package com.mytaxi.android_demo;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage extends BasePage{

    public LoginPage() {
        //varification for the current screen
        onView(withId(R.id.btn_login));
    }

    public void LoginToApp(String username, String password) {
        onView(withId(R.id.edt_username))
                .perform(typeText(username), closeSoftKeyboard());

        onView(withId(R.id.edt_password))
                .perform(typeText(password), closeSoftKeyboard());

        onView(withId(R.id.btn_login))
                .perform(click());
    }

    public void LoginWithValidUser() {
        LoginToApp("whiteelephant261", "video");
    }
}