package com.mytaxi.android_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import com.mytaxi.android_demo.activities.MainActivity;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.Before;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private MainActivity mActivity = null;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setActivity() {
        mActivity = activityActivityTestRule.getActivity();
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.mytaxi.android_demo", appContext.getPackageName());

        LoginPage loginPage = new LoginPage();
        loginPage.LoginWithValidUser();

        SearchPage searchPage = new SearchPage();
        searchPage.SearchForValue("sa");
        searchPage.ChooseValueFromResults("ddd", mActivity);

        DriverPage driverPage = new DriverPage();
        driverPage.CallDriver();
    }
}
