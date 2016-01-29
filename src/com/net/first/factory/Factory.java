package com.net.first.factory;

import com.net.first.department.IDepartment;
import com.net.first.user.IUser;

/**
 * Created by daidaijie on 2016/1/29.
 */
public interface Factory {
    IUser createUser();

    IDepartment createDepartment();

}
