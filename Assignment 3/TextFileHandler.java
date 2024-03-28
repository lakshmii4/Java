package classworkdayseven.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileHandler {
	public static void main(String[]args) {
		Map<String,String> countryMap = new HashMap<String,String>();
		String country = null;
		String capital = null;
		File file = new File("D:\\pro\\country.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine()) !=null) {
				String[] countryCapValue = line.split(",");
				countryMap.put(countryCapValue[0], countryCapValue[1]);
				
			}
			System.out.println(countryMap);
			fr.close();
			br.close();
			
		
		}catch (FileNotFoundException e) {
//			ToDo auto-generated catch block
			e.printStackTrace();
		}

	catch (IOException e) {
//		ToDo auto-generated catch block
		e.printStackTrace();
	}
	}

}
