package org.afplib;

import static org.afplib.CodepageHelper.getCharset;
import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;

import org.junit.Test;

public class CodepageHelperTest {

	private static final int UNUSED = 123;

	@Test
	public void testGetCharset() throws Exception {
		assertEquals(Charset.forName("IBM500"), getCharset(500, UNUSED));
		assertEquals(Charset.forName("IBM850"), getCharset(850, UNUSED));

		assertEquals(Charset.forName("UTF-16"), getCharset(1200, UNUSED));
		assertEquals(Charset.forName("windows-1252"), getCharset(1252, UNUSED));
		assertEquals(Charset.forName("IBM01141"), getCharset(1141, UNUSED));

		assertEquals(Charset.forName("IBM273"), getCharset(273, UNUSED));

		assertEquals(Charset.forName("IBM500"), getCharset(9999999, UNUSED));
	}

}
