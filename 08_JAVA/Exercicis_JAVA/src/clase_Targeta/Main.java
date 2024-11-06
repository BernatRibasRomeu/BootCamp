package clase_Targeta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Targeta t = new Targeta();
		Main m = new Main();
	
		System.out.println("Benvingut a la teva banca online!");
		System.out.print("\t1.- Crear targeta\n\t"
						 + "2.- Activar targeta\n\t"
						 + "3.- Fer una operació\n\t"
						 + "4.- Consultar saldo actual\n\t"
						 + "5.- Consultar informació de la targeta\n\t"
						 + "6.- Anular targeta\n\t"
						 + "7.- Sortir\n"
						 + "Opció: ");
		int opcio = scan.nextInt();
		
		switch (opcio) {
		case 1:
			t = (Targeta) t.crearTargeta();
			m.esperar();
			m.main(null);
			break;
		case 2:
			t.activar();
			m.esperar();
			m.main(null);
			break;
		case 3:
			
			m.esperar();
			m.main(null);
			
			break;
		case 4:
			t.mostrarSaldo();
			m.esperar();
			m.main(null);
			break;
		case 5:
			if (t != null) {  // Verificamos que targeta no sea null
	            t.mostrarInfo(t);  // Usamos el objeto almacenado en la clase
	        } else {
	            System.out.println("No hi ha cap targeta creada.");
	        }
			m.esperar();
			m.main(null);
			break;
		case 6:
			t.anular();
			m.esperar();
			m.main(null);
			break;
		case 7:
			System.out.println("Fins aviat!");
			System.exit(0);
			break;
		default:
			System.out.println("Error al trira una opció, les opcions són del 1 al 6.");
			break;
		}
	}
	
	public void esperar() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modificarSaldo() {
		Targeta t = new Targeta();
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		System.out.print("Quina operació vols realitzar?\n\t"
				+ "1.- Ingrés\n\t"
				+ "2.- Pagament\n\t"
				+ "3.- Sortir\n\t"
				+ "Opció: ");
		int opcio = scan.nextInt();
		switch (opcio) {
		case 1:
			t.ingresar();
			m.main(null);
			break;
		case 2:
			t.pagar();
			m.main(null);
			break;
		case 3:
			m.main(null);
		default:
			System.out.println("L'opció triada no és vàlida.");
			m.modificarSaldo();
			break;
		}
	}

}
