// import java.io.*;
// import java.util.*;
import java.util.Scanner;

public class Solution {
    public static int power(int a, int b){
        if(b==0)
            return 1;
        return a*power(a, b-1);
    }
    

    public static void main(String [] args) throws Exception {
        Scanner s = new Scanner(System.in);

        for(int test=1; test<=10; test++){
            int num = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int result = power(a, b);

            System.out.println("#" + num + " " + result);
        }
    }
}

