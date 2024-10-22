import java.util.Scanner;

class GDC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find gcd !\n");
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD is :"+gcd);
    }
    public static int gcd(int num1,int num2){
        int least = least(num1,num2);
        int gcd = 1;
        int i=2;
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
            i++;
        }

        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
