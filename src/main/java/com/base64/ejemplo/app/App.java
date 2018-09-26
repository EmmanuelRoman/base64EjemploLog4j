package com.base64.ejemplo.app;


import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	static final Logger logger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		String originalInput = "Emmanuel Román Santibáñez";
		Base64 base64 = new Base64();
		String encodedString = new String(base64.encode(originalInput.getBytes()));
		String decodedString = new String(Base64.decodeBase64(encodedString.getBytes()));
		logger.info("commons-codec encoded value is " + encodedString);
		logger.info("commons-codec Decoded value is " + decodedString);
		
		EjemploBase64.ejemploBase64Java();
	}
	
	
}
