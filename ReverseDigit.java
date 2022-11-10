import java.util.Scanner;
public class ReverseDigit {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int ans = 0;
       while(num > 0) {
        int reminder = num % 10;
        ans = (ans * 10 + reminder);
        num = num / 10;
       }
       System.out.println("Reverse of Digit is " + ans);
    }
}