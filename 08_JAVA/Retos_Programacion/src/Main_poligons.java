import java.util.Scanner;

public class Main_poligons {
    /**
     * L'exercici ens proposa fer una única funció que ens calculi l'area de varis poligons
     * @author <a href="https://retosdeprogramacion.com/ejercicios">Retos de Programacion</a>
     */
    public static void main(String[] args) {
        // Intentarem calcular l'àrea de 3 figures: triangle, quadrat i pentàgon
        final String MISSATGE_DESPEDIDA = "Fins aviat";
        final String MISSATGE_ERROR = "ERROR. Sisplau, tria una opció vàlida.";
        Scanner scan = new Scanner(System.in);
        int area = 0;
        int base;
        int altura = 0;
        int apotema = 0;
        int lado = 0;
        int continuar;
        boolean fi = false;
        String nom = "";

        do {
            int opcio = 0;
            boolean opcioValida = false;

            while (!opcioValida) {
                System.out.print("Polígons a triar:\n" +
                        "\t1.- Triangle (1)\n" +
                        "\t2.- Quadrat (2)\n" +
                        "\t3.- Pentàgon (3)\n" +
                        "\t4.- Sortir (0)\n" +
                        "Tria una de les opcions: ");
                opcio = scan.nextInt();

                if (opcio >= 0 && opcio <= 3) {
                    opcioValida = true;
                } else {
                    System.out.println(MISSATGE_ERROR);
                }
            }

            if (opcio != 0) {
                System.out.print("Introdueix la base: ");
                base = scan.nextInt();
                if (opcio == 3) {
                    System.out.print("Introdueix l'apotema del pentàgon: ");
                    apotema = scan.nextInt();
                    System.out.print("Introdueix el costat del pentàgon: ");
                    lado = scan.nextInt();
                } else {
                    System.out.print("Introdueix l'altura: ");
                    altura = scan.nextInt();
                }
                switch (opcio) {
                    case 1:
                        area = (base * altura) / 2;
                        nom = "triangle";
                        break;
                    case 2:
                        area = base * altura;
                        nom = "quadrat";
                        break;
                    case 3:
                        area = (5 * lado * apotema) / 2;
                        nom = "pentàgon";
                        break;
                }
                System.out.println("L'àrea de un " + nom + " és de " + area + ".");
                System.out.print("Vols calcular més àrees?\n" +
                        "\tSí (1) o No (0): ");
                continuar = scan.nextInt();
                if (continuar == 0) {
                    System.out.println(MISSATGE_DESPEDIDA);
                    fi = true;
                }
            } else {
                System.out.println(MISSATGE_DESPEDIDA);
                fi = true;
            }
        } while (!fi);
    }
}
