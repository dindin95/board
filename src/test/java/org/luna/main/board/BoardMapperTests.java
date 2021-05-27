package org.luna.main.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.luna.board.config.BoardConfig;
import org.luna.board.domain.BoardVO;
import org.luna.board.mapper.BoardMapper;
import org.luna.common.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class, BoardConfig.class }) // 경로를 적어주면 컴피그로 등록돼서 실행
@Log4j
public class BoardMapperTests {

	@Autowired
	BoardMapper mapper;


	
	@Test
	public void selectAllTest() {

		
	//	log.info("----selectAllTest-----" + mapper.selectAll(board));
	}


	@Test
	public void selectOneTest() {

		log.info("----selectOneTest-----" + mapper.selectOne(1));
	}
	
	@Test
	public void registerTest() {
		
	BoardVO board =  BoardVO.builder().title("인생").content("에후").writer("곱창이나 먹을까").build();
	 mapper.register(board);
	log.info("----registerTest-----");
		
	}
	
	@Test
	public void removeTest() {
		
	mapper.remove(4115);
	
	log.info("-----remove------");
	}

	
	@Test
	public void modifyTest() {
		BoardVO board = BoardVO.builder().bno(4113).title("언제 다하지").content("막막").writer("스으으읍").build();
		mapper.modify(board);
		log.info("----modify----"+ mapper.selectOne(4113));
	}
}
