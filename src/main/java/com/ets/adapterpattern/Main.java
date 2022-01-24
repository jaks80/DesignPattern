/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ets.adapterpattern;

/**
 *
 * @author yusufakhond
 */
public class Main {

    static int count = 0;

    public static void main(String[] args) {
        if (count < 3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello World!");
    }
}
