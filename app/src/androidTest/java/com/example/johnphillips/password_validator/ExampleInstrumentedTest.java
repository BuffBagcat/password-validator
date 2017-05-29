package com.example.johnphillips.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static org.junit.Assert.*;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    @Test
    public void submitText() {

        String password = "Abcd1234";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.editText))
                .check(matches(withText(password)));
        onView(withId(R.id.resultText)).perform(replaceText("valid"));

    }
}
