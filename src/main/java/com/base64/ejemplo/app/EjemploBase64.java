package com.base64.ejemplo.app;

import java.util.Base64;

import org.apache.log4j.Logger;

public class EjemploBase64 {
	static final Logger logger = Logger.getLogger(EjemploBase64.class);

	private EjemploBase64() {
	}

	public static void ejemploBase64Java() {
		String originalInput = "Emmanuel Román Santibáñez";
		StringBuilder input = new StringBuilder("base64_");
		
		// Encode data on your side using BASE64
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		logger.info("java.util.Base64 encoded value is " + encodedString);
		logger.info("java.util.Base64 len value is " + encodedString.length());
		
		input.append(encodedString);
		logger.info("StringBuilder encoded append value is " + input.toString());
		logger.info("StringBuilder encoded len value is " + input.toString().length());
		logger.info("StringBuilder encoded substring value is " + input.substring(7));
		
		// Decode data on other side, by processing encoded data
		byte[] decodedBytes = Base64.getDecoder().decode(input.substring(7));
		String decodedString = new String(decodedBytes);
		logger.info("java.util.Base64 Decoded value is " + decodedString);
	}
}
