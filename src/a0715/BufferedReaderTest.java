package a0715;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


	public class BufferedReaderTest {

		public static void main(String[] args) {
			try{
			FileReader fr = new FileReader("./src/a0715/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);
			
			String s = null;
			int index= 0;
			while((s = br.readLine())!= null){
				String line = String.format("%d : %s", ++index, s);
				System.out.print(s);
				
			}
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e ){
				e.printStackTrace();
			}
			
		}

	}

