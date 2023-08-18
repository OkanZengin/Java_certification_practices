package part_five;

public class PrintStrings {

	public static void main(String[] args) {
		String str = "123456789012345678901234567890";
		System.out.println("forward");
		printforward(str);
		System.out.println("now backward");
		printBackwards(str);
		System.out.println("now every even chars");
		printevenchars(str);
		System.out.println("now every uneven chars");
		printuneven(str);
	}
	
	public static void printBackwards(String str) {
		for (int i=str.length()-1 ; i>=0; i-- ) {
			System.out.println("char: "+ str.charAt(i));
		}
	}
	public static void printforward(String str) {
		for (int i=0 ; i<str.length(); i++ ) {
			System.out.println("char: "+ str.charAt(i));
		}
	}

	public static void printevenchars(String str) {
		for (int i=1 ; i<str.length(); i+= 2 ) {
			System.out.println("char: "+ str.charAt(i));
		}

}

	public static void printuneven(String str) {
		for (int i=0 ; i<str.length(); i+= 2 ) {
			System.out.println("char: "+ str.charAt(i));
		}
}
}