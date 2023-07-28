package board.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	
	@Override
	public String boardSave(Map<String, Object> commandMap) throws Exception {
		String msg;
		boardDAO.commonSaveFormInsert(commandMap);
		
		msg = "SUCCESS";
		return msg;
	}

}
