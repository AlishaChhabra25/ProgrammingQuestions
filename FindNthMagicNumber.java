import java.util.*;
import java.io.*;
import java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    int n = 12;
    int magic = 0;
    int i=1;
    while(n != 0)
    {
    if((n & 1) == 1){
      magic += Math.pow(5,i);
      i++;
    }
    else i++;
    n = n >> 1;
    }
    System.out.println(magic);
    }
}
