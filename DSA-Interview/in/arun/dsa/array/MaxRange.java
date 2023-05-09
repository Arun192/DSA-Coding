package in.arun.dsa.array;
public class MaxRange {

    public static void main(String[] args) {

        int arr[] = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr,1,3));
    }
    private static int maxRange(int[] arr,int start,int end) {
        if (end>start){
            return -1;
        }
        if (arr==null){
            return -1;
        }
        int maximum = arr[start];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maximum)
                maximum = arr[i];
        }
        return maximum;
    }
}
