package Collection_FrameWork_ArrayList;
import java.util.Stack;

public class Stack1
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		Stack s1=new Stack();
		s1.push(22);
		s1.push('A');
		s1.push("Hello");
		s1.push(2.2);
		s1.push(null);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		
	}
}
