package webSocket.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.Future;

public class BootStrapTest {
	public static void main(String[] args) {
		NioEventLoopGroup group = new NioEventLoopGroup();
		ServerBootstrap bootstrap = new ServerBootstrap();
		bootstrap.group(group)
		.channel(NioServerSocketChannel.class)
		.option(ChannelOption.SO_REUSEADDR, false)
		.childHandler(new SimpleChannelInboundHandler<ByteBuf>() {
			@Override
			protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
				System.out.println("received data");
				ctx.channel().eventLoop();
			}
		});
		ChannelFuture future = bootstrap.bind(8080);
		future.addListener(new ChannelFutureListener() {
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				System.out.println(Thread.currentThread().getName());
				if(future.isSuccess()){
					System.out.println("Server bound");
				}else{
					System.out.println("Bound attempt failed");
					future.cause().printStackTrace();
				}
			}
		});
		System.out.println("close1");
		Future<?> shutdownGracefully = group.shutdownGracefully();
		shutdownGracefully.awaitUninterruptibly();
		System.out.println("close");
	}
}

