public  class  banderas_ansi  {
        public  static  void  main(String[]  args)  {
                /*
                per  fer  les  banderes  es  poden  guardar  en  un  array  bidimensional  de  18x36  aixo  et  dona  el
                tamany  per  fer  les  5  banderas  de  mostra
                  */
                //Background  colors
                final  String  RESET  =  "\033[0m";
                final  String  BLACK_BG  =  "\033[48;2;0;0;0m";
                final  String  BLUE_BG  =  "\033[48;2;5;29;153m";
                final  String  RED_BG  =  "\033[48;2;218;18;26m";
                final  String  YELLOW_BG  =  "\033[48;2;252;221;9m";
                final  String  WHITE_BG  =  "\033[48;5;255;255;255m";
                //Text  color
                final  String  BLACK_TEXT  =  "\033[38;2;0;0;0m";
                final  String  BLUE_TEXT  =  "\033[38;2;5;29;153m";
                final  String  RED_TEXT  =  "\033[38;2;218;18;26m";
                final  String  YELLOW_TEXT  =  "\033[38;2;252;221;9m";
                final  String  WHITE_TEXT  =  "\033[38;2;255;255;255m";
                //Text  format
                final  String  BOLD  =  "\033[1m";

                String  [][]  ucrain  =  {
                                {BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET},
                                {BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET},
                                {BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET},
                                {BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET,  BLUE_BG  +  "  "  +  RESET},
                                {YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET},
                                {YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET},
                                {YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET},
                                {YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET,  YELLOW_BG  +  "  "  +  RESET},
                };
                String [][] shit = {
                        {BLUE_BG + "  " + RESET, BLUE_BG + "  " + RESET, },
                };
                for  (int  i  =  0;  i  <  ucrain.length;  i++)  {  //  Recorrer  filas
                        for  (int  j  =  0;  j  <  ucrain[i].length;  j++)  {  //  Recorrer  columnas
                                System.out.print(ucrain[i][j]);  //  Usar  tabulación  para  separar
                        }
                        System.out.println();  //  Nueva  línea  al  final  de  cada  fila
                }
        }
}
