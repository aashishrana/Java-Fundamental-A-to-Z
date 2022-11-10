import java.util.Scanner;
public class L8PyramidPattern {
    public static void main(String []args) {
        System.out.println("Pyramid Patterns");
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        for(int i = 1; i <= R; i++) {
            for(int j = 1; j <= R - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}