import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr1[]=new int[n];
       int arr2[]=new int[n];
       for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           arr2[i]=sc.nextInt();
       }
       long sum1=0;
       long sum2=0;
       int count1=0;
       int count2=0;
       for(int i=0;i<n;i++){
           if(arr1[i]==-1){
               count1++;
           }else{
             sum1+=arr1[i];}
           if(arr2[i]==-1){
               count2++;
           }else{
               sum2+=arr2[i];
           }
       }
      if(count1==1 && count2==0){
          if(sum1<=sum2){
              System.out.println(1);
          }else{
              System.out.println(0);
          }
      }else if(count1==0 && count2==1){
          if(sum2<=sum1){
              System.out.println(1);
          }else{
              System.out.println(0);
          }
      }else if(count1==2 && count2==0){
          if(sum1<=sum2){
              System.out.println(Math.abs(sum1-sum2)+1);
          }else{
              System.out.println(0);
          }
      }else if(count2==2 && count1==0){
          if(sum2<=sum1){
              System.out.println(Math.abs(sum1-sum2)+1);
          }else{
              System.out.println(0);
          }
      }else{
          System.out.println("Infinite");
      }
    }
}
