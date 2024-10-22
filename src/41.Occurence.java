import java.util.Scanner;

class Occurence {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to find occurence of an element in an array");
         int[] Array = ArrayUtillity.arraynum();
         System.out.print("Enter the element you want to check :");
         int num = input.nextInt();
         int Occurrence  = occurrence(Array,num);
         System.out.println("The number " +num+" comes "+Occurrence+" times in the given array.");
     }
     public static int occurrence(int[] Array, int num){
         int i = 0;
         int occurrence = 0;
         while(i < Array.length) {
             if (num == Array[i]) {
                 occurrence++;
             }
             i++;
         }
         return occurrence;
     }
 }