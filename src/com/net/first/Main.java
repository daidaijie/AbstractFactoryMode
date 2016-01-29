package com.net.first;


import com.net.first.department.Department;
import com.net.first.department.IDepartment;
import com.net.first.factory.AccessFactory;
import com.net.first.factory.Factory;
import com.net.first.user.IUser;
import com.net.first.user.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User();
        Department department = new Department();

        Factory factory = new AccessFactory();

        IUser iu  = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(department);
        id.getDepartment(1);

    }
}
