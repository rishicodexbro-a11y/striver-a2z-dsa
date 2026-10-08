import java.util.ArrayList;
import java.util.List;

/**
 * BruteForce
 */
public class myLogic {

    public static  String removeOuterParentheses(String s) {

        List<String> re = new ArrayList<String>();
        String current = "";
        int open = 0;
        for(int i = 0;i<s.length(); i++){
            if(s.charAt(i)=='('){
                open = open +1;
                current = current +s.charAt(i);
            }
            if(s.charAt(i)==')' && open>0){
                open = open -1;
                current = current +s.charAt(i);
                if(open==0){
                    String x = "";
                    for(int j = 0; j <current.length();j++){
                        if(j==0 || j == current.length()-1)
                            continue;
                        x = x+current.charAt(j);
                    }

                    re.add(x);
                    current = "";
                }
            } 
        }

            System.out.println(re);
            for(int i = 0; i<re.size();i++){
                current = current+re.get(i);
            }
        return current;
    }

    public static void main(String[] args) {
        // String s = "(()())(())";
        String s2 = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s2));

    }
}