package parseXml.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserRace{
	//id
private Long id;
//
private Long userId;
//种族id
private Long raceId;
//
private Long lastLoginTime;
//最后一次发送消息的时间
private Long lastOperateTime;
//
private String nickName;
//
private Integer campCid;
//
private Set<String> armyShop;
//
private Set<String> skillShop;
//空的时候为0
private Integer upgradeSkillCid;


	public Long getId(){
 	return id;
}
public Long getUserId(){
 	return userId;
}
public Long getRaceId(){
 	return raceId;
}
public Long getLastLoginTime(){
 	return lastLoginTime;
}
public Long getLastOperateTime(){
 	return lastOperateTime;
}
public String getNickName(){
 	return nickName;
}
public Integer getCampCid(){
 	return campCid;
}
public Set<String> getArmyShop(){
 	return armyShop;
}
public Set<String> getSkillShop(){
 	return skillShop;
}
public Integer getUpgradeSkillCid(){
 	return upgradeSkillCid;
}

	
	public void setId(Long id){
 	this.id=id;
}
public void setUserId(Long userId){
 	this.userId=userId;
}
public void setRaceId(Long raceId){
 	this.raceId=raceId;
}
public void setLastLoginTime(Long lastLoginTime){
 	this.lastLoginTime=lastLoginTime;
}
public void setLastOperateTime(Long lastOperateTime){
 	this.lastOperateTime=lastOperateTime;
}
public void setNickName(String nickName){
 	this.nickName=nickName;
}
public void setCampCid(Integer campCid){
 	this.campCid=campCid;
}
public void setArmyShop(Set<String> armyShop){
 	this.armyShop=armyShop;
}
public void setSkillShop(Set<String> skillShop){
 	this.skillShop=skillShop;
}
public void setUpgradeSkillCid(Integer upgradeSkillCid){
 	this.upgradeSkillCid=upgradeSkillCid;
}

	
	
}
