import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = i+1 + "";
        }

        for(int i=0; i<n; i++){
            int cnt = 0;
            if(arr[i].contains("3") || arr[i].contains("6") || arr[i].contains("9")){
                for(int j=0; j<arr[i].length(); j++){
                    if(arr[i].charAt(j)=='3' || arr[i].charAt(j)=='6' || arr[i].charAt(j)=='9'){
                        cnt++;
                    }
                }

                for(int j=0; j<cnt; j++){
                    System.out.print("-");
                }

                System.out.print(" ");
            }

            else
                System.out.print(i+1 + " ");
        }
    }
}

