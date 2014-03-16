package controllers;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

import models.User;

import org.bson.types.ObjectId;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import play.libs.F;
import play.libs.Json;
import play.libs.WS;
import play.libs.WS.WSRequestHolder;
import play.mvc.Controller;
import play.mvc.Result;
import util.Constants;
import util.MongodbDataManager;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Stalk extends Controller {

   
   
    public static Result signup() {
    	Map<String, String[]> queryParameters = request().body().asFormUrlEncoded();
    	String email = queryParameters.get("email")[0];
    	String name = queryParameters.get("name")[0];
    	String password = queryParameters.get("password")[0];
    	
    	
    	MongoClient mongo = null;
		  try {
			  mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
			  DB db = mongo.getDB(Constants.MONGO_DB);
			  Jongo jongo = new Jongo(db);
			  
			  MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_USERS);
			  
			  User exist = collection.findOne("{email:'"+email+"'}").as(User.class);
			  
			  
			  Json json = new Json();
			  ObjectNode saveJson = json.newObject();
			  saveJson.put("email", email);
			  saveJson.put("name", name);
			  saveJson.put("password", password);
			 
			  
			  if(exist!=null){
				  
				  flash("error","Email already exist!!");
				  return ok(views.html.signup.render());
				  
				  
			  }else{
				  collection.save(saveJson);
				  
			  }
			  
		  } catch (UnknownHostException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  }finally{
			  mongo.close();
		  }
    	
    	
		  return ok(views.html.login.render());
        
    }
    
    public static Result login() {
    	Map<String, String[]> queryParameters = request().body().asFormUrlEncoded();
    	String email = queryParameters.get("email")[0];
    	String password = queryParameters.get("password")[0];
    	
    	System.out.println(email);
    	System.out.println(password);
    	
    	MongoClient mongo = null;
		  try {
			  mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
			  DB db = mongo.getDB(Constants.MONGO_DB);
			  Jongo jongo = new Jongo(db);
			  
			  MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_USERS);			  
			  User exist = collection.findOne("{email:'"+email+"', password:'"+password+"'}").as(User.class);
			  
			  
			  
			  if(exist==null){
				  flash("error","Email or password is not correct");
				  return ok(views.html.login.render());
			  }else{
				  session().clear();
				  session("email", email);
			  }
			  
		  } catch (UnknownHostException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  }finally{
			  mongo.close();
		  }
    	
		  return redirect(routes.Application.info());
        
    }

    public static Result registStalkUser() {
    	
    	Map<String, String[]> queryParameters = request().body().asFormUrlEncoded();
    	String email = session().get("email");
    	
    	String app = queryParameters.get("app")[0];
    	
    	String password = "";
    	
    	MongoClient mongo = null;
    	Jongo jongo = null;
    	
    	try {
    		mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
    		DB db = mongo.getDB(Constants.MONGO_DB);
    		jongo = new Jongo(db);
			  
    		MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_USERS);			  
    		User exist = collection.findOne("{email:'"+email+"'}").as(User.class);
		  
    		password  = exist.getPassword();
    		
    		
    		
    		WSRequestHolder wsreqHolder = WS.url("http://chat.stalk.io:8000/user/register");
        	wsreqHolder.setQueryParameter("app", "stalk-io:"+app)
    		    .setQueryParameter("userId", email)
    		    .setQueryParameter("deviceId", "web")
    		    .setQueryParameter("password", password);
        	
        	F.Promise<WS.Response> promiseOfResult = wsreqHolder.post("content");

        	WS.Response response = promiseOfResult.get(); //block here

        	String ret =  response.getBody();
        	
        	
        	
        	Json json = new Json();
        	JsonNode returnJson = json.parse(ret);
        	System.out.println(returnJson);
        	System.out.println(returnJson.get("status").toString());
        	
        	if(returnJson.get("status").toString().equals("\"ok\"")){
        		
        		
        		ObjectNode saveJson = json.newObject();
    			saveJson.put("userId", email);
    			saveJson.put("app", "stalk-io:"+app);
    			saveJson.put("deviceId", "web");
    			saveJson.put("password", password);
    			
    			MongoCollection appColl = jongo.getCollection(Constants.M_COLL_STALK_APPS);		
    			appColl.save(saveJson);
    				
        	}else{
        		return ok("err");
        	}
    		
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			mongo.close();
		}
    	
    	return ok("ok"); 
    	
    	
    }
    
    
    public static Result deleteStalkUser() {
    	
    	Map<String, String[]> queryParameters = request().body().asFormUrlEncoded();
    	
    	
    	String deleteId = queryParameters.get("deleteId")[0];
    	
    	MongoClient mongo = null;
		
		
		String code="";
		String msg="";
	    try {
	    	mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
			DB db = mongo.getDB(Constants.MONGO_DB);
			Jongo jongo = new Jongo(db);
			
			MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_APPS);
			
			
			
			ObjectId oid = new ObjectId(deleteId);
			collection.remove(oid);
			
			
			  
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			mongo.close();
		}
	    
    	return redirect(routes.Application.info());
    	
    }
    
    
    
    
    public static Result auth() {
    	
    	Map<String, String[]> queryParameters = request().body().asFormUrlEncoded();
    	
    	System.out.println(queryParameters);
    	
    	String app = queryParameters.get("app")[0];
    	String userId = queryParameters.get("userId")[0];
    	String deviceId = queryParameters.get("deviceId")[0];
    	
    	String password = "";
    	
    	MongoClient mongo = null;
    	Jongo jongo = null;
    	JsonNode returnJson = null;
    	try {
    		mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
    		DB db = mongo.getDB(Constants.MONGO_DB);
    		jongo = new Jongo(db);
			  
    		MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_USERS);			  
    		User exist = collection.findOne("{email:'"+userId+"'}").as(User.class);
		  
    		password  = exist.getPassword();
    		
    		
    		
    		WSRequestHolder wsreqHolder = WS.url("http://chat.stalk.io:8000/auth");
        	wsreqHolder.setQueryParameter("app", app)
    		    .setQueryParameter("userId", userId)
    		    .setQueryParameter("deviceId", deviceId)
    		    .setQueryParameter("password", password);
        	
        	F.Promise<WS.Response> promiseOfResult = wsreqHolder.post("content");

        	WS.Response response = promiseOfResult.get(); //block here

        	String ret =  response.getBody();
        	
        	
        	
        	Json json = new Json();
        	returnJson = json.parse(ret);
        	System.out.println(returnJson);
        	
        	
        	
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			mongo.close();
		}
    	
    	return ok(returnJson); 
    	
    	
    }
    
    public static Result operator() {
    	
    	Map<String, String[]> queryParameters = request().queryString();
		String appId = queryParameters.get("appId")[0];
		
		System.out.println(appId);
		
		MongodbDataManager mm = new MongodbDataManager();
		List<DBObject> docu = mm.getDocumentList(Constants.MONGO_IP, Constants.MONGO_PORT, Constants.MONGO_DB, Constants.M_COLL_STALK_APPS, "{app:'"+appId+"'}","{_id:0,app:1,userId:1}");
	 
	    
	
		
        return ok(docu.toString());
    }	
}
