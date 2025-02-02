package com.bugsnag.android.repackaged.dslplatform.json.generated.types.StringWithMaxLengthOf9;



import com.bugsnag.android.repackaged.dslplatform.json.generated.types.StaticJson;
import com.bugsnag.android.repackaged.dslplatform.json.generated.ocd.javaasserts.StringWithMaxLengthOf9Asserts;

import java.io.IOException;

public class OneStringWithMaxLengthOf9DefaultValueTurtle {
	private static StaticJson.JsonSerialization jsonSerialization;

	@org.junit.BeforeClass
	public static void initializeJsonSerialization() throws IOException {
		jsonSerialization = StaticJson.getSerialization();
	}

	@org.junit.Test
	public void testDefaultValueEquality() throws IOException {
		final String defaultValue = "";
		final StaticJson.Bytes defaultValueJsonSerialized = jsonSerialization.serialize(defaultValue);
		final String defaultValueJsonDeserialized = jsonSerialization.deserialize(String.class, defaultValueJsonSerialized.content, defaultValueJsonSerialized.length);
		StringWithMaxLengthOf9Asserts.assertOneEquals(defaultValue, defaultValueJsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue1Equality() throws IOException {
		final String borderValue1 = "\"";
		final StaticJson.Bytes borderValue1JsonSerialized = jsonSerialization.serialize(borderValue1);
		final String borderValue1JsonDeserialized = jsonSerialization.deserialize(String.class, borderValue1JsonSerialized.content, borderValue1JsonSerialized.length);
		StringWithMaxLengthOf9Asserts.assertOneEquals(borderValue1, borderValue1JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue2Equality() throws IOException {
		final String borderValue2 = "'/\\[](){}";
		final StaticJson.Bytes borderValue2JsonSerialized = jsonSerialization.serialize(borderValue2);
		final String borderValue2JsonDeserialized = jsonSerialization.deserialize(String.class, borderValue2JsonSerialized.content, borderValue2JsonSerialized.length);
		StringWithMaxLengthOf9Asserts.assertOneEquals(borderValue2, borderValue2JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue3Equality() throws IOException {
		final String borderValue3 = "\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t";
		final StaticJson.Bytes borderValue3JsonSerialized = jsonSerialization.serialize(borderValue3);
		final String borderValue3JsonDeserialized = jsonSerialization.deserialize(String.class, borderValue3JsonSerialized.content, borderValue3JsonSerialized.length);
		StringWithMaxLengthOf9Asserts.assertOneEquals(borderValue3, borderValue3JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue4Equality() throws IOException {
		final String borderValue4 = "xxxxxxxxx";
		final StaticJson.Bytes borderValue4JsonSerialized = jsonSerialization.serialize(borderValue4);
		final String borderValue4JsonDeserialized = jsonSerialization.deserialize(String.class, borderValue4JsonSerialized.content, borderValue4JsonSerialized.length);
		StringWithMaxLengthOf9Asserts.assertOneEquals(borderValue4, borderValue4JsonDeserialized);
	}
}
