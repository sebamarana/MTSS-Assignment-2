////////////////////////////////////////////////////////////////////
// Sebastiano Marana 2045041
// Romeo Calearo 2043678
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.security.InvalidParameterException;
import java.util.HashMap;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    public static String printAsciiArt(String romanNumber) {
        if(romanNumber == null || romanNumber.isEmpty()) {
            throw new InvalidParameterException();
        }
        HashMap<Character, String[]> conversionMap = new HashMap<Character, String[]>();

        int height = 6;
        conversionMap.put('I', new String[]{"  _____  ", " |_   _| ", "   | |   ", "   | |   ", "  _| |_  ", " |_____| "});
        conversionMap.put('V', new String[]{" __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "});
        conversionMap.put('X', new String[]{" __   __ ", " \\ \\ / / ", "  \\ V /  ", "   > <   ", "  / . \\  ", " /_/ \\_\\ "});
        conversionMap.put('L', new String[]{"  _       ", " | |      ", " | |      ", " | |      ", " | |____  ", " |______| "});
        conversionMap.put('C', new String[]{"   _____  ", "  / ____| ", " | |      ", " | |      ", " | |____  ", "  \\_____| "});
        conversionMap.put('D', new String[]{"  _____   ", " |  __ \\  ", " | |  | | ", " | |  | | ", " | |__| | ", " |_____/ "});
        conversionMap.put('M', new String[]{"  __  __  ", " |  \\/  | ", " | \\  / | ", " | |\\/| | ", " | |  | | ", " |_|  |_| "});

        String[][] result = new String[height][romanNumber.length()];
        int count = 0;
        for(Character c : romanNumber.toCharArray()) {
            if(!conversionMap.containsKey(c)) {
                throw new InvalidParameterException();
            }
            result[count] = conversionMap.get(c);
            count++;
        }

        String printable = "";
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < romanNumber.length(); j++) {
                printable += result[j][i];
            }
            printable += "\n";
        }

        System.out.println(printable);

        return printable;
    }
}