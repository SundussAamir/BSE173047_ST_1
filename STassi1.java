package stassi1;
public class STassi1 
{
      boolean isPalindrome(String input) 
    {

        input = input.toLowerCase().replaceAll("\\s+", "");
        int length = input.length();
        
        if (!input.matches("^([A-Za-z0-9]+)?$")) 
        {
            return false;
        }
        for (int i = 0; i < length / 2; i++) 
        {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean main (String[] args) {

        STassi1 palindrome = new STassi1();

        String input = "Madam";

        if (palindrome.isPalindrome(input))
           return (true);
        else
            return (false);

    }

    
}
