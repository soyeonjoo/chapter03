package chapter03;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class StringTest {
	public static void main(String [] args){
		//이스케이프 문자 사용
		char c = '\'';
		
		String s= "He \" llo\" \t World\n";
		System.out.println(s);
		System.out.println(c);
		
		//+연산
		
		System.out.println("Hello"+  " World"+ 2);
		//위코드는 아래코드와 같은것이다.
		
//		System.out.println( new StringBuffer("Hello").append("World").append(2));//append 안에  int string 들어갈수도있다
		//위 코드 아래 코드로 쓸수있음 
		StringBuffer sb =new StringBuffer("Hello");
		sb.append("World");
		sb.append(2);
	}	
}
