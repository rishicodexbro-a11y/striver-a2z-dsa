/**
 * BruteForce
 */
public class BruteForce {

    public static  String removeOuterParentheses(String s) {

        String current = "";
        // int open = 0;
        // int close = 0;
        
        // for(int i = 0; i< s.length(); i++){
        //     if(s.charAt(i)== '('){
        //         open = open+1;
        //         if(open%2!=0){
        //             current+s.charAt(i);
        //         }

        //     }

        for(int i = 0;i<s.length()-1; i++){
            for(int j = 1; j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    current = current+s.charAt(i)+s.charAt(j);
                }
            }

        }






        return current;
    }


    
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));

    }
}