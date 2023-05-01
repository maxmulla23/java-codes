import java.util.Scanner;

public class cylinder {
    public static void main(String[]args){
        double pi=3.14, r , h, volume;
        Scanner enter = new Scanner(System.in);
        System.out.print("enter radius");
        r = enter.nextInt();
        System.out.print("enter height");
        h = enter.nextInt();
        volume = pi*r*h;
        System.out.print("volume" +volume);
    }
}
