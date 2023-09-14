interface byCycle{
    int a = 45; //properties in Interfaces are final
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycles implements byCycle{
    public void applyBrake(int decrement){
        System.out.println("Brakes are Applied");
    }

    public void speedUp(int increment){
        System.out.println("Speed is increased");
    }
}

public class Main {
    public static void main(String args[]){
        System.out.println("Hello, World!!");
        AvonCycles obj = new AvonCycles();
        obj.applyBrake(1);
        obj.speedUp(1);
    }
}

/*
 * More than one interfaces can be implemented, 
 * Properteis of interfaces are immutable
 * no more than one Abstract classes are extended
 * interface only includes abstract methods
 * 
 */