package chapter03;

import java.util.Formatter;

public class FomatterTest {

	public static void main(String[] args) {
		String name = "주소연";
		int score = 100;
		

		System.out.println(name + ", "+score);
		
		
		//string 클래스의 format static 메소드를 사용하는 경우
		System.out.println(String.format("학생 %s는 자바시험을 %d점 받았습니다", name, score));
	
		//formatter 을 사용하는 경우
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
		System.out.println(fm.format("학생 %s는 자바시험을 %d점 받았습니다", name, score));
	
	}

}
