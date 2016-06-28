package com.commander.shop.interfaces;

/**
 * Created by Ivan on 11.06.2016.
 */
public interface FoodInterface {

    int getExpirationDay();

    double getPrice();

    String getName();

    DepartmentInterface getDepartmentInterface();

    //метод порчи продуктов
    int decay(int day);

}
