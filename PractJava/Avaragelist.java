import java.util.ArrayList;
import java.util.List;

public class Avaragelist {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(3);
        num.add(5);
        num.add(6);
        int sum=0;
        for(int i:num){
            sum=sum+i;
        }
       double avg=(double) sum/num.size();
        System.out.println(avg);
       
    }
    
}
