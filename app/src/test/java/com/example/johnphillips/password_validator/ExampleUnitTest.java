package com.example.johnphillips.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //check that password is not "password", case insensitive
    @Test
    public void passwordIsPassword() {
        String password = "Password";
        String passwordCaps = "PASSWORD";
        String notPassword = "123456789";
        String containsPassword = "1password2";

        assertTrue(password.toLowerCase().equals("password"));
        assertTrue(passwordCaps.toLowerCase().equals("password"));
        assertTrue(!notPassword.toLowerCase().equals("password"));
        assertTrue(!containsPassword.toLowerCase().equals("password"));
    }

    //check to see that the password is at LEAST 8 characters long
    @Test
    public void passwordLength() {
        String passwordShort = "abc123";
        String password8 = "12345678";
        String passwordLong = "123456789";

        assertFalse(passwordShort.length()>=8);
        assertTrue(password8.length()>=8);
        assertTrue(passwordLong.length()>=8);
    }

    //check to see if the password contains the word "password" at all
    @Test
    public void passwordContainsPassword() {
        String passwordCaps = "PASSWORD";
        String notPassword = "123456789";
        String containsPassword = "1password2";

        assertFalse(!passwordCaps.toLowerCase().contains("password"));
        assertTrue(!notPassword.toLowerCase().contains("password"));
        assertFalse(!containsPassword.toLowerCase().contains("password"));
    }


    //check to see if the password contains at least one number
    @Test
    public void passwordHasLetter(){
        String passwordCaps = "PASSWORD";
        String notPassword = "123456789";

        assertFalse(passwordCaps.toLowerCase().contains("1")||passwordCaps.toLowerCase().contains("2")||passwordCaps.toLowerCase().contains("3")||passwordCaps.toLowerCase().contains("4")||passwordCaps.toLowerCase().contains("5")||passwordCaps.toLowerCase().contains("6")||passwordCaps.toLowerCase().contains("7")||passwordCaps.toLowerCase().contains("8")||passwordCaps.toLowerCase().contains("9")||passwordCaps.toLowerCase().contains("0"));
        assertTrue(notPassword.toLowerCase().contains("1")||notPassword.toLowerCase().contains("2")||notPassword.toLowerCase().contains("3")||notPassword.toLowerCase().contains("4")||notPassword.toLowerCase().contains("5")||notPassword.toLowerCase().contains("6")||notPassword.toLowerCase().contains("7")||notPassword.toLowerCase().contains("8")||notPassword.toLowerCase().contains("9")||notPassword.toLowerCase().contains("0"));
    }

    //check to see if the password has an uppercase letter
    @Test
    public void passwordUppercase() {
        String passwordCaps = "USAUSAUSA";
        String passwordLower = "1australia2";
        String passwordMixed = "SeAlSrCoOl";

        assertFalse(!(passwordCaps.toLowerCase().equals(passwordCaps))&&!(passwordCaps.equals(passwordCaps.toUpperCase())));
        assertFalse(!passwordLower.toLowerCase().equals(passwordLower)&&!passwordLower.toUpperCase().equals(passwordLower));
        assertTrue(!passwordMixed.toLowerCase().equals(passwordMixed)&&!passwordMixed.toUpperCase().equals(passwordMixed));
    }

    
}