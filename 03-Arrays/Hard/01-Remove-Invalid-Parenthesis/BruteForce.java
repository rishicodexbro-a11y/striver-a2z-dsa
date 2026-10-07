import java.util.HashSet;
import java.util.Set;

public class BruteForce{

    static int minRemoval  = Integer.MAX_VALUE;
    static Set<String> result = new HashSet<>(); 
    static void method(String str, int index, int open, String current, int removal){

        if(index == str.length()){
            if(open == 0){
                if(removal < minRemoval){
                    result.clear();
                    minRemoval = removal;
                    result.add(current);
                }
                if(removal==minRemoval){
                    result.add(current);
                }
            }
            return;
        }
        if(str.charAt(index) == '(')
            method(str, index+1, open+1, current+str.charAt(index), removal);

        if(str.charAt(index) == '(')
            method(str, index+1, open, current, removal+1);
        
        
        if(str.charAt(index) == ')' && open>0)
            method(str, index+1, open-1, current+str.charAt(index), removal);


        if(str.charAt(index) == ')')
            method(str, index+1, open, current, removal+1);

        
    }


    public static void main(String[] args) {
        String str = "()())()";
        method(str,0,0,"",0);
        System.out.println(result);
    }
}