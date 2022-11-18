import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        int sco[]; 

        int sum=0;;
        double avg=0;
        int cnt=0;

        for(int i=0;i<arr.length; i++){
            int a=s.nextInt();
            sum=0;  avg=0;  cnt=0;
            sco=new int[a];

            for(int j=0; j<a; j++){
                sco[j]=s.nextInt();
                avg += ((float)sco[j])/a;
            }

            for(int k=0; k<a; k++){
                if(((double)sco[k])>avg){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", ((double)cnt/a)*100);
        }
    }
}