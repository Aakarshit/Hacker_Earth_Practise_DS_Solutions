import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int sum=0,max=0,start=0,ans=0;
       for(int i=0;i<n;i++){
          if(arr[i]==1){
              sum+=arr[i];
          }else{
              sum+= -1;
          }
          if(sum<0){
              start=0;
              sum=0;
          }
          else{
              start++;
              if(ans<=sum){
                  ans=sum;
                  max=start;
              }
          }
       }
       System.out.println(max);
      

    }
}
