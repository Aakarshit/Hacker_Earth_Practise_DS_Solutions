import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<Integer> ans=new ArrayList<Integer>();
      int arr[]=new int[n];
       for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
       }
ans=solve(arr);
for(int i:ans){
    System.out.print(i+" ");
}

    }
    public static ArrayList<Integer> solve(int []arr){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        ans.add(-1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                boolean flag=true;
                if(!stack.isEmpty()){
                while(flag && !stack.isEmpty()){
               if(stack.peek()>=arr[i]){
                   stack.pop();
               }else{
                   ans.add(stack.peek());
                   flag=false;
               }
               }
               if(stack.isEmpty()){
                   ans.add(-1);
               }
               }else{
                   ans.add(-1);
               }
            }
            else if(arr[i]>arr[i-1] && stack.isEmpty()){
                stack.push(arr[i-1]);
                ans.add(stack.peek());
            }else if(arr[i]>arr[i-1]&& !stack.isEmpty()){
               
                stack.push(arr[i-1]);
                ans.add(stack.peek()); 
            }else if(arr[i]==arr[i-1] && stack.isEmpty()){
                ans.add(-1);
            }else if(arr[i]==arr[i-1] && !stack.isEmpty()){
                ans.add(stack.peek());
            }
        }
        return ans;         
    }
}