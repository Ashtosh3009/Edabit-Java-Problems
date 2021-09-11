/*
A student learning Java was trying to make a function. His code should concatenate a passed string name with string "Edabit" and store it in a variable called result. He needs your help to fix this code.

Examples
nameString("Mubashir") ➞ "MubashirEdabit"

nameString("Matt") ➞ "MattEdabit"

nameString("java") ➞ "javaEdabit"
Notes
Don't forget to return the result.
*/

public class Program {
	public static String nameString(String name) {
		  String b = "Edabit";
		  String result = name + b;
		  return result;
	}
}
