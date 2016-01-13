package bufferings.springcloud.sandbox.demo.front1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront1Controller {

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/demo1/")
	@HystrixCommand(fallbackMethod = "fallback1")
	public String getDemo1() {
		return restTemplate.getForObject("http://localhost:8081", String.class);
	}

	public String fallback1() {
		return "fallback1";
	}

	@RequestMapping("/demo2/")
	@HystrixCommand(fallbackMethod = "fallback2")
	public String getDemo2() {
		return restTemplate.getForObject("http://localhost:8082", String.class);
	}

	public String fallback2() {
		return "fallback2";
	}
}