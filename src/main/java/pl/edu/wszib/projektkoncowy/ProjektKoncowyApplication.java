package pl.edu.wszib.projektkoncowy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class ProjektKoncowyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektKoncowyApplication.class, args);
	}

}
