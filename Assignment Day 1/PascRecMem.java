import java.util.HashMap;

import java.util.Map;

public class PascRecMem {

  Map<String, Integer> cache = new HashMap<String, Integer>();

  int pascCalc(int r, int c){

    if(c == 0 || c == 1)

     return c;

    else if(c == r+1 || r == 0)

     return 0;

     

    if(cache.containsKey((r+","+c))){

      return cache.get((r+","+c));

    }

     

    int result = pascCalc(r-1, c-1)+pascCalc(r-1, c);

    cache.put((r+","+c), result);

    return result;

  }

  public static void main(String[] args) {

     PascRecMem ob = new PascRecMem();

     int n = 5;

     for(int i=1;i<=n;i++){

       for(int j=1;j<=n-i;j++)

         System.out.print(" ");

     

       for(int j=1;j<=i;j++)

      System.out.print(ob.pascCalc(i,j)+ " ");

      System.out.println();

      }

  }

}
