import java.util.HashMap;

/**
 * HashMapOptimise
 */
public class HashMapOptimise {

    // mathod for getting the indices optimised

    public static int[] twoSum(int[] arr, int target){

        HashMap< Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int needed = target-arr[i];
            if(map.containsKey(needed))
                return new int[]{map.get(needed), i};
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    // method for array printing
    public static void printArray(int[] arr){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;

        int[] resArr = twoSum(arr, target);
        printArray(resArr);
        
    }
}