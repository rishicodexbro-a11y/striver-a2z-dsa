import java.util.ArrayList;
import java.util.List;

/**
 * backtracking2
 */
public class backtracking2 {

    static void example2(int[] nums, int index, List<Integer> current){

        if(index == nums.length){
            System.out.println(current);
            return;
        }

        //take the first character means include it
        current.add(nums[index]);
        example2(nums, index+1, current);
        current.remove(current.size() - 1);

        //take the charcater
        example2(nums, index+1, current);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        example2(nums,0,new ArrayList<>());
    }
}