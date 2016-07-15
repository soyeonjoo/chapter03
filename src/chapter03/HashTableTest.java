package chapter03;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
//		map.put("둘리", new Integer(100)); //아래와 같은것
		map.put("둘리", 100);//auto boxing
		
		map.put("마이콜", 50);
		map.put("도우넛", 80);
		
		int score = map.get("마이콜");//auto unboxing
		System.out.println(score);//빼내기
		
		//전체 순회 -순서는 모름 순서가없는 자료구조라
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			System.out.println("key :" + key+ ", vlaue="+ value);
		}
	}

}
