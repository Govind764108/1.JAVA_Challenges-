import java.util.Scanner;

 class Product9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float num1=input.nextFloat();
        System.out.print("Please Enter the Second number:");
        float num2 = input.nextFloat();
        float result;
        result = num1*num2;
        System.out.println("Product of given two numbers is :"+result);

    }
}
