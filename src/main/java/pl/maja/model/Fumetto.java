package pl.maja.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Fumetto {
	
	@Id
	private int codice;
	private String titolo;
	private String genere;
	
	@ManyToOne
	@JoinColumn(name = "fk_fumetteria", referencedColumnName = "id")
	private Fumetteria fumetteria;
	
	
	public Fumetto() {}


	public Fumetto(int codice, String titolo, String genere) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.genere = genere;
	}


	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}

	
	@JsonIgnore
	public Fumetteria getFumetteria() {
		return fumetteria;
	}


	public void setFumetteria(Fumetteria fumetteria) {
		this.fumetteria = fumetteria;
	}


	@Override
	public String toString() {
		return "Fumetto [codice=" + codice + ", titolo=" + titolo + ", genere=" + genere + "]";
	}
	
	
	
	
	

}
