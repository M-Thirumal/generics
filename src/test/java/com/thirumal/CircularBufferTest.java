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
		assertTrue(circularBuffer.offer("a"));
	    assertTrue(circularBuffer.offer("b"));
	    assertEquals("a", circularBuffer.poll());
	    assertEquals("b", circularBuffer.poll());
	}

	@Test
	public void testOffer() {
		assertTrue(circularBuffer.offer("a"));
	    assertTrue(circularBuffer.offer("b"));
	    assertFalse(circularBuffer.offer("c")); //Full
	    assertEquals("a", circularBuffer.poll());
	    assertEquals("b", circularBuffer.poll());
	    assertEquals(null, circularBuffer.poll());
	   
	}
	
	@Test
	public void typeSaftey() {
		 assertTrue(circularBuffer.offer(1));
		 assertTrue(circularBuffer.offer(1));
		 assertEquals(2, ((int)circularBuffer.poll() + (int)circularBuffer.poll())); //Type cast is required
	}
	
	
	
}
