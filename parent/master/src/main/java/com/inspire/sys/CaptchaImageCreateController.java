package com.inspire.sys;

import com.inspire.utils.RandomValidateCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
@Slf4j
public class CaptchaImageCreateController {

    @RequestMapping("captcha.html")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setDateHeader("Expires", 0);
            // Set standard HTTP/1.1 no-cache headers.
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            // Set standard HTTP/1.0 no-cache header.
            response.setHeader("Pragma", "no-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            // return a jpeg
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            log.error("获取验证码失败>>>>   ", e);
        }
        return null;
    }

}