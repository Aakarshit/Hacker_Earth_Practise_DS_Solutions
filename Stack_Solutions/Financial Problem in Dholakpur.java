import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           ArrayList<Integer> a=new ArrayList<>(check(arr));
           for(int e:a){
               System.out.print(e+" ");
           }
           System.out.println();
       }
    }
    public static ArrayList<Integer> check(final int arr[]){
        ArrayList<Integer> a=new ArrayList<Integer>();
       
       for(int i=0;i<arr.length;i++){
           int j=i-1;
           int count=1;
           while(j>=0 && arr[j]<=arr[i]){
               count++;
               j--;
           }
           a.add(count);
       }
        
        return a;

    }
}