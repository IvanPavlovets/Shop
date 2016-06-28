package com.commander.shop;

import com.commander.shop.client.CommonVisitor;
import com.commander.shop.goods.Apricot;
import com.commander.shop.goods.Cherry;
import com.commander.shop.interfaces.FoodInterface;

public class Main {

    public static void main(String[] args) {
        FoodInterface apricot = new Apricot("Midle east");

        FoodInterface cherry = new Cherry("Eagle-Eye");
        FoodInterface cherry1 = new Cherry("Little");

        CommonVisitor visitor = new CommonVisitor();
        visitor.buy(cherry);
        visitor.buy(apricot);
        visitor.buy(cherry1);
        System.out.println("привет!da");
        System.out.println("sdf");
    }
}
