 class reverseArray{
     public static void main(String[] args) {
         System.out.println("Welcome to reverse an Array\n");
         int[] newArray = ArrayUtillity.arraynum();
         int[] reversedArray = reverseArray(newArray);
         ArrayUtillity.displayArray(reversedArray);



     }
     public static int[] reverseArray(int[] newArray){
         int[] reversArr = new int[newArray.length];
         int i = newArray.length - 1;
         int j=0;
         while(i>=0){
             reversArr[j] = newArray[i] ;
             j++;
             i--;
         }
         return reversArr;
     }



    
}
