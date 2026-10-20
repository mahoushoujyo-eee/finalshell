/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.GO;
import com.KD;
import com.c.d_0;
import javax.swing.BorderFactory;

/*
 * Renamed from com.c.C
 */
class c_1
extends KD {
    final d_0 C;
    private static final long[] a;
    private static final Integer[] b;

    c_1(d_0 d_02) {
        this.C = d_02;
        this.setEnabled(d_0.q(this.C).isMaximizable());
        this.g(false);
        this.f(0);
        this.s(GO.FT);
        this.x(2);
        this.setFocusable(false);
        this.x(false);
        this.M(false);
        this.X(false);
        this.u(true);
        this.setBorder(BorderFactory.createEmptyBorder(4, c_1.a(23830, 2845175167295073075L), 4, c_1.a(4493, 6951830970801612713L)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7725896080460784375L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a4*\u00e4\u00e6\u00b5\u0010\t\u00c2\u00b8\u009c\u009fM\u00b6B\u00c5X";
        int n11 = "\u00a4*\u00e4\u00e6\u00b5\u0010\t\u00c2\u00b8\u009c\u009fM\u00b6B\u00c5X".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7625;
        if (b[n11] == null) {
            c_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

