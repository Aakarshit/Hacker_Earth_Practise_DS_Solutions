import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int count[]=new int[1000001];
     for(int i=1;i<=1000000;i++){
         count[i]=i*i;
     }
     long sum=0,ans=0;
     for(int i=0;i<n;i++){
         sum=0;
         for(int j=i;j<n;j++){
             sum+=arr[j];
             double x=Math.sqrt(sum);
             int y=(int)Math.sqrt(sum);
             if(x==y){
                 if(count[y]==sum){
                     ans++;
                 }
             }
         }
         
     }
     System.out.println(ans);

    }
}
