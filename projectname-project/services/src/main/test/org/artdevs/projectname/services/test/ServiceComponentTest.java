package org.artdevs.projectname.services.test;

import org.artdevs.projectname.services.ServiceComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
		"classpath*:/META-INF/config/*.xml",
		"classpath*:/META-INF/custom-config/*.xml",
})
public class ServiceComponentTest {

	@Autowired
	ServiceComponent serviceComponent;

	@Test
	public void testService() {
		assertNotNull(serviceComponent);
		assertNotNull(serviceComponent.getMessage());
	}
}
