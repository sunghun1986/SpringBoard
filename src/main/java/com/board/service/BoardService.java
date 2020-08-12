package com.board.service;

import com.board.vo.BoardVO;

//데이터를 DAO를 통해 넘겨주거나 받으면서 비지니스로직을 수행하는역할.
public interface BoardService {
	
	//게시글작성
	public void write(BoardVO boardVO) throws Exception;

}
