// Implementation an algorithm to determine if a string has all unique characters. What if you cannnot use additional data structures?
import java.util.*;

class AnS01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isUniqueChars(str));
    }

    static boolean isUniqueChars(String str)
    {
        if(str.length() > 128)
        {
            return false;
        }
            boolean[] char_set = new boolean[128];

            for(int i=0;i<str.length();i++)
            {
                int val = str.charAt(i);
                if(char_set[val])
                {
                    return false;
                }
                char_set[val]=true;
            }
            return true;
    }
}