package org.inria.restlet.mta.internals;

public class Tweet {

    /** Internal id of the user.*/
    private int id_;

    private String content_;
    
   
    private User user_;


	public Tweet(int id_, String content_, User user_) {
		super();
		this.id_ = id_;
		this.content_ = content_;
		this.user_ = user_;
	}


	public int getId_() {
		return id_;
	}


	public void setId_(int id_) {
		this.id_ = id_;
	}


	public String getContent_() {
		return content_;
	}


	public void setContent_(String content_) {
		this.content_ = content_;
	}


	public User getUser_() {
		return user_;
	}


	public void setUser_(User user_) {
		this.user_ = user_;
	}
    
    
}
