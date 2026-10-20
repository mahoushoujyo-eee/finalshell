/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.GO;
import com.KD;
import com.c.d_0;
import javax.swing.BorderFactory;

/*
 * Renamed from com.c.w
 */
class w_1
extends KD {
    final d_0 Z;
    private static final long[] a;
    private static final Integer[] b;

    w_1(d_0 d_02) {
        block2: {
            KD kD;
            block3: {
                this.Z = d_02;
                this.setEnabled(d_0.s(this.Z).isClosable());
                this.g(false);
                this.f(0);
                this.s(GO.FT);
                int[] nArray = d_0.W();
                this.x(2);
                int[] nArray2 = nArray;
                this.setFocusable(false);
                kD = this;
                if (nArray2 != null) break block2;
                if (!kD.Z.j()) break block3;
                this.x(false);
                this.M(false);
                this.l(false);
                this.Z(true);
                if (nArray2 == null) break block2;
            }
            this.x(false);
            kD = this.M(false);
        }
        this.setBorder(BorderFactory.createEmptyBorder(4, w_1.a(16078, 495565053790828178L), 4, w_1.a(13343, 2628641478758349890L)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8165982302118528202L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "Rs\u00cd\u0099\u0018\u00d9x\u008f\u00e4C\u00d9\u00e8\u0005\u00aar^";
        int n11 = "Rs\u00cd\u0099\u0018\u00d9x\u008f\u00e4C\u00d9\u00e8\u0005\u00aar^".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x85D;
        if (b[n11] == null) {
            w_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

