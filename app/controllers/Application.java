package controllers;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import models.StalkApplication;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import play.mvc.Controller;
import play.mvc.Result;
import util.Constants;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render());
    }

    public static Result feature() {
        return ok(views.html.feature.render());
    }
    
    public static Result install() {
        return ok(views.html.install.render());
    }
    
    public static Result pricing() {
        return ok(views.html.pricing.render());
    }
    
    public static Result contact() {
        return ok(views.html.contact.render());
    }
    
    public static Result signup() {
        return ok(views.html.signup.render());
    }
   
    public static Result signupSave() {
        return ok(views.html.signup.render());
    }
    
    public static Result login() {
        return ok(views.html.login.render());
    }
    
    public static Result info() {
    	
    	MongoClient mongo = null;
    	Jongo jongo = null;
    	
    	Iterator<StalkApplication> exist = null;
		List<StalkApplication> list = new ArrayList<StalkApplication>();
	    try {
	    	mongo =new MongoClient(Constants.MONGO_IP,Constants.MONGO_PORT);
			DB db = mongo.getDB(Constants.MONGO_DB);
			jongo = new Jongo(db);
			
			MongoCollection collection = jongo.getCollection(Constants.M_COLL_STALK_APPS);
			exist =  collection.find("{userId:'"+session().get("email")+"'}").as(StalkApplication.class).iterator();
			
			while(exist.hasNext()){
				list.add(exist.next());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}finally{
			mongo.close();
		}
		//
        return ok(views.html.info.render(list));
    }
    
    public static Result logout() {
	    session().clear();
	    flash("success", "You've been logged out");
	    return redirect(
	        routes.Application.login()
	    );
	}
    
    public static Result chat() {
    	
    	Map<String, String[]> queryParameters = request().queryString();
		String appId = queryParameters.get("appId")[0];
		
		System.out.println(appId);
		
		
        return ok(views.html.chat.render(appId));
    }

}
