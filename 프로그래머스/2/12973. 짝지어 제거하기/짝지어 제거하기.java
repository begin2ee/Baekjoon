import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char ch[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = ch[i];
            
            if(stack.isEmpty())
                stack.push(c);
            
            else{
                if(stack.peek() == c)
                    stack.pop();
                else
                    stack.push(c);
            }
            
        }
        
        if(stack.isEmpty())
            answer = 1;
        else
            answer = 0;
       
        return answer;
    }
}