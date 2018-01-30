package com.mytaxi.android_demo;

import com.mytaxi.android_demo.activities.MainActivity;

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
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.equalTo;
import android.support.test.espresso.matcher.RootMatchers;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;

import android.support.test.rule.ActivityTestRule;

public class SearchPage extends BasePage{

    public SearchPage() {
        AssertPage();
    }

    public void SearchForValue(String searchValue) {
        onData(withId(R.id.textSearch))
                .perform(typeText(searchValue), closeSoftKeyboard());
    }

    public void ChooseValueFromResults(String value, MainActivity activity) {
       // onView(allOf(withId(R.id.searchContainer), withText("Sarah Coleman")))
        // .perform(click());

      //  onView(allOf(withId(R.id.searchContainer))).perform(click());

      //  onData(hasToString(startsWith("S"))).inRoot(RootMatchers.isPlatformPopup())
      //          .inAdapterView(withId(R.id.map))
      //          .perform(click());

       // onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());

       // onData(equalTo("Sarah Coleman")).inRoot(RootMatchers.isPlatformPopup()).perform(click());


        onData(allOf(instanceOf(String.class)))
                .inRoot(withDecorView(not(is(activity.getWindow().getDecorView()))))
                .perform(click());
    }

    public void AssertPage(){
        onView(withId(R.id.textSearch))
                .check(matches(isDisplayed()));
    }
}