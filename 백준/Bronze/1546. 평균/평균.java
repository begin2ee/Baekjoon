import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double arr[] = new double[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double max = arr[n-1];

        double sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = (arr[i]/max) * 100;
            sum += arr[i];
        }

        System.out.println(sum/n);
    }
}
