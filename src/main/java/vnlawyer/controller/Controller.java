package vnlawyer.controller;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vnlawyer.constant.IConstant;
import vnlawyer.entities.Article;
import vnlawyer.entities.Clause;
import vnlawyer.entities.Point;
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value="/ask", method=RequestMethod.POST)
	public String getQuery(Model m, HttpServletRequest request) throws UnsupportedEncodingException{ 
		request.setCharacterEncoding("UTF-8");
		String result=IConstant.HOME_DIR;//request.getParameter("question");
		m.addAttribute("question", result);//request.getParameter("question"));
		
		return "answer";
	}
	
	
	
}
