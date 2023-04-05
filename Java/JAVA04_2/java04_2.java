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

    // public static void java42(String[] args) {
    // for (int i = 0; i < args.length; i++) {
    // int variable = Integer.parseInt(args[i]);
    // if (variable <= 1000) {
    // System.out.println("0%");
    // } else if (variable >= 1000 && variable <= 2000) {
    // System.out.println("1%");
    // } else if (variable >= 2000 && variable <= 5000) {
    // System.out.println("3%");
    // } else {
    // System.out.println("5%");
    // }
    // }
    // }
}
