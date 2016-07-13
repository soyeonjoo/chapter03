package chapter03;

public class LangClassTest {
	public static void main(String[]args){
		Point p1 = new Point(10,20);
		Point p2 = new Point(50,100);
		Point p3 = p1;
		Point p4 = new Point(10,20);
		
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);//객채를 출력하면 객체의 toString 출력
	
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);//객체의 동일성비교 가르키는 곳이 일치하는지 .. 안의 값을 비교 하려면 equals를 통해서..
		System.out.println();
	
		//equals
		System.out.println(p1.equals(p4));//안의 내용을 비교할때  // equal 오버라이드해야함 안그러면 false
		
		
		String s1 =new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
