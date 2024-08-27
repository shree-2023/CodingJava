import java.util.Arrays;

public class Anagram {
    public static boolean areAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        //Convert both strings to lowercase
        String str11=str1.toLowerCase();
        String str22=str2.toLowerCase();
        //sort 
    char[] char1=str11.toCharArray();
    char[] char2=str22.toCharArray();

    Arrays.sort(char1);
    Arrays.sort(char2);
return Arrays.equals(char1,char2);


}
public static void main(String[] args) {
    String str1="listen";
    String str2="Silent";
    System.out.println(areAnagram(str1,str2)); //true
}
}
