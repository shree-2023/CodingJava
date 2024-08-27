//to check string is isogram or not

import java.util.HashSet;
import java.util.Set;

public class Isogram{
    public static  boolean checkIsogram(String s){
        char[] c=s.toCharArray();
        Set<Character> set= new HashSet<>();
        boolean isogram=true;
        for(char ch:c){
            if(set.contains(ch)){
                isogram=false;
           
            }else{
                set.add(ch);
            }
          
        }
        return isogram;
    }
    
    public static void main(String[] args){
        String str="listen";
        String str1="Hello";
        System.out.println(checkIsogram(str));
        System.out.println(checkIsogram(str1));
    }
}