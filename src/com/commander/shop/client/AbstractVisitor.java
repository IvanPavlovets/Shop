package com.commander.shop.client;

import com.commander.shop.interfaces.FoodInterface;
import com.commander.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface{

    private String name;

    @Override
    public void buy(FoodInterface foods) {
        System.out.println(foods.getName());
    }

    @Override
    public void returnGoods(FoodInterface foods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
