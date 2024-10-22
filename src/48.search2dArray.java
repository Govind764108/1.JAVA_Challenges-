import java.sql.SQLOutput;
import java.util.Scanner;

class search2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to search element in 2D Array\n");
        int[][] numArr  = ArrayUtillity.inputArray2D();
        System.out.print("\nNow please enter the number you want to search :");
        int num = input.nextInt();
        boolean isAvailable = searchForNum(numArr,num);
        if(isAvailable) System.out.println(num+" is present in the array");
        else System.out.println(num+" is not present in the array");
    }

    public static boolean searchForNum(int[][] numArr, int num){
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
