package Clase_Persona;

public class Main {
    public static void main(String[] args) {
        // Objeto 1: Usar el constructor vacío y luego los setters para asignar valores
        Persona persona1 = new Persona();
        persona1.setNom("Juan");
        persona1.setEdat(25);

        // Objeto 2: Usar el constructor con parámetros para asignar valores directamente
        Persona persona2 = new Persona("Ana", 30);

        // Objeto 3: Usar el constructor vacío y setters de nuevo para asignar valores
        Persona persona3 = new Persona();
        persona3.setNom("Luis");
        persona3.setEdat(22);

        // Mostrar información usando getters
        System.out.println("Persona 1: Nombre = " + persona1.getNom() + ", Edad = " + persona1.getEdat());
        System.out.println("Persona 1: Nombre = " + persona1.getNom() + ", Edad = " + persona1.getEdat());
        System.out.println("Persona 2: Nombre = " + persona2.getNom() + ", Edad = " + persona2.getEdat());
    }
}