package a0715;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		File file = new File("phone.txt");
		if (file.exists() == false) {
			System.out.println("파일이 존재하지 않습니ㅏ다.");
			return;
		}
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) { // 기본적인 디바이더가 스페이스, 개행, 탭 이기때문에 String네개
										// 만들어준것이다.
				String name = scanner.next();
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();
				System.out.println("이름:" + name + "\t\t전화번호" + phone01 + "-" + phone02 + "-" + phone03);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
