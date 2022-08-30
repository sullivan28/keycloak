package br.com.unibave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/estoque")
public class EstoqueController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GetMapping("/estoque")
	public String estoqueDados() {
		return "estoque";
	}

}
