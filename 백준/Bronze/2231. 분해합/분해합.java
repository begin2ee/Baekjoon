import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            int number = i;

            while(number > 0){
                sum += number%10;
                number /= 10;
            }

            if(n == sum +i){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}

