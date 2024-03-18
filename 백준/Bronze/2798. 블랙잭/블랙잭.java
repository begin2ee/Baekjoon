import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){

                    if(arr[i] + arr[j] + arr[k] <= m){
                        if(arr[i] + arr[j] + arr[k] > max){
                            max = arr[i] + arr[j] + arr[k];
                        }
                    }
                }

            }
        }

        System.out.println(max);
    }
}
