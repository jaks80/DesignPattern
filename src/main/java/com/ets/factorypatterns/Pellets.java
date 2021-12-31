/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ets.factorypatterns;

/**
 *
 * @author yusufakhond
 */
public class Pellets extends Food{

     public Pellets(int quantity) {
        super(quantity);
    }
     
    @Override
    public void consumed() {
        System.out.println("Pellets eaten: "+getQuantity());
    }
    
}
