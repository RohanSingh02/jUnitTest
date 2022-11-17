package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstr = new jUnitFunctions();
		String result = junitstr.addStrings("Software ","Engineering");
		assertEquals ("Software Engineering", result);
	}
}
