import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    /*Scanner s = new Scanner(System.in);
    long a,b,c;

    a=s.nextLong();
    b=s.nextLong();
    c=s.nextLong();
    long sum=a+b+c;

    System.out.println(sum);*/

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a,b,c;
    
    a=Long.parseLong(st.nextToken());
    b=Long.parseLong(st.nextToken());
    c=Long.parseLong(st.nextToken());
    Long sum = a+b+c;

    System.out.println(sum);
  }
}