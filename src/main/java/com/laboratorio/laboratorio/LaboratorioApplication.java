package com.laboratorio.laboratorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LaboratorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratorioApplication.class, args);
	}
}
