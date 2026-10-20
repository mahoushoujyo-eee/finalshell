/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NR;
import org.v.NV;
import org.v._4;

/*
 * Renamed from org.v.Nf
 */
public final class nf_0
extends NR {
    public final NV d;
    public final NV J;
    private static final long[] a;
    private static final Integer[] f;

    public nf_0(I i2, NV nV2, NV nV3) {
        super(i2);
        this.d = nV2;
        this.J = nV3;
    }

    @Override
    public String toString() {
        return this.d.toString() + (char)nf_0.a(15693, 6280154084436749091L) + this.J + (char)nf_0.a(25470, 5299278668901578001L);
    }

    @Override
    @c
    public Object W(_4 _42) throws Throwable {
        return _42.e(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6365754352793795695L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "m\u00fd\n\u001f,\u0005I#F\u00bf\u00e2\u00c1\u00f49\u0097\u0017";
        int n11 = "m\u00fd\n\u001f,\u0005I#F\u00bf\u00e2\u00c1\u00f49\u0097\u0017".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        f = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x166F;
        if (f[n11] == null) {
            nf_0.f[n11] = (int)(a[n11] ^ l2);
        }
        return f[n11];
    }
}

