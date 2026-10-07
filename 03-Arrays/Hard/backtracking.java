// /**
//  * backtracking
//  */
// public class backtracking {

//     static void backtrack(String s, int index, int remaining, String current) {

//         // Base case
//         if (remaining == 0) {
//             System.out.println(current + s.substring(index));
//             return;
//         }

//         // No characters left
//         if (index == s.length()) {
//             return;
//         }

//         // Choice 1: REMOVE current character
//         backtrack(
//             s,
//             index + 1,
//             remaining - 1,
//             current
//         );

//         // Choice 2: KEEP current character
//         backtrack(
//             s,
//             index + 1,
//             remaining,
//             current + s.charAt(index)
//         );
//     }

//     public static void main(String[] args) {

//         String s = "(())";

//         backtrack(s, 0, 1, "");
//     }
// }


/**
 * backtracking
 */
public class backtracking {

    static void easyBackTrack(String s,int index, String current){

        //base case
        if( index== s.length()){
            System.out.println(current);
            return;
        }
        //take the character 
        easyBackTrack(s, index+1,current+s.charAt(index));
        // don't take the character
        easyBackTrack(s, index+1, current);
    }


    public static void main(String[] args) {
        String str = "abc";
        easyBackTrack(str,0, "");
    }
}
