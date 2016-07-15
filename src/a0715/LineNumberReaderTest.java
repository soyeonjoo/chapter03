package a0715;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {// bufferedReader 와 비슷 getlinenumber만 다름 

	
		public static void main(String[] args) {
			try{
			FileReader fr = new FileReader("./src/a0715/BufferedReaderTest.java");
			LineNumberReader lnr = new LineNumberReader(fr);
			
			String s = null;
			int index= 0;
			while((s = lnr.readLine())!= null){
				String line = String.format("%d : %s", lnr.getLineNumber(), s);
				System.out.println(s);
				
			}
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e ){
				e.printStackTrace();
			}
			
		}


	}


