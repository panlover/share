package com.deyang.share.controller;

import com.deyang.share.domain.User;
import com.deyang.share.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户注册时使用
 * User: Administrator
 * Date: 13-10-19
 * Time: 下午8:23
 */
@Controller
public class LoginController { 
	
	@Resource
	private UserService userService;
	
    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	} 

	@RequestMapping(value="/login",method=RequestMethod.GET)
    public ModelAndView showLoginPage(){
    	User user=new User();
    	ModelAndView model=new ModelAndView();
    	model.addObject("user", user);
    	model.setViewName("common/login");
    	return model;
    }
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView processLogin(@ModelAttribute User user,HttpServletRequest request){
        ModelAndView model=new ModelAndView();
        User u=userService.getUserByNameAndPassword(user.getUsername(),user.getPassword());
        if (u != null) {
            HttpSession session=request.getSession();
            session.setAttribute("loginUser",u);
            model.setViewName("redirect:/user/"+u.getUsername());
        }else {
            model.setViewName("redirect:/login");
        }
        return model;
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        HttpSession session=request.getSession();
        //session.setAttribute("user", null);
        session.invalidate();
        return "redirect:/";
    }
}
