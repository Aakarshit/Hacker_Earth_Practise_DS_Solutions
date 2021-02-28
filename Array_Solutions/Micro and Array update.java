import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
           int k=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }

           int ans=check(n,arr,k);
           System.out.println(ans);
       }

    }
    public static int check(int n,int arr[],int k){
        int min=Arrays.stream(arr).min().getAsInt();
        int a=k-min;
        if(a<0){
            return 0;
        }
        return a;
    }
}