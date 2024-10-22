import java.awt.*;
import java.util.Scanner;

class Pattern {
     public static void main(String[] args) {
         System.out.print("Enter the number:");
         Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         int i=1;
         while(i<=num){
             System.out.print("* ");
             int j=1;
             while(j<=i){
                 System.out.println(" *");
                 j++;
             }
             System.out.println();
             i++;

         }
     }

}
