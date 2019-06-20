package com.im.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.im.pojo.Invitation;
import com.im.service.InvitationService;

/**
 * @author 刘若晨
 * @category 控制器
 */
@Controller
public class InvitationController {
	@Resource
	private InvitationService invitationService;
	//进入主页控制器
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	//进入贴吧浏览页面
	@RequestMapping("/showlist")
	public String showlist(Model model){
		List<Invitation> list = invitationService.find();
		model.addAttribute("ins", list);
	    return "list";
		}
	//进入添加页面
	@RequestMapping("/toinsert")
	public String toInsert(){
		return "addinvitation";
	}
	
	@RequestMapping("/insert")
	public String insert(Invitation po){
		boolean flag = invitationService.insert(po);
		if(flag){
			return "redirect:showlist.action";//重定向
		}else{
			return "error";
		}
		
	}

	@RequestMapping("/delete")
	public String delete(int[] ids,Model model){
		
		boolean flag = invitationService.delete(ids);
		if(flag){
			return "redirect:showlist.action";//重定向
		}else{
			String mess="删除失败";
			model.addAttribute("mess",mess);
			return "error";
		}		
	}
	
	@RequestMapping("/toupdate")
	public String toup(int id,Model model){
		Invitation invitation= invitationService.findById(id);
		model.addAttribute("invitation", invitation);
		return "update";
	}
	@RequestMapping("/update")
	public String update(Invitation invitation,Model model ){
		System.out.println("=============="+invitation.getTitle()+"===============");
		boolean flag = invitationService.update(invitation);
		if(flag){
			return "redirect:showlist.action";//重定向
		}else{
			return "error";
		}
	}
	@RequestMapping("/search")
	public ModelAndView search(String title){
	    ModelAndView mv = new ModelAndView();
	    List<Invitation>list = invitationService.search(title);
	    mv.addObject("ins",list);
	    mv.setViewName("list");;
		return mv;
		
	}
}








