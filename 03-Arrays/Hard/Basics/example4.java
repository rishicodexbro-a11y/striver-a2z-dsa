package Basics;
import java.util.ArrayList;
import java.util.List;

/**
 * example4
 */
public class example4 {

    static void btExample(int[] arr, int index, List<Integer> current,int target,int sum){

        if(index==arr.length){
            return;
        }
        
        if(sum == target){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        btExample(arr, index+1, current,6, sum+arr[index]);
        current.remove(current.size()-1);

        btExample(arr, index+1, current, 6,sum);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,0,3,5};
        btExample(arr,0,new ArrayList<>(),6,0);
    }
}