package netty;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NettyTest implements ITest{
	
	private String name;

	@BeforeClass
	public void before() {

	}
	
	@Test
	public void testStringGetBytes(){
		Object obj = "success";
		String str = obj.toString();
		Assert.assertEquals(str.getBytes().length, str.getBytes(Charset.forName("UTF-8")).length);
		
		Assert.assertEquals(str.getBytes().length, 7);
	}
	
//	@Test
	public void testCompositeByteBuf() {
		CompositeByteBuf buf = Unpooled.compositeBuffer();
		boolean is = buf.hasArray();
		Assert.assertTrue(is);

		ByteBuf b = Unpooled.buffer(10);
		buf.addComponent(b);
		is = buf.hasArray();
		Assert.assertFalse(is);
	}

	@Override
	public String getTestName() {
		return "[NettyTest:" + name + "]";
	}
}
