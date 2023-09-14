class Phone{
    public void turnOn(){
        System.out.println("Turning on Phone......");
    }
}

class smartPhone extends Phone{
    @Override
    public void turnOn(){
        System.out.println("Turning on smartPhone.......");
    }

    public void willItTurnOn(){
        System.out.println("This will be called or not by mix.......");
    }
}

public class Main {
    public static void main(String args[]){
        System.out.println("Hello");

        Phone phObj = new Phone(); //rntime memory allocation
        phObj.turnOn();

        smartPhone sPhObj = new smartPhone();
        sPhObj.turnOn();

        Phone mixObj = new smartPhone();
        //smartPhone mixObj = new Phone(); //notAllowed
        mixObj.turnOn();
        // mixObj.methodSmartPhone();

        // mixObj.willItTurnOn(); //notAllowed Reason -> memory is allocated in runTime, 
        //referrence to subClass but it is an object of parent class

    }    
}
