 class sumOfDiagonal2DArray {
     public static void main(String[] args) {
         System.out.println("Welcome to get sum of Diagonal Elements\n");
         int[][] array = ArrayUtillity.inputArray2D();
         long sum = sumOfDiagonal(array);
         System.out.println("Sum of diagonals is: " + sum);


     }
     public static long sumOfDiagonal(int[][] array){
         long sumRight = sumOfRightDiagonal(array);
         long sumLeft = sumOfLeftDiagonal(array);
         long sum = sumRight + sumLeft;
         if(array.length % 2 != 0){
             //in 3*3 array A11 we have to subtract, we can get index 1 by
             //dividing array.length(3) by 2.
             int ind = array.length / 2;
             sum -= array[ind][ind];
         }
         return sum;
     }
     public static long sumOfLeftDiagonal(int[][] array){
         int i = 0;
         long sum = 0;
         while(i < array.length){
             sum += array[i][i];
             i++;
         }
         return sum;
     }
     public static long sumOfRightDiagonal(int[][] array){
         int i = 0;
         long sum = 0;
         while (i < array.length) {
             //to get column element
             //in first row (3 - 1 - 0 = 2) i.e A02
             int col = array.length - 1 - i;
             sum += array[i][col];
             i++;
         }
         return sum;
     }
 }














//     public static int sumOfDiagonal(int[][] array){
//         int i = 0;
//         int sum = 0;
//         while(i < array.length  ){
//            sum += array[i][i];
//            i++;
//         }
//         return sum;
//     }
//}
