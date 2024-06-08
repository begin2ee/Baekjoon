import java.io.*;
import java.util.*;

public class Main {
    public static int min = 64;
    public static boolean arr[][];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];

        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<m; j++){
                if(s.charAt(j)=='W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }

        int nn = n-7;
        int mm = m-7;

        for(int i=0; i<nn; i++){
            for(int j=0; j<mm; j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y){
        int endx = x+8;
        int endy = y+8;
        int cnt = 0;

        boolean TF = arr[x][y];

        for(int i=x; i<endx; i++){
            for(int j=y; j<endy; j++){
                if(arr[i][j] != TF)
                    cnt++;

                TF = !TF;
            }
            TF = !TF;
        }

        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);

    }


}
