package com.ets.adapterpattern1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yusufakhond
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadious() {

        String[] array = {"abc", "2", "10", "0"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));

        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
