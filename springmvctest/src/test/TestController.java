package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("��Ʈ�ѷ� ��û �Ϸ�");
		ModelAndView mav = new ModelAndView();
		String data="";
		for(int i =1; i<=9;i++) {
			data=data+(9+"*"+i+"="+(9*i))+"<br/>";
		}
		mav.addObject("msg",data);
		
		
		mav.setViewName("/WEB-INF/test/result.jsp");
		return mav;
	}

}
