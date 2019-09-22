package dev.kibet.android.libproject.app;

import junit.framework.TestCase;

import dev.kibet.android.libproject.lib1.Lib1Java;

public class Lib1JavaTest extends TestCase {
    public void test1() {
        assertEquals("Lib1Java", new Lib1Java().getName());
    }
}
