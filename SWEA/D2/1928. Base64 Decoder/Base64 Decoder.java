import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String str = br.readLine();
            String result = new String(Base64.getDecoder().decode(str));
            System.out.println("#" + (i+1) + " " + result);
        }
    }
}

