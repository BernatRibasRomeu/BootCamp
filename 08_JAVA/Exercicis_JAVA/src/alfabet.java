public class alfabet {
    public static void main(String[] args) {
        String alfabetReves = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String alfabetOrdenat = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i <= alfabetReves.length(); i++) {
            String nouAlfabetReves = alfabetReves.substring(i);
            System.out.println(nouAlfabetReves);
        }

        for (int i = 1; i <= alfabetOrdenat.length(); i++) {
            String noualfabetOrdenat = alfabetOrdenat.substring(0, i);
            System.out.println(noualfabetOrdenat);
        }

    }
}
