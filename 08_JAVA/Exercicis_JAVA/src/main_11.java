public class main_11 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 2;

        System.out.println(num2 == num4); //true
        System.out.println(num2 == num3); //false
        System.out.println(num1 != num3); //true
        System.out.println(num2 != num2); //false
        System.out.println(num4 < num3); //true
        System.out.println(num3 < num1); //false
        System.out.println(num1 > num3); //false
        System.out.println(num2 > num4); //false
        System.out.println(num2 > num3); //false
        System.out.println(num2 <= num3); //true
        System.out.println(num2 <= num4); //true
        System.out.println(num2 <= num1); //false
        System.out.println(num1 >= num2); //false
        System.out.println(num2 >= num1); //true
        System.out.println(num2 >= num2); //true
    }
}
