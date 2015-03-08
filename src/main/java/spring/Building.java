package spring;

import java.io.Serializable;

public class Building implements Serializable{
	
	private Long userId;
	private Long raceId;
	private Long lastLoginTime;
		
	
	public Building(){
		this.userId = 1000L;
		this.raceId = 2999L;
		this.lastLoginTime = 3399L;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long getRaceId() {
		return raceId;
	}


	public void setRaceId(Long raceId) {
		this.raceId = raceId;
	}


	public Long getLastLoginTime() {
		return lastLoginTime;
	}


	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	
	
}
