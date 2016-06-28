package com.commander.shop.interfaces;

import java.util.ArrayList;
/**
 * Created by Ivan on 11.06.2016.
 */
public interface DepartmentInterface {
        String getName();

        //списки геттеров сотрудников и товаров
        ArrayList<EmployeeInterface> getEmployeeList();
        ArrayList<FoodInterface> getGoodsList();
}
