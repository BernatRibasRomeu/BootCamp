package urus;

public class Main {

	public static void main(String[] args) {
		Coche urus = new Coche();
		urus.setModel("Urus");
		urus.setColor("Negre");
		urus.setPortes(5);
		urus.setKm(0.0);
		urus.setVelocitat(0);

		System.out.println(urus.toString());
	}
}
