import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        

        int t = Integer.parseInt(br.readLine());
       
        while(t-->0){
             String[] p=br.readLine().split(" ");

        int n = Integer.parseInt(p[0]);

        int k = Integer.parseInt(p[1]);

        String[] al=br.readLine().split(" ");

        String[] bo=br.readLine().split(" ");

        int a[]=new int[n];

        int b[]=new int[n];
            long max=0;
            for(int i=0;i<n;i++){
                 a[i] = Integer.parseInt(al[i]);

        b[i] = Integer.parseInt(bo[i]);
                
                if(max<b[i]){
                    max=b[i];
                }
            } 
        max++;
        long sum=0L;
        for(int i=0;i<a.length;i++){
            if(a[i]<=max){
                sum += Long.valueOf((Math.abs(max-a[i])));
            }
        }  
        System.out.println(sum*k);
        }
    }
}