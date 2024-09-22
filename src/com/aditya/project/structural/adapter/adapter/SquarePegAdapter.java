package com.aditya.project.structural.adapter.adapter;

import com.aditya.project.structural.adapter.model.RoundPeg;
import com.aditya.project.structural.adapter.model.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * Formula : diagonal of square = 2 * radius of circle
     *
     * @return radius of biggest circle possible with given square
     */
    @Override
    public double getRadius() {
        return Math.sqrt(2) * peg.getLength() / 2;
    }
}
