package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); //insert할때 remove 문제가있음.  배열을 사용해서! 
		list.add("둘리");
		list.add("마이콜");
		list.add(2,"도우넛");//삽입 ...
		
		list.add("고길동");
		
		list.remove("고길동");
		
		//순회1
		int count  = list.size();
		for(int i = 0; i < count; i++){
			String s = list.get(i);
			System.out.println(s);
		}
		
		//순회 2 vector linkedlist arraylist 다 가능!
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	
		//순회 3 확장포문 이아이를 가장많이 씀 
		for(String s : list){
			System.out.println(s);
		}
	
	
	}

}
