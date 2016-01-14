package bufferings.springcloud.sandbox.demo.front2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import bufferings.springcloud.sandbox.demo.front2.DemoFront2Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoFront2Application.class)
@WebAppConfiguration
public class DemoFront2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
