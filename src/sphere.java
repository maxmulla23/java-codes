import java.util.Scanner;

public class sphere {
    public static void main(String[] args){
        double pi = 3.14, r , surface_area;
        Scanner enter = new Scanner(System.in);
        System.out.print("enter radius");
        r = enter.nextInt();
        surface_area=4*pi*r*r;
        System.out.println("surface area" +surface_area);
    }
}
