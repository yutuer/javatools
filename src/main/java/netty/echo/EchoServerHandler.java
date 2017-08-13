package netty.echo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.util.concurrent.TimeUnit;

@Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ByteBuf in = (ByteBuf) msg;
		System.out.println("Server received: " + in.toString(CharsetUtil.UTF_8));
		ctx.writeAndFlush(in);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		final long beginTime = System.currentTimeMillis();
		ctx.channel().eventLoop().schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("costTime: " + (System.currentTimeMillis() - beginTime));
				System.out.println("channelReadComplete");
				//write 只是写到缓冲区中, 需要调用flush才能发送, 缓冲区实现见Recycler类
				ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
			}
		}, 2, TimeUnit.SECONDS);
		//不能在eventLoop中做时间长的任务, 因为是单线程的
		//原理是循环进行select,然后将delayTaskQueue中的任务放入到taskQueue中, 并且执行taskQueue中的任务, 然后再一次循环 
		//例如,如果这里做10秒的循环, 或者sleep10秒, 那么定时器任务也无法被执行,会被阻塞10秒钟, 直到下一次selectNow
		Thread.currentThread().sleep(10 * 1000L);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

}
