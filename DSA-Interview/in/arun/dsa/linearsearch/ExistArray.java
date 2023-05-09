package in.arun.dsa.linearsearch;

//Find whether 14 exist in the array or not
public class ExistArray {

    public static void main(String[] args) {

        int[] arr = {18, 12, 9, 14, 77, 50};
        int target =14;
        System.out.println(linearsearch(arr,target));
    }
    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int [] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element index if it is = target
            int element =arr[index];
            if (element==target){
                return index;
            }
        }
        //this line will execute if non of the return statements above has executed
        //hence target not found
        return -1;
    }
}
