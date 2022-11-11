package finalTakeHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExist {
	
	static String Path = "C:\\Users\\12248\\eclipse-workspace\\TakeHomeFinalExam\\fruit.txt";
	
	public static void main(String[] args) throws Exception {
		doesFileExist(Path);
	}
   public static String doesFileExist(String path) throws IOException {
	   
	   String line = null;
	   try {
		   File f = new File(Path);
		   FileReader fr = new  FileReader(f);
		   BufferedReader br = new BufferedReader(fr);
		   
		   while((line = br.readLine())!=null) {
			   
			  System.out.println(line); 
			 }
		   br.close();
	   }catch(FileNotFoundException e) {
		   
		   System.out.println("File not found");
	   }
	    return line;
}
}