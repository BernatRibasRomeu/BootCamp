import java.util.Scanner;

public  class  banderas_ansi  {
        
        //Background  colors
        public static final  String  RESET  =  "\033[0m";
        public static final  String  BLACK_BG  =  "\033[48;2;0;0;0m";
        public static final  String  BLUE_BG  =  "\033[48;2;5;29;153m";
        public static final  String  RED_BG  =  "\033[48;2;218;18;26m";
        public static final  String  YELLOW_BG  =  "\033[48;2;252;221;9m";
        public static final  String  WHITE_BG  =  "\033[48;5;255;255;255m";
        //Text  color
        public static final  String  BLACK_TEXT  =  "\033[38;2;0;0;0m";
        public static final  String  WHITE_TEXT  =  "\033[38;2;255;255;255m";
        //Text  format
        final  String  BOLD  =  "\033[1m";

        public  static  void  main(String[]  args)  {

                final String BLACK = BLACK_BG + "  " + RESET;
                final String RED = RED_BG + "  " + RESET;
                final String BLUE = BLUE_BG + "  " + RESET;
                final String YELLOW = YELLOW_BG + "  " + RESET;
                final String WHITE = WHITE_BG + "  " + RESET;

                String  [][]  ucrain  =  {
                                {BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE},
                                {BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE},
                                {BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE},
                                {BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE,  BLUE},
                                {YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW},
                                {YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW},
                                {YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW},
                                {YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW,  YELLOW},
                };

                String [][] france = {
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, RED},
                };
                
                String [][] greece = {
                        {BLUE, BLUE, WHITE, WHITE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE},
                        {BLUE, BLUE, WHITE, WHITE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE},
                        {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE},
                        {BLUE, BLUE, WHITE, WHITE, BLUE, BLUE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE},
                        {BLUE, BLUE, WHITE, WHITE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE},
                        {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, },
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE},
                        {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, },
                        {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE},
                };

                String [][] spain = {
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                };

                String [][] catalonia = {
                        {BLUE, BLUE, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {BLUE, BLUE,   BLUE,    RED,    RED,    RED,    RED,    RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE,   BLUE,   BLUE, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {BLUE, BLUE,   WHITE,   BLUE,   BLUE,    RED,    RED,    RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {BLUE, WHITE,   WHITE,   WHITE,   BLUE, BLUE, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {BLUE, BLUE,   WHITE,   BLUE,   BLUE,    RED,    RED,    RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE,   BLUE,   BLUE, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {BLUE, BLUE,   BLUE,    RED,    RED,    RED,    RED,    RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {BLUE, BLUE, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                };

                String [][] germany = {
                        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
                        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
                        {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED, RED},
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                        {YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, YELLOW, },
                };

                Scanner scan = new Scanner(System.in);
                banderas_ansi b = new banderas_ansi();

                System.out.println("Quina bandera vols veure?\n" +
                        "\tUcraïna: ukr\n" + "\tGrècia: gre\n" + "\tFrança: fra\n" + "\tEspanya: esp\n" + "\tCatalunya: cat\n" + "\tAlemanya: ger\n");
                String bandera = scan.next();
                String pais;

                switch (bandera){
                        case "ukr":
                                pais = "Ucraïna";
                                b.imprimirBandera(ucrain, pais);
                                break;
                        case "gre":
                                pais = "Grècia";
                                b.imprimirBandera(greece, pais);
                                break;
                        case "fra":
                                pais = "França";
                                b.imprimirBandera(france, pais);
                                break;
                        case "esp":
                                pais = "Espanya";
                                b.imprimirBandera(spain, pais);
                                break;
                        case "cat":
                                pais = "Catalunya";
                                b.imprimirBandera(catalonia, pais);
                                break;
                        case "ger":
                                pais = "Alemanya";
                                b.imprimirBandera(germany, pais);
                                break;
                        default:
                                System.out.println("La opció no és correcte.");
                                break;
                }
        }

        public void imprimirBandera(String [][] bandera, String pais){

                String ucraina = YELLOW_BG + "  " + RESET + BOLD + "Ucraïna" + BLUE_BG + "  " + RESET;
                String grecia = BLUE_BG + "  " + RESET + BOLD + "Grècia" + WHITE_BG + "  " + RESET;
                String franca = BLUE_BG + "  " + RESET + WHITE_BG + BOLD + BLACK_TEXT + "França" + RESET + RED_BG + "  " + RESET;
                String espanya = RED_BG + "  " + RESET + YELLOW_BG + BOLD + BLACK_TEXT + "Espanya" + RESET + RED_BG + "  " + RESET;
                String catalunya = YELLOW_BG + "  " + RESET + RED_BG + "  " + RESET + BOLD + BLUE_BG + "Catalunya" + RESET + RED_BG + "  " + RESET + YELLOW_BG + "  " + RESET;
                String alemanya = BLACK_BG + "  " + RESET + RED_BG + BOLD + WHITE_TEXT + "Alemanya" + RESET + YELLOW_BG + "  " + RESET;

                for  (int  i  =  0;  i  <  bandera.length;  i++)  {
                        for  (int  j  =  0;  j  <  bandera[i].length;  j++)  {
                                System.out.print(bandera[i][j]);
                        }
                        System.out.println();
                }
                System.out.println();
                switch (pais){
                        case "Ucraïna":
                                System.out.println(ucraina);
                                break;
                        case "Grècia":
                                System.out.println(grecia);
                                break;
                        case "França":
                                System.out.println(franca);
                                break;
                        case "Espanya":
                                System.out.println(espanya);
                                break;
                        case "Catalunya":
                                System.out.println(catalunya);
                                break;
                        case "Alemanya":
                                System.out.println(alemanya);
                                break;
                }

        }
}
