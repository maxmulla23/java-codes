public class numbers {
    
    public int findlargest(int num1, int num2, int num3){
        int largest = num1;

        if(num2 > largest) {
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }
        return largest;
    }
}
