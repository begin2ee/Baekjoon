import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] = s.split(" ");
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
           cnt++;
        }
        
        int arr2[] = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr2);
            
        return arr2[0] + " " + arr2[cnt-1];
    }
}