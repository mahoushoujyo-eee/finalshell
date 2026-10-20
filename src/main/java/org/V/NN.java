/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NR;
import org.v.NV;
import org.v._w_0;

public final class NN
extends NV {
    public final NR l;
    public final String f;
    public final NV p;
    private static final long[] a;
    private static final Integer[] d;

    public NN(I i2, NR nR2, String string, NV nV2) {
        super(i2);
        this.l = nR2;
        this.f = string;
        this.p = nV2;
    }

    @Override
    public String toString() {
        return this.l.toString() + (char)NN.a(27770, 7030598922913227434L) + this.f + (char)NN.a(30192, 2204268455757396769L) + this.p.toString();
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.E(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6754376292825043918L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "2\u008c\u0014\u00e6\u00ea,\u00a8\u00cflkf&\u00c3T\u00b1D";
        int n11 = "2\u008c\u0014\u00e6\u00ea,\u00a8\u00cflkf&\u00c3T\u00b1D".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        d = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4ED1;
        if (d[n11] == null) {
            NN.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

