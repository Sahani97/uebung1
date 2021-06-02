package at.ac.fhcampus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Password is too short")
    public void testPasswordLength_1(){
        App PV = new App();
        boolean actual = PV.checkPassword("sahani");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is too long")
    public void testPasswordLength_2(){
        App PV = new App();
        boolean actual = PV.checkPassword("nsftpywabyasydawnjacnjnjksalexsahani");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password length is valid")
    public void passwordLengthTest_3() {
        App PV = new App();
        boolean actual = PV.checkPassword("Sahaniojd()dsa23");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is only written in small letters")
    public void testPasswordWriting_1(){
        App PV = new App();
        boolean actual = PV.checkPassword("nsfwnsfwnsfw");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is only written in caps")
    public void testPasswordWriting_2(){
        App PV = new App();
        boolean actual = PV.checkPassword("PAOSLKMDOFUR");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is writtin in small and capital letters")
    public void testPasswordWriting_3(){
        App PV = new App();
        boolean actual = PV.checkPassword("SahaniAbc@7797");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password has got no numbers")
    public void testPasswordNumbers_1(){
        App PV = new App();
        boolean actual = PV.checkPassword("Sahaniinahas");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is just numbers")
    public void testPasswordNumbers_2(){
        App PV = new App();
        boolean actual = PV.checkPassword("1562845627");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is with numbers")
    public void testPasswordNumbers_3(){
        App PV = new App();
        boolean actual = PV.checkPassword("eR23#8r(en98");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password has got no special characters")
    public void testPasswordSC_1(){
        App PV = new App();
        boolean actual = PV.checkPassword("Sahaniinahas");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is just special characters")
    public void testPasswordSC_2(){
        App PV = new App();
        boolean actual = PV.checkPassword("()#$?!%/@()#$?!%/@");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Password is perfect")
    public void testPasswordSC_3(){
        App PV = new App();
        boolean actual = PV.checkPassword("suhwSaYqw88p+#w");
        boolean expected = true;
        assertEquals(expected, actual);
    }




}
