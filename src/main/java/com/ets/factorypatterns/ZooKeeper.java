/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ets.factorypatterns;

/**
 *
 * @author yusufakhond
 */
public class ZooKeeper {

    public static void main(String[] args) {
        Food food = FoodFactory.getFood("polar bear");
        food.consumed();
    }

}
