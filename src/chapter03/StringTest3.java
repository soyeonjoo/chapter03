package chapter03;

public class StringTest3 {//스트링 리터럴과 new String ()차이점

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		
		
		
		String s3 = new String("hello");
		String s4 = new String("hello");
	
		System.out.println(s1 == s2);//같은 객체만 가르키는것이기 때문에 true  (constant Pool에서..상수처럼 쓰기위해) 같은 값이라서 
		System.out.println(s3 == s4);//두개 다른객체이기 때문에 false
	
	}

}
