import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        arrayReverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayReverse(int[] arr) {
       int left=0;
       int right=arr.length-1;
while(left<right){
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;
}

    }

    
}
