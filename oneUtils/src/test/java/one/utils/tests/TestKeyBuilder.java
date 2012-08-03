/**
 * 
 */
package one.utils.tests;

import java.util.Arrays;
import java.util.List;


import one.utils.internal.keybuilder.StringDotKeyBuilder;
import one.utils.internal.keybuilder.StringHashKeyBuilder;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="http://www.mxro.de/">Max Erik Rohde</a>
 * 
 *         Copyright Max Erik Rohde 2011. All rights reserved.
 */
public class TestKeyBuilder {

	@Test
	public void test_string_dot_keybuilder() {

		final StringDotKeyBuilder keyBuilder = new StringDotKeyBuilder();

		Assert.assertEquals(Arrays.asList("one", "two"),
				keyBuilder.makeKey("one.two"));

	}

	@Test
	public void test_string_hash_key_builder() {
		final StringHashKeyBuilder keyBuilder = new StringHashKeyBuilder();

		final List<String> key = keyBuilder
				.makeKey("http://rpc1.linnk.it/service1");

		Assert.assertTrue(key.size() > 3);

		Assert.assertTrue(key.get(0).length() == 1);
	}

}