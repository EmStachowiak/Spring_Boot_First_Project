package pl.maja.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.maja.model.Fumetto;
import pl.maja.service.FumettoService;

@RestController
public class FumettoController {
	
private FumettoService fumettoService;


	public FumettoController(FumettoService fumettoService) {
	super();
	this.fumettoService = fumettoService;
}


	@GetMapping("/tuttiFumetti")
	public List<Fumetto> getTutto() {
		return this.fumettoService.getAll();
	}
	
	
	@GetMapping("/idFumetto/{id}")
	public Fumetto getFumettoById(@PathVariable int id) {
		return this.fumettoService.getById(id);
	}

}
