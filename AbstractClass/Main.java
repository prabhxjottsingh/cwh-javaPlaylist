abstract class Writer{
    abstract public void greet();
}

class Pen extends Writer{
    public void greet(){
        System.out.println("You are using a Pen.");
    }
}

class Pencil extends Writer{
    public void greet(){
        System.out.println("You are using a Pencil.");
    }
}


public class Main {
    public static void main(String args[]){
        System.out.println("This code is for showing the use of Abstraction: ");
        Pen penObj = new Pen();
        Pencil pencilObj = new Pencil();
        greetMe(penObj);
        greetMe(pencilObj);
    }

    static void greetMe(Writer obj){
        obj.greet();
    }


}
