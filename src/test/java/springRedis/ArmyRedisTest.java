package springRedis;

import java.util.Map.Entry;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_redis.service.ArmyService;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.pureland.common.protocal.db.ArmyDBProtocal;
import com.pureland.common.protocal.db.ArmyDBProtocal.ArmyDB;
import com.pureland.common.protocal.db.ArmyModuleDBProtocal.ArmyModuleDB;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArmyRedisTest {
	private ApplicationContext app;
	private ArmyService armyService;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		armyService = (ArmyService) app.getBean("ArmyService");
	}

	@Test
	public void test_0_addArmy() {
		armyService.addArmy();
	}

	@Test
	public void test_1_getArmy() {
		ArmyModuleDB armyModule = armyService.getArmy();
		for (Entry<Integer, ArmyDBProtocal.ArmyDB> entry : armyModule.getArmyMap().entrySet()) {
			ArmyDB army = entry.getValue();
			System.out.println(army.getCid());
			System.out.println(army.getAmount());
			FieldDescriptor f = army.getDescriptor().findFieldByName("exp");
			System.out.println(f);
			System.out.println(army.hasField(f));
		}
	}
}
