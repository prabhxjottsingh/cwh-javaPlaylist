//An array is always passed as a reference in java

public class passingArrayAsParameter {
    public static void main(String args[]){
        int[] marks = {10, 23, 53, 64, 46, 6};
        Integer x = 443;
        System.out.println("The value of x before calling the change function is: " + x);
        changeInt(x);
        System.out.println("The value of x after calling the change function is: " + x);
        System.out.print("The Old Array is: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + ", ");
        }
        changeArr(marks);
        System.out.println();
        System.out.print("The New Array is: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + ", ");
        }
    }

    static void changeInt(Integer x){
        x = 90;
    }

    static void changeArr(int[] marks){
        marks[4] = 34;
    }
}
