import java.util.Scanner;
public class if_else {
    public static void main(String []args) {
        System.out.println("Condition Statement ");
        Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        if(num_1 > num_2) {
            System.out.println("Number one is Greater " + num_1);
        }
        else {
            System.out.println("Number two is Greater");
        }

        String result;
        result = (num_1 % num_2 == 0)? "Divisible": "Not Divisible";
        System.out.println(result);
    }
 }