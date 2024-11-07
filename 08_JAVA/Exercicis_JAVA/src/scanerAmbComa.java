import java.util.Scanner;

public class scanerAmbComa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Introdueix un número decimal: ");
        String input = scan.nextLine();
        
        input = input.replace(',', '.');
        
        try {
            double numero = Double.parseDouble(input);
            System.out.println("Número introduit: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Format del número no vàlid.");
        }
    }
}
