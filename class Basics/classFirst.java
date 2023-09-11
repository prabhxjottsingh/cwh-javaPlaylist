class Employee{
    int id;
    String name;

    static void printEmployeeDetails(String name, int id){
        System.out.println("The Name of the Employee with id: " + id + " is, " + name);
    }

}

public class classFirst {
    public static void main(String args[]){
        System.out.println("Java Program Starts.");
        Employee Prabhjot = new Employee();
        Employee Harry = new Employee();
        Prabhjot.printEmployeeDetails("Prabhjot", 1);
        Prabhjot.printEmployeeDetails("Harry", 2);
    }
}
