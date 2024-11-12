package urus;

public class Coche {

	private String model = "";
	private String color = "";
	private int portes = 0;
	private int km = 0;
	private int velocitat = 0;
	private Combustible combustible;
	private Motor motor;

	public Coche(String model, String color, int portes, int km, int velocitat) {
		super();
		this.model = model;
		this.color = color;
		this.portes = portes;
		this.km = km;
		this.velocitat = velocitat;
		this.combustible = new Combustible();
		this.motor = new Motor();
	}

	public Coche() {
		this.combustible = new Combustible();
		this.motor = new Motor();
	}

	public int acelerar(int velocitat) {
		int novaVelocitat = velocitat + 33;
		if (novaVelocitat >= 330) {
			System.out.println("El Lambo no pot acelerar a més de 330km/h.");
			novaVelocitat = 330;
			return novaVelocitat;
		}
		return novaVelocitat;
	}

	public int frenar(int velocitat) {
		int novaVelocitat = velocitat - 33;
		if (novaVelocitat <= 0) {
			System.out.println("El lambo ja no pot frenar més, recorda posar el freno de mà.");
			novaVelocitat = 0;
			return novaVelocitat;
		}
		return novaVelocitat;
	}

	public void recorreDistancia(int distancia, int velocitat) {
		this.km = this.km + distancia;
		int nouCombustible = combustible.getNivell() - motor.consumPerKilometre(distancia, velocitat);
		combustible.setNivell(nouCombustible);
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

	public void setKm(int km) {
		this.km = km;
	}

	public int getVelocitat() {
		return velocitat;
	}

	public void setVelocitat(int velocitat) {
		this.velocitat = velocitat;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

//	public void setRodes(Roda[] rodes) {
//		this.rodes = rodes;
//	}
	
	public void mostrarInfo() {
		System.out.println("Model: " + model
				 + ", Color: " +color
				 + ", Portes: " + portes
				 + ", Km: " + km
				 + ", Velocitat: " + velocitat
				 + ", " + combustible.toString());
	}

}

class Motor extends componentesCoche {

    private int caballs;
    private int consumMitja;

    public Motor(String marca, String model, int caballs, int consumMitja) {
        super(marca, model);
        this.caballs = caballs;
        this.consumMitja = consumMitja;
    }

    public Motor() {
        super();
    }

	public int getCaballs() {
		return caballs;
	}

	public void setCaballs(int caballs) {
		this.caballs = caballs;
	}

	public int getConsumMitja() {
		return consumMitja;
	}

	public void setConsumMitja(int consumMitja) {
		this.consumMitja = consumMitja;
	}

	public int consumPerKilometre(int distancia, int velocitat) {

		int consumoPor100Km;

		if (velocitat >= 0 && velocitat <= 50) {
			consumoPor100Km = 8;
		} else if (velocitat > 50 && velocitat <= 120) {
			consumoPor100Km = 10;
		} else if (velocitat > 120 && velocitat <= 200) {
			consumoPor100Km = 16;
		} else if (velocitat > 200 && velocitat <= 330) {
			consumoPor100Km = 18;
		} else {
			throw new IllegalArgumentException("velocitat fora de límits (0-330 km/h)");
		}

		return (consumoPor100Km * distancia) / 100;
	}

	@Override
    public void mostrarInfo() {
        System.out.println("Motor Marca: " + marca + ", Model: " + model + ", Caballs: " + caballs + "CV, Consum MItjà: " + consumMitja + " L/100km");
    }
}

class Roda extends componentesCoche {

    private int ample;

    public Roda(String marca, String model, int ample) {
        super(marca, model);
        this.ample = ample;
    }

    public Roda() {
        super();
    }

	public int getAmple() {
		return ample;
	}

	public void setAmple(int ample) {
		this.ample = ample;
	}

	@Override
    public void mostrarInfo() {
        System.out.println("Roda Marca: " + marca + ", Model: " + model + ", Ample: " + ample);
    }
}

class Combustible {

	private int nivell = 100;

	public Combustible(int nivell) {
		super();
		this.nivell = nivell;
	}

	public Combustible() {

	}

	public int getNivell() {
		return nivell;
	}

	public void setNivell(int nivell) {
		this.nivell = nivell;
	}

	public void avisNivellCombustible(int combustible) {
		if (combustible < 10) {
			System.out.println("Alerta! El nivell de combustible és menor al 10%.");
		}
	}

	public void repostarCombustible(int repostat) {
		int nouNivell = getNivell() + repostat;
		if (nouNivell < 0) {
			setNivell(0);
		} else if (nouNivell >= 100) {
			setNivell(100);
		} else {
			setNivell(nouNivell);
		}
	}

	@Override
	public String toString() {
		return "Nivell de combustible = " + nivell;
	}

}

abstract class componentesCoche {
    protected String marca;
    protected String model;

    public componentesCoche() {
    }

    public componentesCoche(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void mostrarInfo();
}
