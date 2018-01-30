package com.mytaxi.android_demo;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class DriverPage extends BasePage{

    public DriverPage() {
        assertPage();
    }

    public void callDriver() {
        onView(withId(R.id.fab))
                .perform(click());
    }

    public void asserPage() {
        onView(withId(R.id.fab))
                .check(matches(isDisplayed()));
    }
}