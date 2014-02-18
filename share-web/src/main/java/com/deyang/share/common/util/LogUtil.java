package com.deyang.share.common.util;

import org.apache.commons.logging.Log;

/**
 * 日志记录工具类（可以根据不同错误级别来记录）
 * @author Administrator
 *
 */
public class LogUtil {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void traceLog(Log log,Object message){
		if(log.isTraceEnabled()){
			log.trace(message);
		}
	}
	
	public static void debugLog(Log log,Object message){
		if(log.isDebugEnabled()){
			log.debug(message);
		}
	}
	
	public static void infoLog(Log log,Object message){
		if(log.isInfoEnabled()){
			log.info(message);
		}
	}

	public static void warnLog(Log log,Object message){
		if(log.isWarnEnabled()){
			log.warn(message);
		}
	}
	
	public static void errorLog(Log log,Object message){
		if(log.isErrorEnabled()){
			log.error(message);
		}
	}
	
	public static void fatalLog(Log log,Object message){
		if(log.isFatalEnabled()){
			log.fatal(message);
		}
	}
}
