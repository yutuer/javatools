package webSocket.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class HttpPipelineInitializer extends ChannelInitializer<Channel>{

	private final boolean isClient;
	
	public HttpPipelineInitializer(boolean isClient) {
		super();
		this.isClient = isClient;
	}

	@Override
	protected void initChannel(Channel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		pipeline.addLast(new IdleStateHandler(1, 1, 1));
		pipeline.addLast(new ReadTimeoutHandler(1));
		if(isClient){
			pipeline.addLast(new HttpClientCodec());
		}else{
			pipeline.addLast(new HttpServerCodec());
		}
		pipeline.addLast(new HttpObjectAggregator(512 * 1024));
	}

}
