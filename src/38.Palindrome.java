import java.util.Scanner;

class Palindrome {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Check palindrome number");
         System.out.print("Enter the number:");
         int num = input.nextInt();
         boolean isPalindrome = isPalindrome(num);
         if(isPalindrome){
             System.out.println(num+" is palindrome number");
         }
         else {
             System.out.println("Not a palindrome number");
         }

     }
    public static boolean isPalindrome(int num){
         int copyNum = num;
         int Reverse = reverse(num);
         if(Reverse == copyNum){
             return true;
         }
         return false;

    }

    //reverse a number
    public static int reverse(int num){
         int newNum = 0;
         while(num>0) {
             int digit = num % 10;
             newNum = newNum * 10 + digit;
             num /= 10;
         }
         return newNum;
    }



}
