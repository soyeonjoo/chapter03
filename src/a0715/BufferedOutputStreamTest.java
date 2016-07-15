package a0715;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[]args){
		try {
			FileOutputStream fis = new FileOutputStream(" 123.txt");//주스트림은 바로 파일에 넣지
			
			BufferedOutputStream bos = new BufferedOutputStream(fis);//보조스트림 가져다끼운것
			
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(" 123.txt")); 이렇게 바로 생성가능 		
		
			for(int i = '1';i<'9';i++){//는  for(int i = 49;i<57;i++) 과 같은것 아스키코드값
				bos.write(i);
				
				
			}bos.flush();//내부 버의 내용을 파일에 적용(쓰기)
			bos.close(); //닫을때 자동으로 flush가 일어남
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
