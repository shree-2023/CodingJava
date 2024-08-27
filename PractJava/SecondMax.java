public class SecondMax {
    public static int Max2ele(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,99,67,96};
        System.out.println(Max2ele(arr));
    }
    
}
