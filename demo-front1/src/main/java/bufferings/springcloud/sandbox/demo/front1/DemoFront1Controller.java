package bufferings.springcloud.sandbox.demo.front1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront1Controller {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/demo111/")
	@HystrixCommand(fallbackMethod = "fallback111")
	public String getDemo111() {
		return restTemplate.getForObject("http://demo-service1", String.class);
	}

	public String fallback111() {
		return "fallback111";
	}

	@RequestMapping("/demo112/")
	@HystrixCommand(fallbackMethod = "fallback112")
	public String getDemo112() {
		return restTemplate.getForObject("http://demo-service2", String.class);
	}

	public String fallback112() {
		return "fallback112";
	}
}