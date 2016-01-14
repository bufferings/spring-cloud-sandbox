package bufferings.springcloud.sandbox.demo.front2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront2Controller {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/demo211/")
	@HystrixCommand(fallbackMethod = "fallback211")
	public String getDemo211() {
		return restTemplate.getForObject("http://demo-service1", String.class);
	}

	public String fallback211() {
		return "fallback211";
	}

	@RequestMapping("/demo212/")
	@HystrixCommand(fallbackMethod = "fallback212")
	public String getDemo212() {
		return restTemplate.getForObject("http://demo-service2", String.class);
	}

	public String fallback212() {
		return "fallback212";
	}
}