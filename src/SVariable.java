public class SVariable {
    static int mySVar = 32;

    public static void main(String[] args){
        SVariable obj1 = new SVariable();
        SVariable obj2 = new SVariable();
        
        System.out.println(obj1.mySVar);
        System.out.println(obj2.mySVar);

        obj1.mySVar = 23;

        System.out.println(obj1.mySVar);
        System.out.println(obj2.mySVar);
    }
}
