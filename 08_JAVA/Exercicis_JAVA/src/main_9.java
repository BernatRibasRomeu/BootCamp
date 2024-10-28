public class main_9 {
    public static void main(String[] args) {
        int numero = 0;
        numero = incrementar(numero);
        System.out.println(numero);
        numero = disminuir(numero);
        System.out.println(numero);
        numero = incrementar(numero);
        System.out.println(numero);
        numero = incrementar(numero);
        System.out.println(numero);
        numero = disminuir(numero);
        System.out.println(numero);
    }
    public static int incrementar(int num){
        num += 1;
        return num;
    }public static int disminuir(int num){
        num -= 2;
        return num;
    }
}
