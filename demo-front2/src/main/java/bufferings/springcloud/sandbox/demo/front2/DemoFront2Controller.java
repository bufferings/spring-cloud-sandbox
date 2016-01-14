package bufferings.springcloud.sandbox.demo.front2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoFront2Controller {

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/demo211/")
	@HystrixCommand(fallbackMethod = "fallback211")
	public String getDemo211() {
		return restTemplate.getForObject("http://localhost:8081", String.class);
	}

	public String fallback211() {
		return "fallback211";
	}

	@RequestMapping("/demo212/")
	@HystrixCommand(fallbackMethod = "fallback212")
	public String getDemo212() {
		return restTemplate.getForObject("http://localhost:8082", String.class);
	}

	public String fallback212() {
		return "fallback212";
	}
}