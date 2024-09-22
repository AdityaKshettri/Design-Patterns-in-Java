package com.aditya.project.structural.adapter;

import com.aditya.project.structural.adapter.adapter.SquarePegAdapter;
import com.aditya.project.structural.adapter.model.RoundHole;
import com.aditya.project.structural.adapter.model.RoundPeg;
import com.aditya.project.structural.adapter.model.SquarePeg;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);

        if (roundHole.fits(smallPegAdapter)) {
            System.out.println("Square peg l2 fits round hole r5");
        }
        if (!roundHole.fits(largePegAdapter)) {
            System.out.println("Square peg l20 doesn't fit into round hole r5");
        }
    }
}
