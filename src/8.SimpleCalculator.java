import java.util.Scanner;

 class SimpleCalculator8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1=input.nextDouble();
        System.out.print("Please Enter the Second number:");
        double num2 = input.nextDouble();
        System.out.println("Enter the operator: +,-,*,/");
        char operator = input.next().charAt(0);
        double result;
        switch (operator){
            case'+':
                result = num1  + num2;
                System.out.println("Addition of "+num1+ " and "+num2+" is :"+result);

            case'-':
                result = num1  - num2;
                System.out.println("Subtraction of "+num1+ " and "+num2+" is :"+result);

                case'*':
                result = num1  * num2;
                System.out.println("Multiplication of "+num1+ " and "+num2+" is :"+result);

                case'/':
                result = num1  / num2;
                System.out.println("Division of "+num1+ " and "+num2+" is :"+result);
        }

    input.close();
    }
}
