package com.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.service.BoardService;
import com.board.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	//게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView" , method = RequestMethod.GET)
	public void writerView() throws Exception{
		logger.info("writeView");
	}
	
	//게시판 글 작성
	@RequestMapping(value = "/board/write" , method = RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception {
		logger.info("write");
		service.write(boardVO);
		return "redirect:/";
	}
	
	//게시판 목록 조회
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		logger.info("list");
		
		//service.list()에 담긴 데이터를 list 라는 이름으로 담을것이다
		model.addAttribute("list",service.list());		
		return "board/list";
	}
	
	//게시물 상세 보기
	@RequestMapping(value = "/readView" , method = RequestMethod.GET)
	public String read(BoardVO boardVO, Model model) throws Exception{
		logger.info("read");
		model.addAttribute("read" , service.read(boardVO.getBno()));		
		return "board/readView";
	}
	
}












