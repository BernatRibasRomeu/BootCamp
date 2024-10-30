import java.util.Scanner;
public class elseif_clima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix una temperatura: ");
        double temp = scan.nextInt();

        if (temp < 10){
            System.out.println("Clima fred");
            if (temp < 5){
                System.out.println("Tipo polar");
            } else if (temp >=5 && temp < 10){
                System.out.println("Tipo alta montanya");
            }
        } else if (temp >= 10 && temp < 20){
            System.out.println("Clima templats");
            if (temp >= 10 && temp < 13.5){
                System.out.println("Tipo oceànic");
            } else if (temp >= 13.5 && temp < 16.5){
                System.out.println("Tipo mediteràni");
            } else if (temp >= 16.5 && temp < 20){
                System.out.println("Tipo continental");
            }
        } else if (temp >= 20){
            System.out.println("Clima càlids");
            if (temp < 23.5) {
                System.out.println("Tipo ecuatorial");
            } else if (temp >= 23.5 && temp < 26.5){
                System.out.println("Tipo tropical");
            } else if (temp >= 26.5) {
                System.out.println("Tipo desertic");
            }
        }
    }
}
