package test;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("chandrika"));
	}
	
	static String reverseString(String name){
		StringBuilder sb=new StringBuilder();
		char[] nameCharArr=name.toCharArray();
		for (int i = nameCharArr.length-1; i >0; i--) {
			char c = nameCharArr[i];
			sb.append(c);
		}
		return sb.toString();
	}
}
