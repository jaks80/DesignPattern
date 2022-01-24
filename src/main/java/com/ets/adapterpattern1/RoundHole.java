package com.ets.adapterpattern1;

/**
 *
 * @author yusufakhond
 */
public class RoundHole {

    private double radious;

    public RoundHole(double radious) {
        this.radious = radious;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.radious >= roundPeg.getRadious();
    }
}
