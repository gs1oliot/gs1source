package org.gs1.source.service.util;

public class ZONEConvertor {

	/**
	 * Convert gtin to domain(aus)
	 * @param gtin
	 * @return
	 */
	public String convert(String gtin) {
		
		String aus = gtin.substring(0, 1) + "." + gtin.substring(12, 13) + "." + gtin.substring(11, 12) + "." + gtin.substring(10, 11) + "."
				+ gtin.substring(9, 10) + "." + gtin.substring(8, 9) + "." + gtin.substring(7, 8) + "." + gtin.substring(6, 7) + "."
				+ gtin.substring(5, 6) + "." + gtin.substring(4, 5) + "." + gtin.substring(3, 4) + "." + gtin.substring(2, 3) + "." + gtin.substring(1, 2) + ".";
		
		return aus + "gtin.gs1.id.onsepc.kr";
	}
}
