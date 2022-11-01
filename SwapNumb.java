import java.util.Scanner;
public class SwapNumb {
    public static void main(String []args) {
        int num_1 = 10;
        int num_2 = 5;
        System.out.println(num_1 + " " + num_2);

        num_1 = num_1 + num_2;
        num_2 = num_1 - num_2;
        num_1 = num_1 - num_2;
        System.out.println(num_1 + " " + num_2);

        // Scanner sc = new Scanner(System.in);
        // int num_3 = sc.nextInt();
        // int num_4 = sc.nextInt();
        // num_3 = num_3 - num_4;
        // num_4 = num_4 + num_3;
        // System.out.println(num_3 + " " + num_4);
    }
}