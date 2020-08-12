package com.board.dao;

import com.board.vo.BoardVO;

//DB를 통해 데이터를 조회하거나 수정 삭제하는 역할.
public interface BoardDAO {

	//게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}
