import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int mul = brown + yellow;
        for(int i=3; i<=mul; i++){
            int ga = mul/i;
            int se = i;
            
            if(ga < 3)
                continue;
            if(ga >= se){
                if((ga-2)*(se-2) == yellow){
                    answer[0] = ga;
                    answer[1] = se;
                    break;
                }
            }
        } 
        
        return answer;
    }
}