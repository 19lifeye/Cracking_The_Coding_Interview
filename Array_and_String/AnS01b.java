// Implementation an algorithm to determine if a string has all unique characters. What if you cannnot use additional data structures?
import java.util.*;

class AnS01b
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isUniqueChar(str));
    }

    static boolean isUniqueChar(String str)
    {
        int Checker = 0;
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i) - 'a';
            if((Checker & (1 << val)) > 0)
            {
                return false;
            }
            Checker |= (1 << val);
        }
        return true;
    }
}