package a0715;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");// chapter03 오른쪽클릭해서 text파일 만들기 
			
			int data = -1;
			while((data = fr.read())!= -1 ){
				System.out.print((char)data); //'안' -> 2byte 이다. 
			}
		
			fr.close();//여기다가 하면 안됨 finally에 해야함
			
			System.out.println();
			FileInputStream fis = new FileInputStream("test.txt");
			while((data=fis.read())!= -1){
				System.out.print((char)data);//안녕하세요 깨짐 . 한바이트씩읽는다. 그래서 깨진다. 쓸때는 상관없지만 읽을 때가 문제!!!
			}
		} catch (FileNotFoundException e) {//ioexception의 자식임 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e ){ //나중에 처리해야함  
			e.printStackTrace();
		}
		
	}

}
