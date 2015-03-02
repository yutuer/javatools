package parseXml.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User{
	//id
private Long id;
//
private String account;
//
private String passwd;
//
private String telephone;
//
private String email;
//
private List<UserRace> userRaces;


	public Long getId(){
 	return id;
}
public String getAccount(){
 	return account;
}
public String getPasswd(){
 	return passwd;
}
public String getTelephone(){
 	return telephone;
}
public String getEmail(){
 	return email;
}
public List<UserRace> getUserRaces(){
 	return userRaces;
}

	
	public void setId(Long id){
 	this.id=id;
}
public void setAccount(String account){
 	this.account=account;
}
public void setPasswd(String passwd){
 	this.passwd=passwd;
}
public void setTelephone(String telephone){
 	this.telephone=telephone;
}
public void setEmail(String email){
 	this.email=email;
}
public void setUserRaces(List<UserRace> userRaces){
 	this.userRaces=userRaces;
}

	
	
}
