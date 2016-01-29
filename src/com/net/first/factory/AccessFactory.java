package com.net.first.factory;

import com.net.first.department.AccessDepartment;
import com.net.first.department.IDepartment;
import com.net.first.user.AccessUser;
import com.net.first.user.IUser;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class AccessFactory implements Factory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
