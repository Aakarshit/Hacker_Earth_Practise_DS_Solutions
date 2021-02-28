import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(!stack.isEmpty() && stack.peek()==c){
               stack.pop();
           }else{
               stack.push(c);
           }

       }
       StringBuilder sb=new StringBuilder();
       if(stack.isEmpty()){
           System.out.println("Empty String");
       }else{
       while(!stack.isEmpty()){
           sb.append(stack.pop());
       }
       System.out.println(sb.reverse());
       }
    }
}