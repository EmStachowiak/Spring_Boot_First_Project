package pl.maja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.maja.model.Fumetto;

@Repository
public interface FumettoRepository extends JpaRepository<Fumetto, Integer> {
	

	public List<Fumetto> findAll();
	
	public Fumetto findById(int id);

}
