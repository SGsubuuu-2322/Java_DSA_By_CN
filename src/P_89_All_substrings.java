//All substrings
//Send Feedback
//For a given input string(str), write a function to print all the possible substrings.
//Substring
//A substring is a contiguous sequence of characters within a string. 
//Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces. All the characters
//in the string would be in lower case.
//Output Format:
//Print the total number of substrings possible, where every substring is printed on a single line and hence the
//total number of output lines will be equal to the total number of substrings.
//Note:
//The order in which the substrings are printed, does not matter.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1:
//abc
//Sample Output 1:
//a 
//ab 
//abc 
//b 
//bc 
//c 
// Sample Input 2:
//co
//Sample Output 2:
//c 
//co 
//o



import java.util.*;
public class P_89_All_substrings {
	
	public static void printSubstring(String str){
		int len = str.length();
//		for(int i = 0; i < len; i++){
//			for(int j = i; j < len; j++)
//				System.out.println(str.substring(i,j+1));
//		}
		
		for(int leng = 1; leng <= len; leng++){
			for(int start = 0; start <= len-leng; start++){
				int end = start + leng - 1;
				System.out.println(str.substring(start, end+1));
			}
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing all the substrings of a main string entered by you...");
		System.out.println("So, enter a string :- ");
		String str  = ip.nextLine();
		printSubstring(str);

	}

}
