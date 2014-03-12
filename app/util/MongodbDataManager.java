package util;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.util.JSON;

public class MongodbDataManager {
	private MongoClient mongo = null;	
	private DB db = null;
	private DBCollection coll = null;
	private DBCursor cursor = null;

	
	public List<String> getDbList(String host, int port) throws Exception{
		List<String> dbs = new ArrayList<String>();
		
		try {
			MongoClientOptions options = MongoClientOptions
																				.builder()
																				.connectTimeout(500)
																				.socketTimeout(500)
																				.socketKeepAlive(true)
																				.maxAutoConnectRetryTime(1000)
																				.autoConnectRetry(true)
																				.build();
			String tempHost = host+":"+port;
			mongo = new MongoClient(tempHost, options);
			
			dbs = mongo.getDatabaseNames();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	
		
		return dbs;
	}
	
	public MongoClient getMongoClient(String host, int port){
		MongoClient mongo = null;
		try {
			mongo = new MongoClient(host, port);
			
						
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return mongo;
	}
	
	public Set<String> getCollectionList(String host, int port, String dbName){
		Set<String> colls = null;
		
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			
			colls = db.getCollectionNames();
						
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return colls;
	}
	
	public List<DBObject> getDocumentListPage(String host, int port, String dbName, String collsName,int pages, int index, String jsonString){
		List<DBObject> list = new ArrayList<DBObject>();
		
		try {
			BasicDBObject sort = new BasicDBObject();
	        sort.put("_id", 1);

			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			
			if(jsonString == null || "".equals(jsonString)){
				cursor = coll.find().sort( sort ).skip((index-1)*pages).limit(pages);
			}else{
				Object obj = JSON.parse(jsonString);
				DBObject jsonQuery = (DBObject) obj;
				
				cursor = coll.find(jsonQuery).sort( sort ).skip((index-1)*pages).limit(pages);
			}
			//cursor = coll.find();
			//cursor = coll.find().sort( sort ).skip((index-1)*pages).limit(pages);

			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	public List<DBObject> getDocumentList(String host, int port, String dbName, String collsName, String jsonString){
		List<DBObject> list = new ArrayList<DBObject>();
		
		try {
			BasicDBObject sort = new BasicDBObject();
			sort.put("_id", 1);
			
			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			
			if(jsonString == null || "".equals(jsonString)){
				cursor = coll.find().sort( sort );
			}else{
				Object obj = JSON.parse(jsonString);
				DBObject jsonQuery = (DBObject) obj;
				
				cursor = coll.find(jsonQuery).sort( sort );
			}
			//cursor = coll.find();
			//cursor = coll.find().sort( sort ).skip((index-1)*pages).limit(pages);
			
			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	
	
	public List<DBObject> getDocumentList(String host, int port, String dbName, String collsName, String queryJson, String fieldJson){
		List<DBObject> list = new ArrayList<DBObject>();
		
		try {
			BasicDBObject sort = new BasicDBObject();
			sort.put("_id", 1);
			
			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			
			if(queryJson == null || "".equals(queryJson)){
				if(fieldJson == null || "".equals(fieldJson)){
					cursor = coll.find().sort( sort );
				}else{
					Object queryObj = JSON.parse(queryJson);
					Object keysObj = JSON.parse(fieldJson);
					DBObject jsonQuery = (DBObject) queryObj;
					DBObject jsonField = (DBObject) keysObj;
					
					cursor = coll.find(jsonQuery, jsonField).sort( sort );
				}
			}else{
				if(fieldJson == null || "".equals(fieldJson)){
					Object obj = JSON.parse(queryJson);
					DBObject jsonQuery = (DBObject) obj;
					
					cursor = coll.find(jsonQuery).sort( sort );
				}else{
					Object queryObj = JSON.parse(queryJson);
					Object keysObj = JSON.parse(fieldJson);
					DBObject jsonQuery = (DBObject) queryObj;
					DBObject jsonField = (DBObject) keysObj;
					
					cursor = coll.find(jsonQuery, jsonField).sort( sort );
				}
			}
			
			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	
	public List<DBObject> getDistinctDocumentList(String host, int port, String dbName, String collsName, String field, String queryJson){
		List<DBObject> result = null;
		
		try {
			BasicDBObject sort = new BasicDBObject();
			sort.put("_id", 1);
			
			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			
			if(queryJson == null || "".equals(queryJson)){				
				result = coll.distinct(field);
			}else{
				Object queryObj = JSON.parse(queryJson);
				DBObject jsonQuery = (DBObject) queryObj;
				
				result = coll.distinct(field, jsonQuery);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return result;
	}
	
	public long getDocumentCount(String host, int port, String dbName, String collsName, String jsonString){
		List<DBObject> list = new ArrayList<DBObject>();
		long cnt = 0;
		try {
			BasicDBObject sort = new BasicDBObject();
			sort.put("_id", 1);
			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			//cursor = coll.find();
			//cnt = coll.count();
			
			if(jsonString == null || jsonString.equals("")){
				cursor = coll.find();
				cnt = coll.count();
			}else{
				Object obj = JSON.parse(jsonString);
				DBObject jsonQuery = (DBObject) obj;
				
				cursor = coll.find(jsonQuery);
				cnt = coll.count(jsonQuery);
			}

			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			System.out.println(list);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		return cnt;
	}
	
	
	public DBObject getDocument(String host, int port,  String dbName, String collsName, String id){
		DBObject result = null;
		BasicDBObject query = new BasicDBObject();
		
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			query.put("_id", new ObjectId(id));
			result = coll.findOne(query);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return result;
	}
	
	public DBObject getDocument(String host, int port,  String dbName, String collsName, String id, String fieldJson){
		DBObject result = null;
		BasicDBObject query = new BasicDBObject();
		
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			query.put("_id", new ObjectId(id));
			
			
			Object keysObj = JSON.parse(fieldJson);
			DBObject jsonField = (DBObject) keysObj;

			result = coll.findOne(query,jsonField);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return result;
	}
	
	public List<DBObject> getDocumentListAll(String host, int port, String dbName, String collsName){
		List<DBObject> list = new ArrayList<DBObject>();
		
		try {
			BasicDBObject sort = new BasicDBObject();
	        sort.put("_id", 1);

			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			cursor = coll.find();
			//cursor = coll.find().sort( sort ).skip((index-1)*pages).limit(pages);

			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			System.out.println(list);
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	
	public void deleteDocument(String host, int port,  String dbName, String collsName, String id){
		BasicDBObject query = new BasicDBObject();
		
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			query.put("_id", new ObjectId(id));
			coll.findAndRemove(query);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void createCollection(String host, int port, String dbName, String collsName){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			
			BasicDBObject option = new BasicDBObject();
			
			/*
			option.put("capped", true);		// max documents �섎� �섏쑝硫��ㅻ옒��document �꾩뿉 overwrite��
			option.put("size", 5242880);	// collections size
			option.put("max", 5000);		// max documents number
			*/
			
			db.createCollection(collsName, option);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void deleteCollection(String host, int port,  String dbName, String collsName){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			coll.drop();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void createDatabase(String host, int port, String dbName){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			db.addUser("tempUser", "tempPwd".toCharArray());
			db.removeUser("tempUser");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void deleteDatabase(String host, int port, String dbName){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			
			db.dropDatabase();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void updateDocument(String host, int port, String dbName, String collsName, String id, String jsonString){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			BasicDBObject query = new BasicDBObject();
			query.put("_id", new ObjectId(id));
			
			 
			
			Object obj = JSON.parse(jsonString);
			DBObject update = (DBObject) obj;
			
			coll.findAndModify(query, update);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void insertDocument(String host, int port, String dbName, String collsName,  String jsonString){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			BasicDBObject query = new BasicDBObject();
			query.put("_id", new ObjectId());
			
			Object obj = JSON.parse(jsonString);
			DBObject insert = (DBObject) obj;
			
			coll.insert(insert);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	
	
	public void saveUser(String host, int port, String dbName, String userName, char[] pwd, boolean isReadOnly){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			
			if(isReadOnly){
				db.addUser(userName, pwd, isReadOnly);
			}else{
				db.addUser(userName, pwd);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	public void deleteUser(String host, int port, String dbName, String userName){
		try {
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			
			db.removeUser(userName);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
	}
	
	
	public List<DBObject> getFileList(String host, int port, String dbName, String collsName){
		List<DBObject> list = new ArrayList<DBObject>();
		
		try {
			BasicDBObject sort = new BasicDBObject();

			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			cursor = coll.find();

			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	public List<DBObject> getUserList(String host, int port, String dbName){
		List<DBObject> list = new ArrayList<DBObject>();
		String collsName = "system.users";
		
		try {
			BasicDBObject sort = new BasicDBObject();
	        sort.put("_id", 1);

			
			mongo = new MongoClient(host, port);
			db = mongo.getDB(dbName);
			coll = db.getCollection(collsName);
			
			
			cursor = coll.find();

			while(cursor.hasNext()){
				list.add(cursor.next());
			}
			System.out.println(list);
			
			//BasicDBObject query = new BasicDBObject("_id",new ObjectId("51da7d94cb1311274b581fe3"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally{
			if(mongo != null){
				mongo.close();			
			}
		}
		
		return list;
	}
	
}
