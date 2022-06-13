package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestBookVo;

@Controller
public class GuestBookController {
	
	//addList
	@RequestMapping(value= "addList", method= {RequestMethod.GET, RequestMethod.POST})
	public String addList(Model model) {
		
		System.out.println("addList 진입");
		
		//리스트 만들기
		GuestBookDao guestbookDao = new GuestBookDao();
		List<GuestBookVo> guestbookList = guestbookDao.getGuestBookList();
		
		//ds통해서 attribute로 리스트 보내기
		model.addAttribute("guestbookList", guestbookList);
		
		
		return "/WEB-INF/views/addList.jsp";
	}
	
	//add
	@RequestMapping(value= "add", method= {RequestMethod.GET, RequestMethod.POST})
	public String add(GuestBookVo guestbookVo) {
		System.out.println("add 진입");
		
		//Dao로 넣기
		GuestBookDao guestbookDao = new GuestBookDao();
		guestbookDao.insert(guestbookVo);
		
		//리다이렉트
		return "redirect:/addList";
	}
	
	
	//deleteForm
	@RequestMapping(value= "deleteForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String deleteForm(Model model, @RequestParam("no")int no) {
		System.out.println("deleteForm 진입");
		
		//no 보내주기
		model.addAttribute(no);
		
		return "/WEB-INF/views/deleteForm.jsp";
	}
	
	
	//delete
	@RequestMapping(value= "delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(GuestBookVo guestbookVo) {
		System.out.println("delete 진입");
		
		//Dao로 삭제하기
		GuestBookDao guestbookDao = new GuestBookDao();
		guestbookDao.delete(guestbookVo);
		
		
		return "redirect:/addList";
	}
	
	
	

}



