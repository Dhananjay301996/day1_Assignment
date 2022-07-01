package day1_Assignment;

public class demonstate {
	
	 static int x = 30;
	 static int y;
	   
	   static void method(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      System.out.println("Running static initialization block.");
	      y = x + 20;
	   }
	   
	   public static void main(String args[]) {
	      method(20);
	   }

}
