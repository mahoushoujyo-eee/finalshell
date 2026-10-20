/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.util.ArrayList;
import javax.swing.text.Segment;

public final class WP {
    private ArrayList O = new ArrayList(2);
    private static WP L = new WP();

    private WP() {
    }

    public static Segment x() {
        int n10 = WP.L.O.size();
        if (n10 > 0) {
            return (Segment)WP.L.O.remove(n10 - 1);
        }
        return new Segment();
    }

    public static void D(Segment segment) {
        segment.array = null;
        segment.count = 0;
        WP.L.O.add(segment);
    }
}

