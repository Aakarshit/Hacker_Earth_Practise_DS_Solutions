import java.io.*;
import java.util.*;
class TestClass {
    public static BufferedReader br;
    public static void main(String args[] ) throws Exception {
       
        br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

        String str=br.readLine();
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){  
            if(!stack.isEmpty() && stack.peek()==str.charAt(i)){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }
        int count=0;
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            count++;
            sb.append(stack.pop());
        }
        System.out.println(count);
        System.out.println(sb.reverse());
    }
}