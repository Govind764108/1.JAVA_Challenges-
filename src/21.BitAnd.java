import java.util.Scanner;

class BitAnd {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Bitwise And.");
         System.out.println("Please enter the first number:");
         int num1 = input.nextInt();
         System.out.println("Now please enter the second number:");
         int num2 = input.nextInt();
         int result = num1 & num2;
         System.out.println("Result is :"+result);
     }
}
