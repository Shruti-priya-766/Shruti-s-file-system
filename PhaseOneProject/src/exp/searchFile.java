package exp;

import java.io.File;
import java.util.Scanner;

public class searchFile {
	String exitinput3;
	public void searchFileName() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter BACK to exit this menu.");
		System.out.println("OR");
		System.out.println("Enter the file name to 'SEARCH'.");
		System.out.println();
		exitinput3 = sc.next();
		String workingDir = System.getProperty("user.dir");
		File sfile = new File(workingDir+"\\src\\root\\");
		
		fileExistsCheck fec = new fileExistsCheck();
		if(fec.existsFile(sfile,exitinput3)) {
			System.out.println(exitinput3+" is found.");
		}else {
			System.out.println(exitinput3+" is not found.");
		}
	}
}
