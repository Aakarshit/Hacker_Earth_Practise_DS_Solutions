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
           String ans=check(arr);
           System.out.println(ans);
       }

    }
    public static String check(int arr[]){
        int max=Arrays.stream(arr).max().getAsInt();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int temp=sum-max;
        if(temp>max){
            return "Yes";
        }else{
            return "No";
        }
    }
}