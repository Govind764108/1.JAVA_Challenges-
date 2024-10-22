import java.util.Scanner;

 class AgeCat20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the age:");
        int age = input.nextInt();
        if(age<12) System.out.println("Child.");
        else if (age<20) System.out.println("Teen.");
        else if (age<60) System.out.println("Adult.");
        else System.out.println("Senior.");

        }

    }
