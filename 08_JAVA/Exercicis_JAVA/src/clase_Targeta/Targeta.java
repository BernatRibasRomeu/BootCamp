package clase_Targeta;

import java.util.Scanner;

public class Targeta {
	
	Scanner scan = new Scanner(System.in);
	
	private Targeta targeta;
	private String emisor = "";
	private String titular = "";
	private String iban = "";
	private String caducitat = "";
	private double saldo = 1000;
	private boolean estat = false;
	
	public Targeta(String emisor, String titular, String iban, String caducitat) {
		this.emisor = emisor;
		this.titular = titular;
		this.iban = iban;
		this.caducitat = caducitat;
	}
	
	public Targeta () {}

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

	public void activar() {
		if (estat) {
			System.out.print("Vols activar la targeta (si o no)?\nResposta: ");
			String resposta = scan.next().toLowerCase();
			switch (resposta) {
			case "si":
				estat = true;
				System.out.println("Targeta activada amb éxit.");
				break;
			case "no":
				System.out.println("La targeta seguirà desactivada.");
			default:
				System.out.println("La resposta no es vàlida, sisplau respon si o no.");
				break;
			}
		}
	}
	
	public void anular () {
		if (!estat) {
			System.out.print("Vols desactivar la targeta (si o no)?\nResposta: ");
			String resposta = scan.next().toLowerCase();
			switch (resposta) {
			case "si":
				System.out.println("Targeta desactivada amb éxit.");
				estat = false;
				break;
			case "no":
				System.out.println("La targeta seguirà activada.");
			default:
				System.out.println("La resposta no es válida, sisplau respon si o no.");
				break;
			}
		}
	}
	public double pagar () {
		System.out.println("Quin és l'import del gasto?");
		double preu = scan.nextDouble();
		if (saldo >= preu) {
			double nouSaldo = saldo - preu;
			System.out.println("El saldo després de l'operació és de " + nouSaldo + "€.");
			return nouSaldo;
		} else {
			System.out.println("El saldo no és suficient per realitzar la operació.");
			return saldo;
		}
	}
	
	public double ingresar() {
		System.out.println("Quin és l'import del ingrés?");
		double ingres = scan.nextDouble();
		if(ingres > 0) {
			double nouSaldo = saldo + ingres;
			return nouSaldo;
		} else {
			System.out.println("No pots fer un ingres de 0 o menys euros.");
			return saldo;
		}
	}
	
	public void mostrarSaldo () {
		System.out.println("El saldo actual de la targeta és de " + saldo + "€.");
	}
	
	public void mostrarInfo (Targeta targeta) {
		System.out.println("Información de la Targeta:");
        System.out.println("Emisor: " + emisor);
        System.out.println("Titular: " + titular);
        System.out.println("IBAN: " + iban);
        System.out.println("Caducidad: " + caducitat);
        System.out.println("Saldo: " + saldo);
        System.out.println("Estado: " + (estat ? "Activa" : "Inactiva"));
	}
	
	public Object crearTargeta () {
		System.out.println("Menú de creació de targetes");
		System.out.print("Introdueix la següent informacio:\n\t"
				+ "Entitat emisora: ");
		String entitat = scan.next();
		System.out.print("Titular de la targeta: ");
		String nom = scan.next();
		System.out.print("IBAN: ");
		String iban = scan.next();
		System.out.print("Data de caducitat: ");
		String data_caducitat = scan.next();
		
		targeta = new Targeta(entitat, nom, iban, data_caducitat);
		return targeta;
	}
}
