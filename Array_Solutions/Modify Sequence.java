import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      String ans=solve(arr);
      System.out.println(ans);
    }
    public static String solve(int arr[]){
        boolean flag=true;
        for(int i=0;i+1<arr.length;i++){
            if(arr[i]<=arr[i+1]){
                arr[i+1]=arr[i+1]-arr[i];
                arr[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                flag=false;
                break;
            }
        }
        if(flag){
            return "YES";
        }else{
            return "NO";
        }

    }