package urus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Coche urus = new Coche();
		urus.setModel("Urus");
		urus.setColor("Negre");
		urus.setPortes(5);
		urus.setKm(0);
		urus.setVelocitat(0);
		
		Motor motor = new Motor("Lamborghini", "V8 Biturbo", 650, 13);

        Roda[] rodesArray = new Roda[4];
        rodesArray[0] = new Roda("Bridgestone", "Potenza S001", 21);
        rodesArray[1] = new Roda("Goodyear", "Eagle F1 Asymmetric", 21);
        rodesArray[2] = new Roda("Continental", "SportContact 6", 21);
        rodesArray[3] = new Roda("Pirelli", "P Zero Nero", 21);

		urus.mostrarInfo();
		motor.mostrarInfo();
		System.out.println("Informació de les Rodes:");
        for (Roda roda : rodesArray) {
            roda.mostrarInfo();
        }

		scan.close();
	}
}