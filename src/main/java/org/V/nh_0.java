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
 * Renamed from org.v.Nh
 */
public final class nh_0
extends NR {
    public final NV E;
    private static final long[] a;
    private static final Integer[] d;

    public nh_0(I i2, NV nV2) {
        super(i2);
        this.E = nV2;
    }

    @Override
    public String toString() {
        return (char)nh_0.a(22299, 4640775289137174373L) + this.E.toString() + (char)nh_0.a(25872, 2612603581908100463L);
    }

    @Override
    @c
    public Object W(_4 _42) throws Throwable {
        return _42.s(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6265627432741851673L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u001b\u00a8\u00dc6\u0099\u000e\u00f7_\u00be\u00d0\u00e3\u0085\u0090\u00eb\u00c5T";
        int n11 = "\u001b\u00a8\u00dc6\u0099\u000e\u00f7_\u00be\u00d0\u00e3\u0085\u0090\u00eb\u00c5T".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x407F;
        if (d[n11] == null) {
            nh_0.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

