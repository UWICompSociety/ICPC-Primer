import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int stringLength = scanner.nextInt();
		int numberOfStrings = scanner.nextInt();
		scanner.nextLine();
		DNA[] sequences = new DNA[numberOfStrings];
		for(int i = 0; i < numberOfStrings ; i++){
			sequences[i] = new DNA(scanner.nextLine(),i);

		}
		Arrays.sort(sequences);
		for(int i = 0; i < sequences.length; i++){
			System.out.printf("%s\n" , sequences[i].getSequence());

		}
	}

}

class DNA implements Comparable<DNA>{
	private String sequence;
	private int inversions;
	private int position;


		public DNA(String sequence, int pos) {
			this.position = pos;

			this.sequence = sequence;

			char[] sequenceArray = sequence.toCharArray();

			int position = 1;
			for(char c: sequenceArray){
				String tempSequence = sequence.substring(position);
														
				switch (c){
														
					case 'T':
						inversions += countOccurences(tempSequence , 'G');
					case 'G':
				
						inversions += countOccurences(tempSequence , 'C');
					
					case 'C':
				
						inversions += countOccurences(tempSequence, 'A');
				}
				position++;
			}
		}

		private int countOccurences(String string , char character){
			int count = 0;
			for(char c: string.toCharArray()){
				if(c == character)
					count++;
			}
			return count;
		}

		@Override
		public int compareTo(DNA dna) {
			int difference =  inversions - dna.inversions;
			return difference == 0 ? position - dna.position : difference;
		}

		public String getSequence() {
			return sequence;
		}
		public int getInversions() {
			return inversions;
		}
}
