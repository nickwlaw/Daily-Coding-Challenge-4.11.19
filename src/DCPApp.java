
public class DCPApp {

	public static void main(String[] args) {

		String trueTest1 = "([])[]({})";
		String falseTest1 = "([)]";
		String falseTest2 = "((()";
		
		System.out.println(test1(trueTest1));
		System.out.println(test1(falseTest1));
		System.out.println(test1(falseTest2));
	}
	
	private static boolean test1(String test) {
		
	}

}

/*
 * Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
 *
 * For example, given the string "([])[]({})", you should return true.
 *
 * Given the string "([)]" or "((()", you should return false.
*/