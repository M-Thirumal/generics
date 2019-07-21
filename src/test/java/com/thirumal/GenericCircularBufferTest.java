/**
 * 
 */
package com.thirumal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author thirumal
 *
 */
class GenericCircularBufferTest {

	GenericCircularBuffer<String> stringCircularBuffer = new GenericCircularBuffer<String>(2);
	GenericCircularBuffer<Integer> integerCircularBuffer = new GenericCircularBuffer<Integer>(2);
	GenericCircularBuffer<Long> longCircularBuffer = new GenericCircularBuffer<Long>(2);
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//String
		assertTrue(stringCircularBuffer.offer("Thirumal"));
		assertEquals("The name is Thirumal", "The name is " + stringCircularBuffer.poll());
		//Integer
		//assertTrue(integerCircularBuffer.offer(Integer.valueOf(123)));
		//assertEquals(Integer.valueOf(123), integerCircularBuffer.poll());
		//Long
		assertTrue(longCircularBuffer.offer(123L));
		assertEquals(Long.valueOf(123), longCircularBuffer.poll());
	}

}
