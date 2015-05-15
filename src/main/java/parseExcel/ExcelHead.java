package parseExcel;

/**
 * Excel头信息 即:前三行的列信息
 * 
 * @author 王烁
 * @date 2012-11-14
 * @version 1.0
 */
public class ExcelHead implements IHead {

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
