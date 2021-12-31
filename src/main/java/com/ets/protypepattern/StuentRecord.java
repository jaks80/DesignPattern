package com.ets.protypepattern;

/**
 *
 * @author yusufakhond
 */
public class StuentRecord implements Prototype {

    private String surName;
    private String foreName;
    private int academicYear;

    public StuentRecord(String surName, String foreName, int academicYear) {
        this.surName = surName;
        this.foreName = foreName;
        this.academicYear = academicYear;
    }

    public void showRecord() {
        System.out.println("Name: " + foreName + " " + surName +"Academic Year: "+academicYear);
    }

    @Override
    public Prototype getClone() {
        return new StuentRecord(surName, foreName, academicYear);
    }
}
