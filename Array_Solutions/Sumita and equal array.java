import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       StringBuilder sb=new StringBuilder();
       while(t-->0){
           int n=sc.nextInt();
           int x=sc.nextInt();
           int y=sc.nextInt();
           int z=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
           for(int i=0;i<n;i++){
               while(arr[i]%x==0){
                   arr[i]=arr[i]/x;
               }
               while(arr[i]%y==0){
                   arr[i]=arr[i]/y;
               }
               while(arr[i]%z==0){
                   arr[i]=arr[i]/z;
               }
           }
           boolean flag=true;
           for(int i=0;i<n-1;i++){
               if(arr[i]!=arr[i+1]){
                   flag=false;
                   break;
               }
           }
           if(flag){
               sb.append("She can"+"\n");
           }else{
               sb.append("She can't"+"\n");
           }
           
       }
       System.out.print(sb);

    }
}
