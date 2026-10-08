package Basics;
import java.util.ArrayList;
import java.util.List;

/**
 * example3
 */
public class example3 {

    static void newBackTrack(int[] arr, int index, List<Integer> current){

        if(index == arr.length){
            // System.out.println(current);
            return;
        }

        if(current.size()==2){
            System.out.println(current);
            // index++;
            return;

        }
        // made a inclusion 
        current.add(arr[index]);
        newBackTrack(arr, index+1, current);
        current.remove(current.size()-1);

        //remove a another
        newBackTrack(arr, index+1, current);  
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        newBackTrack(arr, 0, new ArrayList<>());
    }
}