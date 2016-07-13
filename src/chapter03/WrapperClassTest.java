package chapter03;

public class WrapperClassTest {

		public static void main(String[]args){
			Integer i = new Integer(10);
			Character c = new Character('c');
			Double d = new Double(3.14);
			
			
			System.out.println(i +","+c+","+d );
			
			
			
			//static method
			
			char ch2 = Character.toLowerCase('A');
			System.out.println(ch2);
			
			if (Character.isDigit('9')){
				
			 int i3 =	Character.getNumericValue(ch2);
			 System.out.println(i3);
			}
			
			int i4 = Integer.parseInt("12345");
			int i5 = Integer.parseInt("-12345");
			int i6 = Integer.parseInt("10", 16);
			System.out.println(i4 + ","+ i5+","+ i6);
			
			
			String s2 = Integer.toBinaryString(10);//2진수로
			System.out.println(s2);
			
			System.out.println(Integer.bitCount(10));//10진수로
			
			
			
			//아까 string과 같이 constant pool 에있음 -
			Integer i9 = 10;
			Integer j5 = 10;
			System.out.println(i9==j5);
		}
}
