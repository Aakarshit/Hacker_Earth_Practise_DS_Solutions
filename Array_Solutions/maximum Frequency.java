import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int max=0;
       int k=0;
       for(int i=0;i<n;i++)
       {
           int c=0;
           for(int j=0;j<n;j++){
               if(arr[i]==arr[j]){
                   c++;
               }
               if(c>max){
                   max=c;
                   k=arr[i];
               }
           }
       }
       System.out.print(k);

    }
}
