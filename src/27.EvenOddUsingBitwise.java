import java.util.Scanner;

class EvenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise RightShift.");
        System.out.print("Please enter the number:");
        int num1 = input.nextInt();
          //wring  int result = num1 >> 1;
        if ((num1 & 1) == 1 ) {
            System.out.println(num1 + " is Odd Number.");

        } else {
            System.out.println(num1 + " is Even number.");
        }
    }
}
