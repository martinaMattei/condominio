package it.exolab.ecommerce.model;

public class Carrello {
	
	private int id;
	private int id_prodotto;
	private double prezzo;
	private int quantita;
	private String cookie;
	Prodotto prodotto = new Prodotto();
	
	
	
	
	
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_prodotto() {
		return id_prodotto;
	}
	public void setId_prodotto(int prodottoId) {
		this.id_prodotto = prodottoId;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public Carrello(int id_prodotto, String cookie, double prezzo, int quantita) {
		this.id_prodotto = id_prodotto;
		this.cookie = cookie;
		this.prezzo = prezzo;
		this.quantita = quantita;
		
	}
	public Carrello() {
	}
	public Carrello(int id_prodotto) {
		this.id_prodotto=id_prodotto;
	}

	
	public Carrello(int id, int id_prodotto, String cookie, double prezzo, int quantita) {
		this.id = id;
		this.id_prodotto = id_prodotto;
		this.cookie = cookie;
		this.prezzo = prezzo;
		this.quantita = quantita;
		
	}
	@Override
	public String toString() {
		return "Carrello [id=" + id + ", id_prodotto=" + id_prodotto + ", prezzo=" + prezzo + ", quantita=" + quantita
				+ ", cookie=" + cookie + "]";
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

}
