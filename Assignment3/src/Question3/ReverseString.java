package Question3;

public class ReverseString {
	public String reverseString(String s) {
		System.out.println("The given string is \n" + s);
		var newString = "";
		String words[] = s.trim().split("\\s+");
		int length = words.length;

		for (var i = length - 1; i >= 0; i--) {

			newString += words[i] + " ";
		}
		System.out.println("The reverse string is \n " + newString);
		return newString;

	}

	public static void main(String[] args) {

		ReverseString reverse = new ReverseString();

		reverse.reverseString("             The          sky    is    blue    ");

	}

}
