package org.gs1.source.service.util;

public class CheckBit {
	
	public boolean check(String gtin) {
		
		int[] check = new int[13];
		int sum = 0;
		
		if(gtin.length() == 14) {
			if(gtin.charAt(0) != '0') {
				return false;
			}
			
			for(int i = 0; i < 13; i++) {
				check[i] = Character.getNumericValue(gtin.charAt(i+1));
			}
		} else {
			for(int i = 0; i < 13; i++) {
				check[i] = Character.getNumericValue(gtin.charAt(i));
			}
		}
		
		for(int i = 1; i < 12; i += 2) {
			check[i] *= 3;
			
		}
		
		for(int i = 0; i < 12; i ++) {
			sum += check[i];
		}
		
		int check_sum = 10 - (sum % 10);
		
		if(check_sum == 10) {
			check_sum = 0;
		}
		
		if(check[12] == check_sum) {
			return true;
		} else {
			return false;
		}
	
	}

}
