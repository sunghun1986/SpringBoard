package com.board.dao;

import java.util.List;

import com.board.vo.BoardVO;

//DB를 통해 데이터를 조회하거나 수정 삭제하는 역할.
public interface BoardDAO {

	//게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	//게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	
	//게시물 상세보기
	public BoardVO read(int bno) throws Exception;
	
	//게시물 수정하기
	public void update(BoardVO boardVO) throws Exception;
	
	//게시물 삭제하기
	public void delete(int bno) throws Exception;
	
}







