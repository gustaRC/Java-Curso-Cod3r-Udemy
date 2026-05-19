package br.com.beltsistemas.exerciciosSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class ExerciciosSbApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ExerciciosSbApplication.class, args);
		SpringApplication app = new SpringApplication(ExerciciosSbApplication.class);
		app.setDefaultProperties(Map.of("server.port", "8081"));
		app.run(args);
	}

}
