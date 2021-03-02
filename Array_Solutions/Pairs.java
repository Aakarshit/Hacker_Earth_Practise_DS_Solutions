import java.util.*;
class TestClass {
    static boolean prime[]=new boolean[1000001];
    static int count[]=new int[1000001];
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       help();
       while(t-->0){
         int l=sc.nextInt();
         int r=sc.nextInt();
         long p=count[r]-count[l-1];
         long c=r-l+1-p;
         if(l<=1){
             c--;
         }
         System.out.println(c*p);
       }
    }
    public static void help(){
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<=1000000;i++){
            if(prime[i]){
                for(int j=i*i;j<=1000000;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=1000000;i++){
            count[i]=count[i-1];
            if(prime[i]){
                count[i]++;
            }
        }
    }
}
