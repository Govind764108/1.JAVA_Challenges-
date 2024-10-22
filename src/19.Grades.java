import java.util.Scanner;

class Grades19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade finder.");
        System.out.print("Please enter your marks:");
        int marks = input.nextInt();
        if(marks>90) System.out.println("Your grade is A,Congratulations...");
        else if (marks>75) System.out.println("Your grade is B.");
        else if (marks>60) System.out.println("Your grade is C.");
        else if (marks>33) System.out.println("Your grade is D.");
        else System.out.println("Your grade is F");
            
        }

    }


