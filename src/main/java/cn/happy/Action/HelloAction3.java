package cn.happy.Action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {
    public   String  execute(){
        System.out.println("进入了 HelloAction3  的execute()");
        return  "success";
    }
}
