package com.bugsnag.android.repackaged.dslplatform.json.generated.types.Map;



import com.bugsnag.android.repackaged.dslplatform.json.generated.types.StaticJson;
import com.bugsnag.android.repackaged.dslplatform.json.generated.ocd.javaasserts.MapAsserts;

import java.io.IOException;

public class OneListOfOneMapsDefaultValueTurtle {
	private static StaticJson.JsonSerialization jsonSerialization;

	@org.junit.BeforeClass
	public static void initializeJsonSerialization() throws IOException {
		jsonSerialization = StaticJson.getSerialization();
	}

	@org.junit.Test
	public void testDefaultValueEquality() throws IOException {
		final java.util.List<java.util.Map<String, String>> defaultValue = new java.util.ArrayList<java.util.Map<String, String>>(0);
		final StaticJson.Bytes defaultValueJsonSerialized = jsonSerialization.serialize(defaultValue);
		@SuppressWarnings("unchecked")
		final java.util.List<java.util.Map<String, String>> defaultValueJsonDeserialized =
				(java.util.List<java.util.Map<String, String>>)
				(java.util.List<?>)
				jsonSerialization.deserializeList(java.util.Map.class, defaultValueJsonSerialized.content, defaultValueJsonSerialized.length);
		MapAsserts.assertOneListOfOneEquals(defaultValue, defaultValueJsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue1Equality() throws IOException {
		final java.util.List<java.util.Map<String, String>> borderValue1 = new java.util.ArrayList<java.util.Map<String, String>>(java.util.Arrays.asList(new java.util.HashMap<String, String>(0)));
		final StaticJson.Bytes borderValue1JsonSerialized = jsonSerialization.serialize(borderValue1);
		@SuppressWarnings("unchecked")
		final java.util.List<java.util.Map<String, String>> borderValue1JsonDeserialized =
				(java.util.List<java.util.Map<String, String>>)
				(java.util.List<?>)
				jsonSerialization.deserializeList(java.util.Map.class, borderValue1JsonSerialized.content, borderValue1JsonSerialized.length);
		MapAsserts.assertOneListOfOneEquals(borderValue1, borderValue1JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue2Equality() throws IOException {
		final java.util.List<java.util.Map<String, String>> borderValue2 = new java.util.ArrayList<java.util.Map<String, String>>(java.util.Arrays.asList(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}));
		final StaticJson.Bytes borderValue2JsonSerialized = jsonSerialization.serialize(borderValue2);
		@SuppressWarnings("unchecked")
		final java.util.List<java.util.Map<String, String>> borderValue2JsonDeserialized =
				(java.util.List<java.util.Map<String, String>>)
				(java.util.List<?>)
				jsonSerialization.deserializeList(java.util.Map.class, borderValue2JsonSerialized.content, borderValue2JsonSerialized.length);
		MapAsserts.assertOneListOfOneEquals(borderValue2, borderValue2JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue3Equality() throws IOException {
		final java.util.List<java.util.Map<String, String>> borderValue3 = new java.util.ArrayList<java.util.Map<String, String>>(java.util.Arrays.asList(new java.util.HashMap<String, String>(0), new java.util.HashMap<String, String>() {{ put("a", "b"); }}, new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}, new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}));
		final StaticJson.Bytes borderValue3JsonSerialized = jsonSerialization.serialize(borderValue3);
		@SuppressWarnings("unchecked")
		final java.util.List<java.util.Map<String, String>> borderValue3JsonDeserialized =
				(java.util.List<java.util.Map<String, String>>)
				(java.util.List<?>)
				jsonSerialization.deserializeList(java.util.Map.class, borderValue3JsonSerialized.content, borderValue3JsonSerialized.length);
		MapAsserts.assertOneListOfOneEquals(borderValue3, borderValue3JsonDeserialized);
	}
}
