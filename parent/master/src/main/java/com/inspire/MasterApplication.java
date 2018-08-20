package com.inspire;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class MasterApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(MasterApplication.class, args);
			log.info("Application：应用程序正常启动..."+new Date());
			log.info("路径："+System.getProperty("user.dir"));
		}catch(Exception e){
			if(StringUtils.isNotBlank(e.getMessage())){
				e.printStackTrace();
			}
		}
	}
}
