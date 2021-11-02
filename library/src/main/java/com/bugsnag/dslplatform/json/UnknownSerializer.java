package com.bugsnag.dslplatform.json;

import androidx.annotation.Nullable;

import java.io.IOException;

interface UnknownSerializer {
	void serialize(JsonWriter writer, @Nullable Object unknown) throws IOException;
}
