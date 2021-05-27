package org.luna.board.mapper;

import org.luna.board.domain.BoardVO;

public interface BoardMapper {
	
	//게시글 전체 조회
	BoardVO selectAll(BoardVO board);
	
	//bno로 게시글 하나 조회
	BoardVO selectOne(Integer bno);

	//게시글 등록
	void register(BoardVO board);
	
	//게시글 삭제
	void remove(Integer bno);
	
	//게시글 수정
	void modify(BoardVO board);
	
	
}
