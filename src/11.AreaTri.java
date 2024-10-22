import java.util.Scanner;

 class AreaTri11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of triangle:");
        float base = input.nextFloat();
        float height = input.nextFloat();
        double area = (0.5*base*height);
        System.out.println("Area of the given triangle is :"+area);
    }
}
