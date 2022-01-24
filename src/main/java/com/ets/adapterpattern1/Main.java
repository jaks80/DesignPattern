package com.ets.adapterpattern1;

/**
 *
 * @author yusufakhond
 */
public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        
        if(roundHole.fits(roundPeg)){
            System.out.println("Round hole fits round peg");
        }
        
        SquarePeg smalPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
        
        SquarePegAdapter smallSqrPegAdapter = new SquarePegAdapter(smalPeg);//This is the point
        
        SquarePegAdapter largeSqrPegAdapter = new SquarePegAdapter(largePeg);
        
        if(roundHole.fits(smallSqrPegAdapter)){//2 different class works together
            System.out.println("Small quare peg fits in round hole");
        }
    }
}
