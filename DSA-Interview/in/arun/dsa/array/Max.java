package in.arun.dsa.array;

public class Max {
    public static void main(String[] args) {

        int arr[] = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {

        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
        }
        return maximum;
    }
}
