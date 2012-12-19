import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import beans.UsingResourceBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-applicationContext.xml" })
public class ResourceTest {

	@Autowired
	private UsingResourceBean myBean;
	
	@Autowired
	private TestBean testBean;

	@Test
	public void testMyBean() throws IOException {
		Assert.assertEquals("Hello World!", myBean.getContent());
	}
	
	@Test
	public void testTestBean() throws IOException {
		Assert.assertEquals("Hello World!", testBean.testContent());
	}
	
}
