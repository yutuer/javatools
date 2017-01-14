package webSocket.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import spring_redis.service.UserService_redis;

public class WebSocketHandler extends SimpleChannelInboundHandler<WebSocketFrame> {

	@Autowired
	private UserService_redis userService;

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		// 握手完成
		if (evt == WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE) {
			// 移除HTTP请求处理器
			ctx.pipeline().remove(FirstHttpRequestHandler.class);
		} else {
			super.userEventTriggered(ctx, evt);
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		Logger.getRootLogger().info("channelActive:" + ctx.name());
		super.channelActive(ctx);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Logger.getRootLogger().info("channelInactive:" + ctx.name());
		super.channelInactive(ctx);
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		Logger.getRootLogger().info("channelRegistered:" + ctx.name());
		super.channelRegistered(ctx);
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		super.handlerAdded(ctx);
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);
	}

	@Override
	public boolean acceptInboundMessage(Object msg) throws Exception {
		return super.acceptInboundMessage(msg);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		super.channelReadComplete(ctx);
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, WebSocketFrame frame) throws Exception {
		long beginTime = System.nanoTime();
		userService.addUserNoTranction(100000);
		long endTime = System.nanoTime();
		System.out.println((endTime - beginTime) / 1000 / 1000 / 1000.0);
		ctx.writeAndFlush(1);
	}

}