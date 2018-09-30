import java.util.*;
public class time_analysis {
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter list of text. Note that Java removes 00s at the beginning of a list.");
		System.out.println("Start list with 10001000.");
		String text = userinput.nextLine();

		int counter = text.length()/8;
		int sum = 0;
		int counter2 = 0;
		int counter3 = 8;
		
		
		for(int i = 0; i< counter; i++) {
			
			String initialPart1 = text.substring(counter2,counter2 + 2);
			String initialPart2 = text.substring(counter2 +2, counter2 + 4);
			String finalPart1 = text.substring(counter2 + 4,counter2 + 6);
			String finalPart2 = text.substring(counter2 + 6,counter3);

			int iP1 = Integer.parseInt(initialPart1);
			int iP2 = Integer.parseInt(initialPart2);
			int fP1 = Integer.parseInt(finalPart1);
			int fP2 = Integer.parseInt(finalPart2);

			int TimeInChamber = fP1*60 +fP2 - iP1*60 - iP2;
			
			counter2 += 8;
			counter3 += 8;

			System.out.println(TimeInChamber);
						sum += TimeInChamber;
			System.out.println(sum);
			
			
		}	
}


}
