package spring_redis;

import io.netty.handler.codec.marshalling.MarshallingDecoder;
import io.netty.handler.codec.marshalling.MarshallingEncoder;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class MySeriable implements RedisSerializer {

	private MarshallingDecoder decoder = MarshallingCodeCFactory.buildMarshallingDecoder();
	private MarshallingEncoder encoder = MarshallingCodeCFactory.buildMarshallingEncoder();

	@Override
	public byte[] serialize(Object t) throws SerializationException {
		return null;
	}

	@Override
	public Object deserialize(byte[] bytes) throws SerializationException {
		return null;
	}

}
