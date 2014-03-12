package util;

import play.Configuration;
import play.Play;

public class Constants {

	public static Configuration playConf= Play.application().configuration();
	public static final String MONGO_IP = playConf.getString("mongoIp");
	public static final int MONGO_PORT = playConf.getInt("mongoPort");
	public static final String MONGO_DB = playConf.getString("mongoDB");
	public static final String M_COLL_STALK_USERS = playConf.getString("collUsers");
	public static final String M_COLL_STALK_APPS = playConf.getString("collApps");
	
	
	
}
