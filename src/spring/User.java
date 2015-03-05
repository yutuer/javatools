package spring;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class User implements Serializable {
	private static final AtomicLong ID = new AtomicLong();
	private static final long serialVersionUID = 1752808305845821682L;

	public static enum Field {
		ID, NAME, AGE;
	}

	private long id;
	private String name;
	private int age;
	private Long userId;
	private Long raceId;
	private Long lastLoginTime;
	private Long lastOperateTime; // 最后一次发送消息的时间
	private String nickName;
	private Integer campCid;
	private Set<String> armyShop = Sets.newHashSet();
	private Set<String> skillShop = Sets.newHashSet();
	private List<Building> buildings = Lists.newArrayList();
	private Integer upgradeSkillCid; // 空的时候为0
	private Long upgradeSkillCompleteTime;

	public User(String name, int age) {
		super();
		this.id = ID.getAndIncrement();
		this.name = name;
		this.age = age;
		this.userId = 1000L;
		this.raceId = 1000L;
		this.lastLoginTime = 1000L;
		this.lastOperateTime = 1000L;
		nickName = "aa";
		campCid = 1;
		upgradeSkillCid = 2;
		upgradeSkillCompleteTime = 1000L;
		for (int i = 1; i < 10; i++) {
			armyShop.add(i + "");
			skillShop.add(i + "");
		}
		for (int i = 1; i < 10; i++) {
			buildings.add(new Building());
		}
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

	public Long getLastOperateTime() {
		return lastOperateTime;
	}

	public void setLastOperateTime(Long lastOperateTime) {
		this.lastOperateTime = lastOperateTime;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getCampCid() {
		return campCid;
	}

	public void setCampCid(Integer campCid) {
		this.campCid = campCid;
	}

	public Set<String> getArmyShop() {
		return armyShop;
	}

	public void setArmyShop(Set<String> armyShop) {
		this.armyShop = armyShop;
	}

	public Set<String> getSkillShop() {
		return skillShop;
	}

	public void setSkillShop(Set<String> skillShop) {
		this.skillShop = skillShop;
	}

	public Integer getUpgradeSkillCid() {
		return upgradeSkillCid;
	}

	public void setUpgradeSkillCid(Integer upgradeSkillCid) {
		this.upgradeSkillCid = upgradeSkillCid;
	}

	public Long getUpgradeSkillCompleteTime() {
		return upgradeSkillCompleteTime;
	}

	public void setUpgradeSkillCompleteTime(Long upgradeSkillCompleteTime) {
		this.upgradeSkillCompleteTime = upgradeSkillCompleteTime;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
