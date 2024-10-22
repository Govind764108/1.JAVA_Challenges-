import java.util.Scanner;

public class ArrayUtillity {
    public static int[] arraynum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter the element no "+(i+1)+" : ");
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }

    public static void displayArray(int[] array){
        int i = 0;
        while (i < array.length){
            System.out.print(array[i]+" ");
            i++;
        }
    }

    public static int[][] inputArray2D() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int row = input.nextInt();
        System.out.print("Enter the no. of columns:");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                System.out.print("Enter the element in the row :" + (i + 1) + " column :" + (j + 1) +" :");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;

    }



}
