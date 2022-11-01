import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int power = 1;
        int ans = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            ans += lastDigit * power;
            power /= 10;
            num = num/10;

        }
        System.out.println(ans);

    }
}