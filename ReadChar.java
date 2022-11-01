import java.util.Scanner;
public class ReadChar {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(4);
        System.out.println("Character is " + ch); 

    }
}