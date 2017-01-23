package parseExcel.domainParse;

import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;

public interface IDomainParse<T> {

	List<T> parseModel(Sheet sheet);
	
}
