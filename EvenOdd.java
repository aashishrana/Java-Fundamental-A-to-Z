import java.util.Scanner;
public class EvenOdd {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String result;
        result = (num % 2 == 0)? "Even": "Odd";
        System.out.println(result);

    }
}