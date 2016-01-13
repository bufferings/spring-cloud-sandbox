package bufferings.springcloud.sandbox.hystrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bufferings.springcloud.sandbox.hystrix.HystrixApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HystrixApplication.class)
public class HystrixApplicationTests {

	@Test
	public void contextLoads() {
	}

}
