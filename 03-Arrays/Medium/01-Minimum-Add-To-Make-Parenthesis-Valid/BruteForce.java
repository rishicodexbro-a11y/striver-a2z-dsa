import java.util.ArrayDeque;
import java.util.Deque;
/**
 * BruteForce
 */
public class BruteForce {

    public static int minValidNo(String str){
        
        int add = 0;
        Deque<Character> charStack = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            if(ch == '('){
                charStack.push(ch);
            }
            else if(ch == ')'){
                if(charStack.isEmpty())
                    add++;
                else
                    charStack.pop();
            }
            
        }
        add += charStack.size();
        return add;

    }

    public static void main(String[] args) {
        String str = "(((";
        int result = minValidNo(str);
        System.out.println(result);
    }
}