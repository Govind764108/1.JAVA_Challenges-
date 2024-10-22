import java.util.Scanner;

 class CompoundInterest13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //principle amount
        System.out.print("Enter the principle amount:");
        double principle = input.nextDouble();
            //rate
        System.out.print("Enter the rate amount per annum:");
        double rate = input.nextDouble();
            //time
        System.out.print("Enter the time:");
        double time = input.nextDouble();

        double compound = principle*Math.pow((1+rate/100),time);
        System.out.print("Compound interest is :"+compound);
    }
}
