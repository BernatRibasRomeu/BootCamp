import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix un numero enter positiu entre 1 i 100: ");
        int limit = scan.nextInt();
        if (limit < 0){
            System.out.println("El valor no és positiu.");
        } else if(limit == 0) {
            System.out.println("El valor no pot ser zero.");
        }else {
            System.out.println("Seqüència de Fibonnacci fins a " + limit + ":");
            int primer = 0, segon = 1;
            while(primer <= limit){
                System.out.print(primer + " ");

                int seguent = primer + segon;
                primer = segon;
                segon = seguent;
            }
        }
    }
}
