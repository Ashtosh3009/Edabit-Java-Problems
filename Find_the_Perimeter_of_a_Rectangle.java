/*
Create a function that takes length and width and finds the perimeter of a rectangle.

Examples
findPerimeter(6, 7) ➞ 26

findPerimeter(20, 10) ➞ 60

findPerimeter(2, 9) ➞ 22
Notes
Don't forget to return the result.
*/

public class Challenge {
	public static int findPerimeter(int length, int width) {
		int perimeter = 2 * (length + width);
		return perimeter;
  }
}