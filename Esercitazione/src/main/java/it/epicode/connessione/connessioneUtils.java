package it.epicode.connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connessioneUtils {
	public static final String USER = "postgres";
	public static final String PASSWORD = "postgres";
	public static final String SCHEMA = "negozio";
	public static final String URL= String.format("jdbc:postgresql://localhost:5432/esercizio?currentSchema=%s&user=%s&password=%s", SCHEMA, USER, PASSWORD);
	
//	sto aprendo la connessione. 
	public static Connection createConnection () throws SQLException {
		return DriverManager.getConnection(URL);
	}

}
