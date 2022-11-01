//Decimal Number system 1234 = 1 * 1000 OR 10 ^ 3 + 2 * 100 OR 10 ^ 2 + 3 * 10 OR 10 ^ 1 + 4 * 1 OR 10 ^ 0
// Decimal number on the base 10

// Binary no system 1010 = 1 * 8 OR 2 ^ 3 + 0 * 4 OR 2 ^ 2 + 1 * 2 OR 2  ^ 1 + 0 * 2 OR 2 ^ 0
// BINARY NUMBER SYSTEM ON BASE 2

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String []args) {
        System.out.println("Hello Guys");
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        System.out.println(num_1);
        int power = 1;
        int ans = 0;
        while(num_1 > 0) {
           // num_1 = num_1 % 10;
            int lastDigit = num_1 % 10;
            ans += lastDigit * power;  
            power *= 2;
            num_1 /= 10; 
        }
        System.out.println(ans);
    }
}