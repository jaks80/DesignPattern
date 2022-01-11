package com.ets.solid.S;

/**
 *
 * @author yusufakhond
 * Single Responsibility
 */
public class Book {
    private String name;
    private String author;
    private String text;
    
    //This method needs to be moved to BookPrinter class
    public void printTextToConsole(String text){
        System.out.println(text);
    }
}
