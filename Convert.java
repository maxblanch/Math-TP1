
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
    //- Fonction utilisée pour enlever les zéros au début d'une string -    
    public static String leftTrim(String octalNumber) {
        int i = 0;
        while (i < octalNumber.length() && octalNumber.charAt(i) == '0') {
            i++;
        }
        return octalNumber.substring(i);
    }
    
    
      
    //- Sous-fonction #4 - Fonction qui convertit un chiffre octal en binaire - 
    public static String convertOctalDigitIntoBinary(char octalDigit){
        String binaryRepresentationOfADigit = "";
        switch(octalDigit){
            case '0': binaryRepresentationOfADigit = "000";
                      break;       
            case '1': binaryRepresentationOfADigit = "001";
                      break;
            case '2': binaryRepresentationOfADigit = "010";
                      break;
            case '3': binaryRepresentationOfADigit = "011";
                      break;
            case '4': binaryRepresentationOfADigit = "100";
                      break;
            case '5': binaryRepresentationOfADigit = "101";
                      break;
            case '6': binaryRepresentationOfADigit = "110";
                      break;
            case '7': binaryRepresentationOfADigit = "111";
                      break;
        }
        return binaryRepresentationOfADigit;
    }
    // Main-fonction #4 - Fonction qui convertit une string octal en binaire - 
    static String convertOctalIntoBinary(String octalNumber){
        String binaryConversion = "";
        
        for(int i = 0; i< octalNumber.length();i++){
            if(octalNumber.charAt(i) == ','){
                binaryConversion += ',';
            }else{
                binaryConversion += convertOctalDigitIntoBinary(octalNumber.charAt(i));
            }
        }
        String binaryLtrimmedConversion =leftTrim(binaryConversion);
        return binaryLtrimmedConversion;
    }
    
    
    
    
    //Sous-fonction #5 - Fonction qui convertit un chiffre hexadécimal en binaire -
    public static String convertHexDigitIntoBinary(char octalDigit){
        String binaryRepresentationOfADigit = "";
        switch(octalDigit){
            case '0': binaryRepresentationOfADigit = "0000";
                      break;
            case '1': binaryRepresentationOfADigit = "0001";
                      break;
            case '2': binaryRepresentationOfADigit = "0010";
                      break;
            case '3': binaryRepresentationOfADigit = "0011";
                      break;
            case '4': binaryRepresentationOfADigit = "0100";
                      break;
            case '5': binaryRepresentationOfADigit = "0101";
                      break;
            case '6': binaryRepresentationOfADigit = "0110";
                      break;
            case '7': binaryRepresentationOfADigit = "0111";
                      break;
            case '8': binaryRepresentationOfADigit = "1000";
                      break;
            case '9': binaryRepresentationOfADigit = "1001";
                      break;
            case 'A': binaryRepresentationOfADigit = "1010";
                      break;
            case 'B': binaryRepresentationOfADigit = "1011";
                      break;
            case 'C': binaryRepresentationOfADigit = "1100";
                      break;
            case 'D': binaryRepresentationOfADigit = "1101";
                      break;
            case 'E': binaryRepresentationOfADigit = "1110";
                      break;
            case 'F': binaryRepresentationOfADigit = "1111";
                      break;
        }        
        return binaryRepresentationOfADigit;
    }
    //Main-fonction #5 - Convertit une string hexadécimal en binaire -
    static String convertHexIntoBinary(String hexNumber){
        String binaryConversion = "";
        
        for(int i = 0; i< hexNumber.length();i++){
            if(hexNumber.charAt(i) == ','){
                binaryConversion += ',';
            }else{
                binaryConversion += convertHexDigitIntoBinary(hexNumber.charAt(i));
            }
        }
        String binaryLtrimmedConversion =leftTrim(binaryConversion);
        return binaryLtrimmedConversion;
    }
    
    
    
    
    //Sous-fonction #6 - Fonction qui convertit la partie decimale avant la virgule en baseB -  
    static String convertDecimalBeforeCommaInBbase(int decimalNumber, int base){
        int divider = base;
        int rest = 0;
        int quotient = decimalNumber;
        int digit = 0;
        String result = "";
        
        do{
            rest = quotient % divider;
            quotient = quotient / divider;           
            digit = rest;
            result += String.valueOf(digit);
        }
        while(quotient > 0);
        
        String reversedResult = new StringBuffer(result).reverse().toString();
        return reversedResult;
    }
    //Sous-fonction #6 - Fonction qui convertit la partie decimal apres la virgule en baseB -
    static String convertDecimalAfterCommaInBbase(int decimalPart, int base){
        int length = String.valueOf(decimalPart).length();
        float fractionalPart = decimalPart / (float)(Math.pow(10,length));
        int multiplier = base;
        int rest = 0;
        int aliquotPart = 0;
        int digit = 0;
        String result = "";
        int numberOfDecimals = 0;
        
        do{
            fractionalPart = (fractionalPart * multiplier);
            aliquotPart = (int)fractionalPart;           
            digit = aliquotPart;
            fractionalPart = fractionalPart - aliquotPart;
            result += String.valueOf(digit);
            numberOfDecimals++;
        }
        while(fractionalPart != 0 && numberOfDecimals < 8);
        return result;
    }
    //Main-fonction #6 - Fonction qui convertit une string decimale en nombre en baseB - 
    static String convertFullDecimalInBbase(String decimalNumber, int base){
        String digitsBeforeComma = "";
        String digitsAfterComma = "";
        int decimalBeforeComma = 0;
        int decimalAfterComma = 0;
        String decimalConvertedInBBase = "";
        
        if(decimalNumber.contains(",")){
            int startIndex = decimalNumber.indexOf(",");
            int lastIndex = decimalNumber.length();
            digitsBeforeComma = decimalNumber.substring(0,startIndex);
            digitsAfterComma = decimalNumber.substring((startIndex+1),lastIndex);
            decimalBeforeComma = Integer.parseInt(digitsBeforeComma);
            decimalAfterComma = Integer.parseInt(digitsAfterComma);
            decimalConvertedInBBase = convertDecimalBeforeCommaInBbase(decimalBeforeComma,base) + "," + convertDecimalAfterCommaInBbase(decimalAfterComma,base);
        }else{
            decimalBeforeComma = Integer.parseInt(decimalNumber);
            decimalConvertedInBBase = convertDecimalBeforeCommaInBbase(decimalBeforeComma, base);
        }
        return decimalConvertedInBBase;
    }
}
