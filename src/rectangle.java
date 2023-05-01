import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        int length, width, area;
        Scanner enter = new Scanner (System.in);
        System.out.print("enter length");
        length = enter.nextInt();
        System.out.print("enter width");
        width = enter.nextInt();
        area = length*width;
        System.out.print("area" +area);
    }
    
}
