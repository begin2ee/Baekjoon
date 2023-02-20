import java.util.*;

public class Main{
   public static void main (String args[]){
      Scanner s = new Scanner(System.in);
      int len = s.nextInt();
      String str = s.next();

      int arr[] = new int[26];

      for(int i=0; i<arr.length; i++){
         arr[i] = i+97;
      }

      int sum=0;
      int flag=0;
      for(int i=0; i<str.length(); i++){
         for(int j=0; j<26; j++){
            if(str.charAt(i)==(char)arr[j]){
               sum += (arr[j]-96)*Math.pow(31,flag);
               flag++;
            }
         }
      }

      System.out.println(sum);










   }
}