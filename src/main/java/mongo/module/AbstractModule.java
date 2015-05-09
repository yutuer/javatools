package mongo.module;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class AbstractModule implements IModule {

	private static final long serialVersionUID = -147644798726141482L;

	private long playerId;

	public AbstractModule() {
		super();
	}

	public AbstractModule(long playerId) {
		super();
		this.playerId = playerId;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeLong(playerId);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		playerId = in.readLong();
	}

	@Override
	public long getPlayerId() {
		return playerId;
	}

}
