import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int  i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      ArrayList<Integer> ans=new ArrayList<Integer>();
      ans=solve(n,k,arr);
      for(int i:ans){
          System.out.print(i+" ");
      }

    }
    public static ArrayList<Integer> solve(int n,int k,int[] arr){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int max=0;
        for(int i=0;i<=arr.length-k;i++){
            max=maxEl(arr,i,k);
            ans.add(max);
        }
        return ans;
    }
    public static int maxEl(int arr[],int j,int k){
        int max=0;
        while(k-->0){
            max=Math.max(max,arr[j++]);
        
        }
        return max;
    }
}