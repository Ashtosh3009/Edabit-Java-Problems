/*
Write a function that takes an integer minutes and converts it to seconds.

Examples
convert(5) ➞ 300

convert(3) ➞ 180

convert(2) ➞ 120
Notes
Don't forget to return the result.
*/
public class Challenge {
	public static int convert(int minutes) {
		int seconds = minutes * 60;
		return seconds;		
  }
}
