package com.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.VO;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@RequestMapping("list.do")
	public ModelAndView getList() {
		try {
			ModelAndView mv = new ModelAndView("list");
			List<VO> list = myService.getList();
			mv.addObject("list", list);
			return mv;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null ;
	}
	
	@RequestMapping("write.do")
	public ModelAndView getWrite() {
		return new ModelAndView("write");
	}
	
	@RequestMapping("write_ok.do")
	public ModelAndView getWrite_OK(VO vo) {
		try {
			myService.getInsert(vo);
			return new ModelAndView("redirect:list.do");
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
