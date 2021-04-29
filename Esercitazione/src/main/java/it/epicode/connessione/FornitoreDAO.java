package it.epicode.connessione;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.epicode.modello.Fornitore;

public class FornitoreDAO implements AbstractFornitoreDAO {
	public static final String LISTA_FORNITORI = "SELECT id_fornitore, nome_fornitore, indirizzo_fornitore, citta_fornitore FROM negozio.fornitore";
	public static final String RIMUOVI_FORNITORE = "DELETE FROM negozio.fornitore WHERE id_fornitore=?";

	@Override
	public List<Fornitore> listaFornitori() throws SQLException {
		List<Fornitore> listaFornitori = new ArrayList<>();
		try (Connection connect = connessioneUtils.createConnection();
				Statement st = connect.createStatement();
				ResultSet rs = st.executeQuery(LISTA_FORNITORI)) {
			while (rs.next()) {
				listaFornitori.add(new Fornitore(rs.getInt("id_fornitore"), rs.getString("nome_fornitore"),
						rs.getString("indirizzo_fornitore"), rs.getString("citta_fornitore")));
			}
		}
		return listaFornitori;
	}

	public static final String INSERISCI_NUOVO_FORNITORE = "INSERT INTO negozio.fornitore (id_fornitore, nome_fornitore, indirizzo_fornitore, citta_fornitore) VALUES(?,?,?,?)";

	@Override
	public Fornitore insertFornitore(Fornitore f) throws SQLException {
		try (Connection connect = connessioneUtils.createConnection();
				PreparedStatement ps = connect.prepareStatement(INSERISCI_NUOVO_FORNITORE)) {
			ps.setInt(1, f.getIdFornitore());
			ps.setString(2, f.getNome());
			ps.setString(3, f.getIndirizzo());
			ps.setString(4, f.getCitta());

			ps.executeUpdate();
		}
		return f;
	}

	public void listaProdotti(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

	}

	@Override
	public void rimuoviFornitore(int id) throws SQLException {
		try (Connection connect = connessioneUtils.createConnection();
				PreparedStatement ps = connect.prepareStatement(RIMUOVI_FORNITORE)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		}
	}

}
