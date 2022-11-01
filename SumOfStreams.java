import java.util.Scanner;
public class SumOfStreams {
    public static void main(String []args) {
        System.out.println("Sum of Stream");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the numbers");
        int num = sc.nextInt();
        int sum = 0;
        
        while(num != -1) {
            
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}