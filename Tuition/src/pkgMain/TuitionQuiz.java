package pkgMain;

import java.util.Scanner;

public class TuitionQuiz {

public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("How much tuition will you be paying your first year in college?:");
		double tuition = input.nextDouble();
		
		System.out.println("By what percent will your tuition increase per year(don't include % sign):");
		double rate = 1 + ((input.nextDouble()) / 100);
		
		double total = 0;
		for (int i = 0; i < 4; i++){
			
			double yearlytotal = tuition * Math.pow(rate, i);
			tuition = yearlytotal;
			total += yearlytotal;
			input.close();
		}
		
		System.out.printf("The total tuition to complete a degree is $%4.2f\n" , total); 
		}
}