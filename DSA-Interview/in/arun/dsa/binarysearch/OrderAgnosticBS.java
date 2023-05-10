package in.arun.dsa.binarysearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int[] arr = {99, 89, 87, 78, 77, 76, 67, 54, 45, 34, 32, 23, 21, 11};
        int target = 45;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending and descending
        //boolean isAsc = arr[start] < arr[end];
        //OR
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            //find the middle element
            // int mid =(start+end)/2; might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

