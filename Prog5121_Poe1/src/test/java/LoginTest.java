/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leago
 */
class LoginTest {
    
    private Login login;
    
    @BeforeEach
    void setUp() {
        login = new Login();
    }
    
    //------------- assertTrue/assertFalse Tests ------------
    
    @Test
     void checkUserName_CorrectlyFormatted_ReturnsTrue() {
         assertTrue(login.checkUserName("kyl_1"));
     }
     
     @Test
     void checkUserName_IncorrectlyFormatted_ReturnsFalse(){
         assertFalse(login.checkUserName("kyle!!!!!!"));
     }
     
     @Test
     void checkPasswordComplexity_MeetsRequirements_ReturnsTrue() {
         assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
     }
    
     @Test
     void checkPasswordComplexity_DoesNotMeetRequirements_ReturnsFalse() {
         assertFalse(login.checkPasswordComplexity("password"));
     }
     
     @Test
     void checkCellPhoneNumber_CorrectlyFormatted_ReturnsTrue(){
         assertTrue(login.checkCellPhoneNumber("+27838968976"));
     }
     
     @Test
     void checkCellPhoneNumber_IncorrectlyFormatted_ReturnsFalse(){
         assertFalse(login.checkCellPhoneNumber("08966553"));
     }
     
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
