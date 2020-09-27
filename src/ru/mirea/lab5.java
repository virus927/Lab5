package ru.mirea;

public class lab5 {
        public static void main(String args[]) {
            String palindrom = ("deed");
            StringBuffer buffer = new StringBuffer(palindrom);
            buffer.reverse();
            String palindrom2 = new String(buffer);
            if((palindrom.equals(palindrom2)==true))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        //virus927
    }

