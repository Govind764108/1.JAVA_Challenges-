import java.util.Scanner;

class sumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of odd numbers.\n");
        System.out.print("Please enter the number:");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("The sum of odd numbers till "+num+" is:"+sum);
    }
        public static int oddSum(int num){
        int i=1;
        int count=0;
        while(i<=num){
            count += i;
            i += 2;
        }
        return count;
        }
}