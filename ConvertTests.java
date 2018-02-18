

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
}
