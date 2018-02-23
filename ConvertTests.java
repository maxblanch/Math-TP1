

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConvertTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConvertTests
{
    // #1
    //Binary to Decimal
    @Test
    public void WHEN_binary_number_is_1111_THEN_ConvertsToDecimal_returns_15() {
        //Arrange
        final String BIN_NUMBER = "1111";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "15";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_0100_THEN_ConvertsToDecimal_returns_4() {
        //Arrange
        final String BIN_NUMBER = "0100";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "4";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_1_THEN_ConvertsToDecimal_returns_1() {
        //Arrange
        final String BIN_NUMBER = "1";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "1";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_0_THEN_ConvertsToDecimal_returns_0() {
        //Arrange
        final String BIN_NUMBER = "0";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "0";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_10101010_THEN_ConvertsToDecimal_returns_170() {
        //Arrange
        final String BIN_NUMBER = "10101010";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "170";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_0_0_THEN_ConvertsToDecimal_returns_0_0() {
        //Arrange
        final String BIN_NUMBER = "0.0";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "0.0";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_0_1111011_THEN_ConvertsToDecimal_returns_0_9609375() {
        //Arrange
        final String BIN_NUMBER = "0.1111011";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "0.9609375";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_binary_number_is_111_111_THEN_ConvertsToDecimal_returns_7_875() {
        //Arrange
        final String BIN_NUMBER = "111.111";
        final int BASE = 2;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "7.875";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    //Octal to Decimal
    @Test
    public void WHEN_Octal_number_is_73_THEN_ConvertsToDecimal_returns_59() {
        //Arrange
        final String BIN_NUMBER = "73";
        final int BASE = 8;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "59";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Octal_number_is_45_145_THEN_ConvertsToDecimal_returns_37_197265625() {
        //Arrange
        final String BIN_NUMBER = "45.145";
        final int BASE = 8;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "37.19726563";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }    
    //Base 5 to Decimal
    @Test
    public void WHEN_Base5_number_is_423_123_THEN_ConvertsToDecimal_returns_113_304() {
        //Arrange
        final String BIN_NUMBER = "423.123";
        final int BASE = 5;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "113.304";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Base5_number_is_10000_43212312_THEN_ConvertsToDecimal_returns_625_93844993() {
        //Arrange
        final String BIN_NUMBER = "10000.43212312";
        final int BASE = 5;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertToBase10(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_DECIMAL_NUMBER = "625.93844993";
        assertEquals(EXPECTED_DECIMAL_NUMBER, DECIMAL_NUMBER);
    }
    
    
    
    // #2
    //Binaire vers Octal
    @Test
    public void WHEN_Binary_number_is_1101101_THEN_ConvertsToOctal_returns_155() {
        //Arrange
        final String BIN_NUMBER = "1101101";
        final int BASE = 8;
        
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "155";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Binary_number_is_11101101_THEN_ConvertsToOctal_returns_355() {
        //Arrange
        final String BIN_NUMBER = "11101101";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "355";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Binary_number_is_111011010_THEN_ConvertsToOctal_returns_732() {
        //Arrange
        final String BIN_NUMBER = "111011010";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "732";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_1011_01_THEN_ConvertsToOctal_returns_13_2() {
        //Arrange
        final String BIN_NUMBER = "1011.01";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "13.2";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_0_01110001_THEN_ConvertsToOctal_returns_0_342() {
        //Arrange
        final String BIN_NUMBER = "0.01110001";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "0.342";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_1_0_THEN_ConvertsToOctal_returns_1_0() {
        //Arrange
        final String BIN_NUMBER = "1.0";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "1.0";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_0_0_THEN_ConvertsToOctal_returns_0_0() {
        //Arrange
        final String BIN_NUMBER = "0.0";
        final int BASE = 8;
        //Act
        final String DECIMAL_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_OCTAL_NUMBER = "0.0";
        assertEquals(EXPECTED_OCTAL_NUMBER, DECIMAL_NUMBER);
    }
    // #3
    //Binary To Hex
    @Test
    public void WHEN_Binary_number_is_111011010_THEN_ConvertsToHex_returns_1DA() {
        //Arrange
        final String BIN_NUMBER = "111011010";
        final int BASE = 16;
        //Act
        final String HEX_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_HEX_NUMBER = "1DA";
        assertEquals(EXPECTED_HEX_NUMBER, HEX_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_1011_01_THEN_ConvertsToHex_returns_13_2() {
        //Arrange
        final String BIN_NUMBER = "1011.01";
        final int BASE = 16;
        //Act
        final String HEX_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_HEX_NUMBER = "B.4";
        assertEquals(EXPECTED_HEX_NUMBER, HEX_NUMBER);
    }
    @Test
    public void WHEN_Fractional_Binary_number_is_11111111_010101_THEN_ConvertsToHex_returns_FF_54() {
        //Arrange
        final String BIN_NUMBER = "11111111.010101";
        final int BASE = 16;
        //Act
        final String HEX_NUMBER = Convert.convertBinaryToXBase(BIN_NUMBER, BASE);
        
        //Assert
        final String EXPECTED_HEX_NUMBER = "FF.54";
        assertEquals(EXPECTED_HEX_NUMBER, HEX_NUMBER);
    }    
    @Test
    public void WHEN_string_has_no_zero_at_the_beginning_THEN_ltrim_RETURNS_same_string(){
        //Act
        String rdmString = "15486";
        
        //Arrange
        String trimmedString = Convert.leftTrim(rdmString);
        
        //Assert
        final String EXPECTED_TRIMMED_STRING = "15486";
        assertEquals(EXPECTED_TRIMMED_STRING,trimmedString);
    }    
    @Test
    public void WHEN_string_has_2_zero_at_the_beginning_THEN_ltrim_RETURNS_string_with_no_zero_at_the_beginning(){
        //Act
        String rdmString = "00015486";
        
        //Arrange
        String trimmedString = Convert.leftTrim(rdmString);
        
        //Assert
        final String EXPECTED_TRIMMED_STRING = "15486";
        assertEquals(EXPECTED_TRIMMED_STRING,trimmedString);
    }
    //#4
    //Tests pour la sous-fonction #4 "convertOctalDigitIntoBinary" -
    @Test
    public void WHEN_octalDigitIs3_THEN_convertOctalDigitIntoBinary_Returns011(){
        //Act
        char octalDigit = '3';
        
        //Arrange
        String OctalDigitRepresentation = Convert.convertOctalDigitIntoBinary(octalDigit);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "011";
        assertEquals(EXPECTED_REPRESENTATION,OctalDigitRepresentation);
    }    
    @Test
    public void WHEN_octalDigitIs6_THEN_convertOctalDigitIntoBinary_Returns110(){
        //Act
        char octalDigit = '6';
        
        //Arrange
        String OctalDigitRepresentation = Convert.convertOctalDigitIntoBinary(octalDigit);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "110";
        assertEquals(EXPECTED_REPRESENTATION,OctalDigitRepresentation);
    }
    //Test pour la main-fonction #4 "convertOctalIntoBinary" -
    @Test
    public void WHEN_octalNumberIs343_THEN_convertOctalIntoBinary_Returns011100011(){
        //Act
        String octalNumber = "343";
        
        //Arrange
        String OctalDigitRepresentation = Convert.convertOctalIntoBinary(octalNumber);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "11100011";
        assertEquals(EXPECTED_REPRESENTATION,OctalDigitRepresentation);
    }    
    @Test
    public void WHEN_octalNumberIs1234Comma567_THEN_convertOctalIntoBinary_Returns1010011100Comma101110111(){
        //Act
        String octalNumber = "01234,567";
        
        //Arrange
        String OctalDigitRepresentation = Convert.convertOctalIntoBinary(octalNumber);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "1010011100,101110111";
        assertEquals(EXPECTED_REPRESENTATION,OctalDigitRepresentation);
    }
    //#5
    //Tests pour la main-fonction #5 - "convertHexIntoBinary" -
    @Test
    public void WHEN_hexNumberIs_1AD6_THEN_convertHexIntoBinary_Returns1101011010110(){
        //Act
        String hexNumber = "1AD6";
        
        //Arrange
        String hexDigitRepresentation = Convert.convertHexIntoBinary(hexNumber);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "1101011010110";
        assertEquals(EXPECTED_REPRESENTATION,hexDigitRepresentation);
    }    
    @Test
    public void WHEN_hexNumberIs_01234567Comma89ABCDEF_THEN_convertHexIntoBinary_Returns1001000110100010101100111Comma10001001101010111100110111101111(){
        //Act
        String hexNumber = "01234567,89ABCDEF";
        
        //Arrange
        String hexDigitRepresentation = Convert.convertHexIntoBinary(hexNumber);
        
        //Assert
        final String EXPECTED_REPRESENTATION = "1001000110100010101100111,10001001101010111100110111101111";
        assertEquals(EXPECTED_REPRESENTATION,hexDigitRepresentation);
    }
    //#6
    //Tests pour la sous-fonction #6 -"convertDecimalBeforeCommaInBbase"-
    @Test
    public void WHEN_decimalNumberIs115AndBaseIs8_THEN_convertDecimalBeforeCommaInBbase_RETURNS_163(){
        //Act
        int decimalNumber = 115;
        int base = 8;
        
        //Arrange
        String result = Convert.convertDecimalBeforeCommaInBbase(decimalNumber,base);
        
        //Assert
        final String EXPECTED_RESULTS = "163";
        assertEquals(EXPECTED_RESULTS,result);
    }    
    @Test
    public void WHEN_decimalNumberIs115AndBaseIs2_THEN_convertDecimalBeforeCommaInBbase_RETURNS_1110011(){
        //Act
        int decimalNumber = 115;
        int base = 2;
        
        //Arrange
        String result = Convert.convertDecimalBeforeCommaInBbase(decimalNumber,base);
        
        //Assert
        final String EXPECTED_RESULTS = "1110011";
        assertEquals(EXPECTED_RESULTS,result);
    }        
    ////Test pour la sous-fonction #6 -"convertDecimalAfterCommaInBbase"-
    @Test
    public void WHEN_decimalPartIs375AndBaseIs2_THEN_convertDecimalAfterCommaInBbase_RETURNS_011(){
        //Act
        int decimalpart = 375;
        int base = 2;
        
        //Arrange
        String result = Convert.convertDecimalAfterCommaInBbase(decimalpart,base);
        
        //Assert
        final String EXPECTED_RESULTS = "011";
        assertEquals(EXPECTED_RESULTS,result);
    }  
    //Tests pour la main-fonction #6 -"convertFullDecimalInBbase"-
    @Test
    public void WHEN_decimalNumberIs79AndBaseIs2_THEN_convertFullDecimalInBbase_RETURNS_1001111(){
        //Act
        String decimalNumber = "79";
        int base = 2;
        
        //Arrange
        String result = Convert.convertFullDecimalInBbase(decimalNumber,base);
        
        //Assert
        final String EXPECTED_RESULTS = "1001111";
        assertEquals(EXPECTED_RESULTS,result);
    }    
    @Test
    public void WHEN_decimalNumberIs46Comma375AndBaseIs2_THEN_convertFullDecimalInBbase_RETURNS_101110Comma011(){
        //Act
        String decimalNumber = "46,375";
        int base = 2;
        
        //Arrange
        String result = Convert.convertFullDecimalInBbase(decimalNumber,base);
        
        //Assert
        final String EXPECTED_RESULTS = "101110,011";
        assertEquals(EXPECTED_RESULTS,result);
    }    
}
