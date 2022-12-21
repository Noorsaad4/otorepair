package ibmtal.otorepair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication 
@EnableSwagger
public class OtorepairApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtorepairApplication.class, args);
	}
}
