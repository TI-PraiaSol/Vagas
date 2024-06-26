package br.com.praiasol.apivagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class VagasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VagasApiApplication.class, args);

	}

}
