package clase_Targeta;

import java.util.Scanner;

public class Targeta {
	
	Scanner scan = new Scanner(System.in);
	
	private String emisor = "";
	private String titular = "";
	private String iban = "";
	private String caducitat = "";
	private double saldo = 1000;
	private boolean estat = false;

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getCaducitat() {
		return caducitat;
	}

	public void setCaducitat(String caducitat) {
		this.caducitat = caducitat;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEstat() {
		return estat;
	}

	public void setEstat(boolean estat) {
		this.estat = estat;
	}
	
	public void activar() {
        if (!estat) {
            System.out.println("Vols activar la targeta? (si/no): ");
            String resposta = scan.nextLine().toLowerCase();

            if (resposta.equals("si")) {
            	setEstat(true);
                System.out.println("Targeta activada amb èxit.");
            } else if (resposta.equals("no")) {
                System.out.println("La targeta no serà activada.");
            } else {
            	System.out.println("La resposta no és vàlida.");
            	}
        } else {
            System.out.println("La targeta ja està activada.");
        }
	}
	
	public void anular () {
		if (estat) {
			System.out.print("Vols desactivar la targeta (si o no)?\nResposta: ");
			String resposta = scan.next().toLowerCase();
			
			if (resposta.equals("si")) {
                setEstat(false);
                System.out.println("Targeta desactivada amb èxit.");
            } else if (resposta.equals("no")) {
                System.out.println("La targeta serà desactivada.");
            } else {
            	System.out.println("La resposta no és vàlida.");
            	}
        } else {
            System.out.println("La targeta ja està desactivada.");
        }
	}
	public void pagar () {
		System.out.println("Quin és l'import del gasto?");
		double preu = scan.nextDouble();
		if (saldo >= preu) {
			double nouSaldo = saldo - preu;
			System.out.println("El saldo després de l'operació és de " + nouSaldo + "€.");
			setSaldo(nouSaldo);
		} else {
			System.out.println("El saldo no és suficient per realitzar la operació.");
		}
	}
	
	public void ingresar() {
		System.out.println("Quin és l'import del ingrés?");
		double ingres = scan.nextDouble();
		if(ingres > 0) {
			double nouSaldo = saldo + ingres;
			System.out.println("El saldo després de l'operació és de " + nouSaldo + "€.");
			setSaldo(nouSaldo);;
		} else {
			System.out.println("No pots fer un ingres de 0 o menys euros.");
		}
	}
	
	public void mostrarSaldo () {
		System.out.println("El saldo actual de la targeta és de " + saldo + "€.");
	}
	
	public void mostrarInfo() {
	    System.out.println("Información de la Targeta:");
	    System.out.println("Emisor: " + getEmisor());
	    System.out.println("Titular: " + getTitular());
	    System.out.println("IBAN: " + getIban());
	    System.out.println("Caducitat: " + getCaducitat());
	    System.out.println("Saldo: " + getSaldo());
	    System.out.println("Estat: " + (isEstat() ? "Activa" : "Inactiva"));
	}

	public Targeta(String emisor, String titular, String iban, String caducitat) {
		this.emisor = emisor;
		this.titular = titular;
		this.iban = iban;
		this.caducitat = caducitat;
	}
	
	public Targeta () {}

}