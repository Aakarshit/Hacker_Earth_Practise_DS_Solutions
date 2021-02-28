import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0){
           String str=sc.nextLine();
           binary(str);
       }
    }
    public static void binary(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<sb.length();i++){
            if(!stack.isEmpty() && stack.peek()==sb.charAt(i)){
                stack.pop();
            }else{
                stack.push(sb.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        if(stack.isEmpty()){

            System.out.println("KHALI");

        }else{
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
            System.out.println(ans.reverse());
        }

    }
}