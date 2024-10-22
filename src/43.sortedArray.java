 class sortedArray {
     public static void main(String[] args) {
         System.out.println("Welcome to check sorted array\n");
         int[] arr = ArrayUtillity.arraynum();
         boolean isInc = isInc(arr);
         boolean isDec = isDec(arr);
         if(isInc || isDec){
             System.out.println("Array is sorted");
         }
         else{
             System.out.println("Array is not sorted");
         }
     }
     public static boolean isInc(int[] arr){
         int i = 1;
         while(i < arr.length){
             if(arr[i] < arr[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }

     public static boolean isDec(int[] arr){
         int i = 1;
         while(i < arr.length){
             if(arr[i] > arr[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }
 }