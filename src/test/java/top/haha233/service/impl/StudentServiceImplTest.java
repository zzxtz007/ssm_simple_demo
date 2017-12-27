package top.haha233.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.haha233.service.ScoreService;
import top.haha233.service.StudentService;

/**
 * StudentServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class StudentServiceImplTest {

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: add(String id, String name)
	 */
	@Test
	public void testAdd() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: delete(String id)
	 */
	@Test
	public void testDelete() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: update(String id, String name)
	 */
	@Test
	public void testUpdate() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: query(String id, String name, String stratIndex, String count)
	 */
	@Test
	public void testQuery() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: count(String id, String name)
	 */
	@Test
	public void testCount() throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/spring-dao.xml");
		StudentService studentService = (StudentService) context.getBean("studentService");
		System.out.println(
				studentService.query(null, null, "0", "1")
		);
	}


} 
