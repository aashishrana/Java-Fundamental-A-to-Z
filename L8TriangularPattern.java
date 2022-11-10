import java.util.Scanner;
public class L8TriangularPattern {
    public static void main(String []args) {
        System.out.println("Triangular Pattern");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        for(int i = 1; i <= R; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}