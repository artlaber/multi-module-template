package org.artdevs.projectname.facades;

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
public class FacadeComponentTest {

	@Autowired
	FacadeComponent facadeComponent;

	@Test
	public void testService() {
		assertNotNull(facadeComponent);
		assertNotNull(facadeComponent.getMessage());
	}
}

