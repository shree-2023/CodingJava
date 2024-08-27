public class isPalidrom {
    static boolean checkPalidrom(String str){
        int length=str.length();

        for(int i=0;i<length/2;i++){
            if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(length-i-1)){
               return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Hello";
        String str1="Madam";
        System.out.println(checkPalidrom(str));
        System.out.println(checkPalidrom(str1));
        
    }
    
    
}
