package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;

	@Override
	public void write(BoardVO boardVO) throws Exception {	
		dao.write(boardVO);
	}

	@Override
	public List<BoardVO> list() throws Exception {		
		return dao.list();
	}

}
