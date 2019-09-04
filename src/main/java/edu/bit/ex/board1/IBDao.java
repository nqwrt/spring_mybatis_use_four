package edu.bit.ex.board1;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.bit.ex.board1.BDto;

public interface IBDao {
	
	public ArrayList<BDto> listDao();
	public BDto ContentDao(String bId);
	public void deleteDao(int bId);
	
	public void modifyDao(@Param("bId") int bId,
			@Param("bName") String bName,
			@Param("bTitle") String bTitle,
			@Param("bContent") String bContent);
	
	public void updateDao(BDto bdto);
}
