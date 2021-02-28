import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         ArrayList<Integer> ans=new ArrayList<Integer>();
         ans=funGame(arr);
         StringBuilder sb=new StringBuilder();
         for(int i:ans){
             sb.append(i+" ");
         }
         System.out.print(sb);

         wr.close();
         br.close();
    }
    static ArrayList<Integer> funGame(int[] arr){
      Stack<Integer> stack=new Stack<Integer>();
      Queue<Integer> q=new LinkedList<Integer>();
      for(int i:arr){
          stack.add(i);
          q.add(i);
      }
      ArrayList<Integer> ans=new ArrayList<Integer>();
      while(!q.isEmpty() && !stack.isEmpty()){
          if(q.peek()>stack.peek()){
              ans.add(1);
              stack.pop();
          }else if(stack.peek()>q.peek()){
              
              q.poll();
              ans.add(2);

          }else{
              ans.add(0);
              q.poll();
              stack.pop();
          }
      }
      return ans;
    
    }
}