package bufferings.springcloud.sandbox.demo.front1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DemoFront1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoFront1Application.class, args);
	}
}
