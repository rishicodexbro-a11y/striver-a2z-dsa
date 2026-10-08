package Basics;
/**
 * btExample5
 */
public class btExample5 {

    static void generate(String current, int open, int close, int n){

        if(open == n && close == n){
            System.out.println(current);
            return;
        }
        // add '('
        if(open < n){
            generate(current + "(", open+1, close, n);
        }
        if(close < open){
            generate( current + ")", open, close+1, n);
        }
    }

    public static void main(String[] args) {
        generate("", 0, 0, 5);
    }
}