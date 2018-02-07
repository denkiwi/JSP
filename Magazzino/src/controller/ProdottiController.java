package controller;

import java.util.ArrayList;

import database.ProdottiDAO;
import model.Convertibili;
import model.Desktop;
import model.Notebook;
import model.Prodotto;

public class ProdottiController {
	ArrayList<Prodotto> elencoProdotti;
	{
		elencoProdotti = new ArrayList<>();
		elencoProdotti.add(new Notebook(1,"Macbook","", "Apple",1848.0));
		elencoProdotti.add(new Desktop(2,"Imac","", "Apple",849.0));
		elencoProdotti.add(new Convertibili(3,"Air","", "Apple",929.0));
		System.out.println("Blocco di inizializzazione");
	}
	
	public ProdottiController() {
		System.out.println("sono il costruttori ProdottiController");
	}
	public ArrayList<Prodotto> getElencoProdotti(){
		return elencoProdotti;
		
	}
	public static void main(String[] args) {
		ProdottiController pc = new ProdottiController();
		System.out.println(pc.getElencoProdotti());
		ProdottiDAO prodottiDAO = new ProdottiDAO() ;
		 for(Prodotto p : prodottiDAO.getProdotti()) {
			 System.out.println(p);
		 }
	}

}
