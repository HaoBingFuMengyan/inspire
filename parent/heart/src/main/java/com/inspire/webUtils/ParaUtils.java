package com.inspire.webUtils;

import com.inspire.exception.E;
import com.inspire.exception.ServiceException;
import com.inspire.service.IParameterService;
import com.inspire.spring.SpringContextHolder;
import com.inspire.utils.DateUtils;
import com.inspire.utils.T;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ParaUtils {
	private static IParameterService s;
	private static Object o=new Object();
	private static Map<String,Object> sysMap=new HashMap<String, Object>();
	private static Map<String,String[]> cardMap=new HashMap<String, String[]>();
	


	
	public static String seqno(String name) throws ServiceException{
		init();
		String rs=s.genarateSeqNo(name);
		return rs;
	}
	
	public static Date getServerTime() {
		init();
		return s.getServerTime();
	}
	
	private static void init(){
		if(s==null){
			synchronized (o) {
				if(s==null)
					s= SpringContextHolder.getBean(IParameterService.class);
				if(s==null)
					E.S("IParameterService的实现类找不到!");
			}
			
		}
	}
	
	private static String nowkey(String key){
		return T.snow("yyyyMMddHHmmss")+"_"+key;
	}
	
	private static String oldkey(String key){
		return DateUtils.dateToString(DateUtils.addDays(T.now(), -1),"yyyyMMddHHmmss")+"_"+key;
	}
	
	public static void clearcache(){
		synchronized (o) {
			sysMap.clear();
		}
	}
}
