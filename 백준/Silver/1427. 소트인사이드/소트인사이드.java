import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = s.charAt(i)-'0';
        }

        Arrays.sort(arr);

        for(int i=len-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
