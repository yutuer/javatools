package util;

public abstract class CollectionLogic<T, V> {

	protected V result;

	public CollectionLogic() {
		super();
	}

	public CollectionLogic(V result) {
		super();
		this.result = result;
	}

	public abstract V doLogic(T t);

}
