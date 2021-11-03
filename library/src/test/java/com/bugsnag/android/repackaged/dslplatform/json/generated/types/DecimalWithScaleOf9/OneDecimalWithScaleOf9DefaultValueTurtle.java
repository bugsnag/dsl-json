package com.bugsnag.android.repackaged.dslplatform.json.generated.types.DecimalWithScaleOf9;



import com.bugsnag.android.repackaged.dslplatform.json.generated.types.StaticJson;
import com.bugsnag.android.repackaged.dslplatform.json.generated.ocd.javaasserts.DecimalWithScaleOf9Asserts;

import java.io.IOException;

public class OneDecimalWithScaleOf9DefaultValueTurtle {
	private static StaticJson.JsonSerialization jsonSerialization;

	@org.junit.BeforeClass
	public static void initializeJsonSerialization() throws IOException {
		jsonSerialization = StaticJson.getSerialization();
	}

	@org.junit.Test
	public void testDefaultValueEquality() throws IOException {
		final java.math.BigDecimal defaultValue = java.math.BigDecimal.ZERO.setScale(9);
		final StaticJson.Bytes defaultValueJsonSerialized = jsonSerialization.serialize(defaultValue);
		final java.math.BigDecimal defaultValueJsonDeserialized = jsonSerialization.deserialize(java.math.BigDecimal.class, defaultValueJsonSerialized.content, defaultValueJsonSerialized.length);
		DecimalWithScaleOf9Asserts.assertOneEquals(defaultValue, defaultValueJsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue1Equality() throws IOException {
		final java.math.BigDecimal borderValue1 = java.math.BigDecimal.ONE;
		final StaticJson.Bytes borderValue1JsonSerialized = jsonSerialization.serialize(borderValue1);
		final java.math.BigDecimal borderValue1JsonDeserialized = jsonSerialization.deserialize(java.math.BigDecimal.class, borderValue1JsonSerialized.content, borderValue1JsonSerialized.length);
		DecimalWithScaleOf9Asserts.assertOneEquals(borderValue1, borderValue1JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue2Equality() throws IOException {
		final java.math.BigDecimal borderValue2 = new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(9, java.math.BigDecimal.ROUND_HALF_UP);
		final StaticJson.Bytes borderValue2JsonSerialized = jsonSerialization.serialize(borderValue2);
		final java.math.BigDecimal borderValue2JsonDeserialized = jsonSerialization.deserialize(java.math.BigDecimal.class, borderValue2JsonSerialized.content, borderValue2JsonSerialized.length);
		DecimalWithScaleOf9Asserts.assertOneEquals(borderValue2, borderValue2JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue3Equality() throws IOException {
		final java.math.BigDecimal borderValue3 = new java.math.BigDecimal("-1E-9");
		final StaticJson.Bytes borderValue3JsonSerialized = jsonSerialization.serialize(borderValue3);
		final java.math.BigDecimal borderValue3JsonDeserialized = jsonSerialization.deserialize(java.math.BigDecimal.class, borderValue3JsonSerialized.content, borderValue3JsonSerialized.length);
		DecimalWithScaleOf9Asserts.assertOneEquals(borderValue3, borderValue3JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue4Equality() throws IOException {
		final java.math.BigDecimal borderValue4 = new java.math.BigDecimal("1E19");
		final StaticJson.Bytes borderValue4JsonSerialized = jsonSerialization.serialize(borderValue4);
		final java.math.BigDecimal borderValue4JsonDeserialized = jsonSerialization.deserialize(java.math.BigDecimal.class, borderValue4JsonSerialized.content, borderValue4JsonSerialized.length);
		DecimalWithScaleOf9Asserts.assertOneEquals(borderValue4, borderValue4JsonDeserialized);
	}
}
