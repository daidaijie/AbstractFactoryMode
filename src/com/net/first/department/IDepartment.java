package com.net.first.department;

/**
 * Created by daidaijie on 2016/1/29.
 * 用于客户端访问，解除和具体数据库访问的耦合
 */


public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}
