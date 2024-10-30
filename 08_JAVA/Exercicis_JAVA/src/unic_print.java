public class unic_print {
    public static void main(String[] args) {
        String nom = "Bernat";
        String cognom1 = "Ribas";
        String cognom2 = "Romeu";
        int edat = 29;
        String adreca = "avinguda Catalunya 88, 2n, Els Monjos";
        String municipi = "Santa Margarida i els Monjos";
        int codi_postal = 8730;
        String mail = "bernat162@gmail.com";
        char sexe_char = 'h';
        String sexe = "no binari";

        switch (sexe_char){
            case 'h':
                sexe = "home";
                break;
            case 'f':
                sexe = "dona";
                break;
        }

        System.out.print("El meu nom és " + nom + " " + cognom1 + " " + cognom2 + ".\n" +
                "Visc a l'" + adreca + " amb codi postal 0" + codi_postal + " del municipi " + municipi + ".\n" +
                "M'identifico com un " + sexe + ", tinc " + edat + " i el meu correu electrònic és " + mail + ".");
    }
}
