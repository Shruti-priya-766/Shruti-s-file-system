package exp;

import java.io.File;

public class fileExistsCheck {
	public boolean existsFile(File dir, String filename){
	    String[] files = dir.list();
	    for(String file : files)
	        if(file.equals(filename))
	            return true;
	    return false;
	}
}
