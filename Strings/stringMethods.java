//referce to newStrings are created, because in java strgins are immutable
public class stringMethods{
    public static void main(String args[]){
        String a = "StringOne";
        String a1 = new String("StringOne");
       
        Integer val = a1.length();
        System.out.println(val);
       
        String lowerA = a.toLowerCase();
        System.out.println(lowerA);
       
        String nonTrimmedString = "   Prabhjot    ";
        System.out.println(nonTrimmedString);
        //.trim() method is used to remove the blank spaces in the front as well as at the last of the string
       
        String trimmedString = nonTrimmedString.trim(); 
        System.out.println(trimmedString);
       
        System.out.println(trimmedString.substring(3)); //new string starting from index 3
        System.out.println(trimmedString.substring(1, 4)); //start index is included but end index is excluded
       
        System.out.println(trimmedString.replace('P', 'S')); // it works for substirings also, replace all the occurences of oldString/char with newString.char
        System.out.println(trimmedString.replace("P", "SRA")); //vice versa is not possible in this case

        //startsWith("String"), startsWith("f") => these functions return true or false;
        System.out.println(trimmedString.charAt(1));
        System.out.println(trimmedString.indexOf("Prabh"));
    }
}