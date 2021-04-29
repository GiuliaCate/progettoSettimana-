package it.epicode.connessione;

import java.sql.SQLException;
import java.util.List;

import it.epicode.modello.Fornitore;

public interface AbstractFornitoreDAO {
		
	List<Fornitore> listaFornitori()throws SQLException;
	
	
	Fornitore insertFornitore (Fornitore f)throws SQLException;


	void rimuoviFornitore(int id) throws SQLException;
	
	
	}
