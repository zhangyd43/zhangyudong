package com.jk.controller;
import javax.xml.ws.RequestWrapper;



public class UserController {
    public String mamma() {
        return "nim";
    }



    String a="huahua";

    @RequestWrapper
    public String add(){
        return "hi who is you?";

    }
}
