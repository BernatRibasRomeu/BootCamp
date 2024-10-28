import java.util.Scanner;
public class main_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix un numero del 1 al 9: ");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("U");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatre");
                break;
            case 5:
                System.out.println("Cinc");
                break;
            case 6:
                System.out.println("Sis");
                break;
            case 7:
                System.out.println("Set");
                break;
            case 8:
                System.out.println("Vuit");
                break;
            case 9:
                System.out.println("Nou");
                break;
            default:
                System.out.println("No has introduit un numero entre el 1 i el 9.");
                break;
        }
    }
}
