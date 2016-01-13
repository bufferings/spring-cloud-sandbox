package bufferings.springcloud.sandbox.demo.front1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import bufferings.springcloud.sandbox.demo.front1.DemoFront1Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoFront1Application.class)
@WebAppConfiguration
public class DemoFront1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
