package in.arun.dsa.binarysearch;

public class MountainArray {
    public static void main(String[] args) {

        int [] arr={0,2,4,6,8,11,45,98,54,45,38,23};
        int ans = peakIndexMountainArray(arr);
        System.out.println(ans);


    }

    static int peakIndexMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part of array 0,2,4,6,8,11,45
                //this may be ans but look at left
                //this is why end !=mid-1
                end = mid;
            } else {
                //you are in ascending part of an array
                start = mid + 1; //Because we know that mid +1 element > mid element

            }
        }
        //in the ebd start ==end and pointing to the largest number because of the 2 check above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element that the max one because that is what check say
        //More Elaboration : At every point of time start and end , they have the best possible answer till that time
        //and if we are saying that only one item is remaining , hence bcuz of above line that is the best possible ans
        return start; //or end both equal
    }
}
