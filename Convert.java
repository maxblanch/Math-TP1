
/**
 * Write a description of class Convert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Convert
{
    // #1 Convertir de d'une base X vers Décimal
    static String convertToBase10(String num, int base) {
        String convertedNumber = "";
        String[] splitNum = num.split("\\.");
        int exponent = splitNum[0].length() - 1;
        double x = calculatePower(splitNum[0], base, exponent);
        if (splitNum.length > 1) {
            exponent = -1;
            x += calculatePower(splitNum[1], base, exponent);
            convertedNumber = String.valueOf(x);
        } else {
            convertedNumber = String.valueOf(x).replaceAll("\\.0*", "");
        }
        return convertedNumber;
    }
    static double calculatePower(String str, int base, int exp) {
        double value = 0.0f;
        for(int i=0; i<str.length(); i++) {
            value += Character.getNumericValue(str.charAt(i)) * (float)Math.pow(base, exp--);
        }
        if (exp < -1) { //Si on return les décimals, on vérifie s'il faut arrondir
            if (Double.toString(value).length() > 8) {
                return Math.round(value * 100000000) / 100000000.0;
            }
        }
        return value;
    }
    
    
    
    
    // #2 et 3 Convertir de Binaire vers Base Octal ou Hexadécimal
    static char[] hexValues = {'A','B','C','D','E','F'};
    static String convertBinaryToXBase(String binStr, int base) {
        int numberOfGroupedBits = 0;
        if (base < 9) {
            numberOfGroupedBits = 3;
        } else {
            numberOfGroupedBits = 4;
        }
        String xBaseStr = "";
        String[] splitStrWhenDot = binStr.split("\\.");
        if (splitStrWhenDot[0].length() % numberOfGroupedBits != 0) { //Est-ce qu'il manque des zéros pour avoir des groupements de 3 ?
            splitStrWhenDot[0] = addZerosToString(splitStrWhenDot[0], numberOfGroupedBits, false);
        }
        xBaseStr = convertGroupedBinaryToXBase(splitStrWhenDot[0], xBaseStr, numberOfGroupedBits);
        if (splitStrWhenDot.length > 1) { //Si on a un nombre à virgule
            xBaseStr += '.';
            if (splitStrWhenDot[1].length() % numberOfGroupedBits != 0) {
                splitStrWhenDot[1] = addZerosToString(splitStrWhenDot[1], numberOfGroupedBits, true);
            }
            xBaseStr = convertGroupedBinaryToXBase(splitStrWhenDot[1], xBaseStr, numberOfGroupedBits);
        } 
        return xBaseStr;
    }
    //Converti les groupements de 3 ou 4 bits en base X
    static String convertGroupedBinaryToXBase(String str, String xBaseStr, int groupOfXNumber) {
        int value = 0;
        int exp = groupOfXNumber - 1;
        for (int i=0; i<str.length(); i+=groupOfXNumber) {
            for(int j=i; j<i+groupOfXNumber; j++) {
                value += Character.getNumericValue(str.charAt(j)) * (int)Math.pow(2, exp--);
            }
            if (value > 9) {
                xBaseStr += hexValues[value - 10];
            } else {
                xBaseStr += String.valueOf(value);
            }
            exp = groupOfXNumber - 1;
            value = 0;
        }
        return xBaseStr;
    }
    //Pour ajouter les zéros, afin de former des groupements de 3 ou 4
    static String addZerosToString(String str, int groupedInXNumbers, boolean isFractional) {
        int numberOfZerosToAdd = groupedInXNumbers - str.length() % groupedInXNumbers;
        String zerosString = "";
        for (int i=0; i<numberOfZerosToAdd; i++) {
            zerosString += "0";
        }
        if (!isFractional) {
            str = zerosString + str.substring(0, str.length());
        } else {
            str = str.substring(0, str.length()) + zerosString;
        }
        return str;
    }
}
