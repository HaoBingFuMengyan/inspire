package com.inspire;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MasterApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(MasterApplication.class, args);
			System.out.println("Application：应用程序正常启动..."+new Date());
		}catch(Exception e){
			if(StringUtils.isNotBlank(e.getMessage())){
				e.printStackTrace();
			}
		}
	}
}
