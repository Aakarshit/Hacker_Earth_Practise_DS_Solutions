import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

int n = s.nextInt();
int[] A = new int[n]; 
for(int i=0;i<n;i++){
int e = s.nextInt();
A[i]=e;
}
int i,j,k;
for(i = 0; i < n; i++)
{
for(j = i+1; j < n; j++)
{
if(A[i] < A[j])

break;
}
if(j != n)

{
for(k = j+1; k < n; k++)
{
if(A[j] > A[k])
break;
}
if(k != n)
System.out.print(A[k] + " ");
else
System.out.print(-1 + " ");

}
else
System.out.print(-1 + " ");
}
}}