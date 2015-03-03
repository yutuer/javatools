package webSocket.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2015/3/2.
 */
public class WebSocketHandler extends SimpleChannelInboundHandler<WebSocketFrame> {

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		// 握手完成
		if (evt == WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE) {
			// 移除HTTP请求处理器
			ctx.pipeline().remove(HttpRequestHandler.class);
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
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		Logger.getRootLogger().info("channelUnregistered:" + ctx.name());
		super.channelUnregistered(ctx);
	}

	@Override
	protected void channelRead0(final ChannelHandlerContext ctx, WebSocketFrame frame) throws Exception {
		ByteBuf buf = frame.content(); // 真正的数据是放在buf里面的

		if (buf.isReadable()) {
			byte[] contentByte = new byte[buf.readableBytes()];
			buf.readBytes(contentByte);
		}
	}
	

	@Override
	public boolean acceptInboundMessage(Object msg) throws Exception {
		return super.acceptInboundMessage(msg);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		super.channelReadComplete(ctx);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

}