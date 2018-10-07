// Check Permutation : Given two String, write a methode to decide if one is a permutation of the other.

import java.util.*;
class AnS02a
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String One (1) : ");
        String StrOne = sc.next();
        System.out.println("Enter String Two (2) : ");
        String StrTwo = sc.next();

        System.out.println(permutation(StrOne,StrTwo));
    }
    static boolean permutation(String StrOne, String StrTwo)
    {
        if(StrOne.length() != StrTwo.length())
        {
            return false;
        }
        return Sort(StrOne).equals(Sort(StrTwo));
    }
    static String Sort(String Str)
    {
        char[] content = Str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}