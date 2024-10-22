import java.util.Scanner;

class BitNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise NOT.");
        System.out.println("Please enter the number:");
        int num1 = input.nextInt();
        int result = ~num1;
        System.out.println("Result is :"+result);
    }
}


