package spring_redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_redis.dao.ArmyModuleDBDao;

import com.pureland.common.protocal.db.ArmyModuleDBProtocal.ArmyModuleDB;

@Component
public class ArmyService {
	@Autowired
	private ArmyModuleDBDao armyModuleDao;

	public void addArmy() {
		armyModuleDao.addArmy();
	}

	public ArmyModuleDB getArmy() {
		return armyModuleDao.getArmy();
	}
}
