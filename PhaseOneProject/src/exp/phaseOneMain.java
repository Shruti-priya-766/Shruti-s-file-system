package exp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class phaseOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddFile af = new AddFile();
		deleteFile df = new deleteFile();
		searchFile sf = new searchFile(); 
		
		System.out.println("-------- AUTHOR:- SHRUTI PRIYA --------");
		
		System.out.println("-------- WELCOME TO FILE SEARCH ENGINE --------");
		
		System.out.println();
		
		System.out.println("The following files are available in the root directory:");
		
		String workingDir = System.getProperty("user.dir");
		
		File fileDir = new File(workingDir+"\\root");
		
		Scanner sc = new Scanner(System.in);
		
		if(fileDir.isDirectory()){
			List fileList = Arrays.asList(fileDir.list());
			Collections.sort(fileList);
			System.out.println("Sorting by filename in ascending order");
			System.out.println();
			int i = 1;
			for(Object s:fileList){
				System.out.println((i++)+". "+s);
			}
		}else {
			System.out.println("Root directory is not exits.!");
		}
		System.out.println();
		

		// Asks for input constantly until it gets y or n
		int inputNum = 0;
		do {
			System.out.println();
			System.out.println("The option given below is available");
			System.out.println();
			System.out.println("1 for display files.\n2 for add file name.\n3 for delete file name.\n4 for search file name.\n5 for Exit");
			System.out.println();
			System.out.println("Choose your option ");
			
			try {
				inputNum = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				//System.out.println("Invalid Input.");
			}
			
			//System.out.println(inputNum);
			
			switch(inputNum) {
				case 1:
					if(fileDir.isDirectory()){
						List fileList = Arrays.asList(fileDir.list());
						Collections.sort(fileList);
						System.out.println("Sorting by filename in ascending order");
						System.out.println();
						int i = 1;
						for(Object s:fileList){
							System.out.println((i++)+". "+s);
						}
					}else {
						System.out.println("Root directory is not exits.!");
					}
					break;
				case 2:
					do {
						af.addFileName();
					}while(!af.exitinput1.toUpperCase().equals("BACK"));
					break;
				case 3:
					do {
						df.DeleteFileName();
					}while(!df.exitinput2.toUpperCase().equals("BACK"));
					break;
				case 4:
					do {
						sf.searchFileName();
					}while(!sf.exitinput3.toUpperCase().equals("BACK"));
					break;
				case 5:
					System.out.println("You came out from the program.");
					System.out.println("Thank You, hope you liked this application.");
					break;
				default :
					System.out.println("INVALID INPUT!!");
					System.out.println();
			}
		} while (inputNum != 5);
	}

}
