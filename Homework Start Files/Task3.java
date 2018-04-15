package javatsrt;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File d = new File ("d");
		d.mkdir();
		listDir(d);
		

	}

	public static void listDir(File d) {
		File [] arr = d.listFiles();
		for(File file:arr) {
			System.out.println(file);
		}
		
		}
	}


