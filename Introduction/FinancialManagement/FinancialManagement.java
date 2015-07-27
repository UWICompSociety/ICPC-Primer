import java.util.Scanner;
public class FinancialManagement{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		double sum = 0;
		for(int i = 0; i < 12; i++)
			sum += scan.nextDouble();
		double mean = sum/12;
		System.out.println(String.format("$%.2f" , mean));
	}
}
		
