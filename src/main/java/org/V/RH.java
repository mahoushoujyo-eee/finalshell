/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NA;
import org.v.RK;
import org.v._e_0;
import org.v.nt_0;
import org.v.t_2;
import org.v.x_1;

public final class RH
extends RK {
    public final t_2 V;
    private static final long[] a;
    private static final Integer[] b;

    public RH(NA nA2, t_2 t_22) {
        super(nA2);
        this.V = t_22;
    }

    @Override
    public void d(x_1 x_12) {
        super.d(x_12);
        this.V.d(x_12);
    }

    public String toString() {
        return "@" + this.A + (char)RH.a(20265, 2471357946988888234L) + this.V + (char)RH.a(32714, 317761939285094472L);
    }

    @Override
    public nt_0 R() {
        return this.A;
    }

    @Override
    @c
    public Object q(_e_0 _e_02) throws Throwable {
        return _e_02.b(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3690759351751204122L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00ec\u0015\u008f\t\u000f\u0088]\u0098{i\u00b6M\u00aa\u00ae\u00ed{";
        int n11 = "\u00ec\u0015\u008f\t\u000f\u0088]\u0098{i\u00b6M\u00aa\u00ae\u00ed{".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F83;
        if (b[n11] == null) {
            RH.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

