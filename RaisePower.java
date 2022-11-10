import java.util.Scanner;
public class RaisePower {
    public static void main(String []args) {
        System.out.println("Power of a number is");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= b; i++) {
            ans = ans * a;
            System.out.println(ans);
        }

        System.out.println(ans);
    }
}