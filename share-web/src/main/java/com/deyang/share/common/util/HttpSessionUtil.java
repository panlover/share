package com.deyang.share.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class HttpSessionUtil {
	 
	public static Object getSessionAttributeValue(HttpServletRequest request,String attrName){
    	Object obj= null;
    	HttpSession session=request.getSession();
    	obj=session.getAttribute(attrName);
    	return obj;
    }
    
}
