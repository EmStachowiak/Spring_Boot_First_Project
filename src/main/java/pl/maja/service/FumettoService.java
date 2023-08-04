package pl.maja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.maja.model.Fumetto;
import pl.maja.repository.FumettoRepository;

@Service
public class FumettoService {
	
	private FumettoRepository fumettoRepository;

	
	public FumettoService(FumettoRepository fumettoRepository) {
		this.fumettoRepository = fumettoRepository;
	}
	
	public List<Fumetto> getAll() {
		return this.fumettoRepository.findAll();
	}
	
	public Fumetto getById(int id) {
		return this.fumettoRepository.findById(id);	//   .orElse(null);	 
		// Optional<Fumetto> fumetti = this.fumettoRepository.findById(id);
		// if (!fumetti.isPresent) { 
		//	 throw new IllegalArgumentException();
		
		 }
		
	}
	


