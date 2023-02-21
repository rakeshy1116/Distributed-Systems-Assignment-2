package ecommerce.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SpringBootSopaWsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootSopaWsApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8089"));
		app.run(args);
	}

}
