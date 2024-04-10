package br.com.crudsrvhexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@EnableJpaAuditing
//@EnableAutoConfiguration
@SpringBootApplication//(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class CrudSrvHexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSrvHexaApplication.class, args);
	}

}
