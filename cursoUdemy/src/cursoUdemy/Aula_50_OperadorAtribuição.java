package cursoUdemy;

public class Aula_50_OperadorAtribuição {
	public static void main(String[] args) {
      int a = 3;
      int g = a; 
      int f = a+g;
      
      a = a+g; //  a+=g;
      a = a-g; //  a-=g;
      a = a*g; //  a*=g;
      a = a/g; //  a/=g;
      a = a%g; //  a%=g;
      
      int y = 5;
      int p = 9;
      
      
      System.out.println(y%p);
      System.out.println(f);
	}
}
