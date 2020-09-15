
public class Palindrome 
{

	public static void main(String[] args) 
	{
		checkPalindrome("tacocat");
		checkPalindrome("racecar");
		checkPalindrome("e");
		checkPalindrome(" ");
		checkPalindrome("epic");
		checkPalindrome("");
		checkPalindrome(" eee ");
		checkPalindrome("1 reter 1");
		checkPalindrome("evil o live");
	}

	public static boolean isPalindrome(String str)
	{
		if(str.length() > 0)
		{
			if(str.charAt(0) == str.charAt(str.length() - 1))
			{
				if(str.length() >= 2)
				{
					return isPalindrome(str.substring(1, str.length() - 1));
				}
				else
				{
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public static void checkPalindrome(String str)
	{
		if(isPalindrome(str))
		{
			System.out.println(str + " is a palindrome.");
		}
		else
		{
			System.out.println(str + " is NOT a palindrome.");
		}
	}
}
