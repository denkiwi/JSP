package model;

public class Notebook extends Prodotto {

	public Notebook(int id, String descrizione, String modello, String marca, double prezzo) {
		super(id, descrizione, modello, marca, prezzo);
		this.modello="Notebook";
	}

}
