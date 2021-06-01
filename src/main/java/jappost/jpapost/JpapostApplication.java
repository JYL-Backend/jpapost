package jappost.jpapost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpapostApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpapostApplication.class, args);
	}

}
