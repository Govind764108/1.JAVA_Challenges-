import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print Fibonacci series\n");
        System.out.print("Enter the number up to you want to print series:");
        int num = input.nextInt();
        System.out.println("Series is:");
        series(num);

    }

    public static void series(int num) {
        if(num<0)return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0,second=1;
        while(first + second <= num ){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}