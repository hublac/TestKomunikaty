package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import C2.Annoucment;

public class TestKomunikaty {
	Annoucment annoucment = new Annoucment();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	void test_showMessageAnnouncment_success() {
		//Given
		String message = "Hello World!";
		boolean isSuccess = true;
		
		//When
		try {
			announcment.showMessage(message);
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
				announcment.showMessage(String.valueOf(i));
			}
		} catch(Exception e) {
			isSuccess = false;
		}
		
		//Then
		Assertions.assertTrue(isSuccess);
		
	}
}
