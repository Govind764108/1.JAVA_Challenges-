 class mergeTwoSortedArray {
     public static void main(String[] args) {
         System.out.println("Welcome to merge two sorted array\n");
         int[] arr1 = ArrayUtillity.arraynum();
         int[] arr2 = ArrayUtillity.arraynum();
         int[] newArr = merge(arr1, arr2);
         System.out.println("New merge sorted array is");
         ArrayUtillity.displayArray(newArr);
     }

     public static int[] merge(int[] arr1, int[] arr2) {
         int size = arr1.length + arr2.length;
         int[] mergeArray = new int[size];
         int i = 0, j = 0, k = 0;
         while (i < arr1.length || j < arr2.length) {
             if ( j == arr2.length ||
                     (i < arr1.length && arr1[i] < arr2[j])) {
                 mergeArray[k] = arr1[i];
                 i++;
                 k++;
             } else {
                 mergeArray[k] = arr2[j];
                 k++;
                 j++;
             }
         }
         return mergeArray;
     }
 }


