package bufferings.springcloud.sandbox.demo.front1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront1Controller2 {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/demo121/")
	@HystrixCommand(fallbackMethod = "fallback121")
	public String getDemo121() {
		return restTemplate.getForObject("http://demo-service1", String.class);
	}

	public String fallback121() {
		return "fallback121";
	}

	@RequestMapping("/demo122/")
	@HystrixCommand(fallbackMethod = "fallback122")
	public String getDemo122() {
		return restTemplate.getForObject("http://demo-service2", String.class);
	}

	public String fallback122() {
		return "fallback122";
	}
}