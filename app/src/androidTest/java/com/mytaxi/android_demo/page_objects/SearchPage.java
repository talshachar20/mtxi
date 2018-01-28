package com.mytaxi.android_demo;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onData;

public class SearchPage extends BasePage{

    public SearchPage() {
        //varification for the current screen
        onView(withId(R.id.searchContainer));
    }

    public void SearchForValue(String searchValue) {
        onView(withId(R.id.textSearch))
                .perform(typeText(searchValue), closeSoftKeyboard());
    }

    public void ChooseValueFromResults(String value) {
    }
}