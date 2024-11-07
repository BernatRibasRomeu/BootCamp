package clase_Targeta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Targeta t = new Targeta("BBVA", "Bernat Ribas Romeu", "ES1234567890", "12/25");
		Main m = new Main();
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("Benvingut a la teva banca online!");
			System.out.print("\t1.- Activar targeta\n\t"
							 + "2.- Fer un pagament\n\t"
							 + "3.- Fer un ibgrés\n\t"
							 + "4.- Consultar saldo actual\n\t"
							 + "5.- Consultar informació de la targeta\n\t"
							 + "6.- Anular targeta\n\t"
							 + "7.- Sortir\n"
							 + "Opció: ");
			int opcio = scan.nextInt();
			
			switch (opcio) {
			case 1:
				t.activar();
				m.esperar();
				
				break;
			case 2:
				t.pagar();
				m.esperar();
				break;
			case 3:
				t.ingresar();
				m.esperar();
				break;
			case 4:
				t.mostrarSaldo();
				m.esperar();
				
				break;
			case 5:
				t.mostrarInfo();
				m.esperar();
				
				break;
			case 6:
				t.anular();
				m.esperar();
				
				break;
			case 7:
				System.out.println("Fins aviat!");
				continuar = false;
				break;
			default:
				System.out.println("Error al trira una opció, les opcions són del 1 al 6.");
				break;
			}
		}
		scan.close();
	}
	
	public void esperar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
