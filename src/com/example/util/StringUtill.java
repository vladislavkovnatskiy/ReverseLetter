package com.example.util;

public class StringUtill {

    public static String reverseLetter(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char[] output = new char[str.length()];
        int count = str.length() - 1;
        for (int i = 0; i <= count; i++) {
            if (Character.isLetter(str.charAt(i))) {
                //поиск буквы с конца
                for (; count > i; count--) {
                    if (Character.isLetter(str.charAt(count))) {
                        break;
                    }
                    //Если не буква, сохраняем на такую же позицию в массив вывода
                    output[count] = str.charAt(count);
                }
                char temp = str.charAt(i);
                output[i] = str.charAt(count);
                output[count] = temp;
                count--;
            } else {
                output[i] = str.charAt(i);
            }
        }
        return new String(output);
    }
}
