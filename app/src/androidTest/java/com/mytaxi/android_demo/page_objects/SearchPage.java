package com.mytaxi.android_demo;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onData;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.equalTo;
import android.support.test.espresso.matcher.RootMatchers;

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
       // onView(allOf(withId(R.id.map), withText("Sarah Coleman")))
       // .perform(click());

        onView(allOf(allOf(withId(R.id.map)))).perform(click());

      //  onData(hasToString(startsWith("S"))).inRoot(RootMatchers.isPlatformPopup())
      //          .inAdapterView(withId(R.id.map))
      //          .perform(click());

       // onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());


    }
}