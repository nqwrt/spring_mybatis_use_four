package edu.bit.ex.board3;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface BoardMapper {

	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")
	public List<BDto> selectBoardList();

	/*
	 * @Select("select * from mvc_board where bId =#{bId}") public BoardVO
	 * selectBoardOne(String bId);
	 * 
	 * @Insert("insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, #{bName}, #{bTitle}, #{bContent}, 0, mvc_board_seq.currval, 0, 0 )"
	 * ) public void insertBoard(BoardVO boardVO);
	 * 
	 * @Select("select count(*) from mvc_board") public int selectAllBoard();
	 * 
	 * public List<BoardVO> selectBoardListPage(Criteria criteria);
	 * 
	 * 湲곕쾾�뵪 �삁�젣 public void insertBoardWithMap(Map map);
	 */

}
