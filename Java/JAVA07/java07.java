package Java.JAVA07;

public class java07 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}