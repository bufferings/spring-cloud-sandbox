package bufferings.springcloud.sandbox.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class DemoService2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoService2Application.class, args);
	}
}

@RestController
class ExampleController {

	@RequestMapping("/")
	String hello() {
		return "Hello this is demo2!";
	}
}