import java.util.Scanner;

 class OddEven16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even Odd checker");
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+" is a Even number.");
        }
        else System.out.println(num+" is a Odd number.");
    }
}
