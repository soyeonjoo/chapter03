package chapter03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest2 {//arraylist linkedlist 보다 사이즈가 크다..

	public static void main(String[] args) {
		
			List<String> list = new Vector<String>();
			list.add("둘리");
			list.add("마이콜");
			list.add("고길동");
			
			list.remove("고길동");
			
			//순회 1
			int count  = list.size();
			for(int i = 0; i < count; i++){
				String s = list.get(i);
				System.out.println(s);
			}
			
			//순회 2 (요즘방식)
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				String s = it.next();
				System.out.println(s);
			}
			//순회 3 
			for(String s : list){
				System.out.println(s);
			}
		}
	}


