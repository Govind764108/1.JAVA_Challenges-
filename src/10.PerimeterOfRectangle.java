import java.util.Scanner;

 class PerimeterOfRectangle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle:");
        float leng = input.nextFloat();
        float bread = input.nextFloat();
        float peri = (leng  * bread) ;
        System.out.println("Perimeter of the given rectangle is:"+peri);



    }
}
