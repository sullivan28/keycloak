package br.com.unibave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/desenvolvimento")
public class DesenvolvimentoController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GetMapping("/desenvolvimento")
	public String desenvolvimentoDados() {

		return "Desenvolvimento";
	}

}
