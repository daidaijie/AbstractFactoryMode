package com.net.first.factory;

import com.net.first.department.IDepartment;
import com.net.first.department.SqlserverDepartment;
import com.net.first.user.SqlserverUser;
import com.net.first.user.IUser;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class SqlserverFactory implements Factory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
