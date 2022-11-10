import java.util.Scanner;
public class SumSeries {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);  /// Wrong in this question
        int num = sc.nextInt();

        int ans = 0;
        for(int i = 1; i <= num; i++) {
            if(num % 2 == 0) {
                ans -=  i;
            }
            else {
                ans +=  i;
            }

            
            
            //num = sc.nextInt;
        }
        System.out.println(ans);
    }
}