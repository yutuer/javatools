package spring_redis.serializer;

import java.lang.reflect.Method;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.google.protobuf.GeneratedMessage;

public class ProtocbufRedisSerializer<T> implements RedisSerializer<T> {

	private Class<T> type;

	public ProtocbufRedisSerializer(Class<T> type) {
		this.type = type;
	}

	@Override
	public byte[] serialize(T t) throws SerializationException {
		if (t == null) {
			return new byte[0];
		}
		try {
			GeneratedMessage gm = (GeneratedMessage) t;
			return gm.toByteArray();
		} catch (Exception ex) {
			throw new SerializationException("Cannot serialize", ex);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(byte[] bytes) throws SerializationException {
		if (ArrayUtils.isEmpty(bytes)) {
			return null;
		}
		try {
			Method method = type.getMethod("parseFrom", new Class[] { bytes.getClass() });
			return (T) method.invoke(type, new Object[] { bytes });
		} catch (Exception ex) {
			throw new SerializationException("Cannot deserialize", ex);
		}
	}

	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}

}
