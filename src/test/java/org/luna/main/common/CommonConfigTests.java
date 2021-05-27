package org.luna.main.common;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.luna.common.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
public class CommonConfigTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory ssf;
	

	@Test
	public void testds() {
		log.info("-------------test ds------------------" + ds);
		assertNotNull(ds);//객체()가 null이 아닌지 확인합니다.
	}

	@Test
	public void testssf() {
		SqlSession session = ssf.openSession(); //세션 오픈
		log.info("-------------test ssf------------------");
		assertNotNull(session); 
		
		session.close(); //세션 닫아야됨
	}
}
