import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Armstrong number!\n");
        System.out.print("Enter the number :");
        int num = input.nextInt();
        boolean isArmstrong = isArmastrong(num);
        if(isArmstrong){
            System.out.println(num+" is a Armstrong number.");
        }
        else{
            System.out.println("Not a Armstrong number.");
        }
    }
    public static boolean isArmastrong(int num){
        int noOfDigits = noOfDigits(num);
        int copyNumber = num;
        int finalNumber = 0;
        while(num>0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += power(lastDigit, noOfDigits);
        }
        return finalNumber==copyNumber;
        }

        public static int power(int num1,int num2){
        int result = 1;
        int i=0;
        while (i<num2){
            result *= num1;
            i++;
        }
        return result;
        }


    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
           num /= 10;
        }
        return digits ;
    }
}