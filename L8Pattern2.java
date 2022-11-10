import java.util.Scanner;
public class L8Pattern2 {
    public static void main(String []args) {
        System.out.println("Second Pattern Hollow rectangle");
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        for(int i = 1; i <= R; i++) {
            for(int j = 1; j <= C; j++) {
                if(i == 1 || i == R || j == 1 || j == C) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}