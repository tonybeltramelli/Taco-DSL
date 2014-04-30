package dk.itu.smdp.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.*;
import com.robotium.solo.Solo;

import java.io.File;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class dk.itu.smdp.activity.MainActivityTest \
 * dk.itu.smdp.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }


    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }


    //Main test method. Tests the whole ui for a specific instance
    //The instance is the one that is given with this commit
    //The test instance should always be the same.
    public void test_MainBlackBox() {

        //check current activity
        solo.assertCurrentActivity("Wrong activity", MainActivity.class);

        checkHomeScreen();

        solo.clickOnButton("Start Survey");

        solo.assertCurrentActivity("Survey activity is not in foreground", SurveyActivity.class);

        checkPage_1();

        goToNextPage();
//
//        goToPreviousPage();
//
//        checkPage_1();
//
//        goToNextPage();

//        checkPage_2();
        solo.clickOnText("Fourth option");


        goToNextPage();
//        goToPreviousPage();
//        goToPreviousPage();
//        checkPage_1();
//        goToNextPage();
//        checkPage_2();

        checkPage_3();

       //send data and check for the file
        solo.clickOnImageButton(1);
        smallDelay();
        File file = new File(SurveyActivity.SURVEY_SD_CARD_FILE);
        assertTrue("Output file was not generated" , file.exists());

    }

    private void checkHomeScreen() {
        Button startButton = (Button) this.getActivity().findViewById(dk.itu.smdp.R.id.home_screen_start_button);
        //first time should be disabled
        assertFalse("Login button is enabled when it shouldn't", startButton.isEnabled());
        //set person attributes
        solo.enterText(0, "TestName");
        //should be disabled
        assertFalse("Login button is enabled when it shouldn't", startButton.isEnabled());
        solo.enterText(1, "TestAge");

        //should be enabled
        assertTrue("Login button is disabled when it shouldn't", startButton.isEnabled());
    }


    /*    First page category 1
        Contains 1)OpenField Question
                 2)Multiple choice [2-3]
                 3)*Rating [1,10,1]
        */
    synchronized private void checkPage_1() {

        solo.waitForActivity(SurveyActivity.class, 100);

        smallDelay();
        //rating is the only mandatory. so the next button should be enabled
        checkNextButton(true);
        checkPrevousButton(false);


        //check that everything is delected
//        solo.clickOnText("Answer here");
        assertFalse("Page - 1 OpenField sould be empty", solo.getEditText(0).toString().isEmpty());
        assertFalse("Page - 1 OpenField sould be empty", solo.getEditText(1).toString().isEmpty());
        //check that multiple choice is everything deselected
        for (int i = 0; i < 5; i++)
            assertFalse("Page - 1 Multiple choice radioButton " + i + " should not be selected",
                    solo.isRadioButtonChecked(i));

        //check that rating bar is at zero
        SeekBar seekBar = solo.getView(SeekBar.class, 0);
        assertTrue("Page - 1 Rating bar should be at 0", seekBar.getProgress() == 0);

//        solo.clickOnText("Answer here");
        solo.clickOnEditText(0);
        solo.enterText(0, "Bla Bla Bla");

        //check the multiple choice question . 2-3 answers permitted
        solo.clickOnRadioButton(0);
        assertTrue("Page - 1 RED choice is not selected", solo.isRadioButtonChecked("RED"));

        solo.clickOnRadioButton(1);
        assertTrue("Page - 1 RED choice is not selected", solo.isRadioButtonChecked("RED"));
        assertTrue("Page - 1 YELLOW choice is not selected", solo.isRadioButtonChecked("YELLOW"));

        solo.clickOnRadioButton(2);
        assertTrue("Page - 1 RED choice is not selected", solo.isRadioButtonChecked("RED"));
        assertTrue("Page - 1 YELLOW choice is not selected", solo.isRadioButtonChecked("YELLOW"));
        assertTrue("Page - 1 BLUE choice is not selected", solo.isRadioButtonChecked("BLUE"));

        solo.clickOnRadioButton(3);
        assertFalse("Page - 1 RED choice is selected", solo.isRadioButtonChecked("RED"));
        assertTrue("Page - 1 YELLOW choice is not selected", solo.isRadioButtonChecked("YELLOW"));
        assertTrue("Page - 1 BLUE choice is not selected", solo.isRadioButtonChecked("BLUE"));
        assertTrue("Page - 1 GREEN choice is not selected", solo.isRadioButtonChecked("GREEN"));

        solo.setProgressBar(0, 5);
        seekBar = solo.getView(SeekBar.class, 0);
        assertEquals("Page - 1 Rating bar should be at 5", 5, seekBar.getProgress());


    }

    private void smallDelay() {
        solo.waitForActivity(MainActivity.class, 200);
    }

/*
    Second page category 1
    Contains 1)*Mutually Exclusive
                with subquestions on answer 1 and 2
             2)YesNo
*/
    private void checkPage_2() {

        smallDelay();
        checkNextButton(false);
        checkPrevousButton(true);

        //check that everything is disabled
        for( int i = 0 ; i < 6 ; i++ )
            assertFalse("Page - 2 Initial radio button should be disabled" , solo.isRadioButtonChecked(i));

        //click on yes/no on no answer
        solo.clickOnText("No");
        checkNextButton(false);
        checkPrevousButton(true);

        //click on mutually exclusive last item.
        solo.clickOnText("Fourth option");
        smallDelay();
        checkNextButton(true);
        checkPrevousButton(true);

        //check that previous button is unselected
        solo.clickOnText("First option");
        assertFalse("Page 2 - Radio button 3 should be disabled" , solo.isRadioButtonChecked(3));

        //check that sub questions are open for answer one
        assertTrue("Page 2 - Subquestions for answer one are not open" , solo.searchText("Why?", true));
        assertTrue("Page 2 - Subquestions for answer one are not open" , solo.searchText("Are you married?" , true));

        //click on radio button 3 to see if sub questions dissapear. The OpenField question "Why?" should not appear
        solo.clickOnText("Fourth option");
        TextView why = solo.getText("Why?");
        LinearLayout layout = (LinearLayout) why.getParent();
        assertTrue("Page 2 - Subquestions for answer one are not closed",  layout.getVisibility() == View.GONE );

        //check second sub question
        solo.clickOnText("Second option");
        assertTrue("Page 2 - Subquestions for answer 2 are not open", solo.searchText("What?", true));
        //check rest of the sub questions

        solo.clickOnText("Option 1");
        assertTrue("Page 2 - sub sub question did not open" , solo.searchText("Select a letter?"));

        //check that all the subquestions are not visible
//        solo.clickOnText("Third option");
        solo.clickOnRadioButton(2);
        assertTrue("Page 2 - sub sub sub question did not open", solo.searchText("How?"));

        solo.scrollUp();
        solo.clickOnText("Third option");
        why = solo.getText("What?");
        layout = (LinearLayout) why.getParent();
        assertTrue("Page 2 - Sub sub for answer 2 are not closed", layout.getVisibility() == View.GONE);


        checkPrevousButton(true);
        checkNextButton(true);



    }


    private void checkPage_3() {
        smallDelay();

        //check buttons
        checkNextButton(false);
        checkPrevousButton(true);
        checkSendButton(true);
    }

    private void checkFinalScreen() {

    }

    private void goToNextPage() {
        solo.clickOnView(solo.getCurrentActivity().findViewById(dk.itu.smdp.R.id.page_screen_next_button));
    }

    private void goToPreviousPage() {
        solo.clickOnView(solo.getCurrentActivity().findViewById(dk.itu.smdp.R.id.page_screen_previous_button));
    }

    private void checkNextButton(boolean expected) {
        checkNextButton(dk.itu.smdp.R.id.page_screen_next_button, expected, "Next");
    }

    private void checkPrevousButton(boolean expected) {
        checkNextButton(dk.itu.smdp.R.id.page_screen_previous_button, expected, "Previous");
    }

    private void checkSendButton(boolean expected) {
        checkNextButton(dk.itu.smdp.R.id.page_screen_send_button, expected, "Send");
    }

    private void checkNextButton(int id, boolean expected, String buttonName) {
        ImageButton nextButton = (ImageButton) solo.getCurrentActivity().findViewById(id);

        if (expected)
            assertTrue(buttonName + " button should be enabled but it is not", nextButton.getVisibility() == View.VISIBLE);
        else
            assertTrue(buttonName + " button should be disabled but it is not", nextButton.getVisibility() == View.INVISIBLE);


    }


}
