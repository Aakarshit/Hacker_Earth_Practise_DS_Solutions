import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c=='('||c=='{'||c=='['){
                    stack.push(c);
                }
                if(stack.isEmpty()){
                    flag=false;
                    break;
                }
                else if(c==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        flag=false;
                        break;
                    }
                }
                 else if(c=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        flag=false;
                        break;
                    }
                }
                 else if(c==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        flag=false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                flag=false;
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }    
    }
    }      
    }