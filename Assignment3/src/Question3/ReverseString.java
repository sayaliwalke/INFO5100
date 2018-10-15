package Question3;
//score: 0/2
//your result has a extra space in the end
//you are using javascript in the question, not java 

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
