import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    String str = "long ";

    int result=a/4;

    for(int i=0; i<result; i++){
      System.out.print(str);
    }

    System.out.print("int");
  }
}