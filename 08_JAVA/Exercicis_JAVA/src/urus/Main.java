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
		Motor motor = new Motor();
		motor.setTipoMotor("V8 - Biturbo");
		motor.setCaballs(650);
		motor.setConsumMitja(13);
		
		urus.setMotor(motor);

		System.out.println(urus.toString());

		scan.close();
	}
}