import java.util.Scanner;

public class salary {

    public static void main(String args[]){
        Scanner enter = new Scanner(System.in);
        String EmployeeName;
        int ID_no;
        String Department;
        int salary;
        System.out.println("enter employee name");
        EmployeeName = enter.next();
        System.out.println("enter ID number");
        ID_no= enter.nextInt();
        System.out.println(" enter department ");
        Department = enter.next();
        System.out.println("monthly salary");
        salary = enter.nextInt();

        int annualSalary = salary*12;
        System.out.println("annual salary is " +annualSalary);

    }
    
}
