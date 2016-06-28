package com.commander.shop.client;

import com.commander.shop.interfaces.FoodInterface;

public class VipVisitor extends AbstractVisitor {
    private float discount;

    private boolean checkDiscount(){
        return discount>0;//если больше 0 то возвращаеться true
    }

    @Override
    public void buy(FoodInterface foods) {
        if (!checkDiscount()) {
            super.buy(foods);
        }else{
            System.out.println("купить со скидкой");
        }
    }
}
