package qwr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int [][] b=new int[4][5];
		for(int i=0;i<b.length;i++){
		for(int j=0;j<b[0].length;j++){
		b[i][j]=i+j;
		System.out.print(b[i][j]+" ");
		}
		System.out.println();
		
		}
		
		saveFile(b);
	}

	public static void saveFile(int[][] c) {
		File arr = new File("a.txt");
		
		try(PrintWriter e = new PrintWriter(arr)) {
			for(int i=0;i<c.length;i++){
				for(int j=0;j<c[0].length;j++){
				e.println(c[i][j]+ " "); 
				}
				
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}