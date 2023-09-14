
class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while( i < 1000 ){
            System.out.println("I am Cooking");
            i += 1;
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while( i < 1000 ){
            System.out.println("Chatting..");
            i += 1;
        }
    }
}


public class Main {
    public static void main(String args[]){
        Thread1  t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
