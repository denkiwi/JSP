package model;

public class Desktop extends Prodotto {

	public Desktop(int id, String descrizione, String modello, String marca, double prezzo) {
		super(id, descrizione, modello, marca, prezzo);
		this.modello="Desktop";
	}

}
