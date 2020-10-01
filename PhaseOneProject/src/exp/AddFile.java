package exp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	String exitinput1;
	public void addFileName() {
		
		boolean addFileFlag = true;
		String workingDir = System.getProperty("user.dir");
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println();
		System.out.println("Enter BACK to exit this menu.");
		System.out.println("OR");
		System.out.println("Enter the file name to 'ADD'.");
		System.out.println();
		exitinput1 = sc.next();
		File testfile = new File(workingDir+"\\src\\root\\", exitinput1);
	
		if(testfile.exists()) {
			addFileFlag = false;
			System.out.println(exitinput1+" already exist.!!");
		}
		if(exitinput1.endsWith(".txt") && addFileFlag == true) {
			System.out.println("valid");
			try(FileWriter fw=new FileWriter(workingDir+"\\src\\root\\"+exitinput1);
				BufferedWriter bw=new BufferedWriter(fw);
			){
				System.out.println("Enter some containt inside the file");
				String containtOfFile = sc.next();
				containtOfFile += sc.nextLine();
				bw.write(containtOfFile);
			} catch (IOException e) {
				System.out.println("inside catch");
				System.out.println(e);
			}
		}else if(addFileFlag == false){
			System.out.println();
		}else {
			System.out.println("Invalid file name. please add .txt extension");
		}
	}
}
