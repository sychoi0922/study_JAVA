package ch05;

import java.util.Arrays; // ctrl+shift+o : 자동으로 import문 추가됨

class Ex5_1_tmp {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
	}
}