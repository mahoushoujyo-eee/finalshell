/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.GO;
import com.KD;
import com.c.d_0;
import javax.swing.BorderFactory;

/*
 * Renamed from com.c.h
 */
class h_0
extends KD {
    final d_0 g;
    private static final long[] a;
    private static final Integer[] b;

    h_0(d_0 d_02) {
        block2: {
            KD kD;
            block3: {
                this.g = d_02;
                int[] nArray = d_0.W();
                this.setEnabled(d_0.y(this.g).isIconifiable());
                this.g(false);
                this.f(0);
                int[] nArray2 = nArray;
                this.s(GO.FT);
                this.x(2);
                this.setFocusable(false);
                kD = this;
                if (nArray2 != null) break block2;
                if (!kD.g.j()) break block3;
                this.X(false);
                this.u(true);
                this.W(false);
                this.z(true);
                if (nArray2 == null) break block2;
            }
            this.x(false);
            this.M(true);
            this.X(false);
            kD = this.u(true);
        }
        this.setBorder(BorderFactory.createEmptyBorder(4, h_0.a(27305, 7282880332333216569L), 4, h_0.a(8464, 8441280104003614849L)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2207822625219565160L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d4\u00c4\u007f>\u0089.%V\u0097i\u00a5\u00c7\u0007\u00fdn\u00ef";
        int n11 = "\u00d4\u00c4\u007f>\u0089.%V\u0097i\u00a5\u00c7\u0007\u00fdn\u00ef".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1990;
        if (b[n11] == null) {
            h_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

