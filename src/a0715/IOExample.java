package a0715;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		byte [] src = {0, 1, 2, 3, 4, 5};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(src);//ㄷ연결 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//ㄷ연결 
		
	
		int data = -1 ;
		
		while((data = bais.read()) !=-1 ){ //한마이트씩 읽는다.
			//System.out.println(data);
			baos.write(data);
		}
		byte[] dest = baos.toByteArray();
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
	}
}
