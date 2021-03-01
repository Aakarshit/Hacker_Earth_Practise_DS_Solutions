import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i:arr){
              if(map.containsKey(i)){
                  map.put(i,map.get(i)+1);
              }else{
                  map.put(i,1);
              }
          }
          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
      }

    }
}
