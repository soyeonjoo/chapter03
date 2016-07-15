package a0715;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {//?

	public static void main(String[] args) {
		FileInputStream fis =null;
		FileOutputStream fos=null;
		try {// 파일이 없는 예외가 발생할수 있다.
			 fis = new FileInputStream("123.jpg");
			 fos = new FileOutputStream("4567.jpg");
			
			int data = -1;
			
			while((data= fis.read())!= -1){
				fos.write(data);
			}
		
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.:"+e);
			return;
		}catch(IOException e){
			e.printStackTrace();
		}finally {//자원정리 - 꼭 끝나야ㅏㄴ다는것
			try{ 
			if(fis!=null){
			fis.close();
			}if(fos != null){

			fos.close();	
			}
			}catch(IOException e){
				
			}
			
		}
	}
	
}
