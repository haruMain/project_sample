package board.service.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("BoardDAO")
public class BoardDAO extends EgovComAbstractDAO {
	
	@Autowired
	private SqlSession sql;
	
//	form 저장
	public int commonSaveFormInsert(Map<String, Object> commandMap) throws Exception {
		System.out.println("boardDAO 들어옴@@@@@@@@@");
		
		String namespace= (String) commandMap.get("namespace");
		return insert(namespace+".boardInsert", commandMap);
	}
	

}
