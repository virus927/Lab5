package ru.mirea;

public class lab5 {
        public static void main(String args[]) {

            String palindrom = ("deed");
            StringBuffer buffer = new StringBuffer(palindrom);
            buffer.reverse();
            String palindrom2 = new String(buffer);
            System.out.println(palindrom.equals(palindrom2));
        }
        //virus927
    }

