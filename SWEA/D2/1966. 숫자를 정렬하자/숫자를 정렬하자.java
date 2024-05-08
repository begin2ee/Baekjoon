import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }   

            Arrays.sort(arr);

            System.out.print("#" + (i+1) + " ");
            for(int j=0; j<n; j++){
                System.out.print(arr[j] + " ");
            }  
            System.out.println();
        }
    }
}

