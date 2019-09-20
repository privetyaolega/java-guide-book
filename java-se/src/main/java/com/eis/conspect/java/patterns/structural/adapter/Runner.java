package com.eis.conspect.java.patterns.structural.adapter;

import com.eis.conspect.java.patterns.structural.adapter.adapters.SquarePegAdapter;
import com.eis.conspect.java.patterns.structural.adapter.round.RoundHole;
import com.eis.conspect.java.patterns.structural.adapter.round.RoundPeg;
import com.eis.conspect.java.patterns.structural.adapter.square.SquarePeg;

/**
 * Где-то в клиентском коде...
 */
public class Runner {

    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.isPegFitToHole(rpeg)) {
            System.out.println("Round peg with radius = 5 fits round hole with radius = 5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.isPegFitToHole(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (!hole.isPegFitToHole(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

