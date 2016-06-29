package com.commander.shop.interfaces;

/**
 * Created by Ivan on 11.06.2016.
 */
public interface EmployeeInterface {

    String getName();

    int getExp();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    boolean isFree();

    void getInfo();
}
