package a0715;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {

		try {
			// 파일을 이용해
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			System.out.println("======파일 정보========");
			System.out.println(file.getAbsolutePath());
			System.out.println("======파일 사이즈========");
			System.out.println(file.length() + "byte"); // byte 단위 (속성가서 보면됨)
			System.out.println("======전화번호 리스트 ========");

			FileInputStream fis = new FileInputStream("phone.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String s = null;
			while ((s = br.readLine()) != null) {
				// System.out.println(s);
				StringTokenizer st = new StringTokenizer(s, "\t "); // 토큰으로
																	// 분류한다!!하나씩
																	// 스트링으로
				int index = 0; // 이게 첫번째인지 두번째토큰인지 알기위해

				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (index == 0) {
						System.out.print("이름:" + token);
					} else if (index == 1) {
						System.out.print("\t전화번호:" + token);
					} else if (index == 2) {
						System.out.print("-" + token);
					}
					index++;
				}
				System.out.println();

				// System.out.print(token);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
