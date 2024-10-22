import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome for finding factorial of a given number.\n");
        System.out.print("Please enter the number:");
        int num = input.nextInt();
        long factorial = factorial(num);
        System.out.println("Factorial of "+num+" is : "+ factorial);
    }
        public static long factorial(int num){
        long factorial = 1;
        int i=1;
        while(i<=num){
            factorial *= i;
            i++;
        }
        return factorial;

        }
}
