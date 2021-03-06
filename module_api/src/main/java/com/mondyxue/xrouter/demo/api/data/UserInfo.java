package com.mondyxue.xrouter.demo.api.data;

import java.io.Serializable;

/**
 * @author MondyXue <a href="mailto:mondyxue@gmail.com">E-Mail</a>
 */
public class UserInfo implements Serializable{

    private long userId;

    public long getUserId(){
        return userId;
    }
    public void setUserId(long userId){
        this.userId = userId;
    }

    @Override public String toString(){
        return "UserInfo{userId=" + getUserId() + "}";
    }

}
