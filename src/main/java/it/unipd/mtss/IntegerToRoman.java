////////////////////////////////////////////////////////////////////
// Sebastiano Marana 2045041
// Romeo Calearo 2043678
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import java.security.InvalidParameterException;

public class IntegerToRoman {
    public static String convert(int number){
        if(number <= 0) {
            throw new InvalidParameterException();
        }

        int numbers[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String symbols[] = {"I","IV","V","IX","X","XL",
                            "L","XC","C","CD","D","CM","M"};
        String conv = "";

        int count = numbers.length - 1;
        while(count >= 0) {
            if (number >= numbers[count]) {
                conv += symbols[count];
                number -= numbers[count];
            } else {
                count--;
            }
        }
        return conv;
    }
}
