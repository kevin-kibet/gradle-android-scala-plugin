package dev.kibet.android.libproject.app

import junit.framework.{TestCase, Assert}
import dev.kibet.android.libproject.lib1.Lib1Scala

class Lib1JavaTest extends TestCase {
  def test1() {
    Assert.assertEquals("Lib1Scala", new Lib1Scala().getName)
  }
}
