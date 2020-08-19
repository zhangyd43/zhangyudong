package com.jk.controller;


import javax.xml.ws.RequestWrapper;

public class UserController {
    String a="huahua";

    @RequestWrapper
    public String add(){
        return "hi who is you?";
    }
}
