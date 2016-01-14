package bufferings.springcloud.sandbox.demo.front2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront2Controller2 {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/demo221/")
	@HystrixCommand(fallbackMethod = "fallback221")
	public String getDemo221() {
		return restTemplate.getForObject("http://demo-service1", String.class);
	}

	public String fallback221() {
		return "fallback221";
	}

	@RequestMapping("/demo222/")
	@HystrixCommand(fallbackMethod = "fallback222")
	public String getDemo222() {
		return restTemplate.getForObject("http://demo-service2", String.class);
	}

	public String fallback222() {
		return "fallback222";
	}
}