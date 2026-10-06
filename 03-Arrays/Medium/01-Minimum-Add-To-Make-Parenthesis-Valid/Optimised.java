/**
 * Optimised
 */
public class Optimised {

    public static int minValidNumberOfBraces(String str){
        
        int open = 0;
        int close = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '(')
                open++;
            else if(str.charAt(i) == ')' && open > 0){
                open--;
            }
            else
                close++;
        }
        return open+close;
    }

    public static void main(String[] args) {
        String str  = "()()()()(()(((";
        int result = minValidNumberOfBraces(str);
        System.out.println(result);
    }
}