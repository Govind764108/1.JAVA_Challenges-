import java.util.Scanner;

class maxMinElement {
     public static void main(String[] args) {
         System.out.println("Welcome to find max and min elements in an Array\n");
         Scanner input = new Scanner(System.in);
         int[] Array = ArrayUtillity.arraynum();
         int Max = max(Array);
         int Min = min(Array);
         System.out.println("Maximum element is : "+Max);
         System.out.println("Minimum element is : "+Min);


     }

     public static int min(int[] Array){
         int min = Integer.MAX_VALUE;
         int i = 0;
         while(i < Array.length){
             if(min > Array[i]){
                 min = Array[i];
             }
             i++;
         }
         return min;
     }

     public static int max(int[] Array) {
         if(Array.length == 0){
             return Integer.MIN_VALUE;
         }
         int max = Array[0];
         int i = 1;
         while(i < Array.length){
             if(max < Array[i]){
                 max = Array[i];
             }
             i++;
         }
         return max;
     }
}
