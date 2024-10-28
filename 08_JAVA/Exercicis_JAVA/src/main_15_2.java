import  java.util.Scanner;
public class main_15_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix un numero enter, pot ser negatiu o positiu: ");
        int number = scan.nextInt();
        String resultado = (number > 0) ? "És positiu" : (number < 0) ? "És negatiu" : "És zero";
        System.out.println(resultado);

    }
}
