package edu.bit.ex.board3;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.ExternalResources;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.board1.IBDao;


/*
 
1.인터페이스 위에 @을 붙이는 형식임 
2.XML이 필요없음, sqlSession개체 필요없음
3.root~.xml 에 
아래의 한줄을 추가
	<!-- 	Mapper Interface -->
	<mybatis-spring:scan base-package="edu.bit.mapper"/> 
4.쿼리가 길어지면 사용하기 힘듬
* 
* */

@Controller
public class BController3 {

	@Inject
	BService3 bservice;
	
	@RequestMapping("/list3")
	public String list(Model model) throws Exception{
		System.out.println("list3()");	
		
		model.addAttribute("list", bservice.selectBoardList());			
		return "list";		
	}
	
	/*
	 * @RequestMapping("/write_view") public String write_view(Model model) {
	 * System.out.println("write_view()");
	 * 
	 * return "write_view"; }
	 * 
	 * @RequestMapping("/content_view") public String
	 * content_view(HttpServletRequest request, Model model){
	 * System.out.println("content_view()");
	 * 
	 * String bid = request.getParameter("bId");
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class);
	 * model.addAttribute("content_view", dao.ContentDao(bid));
	 * 
	 * 
	 * return "content_view"; }
	 * 
	 * @RequestMapping("/delete") public String delete(HttpServletRequest request,
	 * Model model){ System.out.println("delete()");
	 * 
	 * String bId = request.getParameter("bId");
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class);
	 * 
	 * int num = Integer.parseInt(bId);
	 * 
	 * dao.deleteDao(num);
	 * 
	 * 
	 * return "redirect:list"; }
	 * 
	 * @RequestMapping(value="/modify", method=RequestMethod.POST ) public String
	 * modify(BDto bDto, Model model){ System.out.println("modify()");
	 * 
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class); dao.updateDao(bDto);
	 * 
	 * return "redirect:list"; }
	 */
}
