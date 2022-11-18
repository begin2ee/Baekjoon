import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        double arr[]=new double[n];

        double max=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextDouble();
            if(arr[i]>max){
                max=arr[i];
            }
        }

        double sum=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=(arr[i]/max)*100.0;
            

            sum +=arr[i];
        }

        System.out.println(sum/n);

    }
}