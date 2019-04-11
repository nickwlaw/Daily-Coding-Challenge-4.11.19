
public class DCPApp {

	public static void main(String[] args) {

		String trueTest1 = "([])[]({})";
		String falseTest1 = "([)]";
		String falseTest2 = "((()";
		
		System.out.println(test1(trueTest1));
		System.out.println(test1(falseTest1));
		System.out.println(test1(falseTest2));
	}
	
	// this test will assume this string does not have any characters that are not ()[]{};
	private static boolean test1(String test) {
		boolean isValid = false;
		for (int i = 0; i < test.length(); i++) {
			if (String.valueOf(test.charAt(i)).equals("("))
				isValid = par(test.substring(i));
			if (String.valueOf(test.charAt(i)).equals("["))
				isValid = squ(test.substring(i));
			if (String.valueOf(test.charAt(i)).equals("{"))
				isValid = cur(test.substring(i));
			i++;
		}
		return isValid;
		
	}

	private static boolean par(String parTest) {
		return false;
	}
	private static boolean squ(String squTest) {
		return true;
	}
	private static boolean cur(String curTest) {
		return true;
	}
}

/*
 * Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
 *
 * For example, given the string "([])[]({})", you should return true.
 *
 * Given the string "([)]" or "((()", you should return false.
*/