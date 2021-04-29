package it.epicode.modello;

public class Fornitore {
	private int idFornitore;
	private String nome;
	private String indirizzo;
	private String citta;
	
	
	public Fornitore(int idFornitore, String nome, String indirizzo, String citta) {
		this.idFornitore = idFornitore;
		this.nome= nome;
		this.indirizzo = indirizzo;
		this.citta= citta;
	}

	public int getIdFornitore() {
		return idFornitore;
	}
	

	public void setIdFornitore(int idFornitore) {
		this.idFornitore = idFornitore;
	}

	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
	

}
