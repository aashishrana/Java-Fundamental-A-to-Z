import java.util.Scanner;
public class L8Pattern1 {
    public static void main(String []args) {
        System.out.println("First Pattern");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        for(int i = 1; i <= R; i++) {
            for(int j = 1; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}