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

}