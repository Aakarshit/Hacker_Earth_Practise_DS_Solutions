import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=check(arr);
        System.out.println(ans);

    }
    public static int check(int arr[]){
        int count=0;
        Arrays.sort(arr);
        while(arr[arr.length-1]!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==1){
                    arr[i]--;
                    count++;
                }
            }
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i]/2;
                
            }
            count++;
        }
        return count-1;
    }
}