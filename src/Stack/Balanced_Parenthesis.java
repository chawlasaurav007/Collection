package Stack;

import java.util.Stack;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        String s = "[]{([])}";
        Stack<Character> s1 = new Stack<>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='{' || charArray[i]=='[' || charArray[i]=='('){
                s1.push(charArray[i]);
            }else if(charArray[i]=='}' || charArray[i]==']' || charArray[i]==')'){
                s1.pop();
            }
        }
        if(s1.isEmpty()){
            System.out.println("Its a balanced Parenthesis");
        }else {
            System.out.println("Its not a balanced Parenthesis");
        }
    }

}
