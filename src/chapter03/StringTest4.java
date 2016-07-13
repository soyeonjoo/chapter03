package chapter03;

public class StringTest4 {

	public static void main(String[] args) {
		String str = "aBcAbCabcABC";
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 5));
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.replace('a', 'R'));
		System.out.println(str.replaceAll("a", "R"));
		System.out.println(str.substring(0,3));
	
	    String a = new String(" abcd");
	    String b = new String(",efg ");
	    
	    System.out.println(a.concat("rrr"));
	    a = a.concat(b); //a는 바뀜
	    System.out.println(a);
	    
	    a =a.trim();
	    System.out.println("===="+a+"====");
	    
	    
	    String[] as= a.split(",");
	    for(String s : as){
	    	System.out.println(s);
	    }
	}

}
