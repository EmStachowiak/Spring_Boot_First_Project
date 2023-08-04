package pl.maja.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import pl.maja.model.Fumetteria;
import pl.maja.model.Fumetto;
import pl.maja.repository.FumetteriaRepository;
import pl.maja.repository.FumettoRepository;

@Service
public class DataLoader {
	
	
	private FumetteriaRepository fumetteriaRepository;
	private FumettoRepository fumettoRepository;
	

	public DataLoader(FumetteriaRepository fumetteriaRepository, FumettoRepository fumettoRepository) {
		this.fumetteriaRepository = fumetteriaRepository;
		this.fumettoRepository = fumettoRepository;
	}
	
	
	@PostConstruct
	private void loadData() {
		
		Fumetteria fumetteria1 = new Fumetteria("FUM 1", "Via Blue 123");
		Fumetteria fumetteria2 = new Fumetteria("FUM 2", "Via Red 321");
		
		Fumetto fum1 = new Fumetto(11234, "ABC", "A");
		Fumetto fum2 = new Fumetto(2211, "BCD", "B");
		Fumetto fum3 = new Fumetto(1243, "CDE", "A");
		Fumetto fum4 = new Fumetto(1145, "DEF", "D");
		Fumetto fum5 = new Fumetto(5434, "FGH", "A");
		Fumetto fum6 = new Fumetto(3321, "GHJ", "B");
		
		
		fumetteria1.getFumetti().add(fum1);
		fumetteria1.getFumetti().add(fum2);
		fumetteria1.getFumetti().add(fum3);
		fumetteria1.getFumetti().add(fum4);
		fum1.setFumetteria(fumetteria1);
		fum2.setFumetteria(fumetteria1);
		fum3.setFumetteria(fumetteria1);
		fum4.setFumetteria(fumetteria1);
		
		fumetteria2.getFumetti().add(fum5);
		fumetteria2.getFumetti().add(fum6);
		fum5.setFumetteria(fumetteria2);
		fum6.setFumetteria(fumetteria2);
		
		fumetteriaRepository.save(fumetteria1);
		fumetteriaRepository.save(fumetteria2);
		
		fumettoRepository.save(fum1);
		fumettoRepository.save(fum2);
		fumettoRepository.save(fum3);
		fumettoRepository.save(fum4);
		fumettoRepository.save(fum5);
		fumettoRepository.save(fum6);
		
		
	}
	
	
	

}
