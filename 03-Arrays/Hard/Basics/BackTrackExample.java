// public class BackTrackExample {

//     static void easyBackTrack(String s,int index, String current){

//         //base case
//         if( index== s.length()){
//             System.out.println(current);
//             return;
//         }
//         //take the character 
//         easyBackTrack(s, index+1,current+s.charAt(index));
//         // don't take the character
//         easyBackTrack(s, index+1, current);
//     }


//     public static void main(String[] args) {
//         String str = "abc";
//         easyBackTrack(str,0, "");
//     }
// }


package Basics;

/**
 * BackTrackExample
 */
public class BackTrackExample {

    static void removedOne(String str, int index){

        if(index == str.length()){
            return;
        }
        String current = str.substring(0, index) + str.substring(index + 1);
        System.out.println(current);
        removedOne(str, index+1);
    }

    public static void main(String[] args) {
        removedOne("abcdrefh",0);
    }
}