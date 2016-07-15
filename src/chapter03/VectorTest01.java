package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		//collection Framework 1.2이전 
		Vector<String> vector = new Vector<String>();//string을 저장하는 vector다. 내부에 string 배열이있음
		
		vector.addElement("둘리");//추가
		vector.addElement("마이콜");
		vector.addElement("도우넛");
		vector.addElement("고길동");
		
		vector.removeElement("마이콜");//지우기
		
		//순회 1
		int size = vector.size();
		for(int i= 0;i<size; i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		//순회 2(옛날방식)
		Enumeration<String> e= vector.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
		
		//
		
		
		
	}

}
