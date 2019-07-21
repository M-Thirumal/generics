package com.thirumal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircularBufferTest {

	CircularBuffer circularBuffer = new CircularBuffer(2);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testOffer() {
		assertTrue(circularBuffer.offer("a"));
	    assertTrue(circularBuffer.offer("b"));
	    assertTrue(circularBuffer.offer("c"));
	}
	
}
