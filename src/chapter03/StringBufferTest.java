package chapter03;

public class StringBufferTest {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is Pencil");
		System.out.println(sb);
		
		
		sb.insert(7," my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		
		//method chain - return 하는거라 계속 연결해서 쓸수있음
		
		StringBuffer sb2 =new StringBuffer("This");
		sb2.append(" is Pencil").insert(7," my");
		System.out.println(sb2);
		
		
		//+ 연산자 대체 
		
		String s = "Hello"+100+ "World";
		String s2 = new StringBuffer("Hello").append(100).append("World").toString();
		System.out.println(s);
		System.out.println(s2);
	}
}
