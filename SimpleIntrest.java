import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String []args) {
        System.out.println("Calculate Intrest");
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();

        float total = (principal * rate * time)/100;
        System.out.println("Total is " + total); 
    }
}