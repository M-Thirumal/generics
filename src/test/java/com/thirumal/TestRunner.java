package com.thirumal;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] str) {
		 Result result = JUnitCore.runClasses(CircularBufferTest.class);
		    for (Failure failure : result.getFailures()) {
		      System.out.println(failure.toString());
		    }
	}

}
