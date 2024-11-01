package mitigia.backend.mitigia_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class MitigiaTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(MitigiaTaskApplication.class, args);
	}

}
