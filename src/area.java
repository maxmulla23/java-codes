import java.util.Scanner;

public class area {
    
    
    static void Square(){
        Scanner enter = new Scanner(System.in);
        int x;
        int area;
        System.out.println("enter length");
        x = enter.nextInt();
        area = x*x ;
        System.out.println("area is " +area);
    }
    

    public static void main(String[] args){
        
        Square();
    }
}
