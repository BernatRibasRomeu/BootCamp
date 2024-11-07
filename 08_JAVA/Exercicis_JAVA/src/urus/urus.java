package urus;

public class urus {

	private String model = "";
	private String color = "";
	private int portes = 5;
	private double km = 0;
	private int velocitat = 0;
	
	public double gestioCombustible (int distancia, double velocitat) {
		if (velocitat <= 50 && velocitat > 0) {
			double consumMitja = 18.7;
			double consum = Math.round((consumMitja * distancia)/100) / 100;
			return consum;
		} else if (velocitat > 50 && velocitat <= 150) {
			double consumMitja = 15.1;
			double consum = Math.round((consumMitja * distancia)/100) / 100;
			return consum;
		} else if (velocitat > 150 && velocitat <= 250) {
			double consumMitja = 11.3;
			double consum = Math.round((consumMitja * distancia)/100) / 100;
			return consum;
		} else {
			return 0;
		}
	}
	
	public void accelerar () {
		
	}
	
	public void frenar () {
		
	}
	
	public void recorreDistancia () {
		
	}
	
	public void avis () {
		
	}
	
	public urus(String model, String color, int portes, double km, int velocitat) {
		super();
		this.model = model;
		this.color = color;
		this.portes = portes;
		this.km = km;
		this.velocitat = velocitat;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPortes() {
		return portes;
	}

	public void setPortes(int portes) {
		this.portes = portes;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getVelocitat() {
		return velocitat;
	}

	public void setVelocitat(int velocitat) {
		this.velocitat = velocitat;
	}
}

class motor extends urus {
	public motor(String model, String color, int portes, double km, int velocitat) {
		super(model, color, portes, km, velocitat);
	}
}

class roda extends urus {
	public roda(String model, String color, int portes, double km, int velocitat) {
		super(model, color, portes, km, velocitat);
	}
}

class combustible extends urus {
	private double diposit = 100;
	public combustible(String model, String color, int portes, double km, int velocitat, double diposit) {
		super(model, color, portes, km, velocitat);
		this.diposit = diposit;
	}
}