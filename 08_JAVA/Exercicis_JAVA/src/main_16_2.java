public class main_16_2 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 4, 6, 8, 9, 12, 14, 15, 18};
        main_16_2 m = new main_16_2();
        System.out.print("Divisibles por 3 usando un for: ");
        m.buscarFor(numeros);

        System.out.print("Divisibles por 3 usando un while: ");
        m.buscarWhile(numeros);
    }

    public void buscarFor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void buscarWhile(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
            i++;
        }
    }
}
