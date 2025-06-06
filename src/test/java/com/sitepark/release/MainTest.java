package com.sitepark.release;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private static final PrintStream OUT = System.out;
  private static final PrintStream ERR = System.err;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(OUT);
    System.setErr(ERR);
  }

  @Test
  void test() {
    Main.main(new String[] {"Peter"});
    assertEquals("Hello Peter\n", this.outContent.toString(), "wrong output");
  }
}
