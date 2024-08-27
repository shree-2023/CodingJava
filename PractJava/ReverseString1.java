public class ReverseString1 {
    public static String  revString(String str){
// Base case: if the string is empty or has only one character, return the string itself

        if(str.isEmpty()){
            return str;
        }
        else{
     // Recursive case: reverse the substring excluding the first character and append the first character at the end

            return revString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args) {
        String str="Hello World";
        String str1="h";

        System.out.println(revString(str));
        System.out.println(revString(str1));
        
    }
    
}
