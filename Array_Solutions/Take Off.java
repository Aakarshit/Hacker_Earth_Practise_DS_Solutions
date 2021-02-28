import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
            int n=sc.nextInt();
             int p=sc.nextInt();
              int q=sc.nextInt();
               int r=sc.nextInt();
               int count=solve(n,p,q,r);
               System.out.println(count);
       }
    }
    public static int solve(int n,int p,int q,int r){
        int count=0;
       for(int i=1;i<=n;i++){
if(((i%p==0)&&(i%q==0))||((i%p==0)&&(i%r==0))||((i%q==0)&&(i%r==0))){
continue;
}
else if((i%p==0)||(i%q==0)||(i%r==0)){
count++;
}
}
return count;    
}}