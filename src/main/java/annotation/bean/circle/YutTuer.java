package annotation.bean.circle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class YutTuer {
		
	private final String url;

	public YutTuer(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
