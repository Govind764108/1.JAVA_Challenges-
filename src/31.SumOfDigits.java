import java.util.Scanner;

class SumOfDigits {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome for sum of digits!\n");
         System.out.print("Please enter the digit :");
         int digit = input.nextInt();
         int sum = sumOfdigit(digit);
         System.out.println("The sum of "+digit+" is : "+sum);
     }
     public static int sumOfdigit(int digit){
         int sum = 0;
         while(digit>0){
             sum = sum + (digit%10);
             //10 se divide krne se last vali digit hat jayegi
             //kyunki interger he 232.4 me se 4 hat jayega
             digit = digit/10;
         }
         return sum;
     }
}
