package com.deyang.share.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SysSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
        System.out.println("SysSessionListener.sessionCreated");
    }

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        System.out.println("SysSessionListener.sessionDestroyed");
    }

}
