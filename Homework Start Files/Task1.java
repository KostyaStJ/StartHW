package old;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input filename");
		String s = sc.nextLine();
		File f1 = new File (s +".txt");
		
		try(PrintWriter pw = new PrintWriter(f1)) {
			System.out.println("Input text");
			pw.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Save file? Input 1 - Yes; 2 - No");
		try {
			int c = sc.nextInt();
			if (c==1) {
				
				
			}else if(c==2) {
				f1.delete();
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Error.Try again");
		}
		
		
	}

}
