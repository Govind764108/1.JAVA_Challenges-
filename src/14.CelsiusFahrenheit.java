import java.util.Scanner;

 class CelsiusFahrenheit14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //fahrenheit to celsius
        System.out.print("Enter the Fahrenheit temperature:");
        float fahren = input.nextFloat();
        float celsius = (fahren-32)*5/9;
        System.out.print("In Celsius the temperature is:"+celsius);
    }
}
