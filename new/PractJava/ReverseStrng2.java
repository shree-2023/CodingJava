public class ReverseStrng2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello world");
        for(int i=0;i<str.length()/2;i++){
            int front =i;
            int back=str.length()-i-1;

            char frontChar=str.charAt(front);
            char backChar=str.charAt(back);

      str.setCharAt(front, backChar);
     str.setCharAt(back, frontChar);


        }
System.out.println(str);
    }
    
}
