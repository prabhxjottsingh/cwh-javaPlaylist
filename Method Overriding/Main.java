
class Parent{
    public void methodOne(){
        System.out.println("I am methodOne of the Parent Class.");
    }
}

class Child extends Parent{
    @Override
    public void methodOne(){
        System.out.println("I am methodOne of the Child Class.");
    }
}

public class main {
    public static void main(String args[]){
        Parent parentObj = new Parent();
        parentObj.methodOne();

        Child childObj = new Child();
        childObj.methodOne();
    }
}
