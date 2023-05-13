package in.arun.dsa.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,9,11,12,15,17,18,21,23,25,56,65};
        int target = 15;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; //this is my new start
            //double the box value
            //end =previous end +sizeOfBox*2
            end = end + (start - start + 1) * 2;
            start =temp;
        }
    return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }

        }

        return -1;
    }

}
