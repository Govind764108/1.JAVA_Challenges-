import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find prime number.");
        System.out.print("Enter the number:");
        int num = input.nextInt();
        boolean isprime = isPrime(num);
        if(isprime){
            System.out.println(+num+" is prime number.");
        }else{
            System.out.println("Not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
