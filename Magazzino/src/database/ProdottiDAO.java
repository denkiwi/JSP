package database;


import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;

import model.Prodotto;

public class ProdottiDAO {
	ArrayList<Prodotto> elencoProdotti;
	private Statement statement = null;
	private ResultSet rs = null;
	public ArrayList<Prodotto> getProdotti(){
		elencoProdotti = new ArrayList<>();
		String SQL = "SELECT * FROM untitled";
		Connessione c1= new Connessione();
		c1.openConnection();
		try {
			statement = c1.returnConnection().createStatement();
		rs =	statement.executeQuery(SQL);
			while(rs.next()) {
				elencoProdotti.add(new Prodotto(rs.getInt(1	), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return elencoProdotti;
		
	}

}

