import java.util.Scanner;

 class Challenge1 {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.print("Tell your name:");
        String name = input.nextLine();
        System.out.println("Welcome "+name+" to KG Coding."); */

            //Challenge 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:" );
        int num1 = input.nextInt();
        System.out.print("Enter the second number:" );
        int num2 = input.nextInt();
        int sum;
        sum=num1 + num2;
        System.out.print("Addition is :"+sum);
    }
}
