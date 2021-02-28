import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
         Scanner sc=new Scanner(System.in);
 
    String s=sc.next();
 
    char ch[]=s.toCharArray();
 
    int flag,c=0,i,j,n=ch.length;
 
    for(i=0;i<n;i++)
 
      {
 
        flag=0;
 
        if(ch[i]==')'){
 
          continue;}
 
        for(j=i;j<i+n;j++)
 
        {
 
          if(ch[(j%n)] == '(' )
 
            flag++;
 
          else
 
            flag--;
 
         if(flag<0)
 
           break;
 
       }
 
       if(flag==0)
 
         c++;
 
     }
 
     System.out.println(c);
    }} 