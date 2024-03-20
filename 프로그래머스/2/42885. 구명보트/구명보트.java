import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        Arrays.sort(people);
        
        int idx = 0;
        for(int i=len-1; i>=idx; i--){
            if(people[i] + people[idx] <= limit){
                answer++;
                idx++;
            }
            else
                answer++;
        }
     
        
        return answer;
    }
}