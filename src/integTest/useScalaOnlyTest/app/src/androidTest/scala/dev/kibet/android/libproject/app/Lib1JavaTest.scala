package dev.kibet.android.libproject.app

import junit.framework.{TestCase, Assert}
import dev.kibet.android.libproject.lib1.Lib1Java

class Lib1JavaTest extends TestCase {
  def test1() {
    Assert.assertEquals("Lib1Java", new Lib1Java().getName)
    Assert.assertEquals(List("Lib1Java").last, Option(new Lib1Java().getName).get)
  }
}
