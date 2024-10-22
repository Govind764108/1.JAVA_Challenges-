import java.util.Scanner;

class Lcm {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Find LCM of two numbers!\n");
         System.out.print("Please enter the first number:");
         int num1 = input.nextInt();
         System.out.print("Please enter the second number:");
         int num2 = input.nextInt();
         int lcm = LCM(num1,num2);
         System.out.println("LCM is: "+lcm);

     }
     public static int LCM(int num1,int num2){
         int i =1;
         //15*20 = 300 i.e. 15 ki table 20 tk chlegi to mil hi jayega.
         while(i<num2)//agar condn me true bhi likhe de to bhi chlega
              {
             int factor = num1*i;
             if(factor%num2 == 0){
                 return factor;
             }
             i++;
         }
         return 0;
     }
}
