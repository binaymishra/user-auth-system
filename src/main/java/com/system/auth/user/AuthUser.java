package com.system.auth.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auth_user")
public class AuthUser {
	
	@Id
    @GeneratedValue
    @Column(name="usr_id")
    private Long usrId;
    
	
    @Column(name="usr_name")
    private String userName;
    
    public AuthUser() {
    	
    }

	public AuthUser(Long usrId, String userName) {
		super();
		this.usrId = usrId;
		this.userName = userName;
	}

	public Long getUsrId() {
		return usrId;
	}


	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "AuthUser [usrId=" + usrId + ", userName=" + userName + "]";
	}
    
    
    

}
