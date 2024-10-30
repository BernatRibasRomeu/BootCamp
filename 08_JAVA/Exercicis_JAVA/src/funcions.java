import java.util.Scanner;

public class funcions {
    public static void main(String[] args) {
        funcions f = new funcions();
        Scanner scan = new Scanner(System.in);
        String paraula;
        System.out.print("Introdueix una paraula: ");
        paraula = scan.next();
        System.out.println(f.javaOrNull(paraula));
        System.out.println();

        System.out.print("Introdueix el nom d'usuari: ");
        String usuari = scan.next();
        System.out.print("Introdueix la contrasenya: ");
        int password = scan.nextInt();
        if (f.login(usuari, password)){
            System.out.println("Log in correcte");
        } else {
            System.out.println("Incorrecte.");
        }

        System.out.print("Introdueix un numero enter: ");
        int num = scan.nextInt();
        if (f.calcula(num)){
            System.out.println("El numero és parell");
        } else {
            System.out.println("El numero és imparell");
        }
    }

    public String javaOrNull (String param){
        String resposta;
        String mostra = "java";
        if (mostra.equals(param)){
            return resposta = "java";
        } else {
            return resposta = "No java";
        }
    }

    public boolean login (String usuari, int password){
        String usuari_mostra = "admin";
        int password_mostra = 1234;
        if (usuari.equals(usuari_mostra) && password_mostra == password){
            return true;
        } else {
            return false;
        }
    }

    public boolean calcula (int num){
        if (num%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
