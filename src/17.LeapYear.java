import java.util.Scanner;

 class LeapYear17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap year checker");
        System.out.print("Enter the year :");
        int year= input.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        }
    }

