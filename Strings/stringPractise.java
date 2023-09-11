public class stringPractise {
    public static void main(String args[]){
        
        //a Program to convert a string to lowerCase
        toLowerCase("Hello");

        //a program to replace all blank spaces with underscores
        replaceWith("   replace all   ", ' ', '_');

    }

    private static void toLowerCase(String str){
        String tStr = str.toLowerCase();
        System.out.print("Old String: ");
        System.out.println(str);
        System.out.print("New String: ");
        System.out.println(tStr);
    }

    private static void replaceWith(String str, char a, char b){
        String tStr = str.replace(a, b);
        System.out.print("Old String: ");
        System.out.println(str);
        System.out.print("New String: ");
        System.out.println(tStr);
    }

}
