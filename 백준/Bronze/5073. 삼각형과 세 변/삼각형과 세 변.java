import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int arr[] = new int[3];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0]==0 && arr[1]==0 && arr[2]==0)
              break;

            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(arr[i] < arr[j]){
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if(a+b>c){
                if(a==b && b==c && a==c){
                    System.out.println("Equilateral");
                }
                else if(a==b || a==c || b==c){
                    System.out.println("Isosceles");
                }
                else    
                    System.out.println("Scalene");
            }
            else
                System.out.println("Invalid");
        }
    }
}
