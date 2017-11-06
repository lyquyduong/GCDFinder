package com.lyquyduong.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.lyquyduong.GCDFinder;
/**
 * @author webmaster@LyQuyDuong.Com
 *
 */
public class ApplicationTest {
	private static GCDFinder finder;
	
	@BeforeClass
	public static void initCalculator() {
		finder = new GCDFinder();
    }

	@Test
	public void testGCD() {
		assertEquals(finder.gcd(25, 100), 25);
		assertEquals(finder.gcd(25, 10), 5);
	}
}
