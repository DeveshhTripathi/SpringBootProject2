package com.example.SpringProject_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepartmentBean departmentBean;

    public void displayInfo() {
        System.out.println("Employee belongs to " + departmentBean.getDepartmentName());
    }
}
