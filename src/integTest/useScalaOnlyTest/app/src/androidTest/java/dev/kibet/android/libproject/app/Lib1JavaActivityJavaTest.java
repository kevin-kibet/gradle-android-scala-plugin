package dev.kibet.android.libproject.app;

import android.test.ActivityInstrumentationTestCase2;
import android.view.ViewGroup;
import android.widget.TextView;

import dev.kibet.android.libproject.R;
import dev.kibet.android.libproject.lib1.Lib1JavaActivity;

public class Lib1JavaActivityJavaTest extends ActivityInstrumentationTestCase2<Lib1JavaActivity> {
    public Lib1JavaActivityJavaTest() {
        super(Lib1JavaActivity.class);
    }

    public void test1() {
        assertTrue(true);
    }

    public void test2() {
        assertEquals("Lib1Java", ((TextView)((ViewGroup) getActivity().findViewById(android.R.id.content)).getChildAt(0)).getText());
    }
}
