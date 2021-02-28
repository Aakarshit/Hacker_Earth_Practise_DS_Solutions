import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       long arr[]=new long[n];
       long sum=0;
       long sumK=0;
       for(int i=0;i<n;i++){
           arr[i]=sc.nextLong();
           if(i>=n-k){
           sumK+=arr[i];}
       }
       long max=Integer.MIN_VALUE;
       for(int i=0;i<k;i++){
           sum+=arr[i];
           sumK-=arr[n-k+i];
           max=Math.max(sum+sumK,max);
       }
       System.out.println(max);

    }
    
}