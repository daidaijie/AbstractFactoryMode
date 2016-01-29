package com.net.first.department;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class AccessDepartment implements IDepartment {


    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中给Department表查找一条记录");
        return null;
    }
}
