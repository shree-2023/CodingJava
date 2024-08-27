public class Missnum {

    public static int findMissingnum(int arr[]){
        int length=arr.length;
        int n=arr.length+1;
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=arr[i];

        }
        int expectedsum=2*n*(n+1)/2;
        int actualsum=expectedsum-sum;
        // System.out.println(actualsum);
        return actualsum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,10};
        
    System.out.println(findMissingnum(arr));
    }
    
}
