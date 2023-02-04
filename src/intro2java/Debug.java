package intro2java;
public class Debug {
   public static void main(String[] args) {
     Integer i = (int) 2.3;
     Double d = (double) 5;
     System.out.println( i.intValue() );
     System.out.println( d.doubleValue() );
     // Print out the min and max values possible for integers
     System.out.println(Integer.MIN_VALUE);
     System.out.println( Integer.MAX_VALUE );
   }
}
