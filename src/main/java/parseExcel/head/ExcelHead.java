package parseExcel.head;

public class ExcelHead implements IExcelHeader {

	/**
	 * 表格描述
	 */
	public String desc;
	/**
	 * 表格名称
	 */
	public String title;
	/**
	 * 表格字段类型
	 */
	public String type;

	/**
	 * 属于 第几列
	 */
	public int column;

	public ExcelHead() {
		super();
	}

	public ExcelHead(String desc, String title, String type) {
		super();
		this.desc = desc.trim();
		this.title = title.trim();
		this.type = type.trim();
	}

	@Override
	public String getDesc() {
		return desc;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getType() {
		return type;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
}
