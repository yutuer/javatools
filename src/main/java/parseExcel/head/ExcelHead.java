package parseExcel.head;

public class ExcelHead implements IHeader {

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
}
