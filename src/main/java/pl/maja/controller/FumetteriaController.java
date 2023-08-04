package pl.maja.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.maja.model.Fumetteria;
import pl.maja.service.FumetteriaService;

@RestController
public class FumetteriaController {
	
	private FumetteriaService fumetteriaService;

	
	public FumetteriaController(FumetteriaService fumetteriaService) {
		this.fumetteriaService = fumetteriaService;
	}
	
	@GetMapping("/tutteFumetterie")
	public List<Fumetteria> getTutto() {
		return this.fumetteriaService.getTutto();
	}
	
	
	@GetMapping("/idFumetteria/{id}")
	public Fumetteria getFumetteriaById(@PathVariable int id) {
		return this.fumetteriaService.getById(id);
	}
	

}
