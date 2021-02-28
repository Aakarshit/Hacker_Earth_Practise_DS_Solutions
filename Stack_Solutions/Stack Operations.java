import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
int n = s.nextInt();
int k = s.nextInt();
long arr[] = new long[n];
for(int i=0; i<n; i++)
{
arr[i] = s.nextLong();
}
Stack<Long> st = new Stack<Long>();
for(int i=n-1; i>=0; i--)
{
st.push(arr[i]);
}
if(k>=n)
{
if(n==1 && k%2==1)
{
System.out.println(-1);
}
else if(n==1 && k%2==0)
{
System.out.println(arr[0]);
}
else
{
int i=0;
long max = arr[0];
while(i<n)
{
if(arr[i] > max)
{
max = arr[i];
}
i=i+1;
}
System.out.println(max);
}
}
else
{
long temp = st.pop();
for(int i=1; i<k-1; i++)
{
if(temp < st.peek())
{
temp = st.pop();
}
else
{
st.pop();
}
}
long temp1 = st.pop();
if(temp > st.peek())
{
System.out.println(temp);
}
else
{
System.out.println(st.peek());
}
}
}}