package finaExamInClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDictionary {

	
	public static void main(String[] args) throws IOException {
		String path = "file\\dictionary.txt";
		Boolean fileExist = false;
		
		FileDictionary fd = new FileDictionary();
		fileExist = fd.doesFileExist(path);
		if(fileExist) {
			fd.readAndPrint(path);
		}
		
	}
	
	public boolean doesFileExist(String path) throws FileNotFoundException {
		FileReader fr = new FileReader(path);
		if(fr != null) {
			System.out.println("Yes the file exist in the given path");
			return true;
		}	else {
			System.out.println("No the file does not exist in the given path");
			return false;			
		}
	}
	
	public void readAndPrint(String path) throws IOException {		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String readLine1 ;
		String[] dictItem = new String[2];
		String[] meaningItem = new String[2];

		while ((readLine1 = br.readLine()) != null) {
			dictItem = readLine1.split("-");
			meaningItem = dictItem[1].split(",");
			System.out.println(dictItem[0].trim());
			if(meaningItem.length > 0) {
				System.out.println(meaningItem[0].trim());				
			}
			if(meaningItem.length > 1) {
				System.out.println(meaningItem[1].trim());				
			}
		}

	}
}
