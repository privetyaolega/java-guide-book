package com.eis.conspect.java.patterns.structural.adapter.round;

/**
 * КруглоеОтверстие совместимо с КруглымиКолышками.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isPegFitToHole(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
