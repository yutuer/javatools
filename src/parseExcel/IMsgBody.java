/**
 * @author zhusj
 */
package parseExcel;

import java.io.Serializable;

/**
 * @author zhusj
 *
 */
public interface IMsgBody extends Serializable {
	/**
	 * 写入数据
	 */
	public void write(java.io.DataOutputStream out) throws java.io.IOException;
	
	/**
	 * 读取数据
	 */
	public void read(java.io.DataInputStream inn) throws java.io.IOException;

	/**
	 * 获取Detail 
	 */
	public String getDetail();
	
	/**
	 * 检查
	 */
	public boolean check();
}
