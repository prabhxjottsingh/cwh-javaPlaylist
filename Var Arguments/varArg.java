public class varArg {

    static int sumFunc(int a, int b){
        return a + b;
    }

    static int sumFuncVarArg(int ...arr){
        int sum = 0;
        for(int a : arr) sum += a;
        return sum;
    }

    public static void main(String args[]){
        System.out.println("Sum of Given numbers are: " + sumFunc(4, 5));
        System.out.println("Sum of Given numbers are: " + sumFuncVarArg(4, 5, 6, 7, 8));
        System.out.println("Sum of Given numbers are: " + sumFuncVarArg(7, 8));
    }
}
