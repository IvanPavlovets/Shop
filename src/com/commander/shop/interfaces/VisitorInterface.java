package com.commander.shop.interfaces;

/**
 * Created by Ivan on 11.06.2016.
 */
public interface VisitorInterface {

    void buy(FoodInterface foods);

    void returnGoods(FoodInterface foods);

    String getName();
}
