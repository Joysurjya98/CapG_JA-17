package com.capgemini.Author.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Author.model.Author;

/**
 * @author joysu
 *
 */

public class AuthorTest {
	/**
	 * @throws java.lang.Exception
	 */
	static Author aut;
	Author aut1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	aut = new Author("Joy","joysurjya@gmail.com",'m');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		aut = null;  //eligible for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		aut1 = new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		aut1 = null;
	}

	
	@Test
	void testAuthor() {
		assertEquals(new Author(),aut1);
	}

	
	/**
	 * Test method for {@link com.capgemini.author.model.Author#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("Joy",aut.getName());
	}


	/**
	 * Test method for {@link com.capgemini.author.model.Author#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("joysurjya@gmail.com",aut.getEmail());
	}

	

	/**
	 * Test method for {@link com.capgemini.Author.model.Author#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('m', aut.getGender());
	}

}
