package pl.maja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.maja.model.Fumetteria;
import pl.maja.repository.FumetteriaRepository;

@Service
public class FumetteriaService {
	
	private FumetteriaRepository fumetteriaRepository;

	public FumetteriaService(FumetteriaRepository fumetteriaRepository) {
		this.fumetteriaRepository = fumetteriaRepository;
	}
	
	public List<Fumetteria> getTutto() {
		return this.fumetteriaRepository.findAll();
		
	}
	
	public Fumetteria getById(int id) {
		return this.fumetteriaRepository.findById(id);
		
	}

}
