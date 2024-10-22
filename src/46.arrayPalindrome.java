 class arrayPalindrome {
     public static void main(String[] args) {
         System.out.println("Welcome to check Array Palindrome\n");
         int[] arr = ArrayUtillity.arraynum();
         boolean ispalindrome = palindrome(arr);
         if(ispalindrome){
             System.out.println("Array is palindrome");
         }
         else System.out.println("Not a palindrome");

     }
     public static boolean palindrome(int[] arr){
         int i = 0;
         while(i < arr.length / 2){
             if(arr[i] != arr[arr.length - 1 -i]){

                 return false;
             }
             i++;
         }

         return true;
     }
}
