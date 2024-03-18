import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arrx[] = new int[n];
        int arry[] = new int[n];

        int xMin = 10001;      int xMax = -10001;
        int yMin = 10001;      int yMax = -10001;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrx[i] = Integer.parseInt(st.nextToken());
            arry[i] = Integer.parseInt(st.nextToken());

            if(arrx[i] < xMin)
                xMin = arrx[i];
            if(arrx[i] > xMax)
                xMax = arrx[i];
        
            if(arry[i] < yMin)
                yMin = arry[i];
            if(arry[i] > yMax)
                yMax = arry[i];
        }

        int size = (xMax - xMin) * (yMax - yMin);
        System.out.println(size);
    }
}
