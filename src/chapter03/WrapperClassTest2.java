package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {

		//Boxing
		Integer i = new Integer(10); //10이라는 값을 객채로 만듬
		
		//Unboxig
		int j = i.intValue(); //-> 원래 들어있던 값을  빼냄 
		
		System.out.println(i+","+ j);
		
		
		//auto boxing, 
		Integer i2 = 10; //자동으로 해줌 
		//auto unboxing
		int j2 = i+10; //-> int j2 = i.intValue() +10; 랑같은것 .컴파일러가 알아서해줌 
	}

}
