import java.util.Scanner;
public class Loops {
    public static void main(String []args) {
        System.out.println("Loops in Java");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i < num) {
            System.out.println(i);
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}