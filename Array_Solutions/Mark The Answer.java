import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x && temp<=1){
                ans++;
            }
            if(arr[i]>x){
                temp++;
            }
            else if(temp==2){
                break;
            }
        }
        System.out.println(ans);
    }
}
