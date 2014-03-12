import play.Application;
import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {
	private String host = "127.0.0.1";
	private int port = 27017;
	private String CMDB = "cmdb";
	private String USER_COLLECTION = "user";
	private String USER_QUERY = "{email:'cmdb@test.com',name:'cmdb',password:'cmdb'}";

  @Override
  public void onStart(Application app) {
    
  }  

  @Override
  public void onStop(Application app) {
    Logger.info("Application shutdown...");
  }  
}