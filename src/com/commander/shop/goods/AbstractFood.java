package com.commander.shop.goods;

import com.commander.shop.department.AbstractDepartment;
import com.commander.shop.interfaces.DepartmentInterface;
import com.commander.shop.interfaces.FoodInterface;

public abstract class AbstractFood implements FoodInterface{
    private double price;
    private int expirationDay;
    private String name;
    private AbstractDepartment department;


    //конструкторы:
    public AbstractFood() {
    }

    public AbstractFood(String name) {
        this.name = name;
    }


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartmentInterface() {
        return null;
    }

    public void setDepartment(AbstractDepartment department) {
        this.department = department;
    }

    //метод порчи продуктов
    @Override
    public int decay(int day){ //отнимаем от срока годности количество дней
        return (this.getExpirationDay()-day);
    }
}
