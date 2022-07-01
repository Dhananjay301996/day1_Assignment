package day1_Assignment;

public class sum_of_com_arg {
	

	public static void main(String[] number) {
		int sum = 0;
		System.out.println("Calculates Sum for below Integers");
		
		for(int i=0;i<number.length;i++){
			
			System.out.println(number[i]);
			
			try {
			sum = sum + Integer.parseInt(number[i]);
			}
			catch (NumberFormatException e) {
				
			System.out.println("Invalid integer command line arguments: " + e.toString());
			}
		}
		System.out.println("Sum :" + sum);

}
}