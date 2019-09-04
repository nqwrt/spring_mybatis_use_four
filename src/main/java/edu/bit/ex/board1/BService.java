package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;


@Service
public class BService {
	
	@Inject
	SqlSession sqlSession;
	
    public List<BDto> selectBoardList()throws Exception {
    	IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDao();
    }

}
