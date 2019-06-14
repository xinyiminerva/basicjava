
public class Hw1{
  public static int A(int a){
    return a+1;
  }
  
  public static void main( String args[] ){
    int i = 0, val = 3;
    for(i = 0; i<5; i++){
      val = A(val);
  }
  
    System.out.println("val " + val );
  }
}
