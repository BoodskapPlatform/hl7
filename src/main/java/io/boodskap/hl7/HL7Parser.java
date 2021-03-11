package io.boodskap.hl7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;

public class HL7Parser {

	private static final ThreadLocal<HapiContext> CONTEXTS = new ThreadLocal<HapiContext>() {
		@Override
		protected HapiContext initialValue() {
			return new DefaultHapiContext();
		}

	};

	public static Map<String, Object> toMap(JSONObject jsonobj) throws JSONException {
		Map<String, Object> map = new HashMap<String, Object>();
		Iterator<String> keys = jsonobj.keys();
		while (keys.hasNext()) {
			String key = keys.next();
			Object value = jsonobj.get(key);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			} else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			map.put(key, value);
		}
		return map;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			} else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}

	public static Map<String, Object> parseAsMap(byte[] data) throws Exception {
		return HL7Parser.parseAsMap(new String(data));
	}

	public static Map<String, Object> parseAsMap(String data) throws Exception {

		JSONObject json = HL7Parser.parse(data);

		return toMap(json);
	}

	public static JSONObject parse(byte[] data) throws Exception {
		return HL7Parser.parse(new String(data));
	}

	public static JSONObject parse(String data) throws Exception {

		HapiContext context = CONTEXTS.get();

		ca.uhn.hl7v2.parser.Parser parser = context.getGenericParser();

		Message msg = parser.parse(data);

		final String version = msg.getVersion().replaceAll("\\.", "");

		String className = String.format("io.boodskap.hl7.v%s.Decoder", version);

		MessageDecoder decoder = (MessageDecoder) Class.forName(className).newInstance();

		JSONObject json = new JSONObject();

		decoder.decode(context, parser, msg, json, data);

		return json;

	}
}
