package com.example.poornima.myfirstapp;

import org.junit.Rule;
import org.junit.Test;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * Created by Poornima on 9/24/17.
 */
@RunWith(AndroidJUnit4.class)
public class MyFirstAppTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testIfTextIsEntered(){
        onView(withId(R.id.editText))
                .perform(typeText("From test"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

    }
}
