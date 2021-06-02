package com.capgemini.cmapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ContactManagerTest {
	/**
	 * Object of Contact Manager Class
	 */
	private static ContactManager contManager;
	
	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before all tests");
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("Should print before each test");
		System.out.println("Instanting the Contact Manager");
		contManager = new ContactManager();
	}
	
	@Test
	@DisplayName("Should create contact")
	public void shouldCreateContact() {
		contManager.addContact("Rama", "Krishna", "09876543211");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull() {
		Assertions.assertThrows(RuntimeException.class,() ->{ 
			contManager.addContact(null, "Krishna", "09876543211");});
	}
	
	@Test
	@DisplayName("Should not create contact when last name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Rama",null,"09798416266");});
		}
	
	@Test
	@DisplayName("Should not create contact when phone no is null")
	public void shouldThrowRunTimeExceptionWhenPhoneIsNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Rama","Krishna",null);});
		}
	
	@Test
	@DisplayName("Should not create contact when phone not starting with 0")
	public void shouldTestPhoneNumberFormat() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Rama","Krishna","99876543211");});
		}
	
	@Nested
	class RepeatedTests {
		
		@DisplayName("Should create contact")
		@RepeatedTest(value = 5, name = "Repeating contact creation test{currentRepeatition} of {totalRepeatition}")
		public void shouldCreateContactRepeatedly() {
			contManager.addContact("Rama", "Krishna", "09876543211");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	
	@Nested
	class ParamterizedTests {

	@DisplayName("Phone number should match with required format")
	@ParameterizedTest
	@ValueSource(strings={"09876543211","09876543212","09876543213"}) 
	public void shouldTestPhoneNumberFormatUsinaValueSource(String phoneNumber) {
		contManager.addContact("Rama", "Krishna", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	}
	
	private static List <String> phoneNumberList(){
		return Arrays.asList("09876543217", "09876543777", "09876543265");
	}
	
	@DisplayName("Testing Phone Number Format Using Method Source")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void testPhoneNumberMethodSource(String phoneNumber) {
		contManager.addContact("KJ", "jk", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disable Test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("This test is a disabled test");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Should execute after each test");
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("Should execute after all tests are done");
	}

}
