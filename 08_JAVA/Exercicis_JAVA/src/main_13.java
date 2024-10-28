import java.util.Scanner;
public class main_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Introdueix un numero enter: ");
        num = scan.nextInt();
        int proces = num%2;
        if(proces == 0){
            System.out.println("Parell");
        } else {
            System.out.println("Imparell");
        }
       double num2 = Math.random();
       if (num2 < 0.5){
            System.out.println("Blanc");
       } else {
           System.out.println("Negre");
       }
    }
}
