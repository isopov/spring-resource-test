import java.io.IOException;

import beans.UsingResourceBean;

public class TestBean {
	
	private UsingResourceBean usingBean;

	public void setUsingBean(UsingResourceBean usingBean) {
		this.usingBean = usingBean;
	}
	
	public String testContent() throws IOException{
		return usingBean.getContent();
	}
}
