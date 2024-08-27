public class Pali {

    public static void main(String[] args) {
        int num=101;
        int original=num;
        int reverseNum=0;
        while(num!=0){
           int digit=num%10;
            reverseNum=reverseNum*10+digit;
            num=num/10;
        }
        if(original  ==reverseNum){
            System.out.println("palidrom");
            
        }
        else{
            System.out.println("Not Palindrom");
        }
        
       
    }
    
}
