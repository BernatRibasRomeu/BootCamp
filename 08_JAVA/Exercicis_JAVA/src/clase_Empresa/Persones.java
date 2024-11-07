package clase_Empresa;

import java.util.Random;

public class Persones {
	
	private String nom = "";
	private String cognoms = "";
	private String document = "";
	private String tipus = "";
	
	public Persones(String nom, String cognoms, String document, String tipus) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.document = document;
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "Persones [nom=" + nom + ", cognoms=" + cognoms + ", document=" + document + ", tipus=" + tipus + "]";
	}

}

class Clients extends Persones{
	
	private String categoria = "";
	private int codi = 0;
	
	public Clients(String nom, String cognoms, String document, String tipus, String categoria, int codi) {
		super(nom, cognoms, document, tipus);
		this.categoria = categoria;
		this.codi = generarCodi();;
	}
	
	public int generarCodi() {
		Random random = new Random();
		return codi = 1 + random.nextInt(9999);
	}

	@Override
	public String toString() {
		return "Clients [categoria=" + categoria + ", codi=" + codi + "]";
	}
}

class Treballadors extends Persones {
	
	private String tipusContracte = "";
	private int sou = 0;
	public Treballadors(String nom, String cognoms, String document, String tipus, String tipusContracte, int sou) {
		super(nom, cognoms, document, tipus);
		this.tipusContracte = tipusContracte;
		this.sou = calcularSou();;
	}
	
	public int calcularSou() {
		return sou = 80*30;
	}

	@Override
	public String toString() {
		return "Treballadors [tipusContracte=" + tipusContracte + ", sou=" + sou + "]";
	}
	
	
}
