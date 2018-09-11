package com.inspire.vo.hy;


import com.inspire.hy.User;

public class TRegister extends User{

    private String scheckcode;//验证码

    public String getScheckcode() {
        return scheckcode;
    }

    public void setScheckcode(String scheckcode) {
        this.scheckcode = scheckcode;
    }
}
