public class classPractise {
    public static void main(String args[]){
        System.out.println("Hello, World!!");
        Employee Prabhjot = new Employee();
        System.out.println(Prabhjot.getName());
        Prabhjot.setName("Prabhjot");
        System.out.println(Prabhjot.getName());
        Prabhjot.salary = 78000;
        System.out.println(Prabhjot.getSalary());
    }
}

class Employee{
    int salary;
    String name = "Name not Assigned Yet";

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String str){
        name = str;
    }

}
