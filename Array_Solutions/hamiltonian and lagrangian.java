import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     ArrayList<Integer> a=new ArrayList<>();
     int max=arr[n-1];
     for(int i=n-1;i>=0;i--){
         if(arr[i]>=max){
             max=arr[i];
            a.add(max);
         }
     }
     Collections.reverse(a);
     for(int e: a){
         System.out.print(e+" ");     
         }
    }
}