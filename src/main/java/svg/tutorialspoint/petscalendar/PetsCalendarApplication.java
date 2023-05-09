package svg.tutorialspoint.petscalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class PetsCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsCalendarApplication.class, args);
	}

}
