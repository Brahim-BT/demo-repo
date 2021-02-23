import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = Math.random() * 100;
        int n = (int) d;
        System.out.println("Try to guess the number :");
        System.out.print("Guess the number : ");
        int g = sc.nextInt();
        while (g != n) {
            if (g > n) {
                System.out.println("Smaller than that");
                g = sc.nextInt();
            } else if (g < n) {
                System.out.println("Bigger than that");
                g = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Bingoo !!");
        sc.close();
    }
}
