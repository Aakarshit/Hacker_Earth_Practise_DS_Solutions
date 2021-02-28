import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      ArrayList<Integer> ans=new ArrayList<Integer>();
      double max=0;
      for(int i=0;i<n;i++){
          max+=arr[i];
      }
      int count=0;
      for(int p=0;p<n;p++){
          double sum=0;
          for(int k=p;k<n;k++){
              sum+=arr[k];
              double temp;
              int i=p+1;
              int j=k+1;
              if(i==j){
                  temp=1;
              }else{
               temp=(j-i)+1;}
               if(temp == n){
                   ans.add(i);
                   ans.add(j);
                   count++;
               }
               double one=sum/temp;
               double temp1=n-temp;
               double temp3=max-sum;
               double two=temp3/temp1;
              if(one > two){
                  ans.add(i);
                  ans.add(j);
                  count++;
              }
          }
      }
      System.out.println(count);
      for(int i=0;i<ans.size();i+=2){
          System.out.println(ans.get(i)+" "+ans.get(i+1));
      }

    }

}