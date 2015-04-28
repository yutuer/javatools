package webSocket.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebSocketChannelInitializer extends ChannelInitializer<SocketChannel> {

	public WebSocketChannelInitializer() {
		// 初始化spring容器
		new ClassPathXmlApplicationContext("Application.xml");
	}

	@Override
	public void initChannel(SocketChannel channel) throws Exception {
		// Create a default pipeline implementation.
		ChannelPipeline pipeline = channel.pipeline();
		pipeline.addLast("decoder", new HttpServerCodec());
		pipeline.addLast("aggregator", new HttpObjectAggregator(65536));
		pipeline.addLast("chunkWrite", new ChunkedWriteHandler());
		pipeline.addLast("uriCheck", new FirstHttpRequestHandler("/apis/reqWrapper"));
		pipeline.addLast("handshake", new WebSocketServerProtocolHandler("")); // websocket的handler部分定义的，它会自己处理握手等操作
		pipeline.addLast("handler", new WebSocketHandler());
	}

}
