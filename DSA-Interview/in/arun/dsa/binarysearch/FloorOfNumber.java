package in.arun.dsa.binarysearch;
public class FloorOfNumber {
    //smallest Number smaller or equal to(=<) target
    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,18};
        int target = 19;
        int ans = floor(arr, target);
        System.out.println(ans +" "+target);
    }
    //return the index
    //return -1 if it does not exist
    static int floor(int [] arr , int target){

        //but what if the target is greater than the greatest number in the array
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start =0;
        int end = arr.length-1;

        while (start<=end){
            //find the middle element
           // int mid =(start+end)/2; might be possible that (start+end) exceeds the range of int in java
            int mid = start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start =mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
