package pl.edu.wszib.projektkoncowy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "pl.edu.wszib.*")
@EntityScan("pl.edu.wszib.*")
public class ProjektKoncowyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektKoncowyApplication.class, args);
	}

}
