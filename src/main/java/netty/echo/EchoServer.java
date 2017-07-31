package netty.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class EchoServer {

	private int port;

	public EchoServer(int port) {
		super();
		this.port = port;
	}

	public static void main(String[] args) throws Exception {
		int port = Integer.parseInt(args[0]);
		new EchoServer(port).start();
	}

	public void start() throws Exception {
		EchoServerHandler esHandler = new EchoServerHandler();
		EventLoopGroup group = new NioEventLoopGroup();

		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(group).channel(NioServerSocketChannel.class).localAddress(port)
					.childHandler(new ChannelInitializer<Channel>() {
						@Override
						protected void initChannel(Channel ch) throws Exception {
							ch.pipeline().addLast(esHandler);
						}
					});
			ChannelFuture cf = b.bind().sync();
			cf.channel().closeFuture().sync();
		} finally {
			group.shutdownGracefully().sync();
		}
	}
}
