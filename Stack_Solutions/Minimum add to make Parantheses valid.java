import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int ans=solve(str);
      System.out.println(ans);

    }
    public static int solve(String str){
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
          else if(c==')' && stack.peek()=='('){
              stack.pop();
          }else{
              stack.push(c);
          }
        }
        return stack.size();
    }
}