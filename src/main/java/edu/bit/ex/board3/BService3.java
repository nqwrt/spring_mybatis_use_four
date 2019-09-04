package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;


@Service
public class BService3 {
	
	@Inject
	BoardMapper boardMapper;
	
    public List<BDto> selectBoardList()throws Exception {
		return boardMapper.selectBoardList();
    }
}
