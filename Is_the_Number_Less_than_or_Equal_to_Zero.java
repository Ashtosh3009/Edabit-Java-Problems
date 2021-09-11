/*Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.

Examples
lessThanOrEqualToZero(5) ➞ false

lessThanOrEqualToZero(0) ➞ true

lessThanOrEqualToZero(-2) ➞ true
Notes
Don't forget to return the result.
*/
public class Program {
    public static boolean lessThanOrEqualToZero(int num) {
      if(num <= 0)
				return true;
			else
				return false;
    }
}
