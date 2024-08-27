public class Missingno3 {
    public static int findNo(int[] arr){
        int commondifferenceNo=(arr[arr.length-1]-arr[0])/arr.length; //to find last-first/length

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=commondifferenceNo){
                return arr[i]+commondifferenceNo;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,17,24,38,45};
        System.out.println(findNo(arr));
    }
    
}
