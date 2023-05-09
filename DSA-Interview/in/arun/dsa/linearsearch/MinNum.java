package in.arun.dsa.linearsearch;
public class MinNum {
    public static void main(String[] args) {
        int [] arr ={18,12,-7,14,28};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
