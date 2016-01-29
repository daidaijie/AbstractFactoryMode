package com.net.first.user;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class AccessUser implements IUser {


    @Override
    public void insert(User user) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中给Department表查找一条记录");
        return null;
    }
}
