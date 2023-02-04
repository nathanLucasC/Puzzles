package org.example;
public class GetMiddleChar {

    public static String getMiddle(String word){
        int length = word.length();
        int middle = length / 2;
        String result = "";

        if((word.length() % 2) == 0){
            result = word.substring(middle - 1, middle + 1);
        }
        else {
            result = word.substring(middle, middle + 1);
        }
        return result;
    }
}
