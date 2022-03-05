package week3.day1;

public class LearnString {
public static void main(String[] args) {
	String text1 = new String("Testleaf is in Chennai");	// Object
	String text2 = "Testleaf";	// Literal
	String text3 = "Since 2000 in India Since 1985";
	
	text2.startsWith("T");
	// String methods
	String replaceAll = text3.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	
		/*
		 * String replace = text2.replace("e", "E"); System.out.println(replace);
		 */
	
	
	
	
		/*
		 * String concat = text2.concat(text3); System.out.println(concat); String text4
		 * = text2+text3; Integer a = 543; System.out.println();
		 */
	
	
	
	
		/*
		 * String substring = text2.substring(4); System.out.println(substring); String
		 * substring2 = text2.substring(2, 6); System.out.println(substring2);
		 */
	
	
	
	
	
	
		/*
		 * String[] array = text1.split(" "); for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * int length = text2.length(); System.out.println(length); for(int i = 0; i <=
		 * length-1; i++) { char charAt = text2.charAt(i); System.out.println(charAt); }
		 * 
		 * char[] array = text2.toCharArray(); for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	
	
	
	
	
	
	
	
	
		/*
		 * boolean equals = text1.equals(text2); System.out.println(equals);
		 * 
		 * boolean equalsIgnoreCase = text1.equalsIgnoreCase(text2);
		 * System.out.println(equalsIgnoreCase);
		 * 
		 * boolean contains = text1.contains(text2); System.out.println(contains);
		 */
	
	
	
	
	
	
	
		/*
		 * String text3 = "     Testleaf is in Chennai      "; String trim =
		 * text3.trim(); System.out.println(trim);
		 */
	
	
		/*
		 * String text3 = text2.toUpperCase(); String text4 = text3.toLowerCase();
		 * System.out.println(text4);
		 */
	
	
	
	
	
	
	
	
	
	
		/*
		 * if (text2.equals(text1)) { System.out.println("The text are same"); } else {
		 * System.out.println("The text are different"); }
		 */
}
}
