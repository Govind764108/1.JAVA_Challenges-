import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise LeftShift.");
        System.out.println("Please enter the number:");
        int num1 = input.nextInt();
        int result = num1<<4;
        System.out.println("Result is :"+result);
    }
}
