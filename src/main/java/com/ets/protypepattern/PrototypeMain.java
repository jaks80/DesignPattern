package com.ets.protypepattern;

/**
 *
 * @author yusufakhond
 */
public class PrototypeMain {
    public static void main(String[] args) {
        StuentRecord student1 = new StuentRecord("Akhond", "Yusuf", 3);
        student1.showRecord();
        
        StuentRecord student2 = (StuentRecord) student1.getClone();
        student2.showRecord();
    }
}
