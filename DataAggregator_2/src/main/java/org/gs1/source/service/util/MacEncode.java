package org.gs1.source.service.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class MacEncode {

	/**
	 * MacEncode with SHA256-HMAC
	 * @param key
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String encode(String key, String data) throws Exception{

		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);

		return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));

	}

}
