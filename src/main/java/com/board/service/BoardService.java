package com.board.service;

import java.util.List;

import com.board.vo.BoardVO;

//데이터를 DAO를 통해 넘겨주거나 받으면서 비지니스로직을 수행하는역할.
public interface BoardService {
	
	//게시글작성
	public void write(BoardVO boardVO) throws Exception;
	
	//게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	
	//게시물 상세조회
	public BoardVO read(int bno) throws Exception;
	
	//게시글 수정
	public void update(BoardVO boardVO) throws Exception;
	
	//게시글 삭제
	public void delete(int bno) throws Exception;

}
