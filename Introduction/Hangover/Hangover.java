import java.util.Scanner;
public class Hangover{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		while(true){
			int n = 1;
			double c = scan.nextDouble();
			double hangover = 0.00;
			if(c == hangover)
				break;
			while(c > hangover)
				hangover += 1.0/((n++)+1);
			System.out.println(String.format("%d card(s)",n-1));	
		}
	}
}
