import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=20;
        arr[1]=30;
        for(int i=2;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i-2]*2;
            }else{
                arr[i]=arr[i-2]*3;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]*2);
    }
}
