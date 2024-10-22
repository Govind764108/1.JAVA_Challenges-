import java.util.Scanner;

 class PosiNegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        float num = input.nextFloat();
        if(num>0){
            System.out.println(num+" is positive.");
        } else if (num<0) {
            System.out.println(num+" is negative.");

        }else{
            System.out.println(num+ " is zero.");
        }
    }
}
