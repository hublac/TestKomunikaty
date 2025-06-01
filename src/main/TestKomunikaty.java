package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import C2.Annoucment;

public class TestKomunikaty {
	Annoucment annoucment = new Annoucment();

	@Test
	void test_showMessageAnnouncment_success() {
		//Given
		String message = "Hello World!";
		boolean isSuccess = true;
		
		//When
		try {
			annoucment.showMessage(message);
		} catch(Exception e) {
			isSuccess = false;
		}
		
		//Then
		Assertions.assertTrue(isSuccess);
	}
	
	@Test
	void test_loopShowMessage_success() {
		//Given
		int loopScope = 10000;
		boolean isSuccess = true;
		
		//When
		try {
			for(int i = 1; i <= loopScope; i++) {
				annoucment.showMessage(String.valueOf(i));
			}
		} catch(Exception e) {
			isSuccess = false;
		}
		
		//Then
		Assertions.assertTrue(isSuccess);
		
	}
}
