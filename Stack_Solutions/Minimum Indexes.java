import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       int que[]=new int[k];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<k;i++){
           que[i]=sc.nextInt();
       }
       ArrayList<Integer> ans=new ArrayList<Integer>();
       ans=solve(arr,que);
       for(int e:ans){
           System.out.println(e);
       }

    }
    public static ArrayList<Integer> solve(int arr[],int que[]){
       ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<que.length;i++){
            int start=que[i]-1;
            boolean flag=false;
            int end=start+1;
            while(end<arr.length && flag==false){
                if(arr[start]<arr[end]){
                    flag=check(arr[start],arr[end]);
                }
                end++;
            }
            if(flag==false){
                ans.add(-1);
            }else if(flag==true){
                ans.add(end);
            }
        }
       
        return ans;
    }
    public static boolean check(int a,int b){
        int sum=0;
        int sum1=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        while(b!=0){
            while(b!=0){
                sum1+=b%10;
                b=b/10;
            }
        }
        if(sum>sum1){
            return true;
        }else{
            return false;
        }

    }
}