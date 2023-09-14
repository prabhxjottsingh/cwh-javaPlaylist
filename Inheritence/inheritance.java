class Base{
    public int x;

    public void getX(){
        System.out.println(x);
    }

    public void setX(int x){
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public void getY(){
        System.out.println(y);
    }

    public void setX(int y){
        this.y = y;
    }
}

public class inheritance {
    public static void main(String args[]){
        Base obj = new Base();
        obj.setX(10);
        obj.getX();
    }
}
