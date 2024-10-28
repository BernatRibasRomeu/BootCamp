public class arbre_nadal {
    public static void main(String[] args) {
        int altura = 10;
        int alt_tron = 3;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++){
                System.out.print("**");
            }
            System.out.println();
        }
        for (int l = 0; l < alt_tron; l++){
            System.out.print("      ");
            System.out.println("******");
        }
    }
}


