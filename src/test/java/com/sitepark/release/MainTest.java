package com.sitepark.release;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUpStreams() {
    System.setOut(new PrintStream(outContent, true, StandardCharsets.UTF_8));
    System.setErr(new PrintStream(errContent, true, StandardCharsets.UTF_8));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	void test() {
		Main.main(new String[] { "Peter" });
		assertEquals("Hello Peter\ndo something\n", this.outContent.toString(StandardCharsets.UTF_8), "wrong output");
	}
}
