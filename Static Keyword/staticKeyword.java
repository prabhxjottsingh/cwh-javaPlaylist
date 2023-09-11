//in classes static key word is used for the members which are access by the same class, but
//static keyword is not used for the members which are different for every object
//example comparator functino in classes have to use static keyword because they are objecgt dependent
//static method can only be called with static method, otherwise we have to create an object 

public class staticKeyword {

    int cntObject = 0;
    static int cntClass = 0;

    void objectFunction(){
        System.out.println("This is an object function.");
        cntObject += 1;
    }

    static void classFunction(){
        System.out.println("This is class function.");
        cntClass += 1;
    }

    public static void main(String args[]){
        System.out.println("Hello, World!!");
        classFunction();
        classFunction();
        classFunction();
        System.out.println(cntClass);
        staticKeyword obj = new staticKeyword();
        obj.objectFunction();
        System.out.println(obj.cntObject);
        staticKeyword objSecond = new staticKeyword();
        objSecond.objectFunction();
        System.out.println(objSecond.cntObject);
    }
}
