// package Constructors In Inheritance;

class Base{
    public int x; 

    Base(){
        System.out.println("I am the constructor of the Base Class.");
    }

    Base(int v){
        System.out.println("I am the Constructor of the Base class with an argument.");
    }

    public void getX(){
        System.out.println(x);
    }

    public void setX(int x){
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    Derived(){
        super(10);
        System.out.println("I am the constructor of the Derived Class.");
    }

    Derived(int a){
        super();
        System.out.println("I am the constructor of the Derived class with an argument.");
    }

    public void getY(){
        System.out.println(y);
    }

    public void setX(int y){
        this.y = y;
    }
}

public class ConstructorsInIngeritance {
    public static void main(String args[]){
        Base baseObj = new Base();
        Derived derivedObj = new Derived();
        Derived derivedObjTwo = new Derived(10);
    }
}
