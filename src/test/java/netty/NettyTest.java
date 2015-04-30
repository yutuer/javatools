package netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NettyTest {

	@Before
	public void before() {

	}

	@Test
	public void testCompositeByteBuf() {
		CompositeByteBuf buf = Unpooled.compositeBuffer();
		boolean is = buf.hasArray();
		Assert.assertTrue(is);

		ByteBuf b = Unpooled.buffer(10);
		buf.addComponent(b);
		is = buf.hasArray();
		Assert.assertFalse(is);
	}
}
