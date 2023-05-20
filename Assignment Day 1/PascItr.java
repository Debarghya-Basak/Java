
public class PascItr {

  public int fact(int n){
    int factorial = 1;
    for(int i= 1;i<=n;i++)
      factorial *= i;
      
    return factorial;
  }

  public static void main(String[] args) {
    
    PascItr ob = new PascItr();
    int n = 5;
    for(int i=0;i<n;i++){
       for(int j=1;j<=n-i;j++){
         System.out.print(" ");
       }
       
       for(int j=0;j<=i;j++){
         int posValue = ob.fact(i)/ (ob.fact(j) * ob.fact(i-j));
         System.out.print(posValue + " ");
       }
       
       System.out.println();
      
    }
  }
}
