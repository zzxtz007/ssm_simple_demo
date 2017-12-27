package top.haha233.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.haha233.service.ScoreService;

/**
 * ScoreServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class ScoreServiceImplTest {

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: addScore(String stuid, String lesson, String score)
	 */
	@Test
	public void testAddScore() throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/spring-dao.xml");
		ScoreService scoreService = (ScoreService) context.getBean("scoreService");
		System.out.println(
				scoreService.queryScore(null, null, null, null, "0", "5")
		);
//TODO: Test goes here...
	}

	/**
	 * Method: deleteScore(String id)
	 */
	@Test
	public void testDeleteScore() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: updateScore(String stuid, String lesson, String score, String id)
	 */
	@Test
	public void testUpdateScore() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: queryScore(String stuid, String lesson, String score, String id, String startIndex, String count)
	 */
	@Test
	public void testQueryScore() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: count(String stuid, String lesson, String score, String id)
	 */
	@Test
	public void testCount() throws Exception {
//TODO: Test goes here... 
	}


} 
