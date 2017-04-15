package entity;

import annotation.Column;
import annotation.Entity;

@Entity(tabName="user")
public class User {
	@Column(columnName="UserID",nullable=false,length=255)
	private String userID;
	@Column(columnName="UserPassword",nullable=false,length=255)
	private String password;
	@Column(columnName="UserName",nullable=false,length=255)
	private String userName;
	@Column(columnName="UserStatus",nullable=false,length=5)
	private boolean userStatus;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	
}
