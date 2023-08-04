package pl.maja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.maja.model.Fumetteria;

@Repository
public interface FumetteriaRepository extends JpaRepository<Fumetteria, Integer>{
		
	public List<Fumetteria> findAll();
	
	public Fumetteria findById(int id);
	
	
	

}
