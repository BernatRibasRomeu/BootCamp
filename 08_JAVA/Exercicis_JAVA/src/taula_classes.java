public class taula_classes {
    public static void main(String[] args) {
                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "Nombre", "Tipo", "Tamaño", "Valor por defecto", "Rango");
                System.out.println("----------------------------------------------------------------------------------------");

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "byte", "Entero", Byte.SIZE + " bits", "0", Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "short", "Entero", Short.SIZE + " bits", "0", Short.MIN_VALUE + " a " + Short.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "int", "Entero", Integer.SIZE + " bits", "0", Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "long", "Entero", Long.SIZE + " bits", "0L", Long.MIN_VALUE + " a " + Long.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "float", "Decimal", Float.SIZE + " bits", "0.0f", Float.MIN_VALUE + " a " + Float.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "double", "Decimal", Double.SIZE + " bits", "0.0d", Double.MIN_VALUE + " a " + Double.MAX_VALUE);

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "char", "Carácter", Character.SIZE + " bits", "'\\u0000'", "'\\u0000' (0) a '\\uffff' (" + (int) Character.MAX_VALUE + ")");

                System.out.printf("%-10s %-10s %-12s %-20s %-40s %n",
                        "boolean", "Lógico", "1 bit", "false", "true o false");
    }
}
