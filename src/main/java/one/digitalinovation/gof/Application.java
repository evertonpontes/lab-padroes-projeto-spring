package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Utilizando os seguintes módulos:
 * <ul>
 *     <li>Spring Data JPA</li>
 *     <li>Spring Web</li>
 *     <li>H2 Database</li>
 *     <li>OpenFeign</li>
 * </ul>

 * @author evertonpontes
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
