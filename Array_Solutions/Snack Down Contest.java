import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int arr[]=new int[p];
            for(int i=0;i<p;i++){
                arr[i]=sc.nextInt();
            }
            int q=sc.nextInt();
            int ar[]=new int[q];
            for(int i=0;i<q;i++){
                ar[i]=sc.nextInt();
            }
            String str=solve(arr,ar,n);
            System.out.println(str);
        }
    }
public static String solve(int[] arr,int ar[], int n){
        HashSet<Integer> set=new HashSet<Integer>();
        HashSet<Integer> set1=new HashSet<Integer>();
       
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        for(int i:arr){
            set1.add(i);
        }
        for(int i:ar){
            set1.add(i);
        }
        if(set.equals(set1)){
            return "YES";
        }else{
            return "NO";
        }
}
}