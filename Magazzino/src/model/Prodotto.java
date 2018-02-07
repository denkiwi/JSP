package model;

public class Prodotto {
	

	int id;
	String descrizione;
	String modello;
	String marca;
	double prezzo;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the modello
	 */
	public String getModello() {
		return modello;
	}
	/**
	 * @param modello the modello to set
	 */
	public void setModello(String modello) {
		this.modello = modello;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	/**
	 * @param id
	 * @param descrizione
	 * @param modello
	 * @param marca
	 * @param prezzo
	 */
	public Prodotto(int id, String descrizione, String modello, String marca, double prezzo) {

		this.id = id;
		this.descrizione = descrizione;
		this.modello = modello;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	
@Override
public String toString() {
	return this.getMarca() + " " + this.getModello() + " " + this.getDescrizione();
}	
}

