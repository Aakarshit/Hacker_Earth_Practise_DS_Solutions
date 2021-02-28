import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int i=check(arr);
      System.out.println(i);
    }
    public static int check(int arr[]){
        int count=1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        return count;
    }
}