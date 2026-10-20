/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nl_1;
import com.nv_2;
import com.wr_2;
import java.util.IdentityHashMap;

public abstract class H2
implements wr_2 {
    private static final ThreadLocal d;
    private static final ThreadLocal H;
    private static final Character c;
    private static final long[] a;
    private static final Integer[] b;

    final char y(nl_1 nl_12, Object object, char c2) {
        nl_1 nl_13 = (nl_1)d.get();
        d.set(nl_12);
        H.set(Character.valueOf(c2));
        this.Z(object);
        d.set(nl_13);
        return ((Character)H.get()).charValue();
    }

    protected final void P(String string, Object object) {
        nl_1 nl_12 = (nl_1)d.get();
        String string2 = nv_2.o();
        char c2 = ((Character)H.get()).charValue();
        char c3 = nl_12.S(object);
        nl_12.A(c2, string, object);
        char c4 = c3;
        if (string2 != null) {
            if (c4 == '\u0000') {
                IdentityHashMap identityHashMap = nl_12.Y;
                if (string2 != null && identityHashMap != null) {
                    identityHashMap = nl_12.Y.remove(object);
                }
            }
            c4 = c2;
        }
        if (c4 != H2.a(5396, 3179395681238325068L)) {
            H.set(c);
        }
    }

    public abstract void Z(Object var1);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1184427867990045711L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00b0\u0015\u00a4\\9\u0001\u00a3o\u001f7:\u00b1\u00f9-\u000e\u000e";
        int n11 = "\u00b0\u0015\u00a4\\9\u0001\u00a3o\u001f7:\u00b1\u00f9-\u000e\u000e".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        d = new ThreadLocal();
        H = new ThreadLocal();
        c = Character.valueOf((char)H2.a(14452, 2319432642836281901L));
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x258;
        if (b[n11] == null) {
            H2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

