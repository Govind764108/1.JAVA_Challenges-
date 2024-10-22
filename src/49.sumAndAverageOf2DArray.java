 class sumAndAverageOf2DArray {
     public static void main(String[] args) {
         System.out.println("Welcome in sum and average in 2D array\n");
         int[][] array = ArrayUtillity.inputArray2D();
         int Sum = sum(array);
         System.out.print("Sum of all the elements is :"+Sum);
         double Avg = Average(array);
         System.out.println("\nAverage of all the elements is :"+Avg);

     }

     public static int sum(int[][] array){
         int sum = 0;
         int i = 0;
         while (i < array.length){
             int j = 0;
             while(j < array[i].length){
                 sum += array[i][j];
                 j++;
             }
             i++;
         }
         return sum;
     }

     public static double Average(int[][] array){
         if(array.length == 0){
             return 0;
         }
         int row = array.length;;
         int cols = array[0].length;
         double size = row * cols ;
         return sum(array)/ size;
     }
 }
