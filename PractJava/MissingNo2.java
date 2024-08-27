public class MissingNo2 {
    public static int findNo(int[] arr){
        int n=arr.length+1;// Total number of terms including the missing one
        // Find the first and last terms in the array
        int first=arr[0];
        int last=arr[arr.length-1];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
// The sum of an arithmetic sequence is given by the formula: n/2 * (firstTerm + lastTerm)
        int actualSum=n*(first+last)/2;
        int SumofNum=actualSum-sum;
        return SumofNum;
    }
    public static void main(String[] args) {
        int[] arr={10,12,16,18,20};
        System.out.println(findNo(arr));
    }
    
}
