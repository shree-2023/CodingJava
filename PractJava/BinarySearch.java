public class BinarySearch {

    public static int findEle(int[] arr,int target){
        int lft=0;
        int right=arr.length-1;
        while(lft<=right){
          int mid=lft+(right-lft)/2;
            if(arr[mid]==target){
                return mid;

            }else{
                if(arr[mid]<target){
                    lft=mid+1;
                }
                else{
                    right=mid-1;
                                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,3,5,6,7,8};
        int target=7;
        int index=findEle(arr, target);
        System.out.println(index);
    }
    
}
