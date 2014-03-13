package com.dit.test.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dit.test.service.DarkTestService;
import com.dit.util.lang.StringUtil;


@Controller
public class DarkTestController {
	
	@Autowired
	private DarkTestService darkTestService;
	
	@RequestMapping("/test1.do")
	public ModelAndView test1(){
		
		System.out.println("===================");           
		System.out.println("===================" + StringUtil.isEmpty("test"));
		Map rslt = darkTestService.getTest();
		System.out.println("rslt======"+rslt);
		ModelAndView view = new ModelAndView("/test/test");
		return view;
		
	}
	
	@RequestMapping("/test2.do")
	public ModelAndView test2(){
		
		System.out.println("===================");
		List rslt = darkTestService.getListTest();
		System.out.println("rslt======"+rslt);
		ModelAndView view = new ModelAndView("/test/test2");
		view.addObject("rslt", rslt);
		return view;
		
	}
	
}
