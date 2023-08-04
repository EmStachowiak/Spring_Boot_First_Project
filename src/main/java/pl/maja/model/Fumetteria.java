package pl.maja.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fumetteria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String indirizzo;
	
	@OneToMany(mappedBy = "fumetteria")
	private List<Fumetto> fumetti;
	
	
	
	public Fumetteria() {
		fumetti = new ArrayList();
	}



	public Fumetteria(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		fumetti = new ArrayList();
	}



	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getIndirizzo() {
		return indirizzo;
	}



	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	@JsonIgnore
	public List<Fumetto> getFumetti() {
		return fumetti;
	}



	public void setFumetti(List<Fumetto> fumetti) {
		this.fumetti = fumetti;
	}



	@Override
	public String toString() {
		return "Fumetteria [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	
	

}
