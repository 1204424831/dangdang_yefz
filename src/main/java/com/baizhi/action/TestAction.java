package com.baizhi.action;

import com.opensymphony.xwork2.Action;

public class TestAction {
    public String test1(){
        System.out.println("远程的修改");
    	return Action.SUCCESS;
    }
}
