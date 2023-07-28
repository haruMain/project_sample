package board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import board.service.BoardService;

@Controller
public class BoardController {
	
	BoardService boardService;
	
	@RequestMapping(value = "/index.do")
	 public String filelistSelect() throws Exception {
		
		  return "/main"; 
	 }
	
	
	
	

}
