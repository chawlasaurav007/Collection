package Stack;

import java.util.Stack;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        String s = "()";
        Stack<Character> s1 = new Stack<>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='{' || charArray[i]=='[' || charArray[i]=='('){
                s1.push(charArray[i]);
            }else{
               if(s1.isEmpty()){
                   System.out.println("Not balanced");
                   return;
               }
                char top = s1.pop();
                if(charArray[i]=='}' && top!='{' ||
                   charArray[i]==']'&& top!='[' ||
                   charArray[i]==')' && top!='('){
                    System.out.println("Not balanced");
                    return ;
                }
            }
        }
        if(s1.isEmpty()){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }

}
