package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();//리스트로 참조해도됨
		
		stack.push("둘리");
		stack.push("도우넛");
		System.out.println(stack.peek())
		;
		
		stack.push("마이콜");
		System.out.println(stack.pop());
		stack.push("고길동");
		
		
		while(stack.isEmpty()==false){//LIFO이라서 뒤에서 부터 출력
			String s = stack.pop();
			System.out.println(s);
		}
		
		
		
		

	}

}
