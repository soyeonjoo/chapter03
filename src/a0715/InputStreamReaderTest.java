package a0715;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");//파일열기! //ms949는  그냥하면 깨진다..
			InputStreamReader isr = new InputStreamReader(fis,"ms949");//ms949로 인코딩 하라는 말 . inputStreamReader는 , 하고 적을수 있음
			
			int data = -1;
			
			while((data= isr.read())!= -1 ){
				System.out.print((char)data);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
