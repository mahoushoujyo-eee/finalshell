/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.NE;
import org.v.NN;
import org.v.NV;
import org.v.NY;
import org.v.R8;
import org.v.RG;
import org.v.h_2;
import org.v.nj_0;
import org.v.no_0;
import org.v.nu_0;

public final class RY
extends R8 {
    public final NV h;
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;

    public RY(NV nV2) throws b_0 {
        NV nV3;
        block22: {
            block23: {
                String[] stringArray = RG.C();
                super(nV2.Q());
                String[] stringArray2 = stringArray;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            nV3 = nV2;
                                                            if (stringArray2 == null) break block22;
                                                            if (nV3 instanceof NN) break block23;
                                                        }
                                                        catch (b_0 b_02) {
                                                            throw RY.a(b_02);
                                                        }
                                                        nV3 = nV2;
                                                        if (stringArray2 == null) break block22;
                                                    }
                                                    catch (b_0 b_03) {
                                                        throw RY.a(b_03);
                                                    }
                                                    if (nV3 instanceof nu_0) break block23;
                                                }
                                                catch (b_0 b_04) {
                                                    throw RY.a(b_04);
                                                }
                                                nV3 = nV2;
                                                if (stringArray2 == null) break block22;
                                            }
                                            catch (b_0 b_05) {
                                                throw RY.a(b_05);
                                            }
                                            if (nV3 instanceof no_0) break block23;
                                        }
                                        catch (b_0 b_06) {
                                            throw RY.a(b_06);
                                        }
                                        nV3 = nV2;
                                        if (stringArray2 == null) break block22;
                                    }
                                    catch (b_0 b_07) {
                                        throw RY.a(b_07);
                                    }
                                    if (nV3 instanceof NY) break block23;
                                }
                                catch (b_0 b_08) {
                                    throw RY.a(b_08);
                                }
                                nV3 = nV2;
                                if (stringArray2 == null) break block22;
                            }
                            catch (b_0 b_09) {
                                throw RY.a(b_09);
                            }
                            if (nV3 instanceof NE) break block23;
                        }
                        catch (b_0 b_010) {
                            throw RY.a(b_010);
                        }
                        nV3 = nV2;
                        if (stringArray2 == null) break block22;
                    }
                    catch (b_0 b_011) {
                        throw RY.a(b_011);
                    }
                    if (nV3 instanceof nj_0) break block23;
                }
                catch (b_0 b_012) {
                    throw RY.a(b_012);
                }
                String string = nV2.getClass().getName();
                string = string.substring(string.lastIndexOf(RY.a(16319, 4037023579765679244L)) + 1);
                this.M(string + d);
            }
            nV3 = this.h = nV2;
        }
        nV3.d(this);
    }

    public String toString() {
        return this.h.toString() + (char)RY.a(16395, 4719997911753874233L);
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.i(this);
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "2\u0010,\n\u0015\"72\u00183F\u0014:&vY>Y[,-2\u001c'Z\t(0a\u00100D[>7s\r:G\u001e#7<Y\u001aR\u000b?&a\n6E\u0015>ca\r>^\u001e &|\r,\n\u001680fY=O[\"-wY0L[,0a\u00108D\u0016(-f\ns\n\u0016(7z\u0016;\n\u0012#5}\u001a>^\u0012\"-aU\u007fE\tm,p\u0013:I\u000fm\"~\u00150I\u001a9*}\u0017,\u0004".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 11;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 25;
                            break;
                        }
                        case 1: {
                            n17 = 114;
                            break;
                        }
                        case 2: {
                            n17 = 84;
                            break;
                        }
                        case 3: {
                            n17 = 33;
                            break;
                        }
                        case 4: {
                            n17 = 112;
                            break;
                        }
                        case 5: {
                            n17 = 70;
                            break;
                        }
                        default: {
                            n17 = 72;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        d = new String(cArray).intern();
        long l2 = 4172126949120165849L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00a1 |J.\u0088\u009c\u00db\t\u00f5\u00c2\u00de}\u00ebc{";
        int n19 = "\u00a1 |J.\u0088\u009c\u00db\t\u00f5\u00c2\u00de}\u00ebc{".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        e = lArray;
        f = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1B32;
        if (f[n11] == null) {
            RY.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

