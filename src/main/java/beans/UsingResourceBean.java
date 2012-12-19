package beans;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.core.io.Resource;

public class UsingResourceBean {

	private Resource resource;

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getContent() throws IOException {
		try (InputStream in = resource.getInputStream()) {
			return convertStreamToString(in);
		}
	}

	private static String convertStreamToString(java.io.InputStream is) {
		try (Scanner s = new Scanner(is)) {
			s.useDelimiter("\\A");
			return s.hasNext() ? s.next() : "";
		}

	}

}
