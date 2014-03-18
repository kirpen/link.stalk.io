package models;

import org.bson.types.ObjectId;


public class StalkApplication {

	private ObjectId _id=null;
	private String app="";
	private String url="";
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	private String userId="";
	private String deviceId="";
	
	public StalkApplication(){}


	public ObjectId get_id() {
		return _id;
	}


	public void set_id(ObjectId _id) {
		this._id = _id;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


}