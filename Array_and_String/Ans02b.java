// Check Permutation : Given two String, write a methode to decide if one is a permutation of the other.

import java.util.*;

class Ans02b
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
        
        int[] letters = new int[128];
        char[] s_array = StrOne.toCharArray();
        // Count number of char

        for(char c : s_array)
        {
            letters[c]++;
        }

        for(int i=0;i<StrTwo.length();i++)
        {
            int c = (int) StrTwo.charAt(i);
            letters[c]--;
            if(letters[c] < 0)
            {
                return false;
            }
        }
        return true;
    }
}