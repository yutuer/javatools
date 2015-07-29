package spring_redis.dao;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import spring_redis.serializer.ProtocbufRedisSerializer;

import com.pureland.common.protocal.db.ArmyDBProtocal.ArmyDB;
import com.pureland.common.protocal.db.ArmyModuleDBProtocal.ArmyModuleDB;

@Component
public class ArmyModuleDBDao {

	@Resource
	private RedisTemplate<String, ArmyModuleDB> template;

	public void addArmy() {
		ArmyModuleDB.Builder armyModuleBuilder = ArmyModuleDB.newBuilder();
		ArmyDB.Builder armyBuilder = ArmyDB.newBuilder();
		armyBuilder.setAmount(100);
		armyBuilder.setCid(2);
		armyModuleBuilder.getMutableArmyMap().put(armyBuilder.getCid(), armyBuilder.build());
		armyBuilder.setAmount(200);
		armyBuilder.setCid(211);
		armyBuilder.setExp(5);
		armyModuleBuilder.getMutableArmyMap().put(armyBuilder.getCid(), armyBuilder.build());
		template.setValueSerializer(new ProtocbufRedisSerializer(ArmyModuleDB.class));
		template.opsForValue().set("ArmyModuleDB", armyModuleBuilder.build());
	}

	public ArmyModuleDB getArmy() {
		template.setValueSerializer(new ProtocbufRedisSerializer(ArmyModuleDB.class));
		return template.opsForValue().get("ArmyModuleDB");
	}

}
