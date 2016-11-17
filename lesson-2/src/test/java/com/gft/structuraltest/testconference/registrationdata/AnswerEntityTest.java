package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.*;

/**
 * Test class for AnswerEntity class.
 */ 
public class AnswerEntityTest {
	
	private AnswerEntity an1,an2;
	private QuestionEntity que1, que2;
	
	@Before
	public void setUp() {
		que1 = mock(QuestionEntity.class);
		que2 = mock(QuestionEntity.class);
	}
	
	/**
	 * Test for the case when the object is null.
	 */
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        an1 = new AnswerEntity();
        an2 = null;
        assertFalse(an1.equals(an2));
    }
	
    /**
     * Test for the case when the objects references are the same.
     */
	@Test
	public void shouldReturnTrueWhenTheReferencesAreTheSame() {
		an1 = new AnswerEntity();
		an2 = an1;
		assertTrue(an1.equals(an2));
	}
	
	/**
	 * Test for the case when the Object is not instance of AnswerEntity Class.
	 */
	@Test
	public void shouldReturnFalseWhenObjectIsNotInstanceOfThisClass() {
		an1 = new AnswerEntity();
		String str = new String();
		assertFalse(an1.equals(str));
	}
	
	/**
	 * Test for the case when the answerText is null.
	 */
	@Test 
	public void shouldReturnFalseWhenTheObjectAnswerTextIsNull() {
		an1 = new AnswerEntity();
		an1.setAnswerText(null);
		AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText("answer");
		assertFalse(an1.equals(an2));
	}
	
	/**
	 * Test for the case when none of objects is null and 
	 * answerText from each element is different.
	 */
	@Test
	public void shouldReturnFalseWhenAnswerTextsAreNotEqual() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setAnswerText("answer 1");
		an2.setAnswerText("answer 2");
		assertFalse(an1.equals(an2));
	}
	
	/**
	 * Test for the case when id is null.
	 */
	@Test 
	public void shouldReturnFalseWhenTheObjectIdIsNull() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setId(null);
		an2.setId(1L);
		assertFalse(an1.equals(an2));
	} 
	
	/**
	 * Test for the case when id for each element is different.
	 */
	@Test 
	public void shouldReturnFalseWhenIdsAreNotEqual() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setId(2567L);
		an2.setId(1L);
		assertFalse(an1.equals(an2));
	}
	
	/**
	 * Test for the case when field question is null.
	 */
	@Test
	public void shouldReturnFalseWhenTheQuestionIsNull() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setQuestion(null);
		an2.setQuestion(que1);
		assertFalse(an1.equals(an2));
	}
	
	/**
	 * Test for the case when the question fields are different.
	 */
	@Test
	public void shouldReturnFalseWhenQuestionsAreNotEqual() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setQuestion(que1);
		an2.setQuestion(que2);
		assertFalse(an1.equals(an2));
	}
	
	/**
	 * Test for the case when the object is equal to another.
	 */
	@Test
	public void shouldReturnTrueWhenTwoObjectAreEqual() {
		an1 = new AnswerEntity();
		an2 = new AnswerEntity();
		an1.setId(1L);
		an2.setId(1L);
		an1.setAnswerText("answer");
		an2.setAnswerText("answer");
		an1.setQuestion(que1);
		an2.setQuestion(que1);
		assertTrue(an1.equals(an2));
	}
}