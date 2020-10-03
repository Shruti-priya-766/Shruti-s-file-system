package exp;

import java.io.File;
import java.util.Scanner;

public class deleteFile {
	String exitinput2;
	public void DeleteFileName() {
		Scanner sc = new Scanner(System.in);
		fileExistsCheck fecd = new fileExistsCheck();
		System.out.println();
		System.out.println("Enter BACK to exit this menu.");
		System.out.println("OR");
		System.out.println("Enter the file name to 'DELETE'.");
		System.out.println();
		exitinput2 = sc.next();
		
		//String workingDir = System.getProperty("user.dir");
		String workingDir = System.getProperty("user.dir");
		File dfile = new File(workingDir+"\\root\\"+exitinput2); 
		File sfile = new File(workingDir+"\\root\\");
		
		//System.out.println(fecd.existsFile(sfile,exitinput2));
		if(!fecd.existsFile(sfile,exitinput2)) {
			System.out.println(exitinput2+" FILE NOT FOUND.!!");
		}else {
			if(dfile.delete()) {
				System.out.println(exitinput2+" deleted successfully"); 
			}else {
				System.out.println("Failed to delete the file");
			}
		}
	}
}
