import java.util.Scanner;

public class Day14
{
	public static boolean checkParens(String text) {
		Stack<Character> stack = new ArrayStack<Character>();
		for (char c : text.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')') {
				if (!stack.isEmpty() && stack.top() == '(')
					stack.pop();
				else 
					return false;
			} else if (c == ']') {
				if (!stack.isEmpty() && stack.top() == '[')
					stack.pop();
				else 
					return false;
			} else if (c == '}') {
				if (!stack.isEmpty() && stack.top() == '{')
					stack.pop();
				else 
					return false;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		while (true) {
//			System.out.println("Type an expression (blank to stop): ");
//			String expression = scanner.nextLine();
//			if (expression.equals(""))
//				break;
//			if (checkParens(expression))
//				System.out.println("Syntax ok.");
//			else
//				System.out.println("Syntax NOT ok!");
//		}
//		
		
//		Stack<String> pancakes = new ArrayStack<String>();	
//		pancakes.push("blueberry");
//		pancakes.push("strawberry");
//		pancakes.push("chocolate chip");
//		
//		while (!pancakes.isEmpty()) {
//			String p = pancakes.pop();
//			System.out.println(p);
//		}
		
		Queue<String> people = new ArrayQueue<String>();
		people.enqueue("Alice");
		people.enqueue("Beatrix");
		people.enqueue("Clarice");
		System.out.println(people.dequeue());
		people.enqueue("Dimitri");
		System.out.println(people.dequeue());
		people.enqueue("Enrique");
		people.enqueue("Frank");
		people.enqueue("Georgina");
		people.enqueue("Henrietta");
		people.enqueue("Inga");
		people.enqueue("J");
		people.enqueue("Kara");
		people.enqueue("Lola");
		while (!people.isEmpty())
			System.out.println(people.dequeue());

	}

}
