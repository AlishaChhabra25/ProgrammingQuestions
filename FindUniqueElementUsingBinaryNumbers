import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    int n = 2;
    int sum = 0;
    int[] arr = {3,4,4,5,5,6,7,6,7};
    int[] holdBinary = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      holdBinary[i] =  Integer.parseInt(Integer.toBinaryString(arr[i]));
    }
    for(int i=0;i<arr.length;i++){
      sum += holdBinary[i];
    }
    ArrayList<Integer> array = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    while(sum > 0){
      st.push(sum%10);
      sum /= 10;
    }
    while(!st.isEmpty()){
      array.add(st.pop());
    }
    String s ="";
    Iterator<Integer> itr = array.iterator();
    while(itr.hasNext()){
      s += itr.next()%n;
    }
    System.out.println(Integer.parseInt(s,2));
  }
}
