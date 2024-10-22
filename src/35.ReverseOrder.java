import java.util.Scanner;

class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the number.\n");
        System.out.print("Enter the number:");
        int num = input.nextInt();
        int Reverse = rev(num);
        System.out.println("Reverse will be:"+Reverse);

    }
    public static int rev(int num){
        int reverse = 0;
        while(num>0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        return reverse;
    }
}