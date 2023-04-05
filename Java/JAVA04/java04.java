package Java.JAVA04;

public class java04 {
    public static void main(String[] args) {
        int variable = 100;

        if (variable <= 1000) {
            System.out.println("0%");
        } else if (variable >= 1000 && variable <= 2000) {
            System.out.println("1%");
        } else if (variable >= 2000 && variable <= 5000) {
            System.out.println("3%");
        } else {
            System.out.println("5%");
        }
    }
}
