import java.util.Scanner;

public class calc {
    int a,b;
    int c;
    public void Choice (int c){
        
        System.out.println("1.Multiplication");
        System.out.println("2. Division");
        System.out.println("3. Addition");
        System.out.println("4. Subtraction");
        System.out.println("enter your choice");
        Scanner enter = new Scanner(System.in);
        c = enter.nextInt();
    }

    public void Numbers(int a, int b, int c){
       
        System.out.println("enter first number");
        Scanner enter = new Scanner(System.in);
        a = enter.nextInt();
        System.out.println("enter second number");
        b = enter.nextInt();
    
        if (c == 1) {
            System.out.println("the result of " + a + " * " + b + " is " + (a * b));
        }
        else if (c == 2) {
            System.out.println("the result of " + a + " / " + b + " is " + (a / b));
        }
        else if (c == 3) {
            System.out.println("the result of " + a + " + " + b + " is " + (a + b));
        }
        else if (c == 4) {
            System.out.println("the result of " + a + " - " + b + " is " + (a - b));
        }
        else {
            System.out.println("invalid choice");
        }

    }
    public static void main(String[] args) {
      calc m = new calc();
      m.Choice(0);
      m.Numbers(0, 0, 0);
    }
}





