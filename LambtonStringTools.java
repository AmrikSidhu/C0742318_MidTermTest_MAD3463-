package com.midterm;
import java.util.regex.Pattern;
import java.util.regex.Pattern.*;

public class LambtonStringTools {
    static String s(String string)
    {
        int len = string.length();
        String temp="";
        for (int i=len-1;i>=0;i--)
        {
temp += string.charAt(i);

    }
return temp;
}

    /*public static void main(String[] args) {
        String s1 ="Lambton";
        System.out.println(rev(s1));

    }*/

    static String reversewords(String reverse)
    {
        int len =reverse.length();
        Pattern pattern= Pattern.compile("\\s");
        String[] temp = pattern.split(reverse);
        String temp2 ="";
        for(int i=0;i<temp.length;i++)
        {
            if(i==len-1)
            {
                temp2 = temp[i] + temp2;

            }
            else
            {
                temp2 = " " + temp[i] + temp2;

            }

        }

        return  temp2;
    }
}
