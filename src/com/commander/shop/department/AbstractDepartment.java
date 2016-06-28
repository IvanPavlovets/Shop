package com.commander.shop.department;

import com.commander.shop.interfaces.DepartmentInterface;
import com.commander.shop.interfaces.EmployeeInterface;
import com.commander.shop.interfaces.FoodInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface{
    private String name;
    //списки сотрудников и продуктов в департменте
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<FoodInterface> foodList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<FoodInterface> getGoodsList() {
        return foodList;
    }

    public void setFoodList(ArrayList<FoodInterface> foodList) {
        this.foodList = foodList;
    }
}
