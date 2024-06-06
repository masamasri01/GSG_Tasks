/*
Given a string(statement), write a code to reverse the order of the words in the given string. (code required)

Example:

Input :”I live in Palestine” Output: “Palestine in live I”


 */


public class GSGTask {
   static String ReverseStringWords(String str) {
	   	String arr[]=str.split(" ");
	   	String out = "";
		for(int i = arr.length-1; i>=0;i--) {
			out+= arr[i]+" ";
		}
		out= out.strip();// trim white spaces
	return out;
}
	public static void main(String[] args) {
		String str = "I live in Palestine";
		String outputString = ReverseStringWords(str);
		System.out.println(outputString);
	}

}
