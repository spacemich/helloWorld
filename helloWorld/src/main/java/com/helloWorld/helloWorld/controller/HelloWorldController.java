package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello-world")

public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World !!!";

	}

	@GetMapping("/bsm")
	public List<String> getBsmlist() {
		return Arrays.asList("Comunicação", "Proatividade", "Responsabilidade Pessoal", "Orientação ao Futuro",
				"Trabalho em equipe", "Peristencia", "Mentalidade de Crescimento", "Atenção aos Detalhes");
	}

	@GetMapping("/Objetos")
	public List<String> getlearningObjetctives() {
		return Arrays.asList("Aprendi o que é uma API", "APrendi a fazer o meu primeiro Hello World",
				"Pratiquei mentalidade de persistencia", "Aprendi o que é um Spring Boot",
				"Aprendi conceitos de Model, Controller e View");
	}
}
