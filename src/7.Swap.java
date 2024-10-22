import java.util.Scanner;

class Swap7 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the value of a:");
         int a=input.nextInt();
         System.out.print("Enter the value of b:");
         int b= input.nextInt();
        //assign the value of a to another variable so that b can be given to the value of a
         int c=a;
          a = b;
          b = c;
         System.out.println(a);
         System.out.println(b);


     }
}
