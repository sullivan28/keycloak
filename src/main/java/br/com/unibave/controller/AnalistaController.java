package br.com.unibave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/analista")
public class AnalistaController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GetMapping("/analista")
	public String analistaDados() {

		return "Analista";
	}

}
