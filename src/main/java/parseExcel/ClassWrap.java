package parseExcel;

public class ClassWrap<T> {

	private Class<T> c;

	public ClassWrap(Class<T> c) {
		super();
		this.c = c;
	}

	public T newInstance() {
		try {
			return c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

}
