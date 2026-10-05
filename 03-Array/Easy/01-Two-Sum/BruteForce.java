/**
 * BruteForce
 */
public class BruteForce {

    public static int[] twoSum(int[] arr, int target){

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        int target = 9;

        int[] resArr = twoSum(arr, target);
        printArray(resArr);

    }
}