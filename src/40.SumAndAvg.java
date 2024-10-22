 class SumAndAvg {
     public static void main(String[] args) {
         System.out.println("Welcome to Sum and Average of array");
         int[] Array = ArrayUtillity.arraynum();
         long Sum = sum(Array);
         double Average = average(Array);
         System.out.println("Sum of given array is : "+Sum);
         System.out.println("Sum of given array is : "+Average);
     }
     public static long sum(int[] Array){
         long sum = 0;
         int i = 0;
         //Traversing the each element of array and adding them to sum
         while (i < Array.length){
             sum += Array[i];
             i++;
         }
         return sum;
     }

     public static double average(int[] Array){
         //Calling the sum method
         double average = sum(Array);
         //Explicitly casting long to int
         return average/Array.length;
     }

}
