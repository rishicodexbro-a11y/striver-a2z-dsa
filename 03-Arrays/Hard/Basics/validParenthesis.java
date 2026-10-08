package Basics;

/**
 * validParenthesis
 */
public class validParenthesis {

    static void solve(String str, int index, String current, int open) {

        
        if(index == str.length() && open==0){
            System.out.println(current);
            return;
        }
        if(str.charAt(index) == '('){
            solve(str, index+1, current + str.charAt(index), open++);
        }
        if(str.charAt(index) == ')' && open>0){
            solve(str, index+1, current + str.charAt(index), open--);
        }

    }   

    public static void main(String[] args) {
        solve("(((()))()()", 0, "",0);
    }
}