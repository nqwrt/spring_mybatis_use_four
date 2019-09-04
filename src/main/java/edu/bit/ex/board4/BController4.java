package edu.bit.ex.board4;

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
*
1.첫번째 방법과 같은 방식임. 대신 sqlSession.getMapper 함수를 사용하지 않음 
2.간단하고 심플함

3.root~.xml 에 
아래를 추가함
	<!-- 	Mapper Interface -->
	<mybatis-spring:scan base-package="edu.bit.mapper"/> 

*/

@Controller
public class BController4 {

	@Inject
	BService4 bservice;
	
	@RequestMapping("/list4")
	public String list(Model model) throws Exception{
		System.out.println("list4()");	
		
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
