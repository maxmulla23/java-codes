import java.util.Scanner;

public class Calculation {
    public static void main(String[] args)
   
    {

        Scanner enter = new Scanner (System.in);
        float a  , b , sum  , product , division;
        System.out.println("Enter a" );
        a = enter.nextInt();
        System.out.println("Enter b");
        b = enter.nextInt();
        sum=a+b;
        product=a*b;
        division=a/b;
        System.out.println("sum" +sum);
        System.out.println("product" +product);
        System.out.println("division" +division);
        }
 
        
}