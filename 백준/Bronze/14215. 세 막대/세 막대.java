import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arr[] = new int[3];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        if(a+b<=c){
            c = a+b-1;
            System.out.println(a+b+c);
        }
        else{
            System.out.println(a+b+c);
        }
    }
}
