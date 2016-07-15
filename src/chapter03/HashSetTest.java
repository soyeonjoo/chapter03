package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
				
		set.add("둘리");
		set.add("마이콜");
		set.add("도우너");
		System.out.println(set.size());
		
		
		//추가하지만 같은 값이 이미 있으므로 안들어감
		set.add("마이콜");
		set.add("도우너");
		System.out.println(set.size());
		

		System.out.println(set.contains("마이콜"));//마이콜이 안에 들어있는지?! 확인하는 코드, 값을 가져올수는 없다!! 
		System.out.println(set.contains("고길동"));//고길동이 안에 들어있는지?! 확인하는 코드 
		
		//전체 가져오기 iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
