package com.deyang.share.controller;

import com.deyang.share.model.User;
import com.deyang.share.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * To verify user information when registering and process register process.
 * User: yudeyang
 * Date: 14-1-22
 * Time: 上午9:02
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    /**
     * Show Register Page.
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView showRegisterPage(){
        ModelAndView  model=new ModelAndView();
        model.addObject("user",new User());
        model.setViewName("common/register");
        return model;
    }

    /**
     * Process the Register Form result.
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegister(@Valid User user,BindingResult result,HttpServletRequest request){
        if (result.hasErrors()) {
            return "/register";
        }
        HttpSession session=request.getSession();
        session.setAttribute("loginUser",user);
        return "redirect:/user/"+user.getUsername();
    }
}
