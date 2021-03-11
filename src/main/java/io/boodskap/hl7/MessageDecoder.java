package io.boodskap.hl7;

import org.json.JSONObject;

import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;

public interface MessageDecoder {

	public void decode(HapiContext context, Parser parser, Message msg, JSONObject json, String data) throws Exception;
}
