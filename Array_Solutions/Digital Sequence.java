import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int count[]=new int[10];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int max=0;
      
       for(int i=0;i<arr.length;i++){
           int temp[]=new int[10];
          while(arr[i]!=0){
              int p=arr[i]%10;
              temp[p]=1;
              arr[i]=arr[i]/10;
          }
          for(int j=0;j<10;j++){
              if(temp[j]==1){
                  count[j]++;
              }
          }
       }
       for(int i=0;i<10;i++){
           max=Math.max(count[i],max);
       }
       System.out.println(max);
      
    }
  
    
}