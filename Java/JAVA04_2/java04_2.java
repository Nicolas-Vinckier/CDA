package Java.JAVA04_2;

public class java04_2 {
    public static void main(String[] args) {
        int poid = Integer.parseInt(args[0]);

        switch (poid) {
            case 0:
                System.out.println("petit");
                break;
            case 1:
                System.out.println("petit");
                break;
            case 2:
                System.out.println("Moyen");
                break;
            default:
                System.out.println("Grand");
        }
    }
}
