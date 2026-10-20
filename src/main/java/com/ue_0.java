/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aj_0;
import com.nm_2;

/*
 * Renamed from com.ue
 */
final class ue_0
implements aj_0 {
    private int Z = 0;
    private static int[] z;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    ue_0() {
    }

    @Override
    public void A(byte[] byArray, int n10, int n11) {
        block2: {
            int n12 = ~this.Z;
            int[] nArray = nm_2.g();
            while (--n11 >= 0) {
                n12 = z[(n12 ^ byArray[n10++]) & ue_0.a(6062, 6719589629920745314L)] ^ n12 >>> ue_0.a(3191, 7134053857946897598L);
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block2;
            }
            this.Z = ~n12;
        }
    }

    @Override
    public void C() {
        this.Z = 0;
    }

    @Override
    public void I(long l2) {
        this.Z = (int)(l2 & ue_0.b(19106, 115993715303970424L));
    }

    @Override
    public long u() {
        return (long)this.Z & ue_0.b(31288, 3505931755486496483L);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static long j(long l2, long l3, long l4) {
        long l5;
        long[] lArray;
        int[] nArray;
        long[] lArray2;
        block13: {
            lArray2 = new long[ue_0.a(10829, 7117853909133175431L)];
            nArray = nm_2.g();
            lArray = new long[ue_0.a(32691, 984710200557207421L)];
            long l6 = l4;
            if (nArray == null) {
                if (l6 <= 0L) {
                    return l2;
                }
                lArray[0] = ue_0.b(8688, 222484501740625192L);
                l6 = 1L;
            }
            long l7 = l6;
            for (int i2 = 1; i2 < ue_0.a(32691, 984710200557207421L); l7 <<= 1, ++i2) {
                lArray[i2] = l7;
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block13;
            }
            ue_0.Y(lArray2, lArray);
        }
        ue_0.Y(lArray, lArray2);
        block1: while (true) {
            ue_0.Y(lArray2, lArray);
            boolean bl = true;
            do {
                block17: {
                    long l8;
                    block16: {
                        long l9;
                        block15: {
                            block14: {
                                if (!bl || (bl = false)) break block14;
                                if ((l4 & 1L) == 0L) break block15;
                                l5 = ue_0.X(lArray2, l2);
                            }
                            l2 = l5;
                        }
                        l8 = (l9 = (l4 >>= 1) - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1);
                        if (nArray != null) break block16;
                        if (l8 == false && nArray == null) break block17;
                        ue_0.Y(lArray, lArray2);
                        long l10 = (l4 & 1L) - 0L;
                        l8 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                    }
                    if (nArray == null) {
                        long l11;
                        if (l8 != false) {
                            l2 = ue_0.X(lArray, l2);
                        }
                        l8 = (l11 = (l4 >>= 1) - 0L) == 0L ? 0 : (l11 < 0L ? -1 : 1);
                    }
                    if (l8 != false) continue block1;
                }
                l5 = l2 ^= l3;
            } while (nArray != null);
            break;
        }
        return l5;
    }

    private static long X(long[] lArray, long l2) {
        long l3;
        block4: {
            long l4 = 0L;
            int n10 = 0;
            int[] nArray = nm_2.g();
            while (l2 != 0L) {
                l3 = l2 & 1L;
                if (nArray == null) {
                    long l5;
                    if (nArray == null) {
                        if (l3 != 0L) {
                            l4 ^= lArray[n10];
                        }
                        l5 = l2 >> 1;
                    }
                    l2 = l5;
                    ++n10;
                    if (nArray == null) continue;
                }
                break block4;
            }
            l3 = l4;
        }
        return l3;
    }

    static final void Y(long[] lArray, long[] lArray2) {
        int[] nArray = nm_2.g();
        for (int i2 = 0; i2 < ue_0.a(32691, 984710200557207421L); ++i2) {
            lArray[i2] = ue_0.X(lArray2, lArray2[i2]);
            if (nArray == null) continue;
        }
    }

    public ue_0 D() {
        ue_0 ue_02 = new ue_0();
        ue_02.Z = this.Z;
        return ue_02;
    }

    static int[] k() {
        int[] nArray = new int[z.length];
        System.arraycopy(z, 0, nArray, 0, nArray.length);
        return nArray;
    }

    @Override
    public aj_0 y() {
        return this.D();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                block13: {
                    block12: {
                        var8 = 7341830455983048418L;
                        var14_1 = new long[8];
                        var11_2 = 0;
                        var12_3 = "s4AV1m\u008aT\u00f9\u0015\u001b\u00d5\u001bZ\u00be2\u0015\u0001niJ\u00d0\u00b7\u0004ov\u0080#\u00b3\u0001\u00acEC\u00e5\u00c5r\u0005\u00e9\u00f1\u00b48\u00a5 \u00d25\u00d0\u0091\u007f";
                        var13_4 = "s4AV1m\u008aT\u00f9\u0015\u001b\u00d5\u001bZ\u00be2\u0015\u0001niJ\u00d0\u00b7\u0004ov\u0080#\u00b3\u0001\u00acEC\u00e5\u00c5r\u0005\u00e9\u00f1\u00b48\u00a5 \u00d25\u00d0\u0091\u007f".length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block12;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "ns\u0090R\u00d0\u0086\u0096c\u00db\u00a7\u00bf/d\u00e9\u00f9\u00bf";
                            var13_4 = "ns\u0090R\u00d0\u0086\u0096c\u00db\u00a7\u00bf/d\u00e9\u00f9\u00bf".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block12;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block13;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl38:
                        // 1 sources

                        ** continue;
                    }
                }
                ue_0.a = var14_1;
                ue_0.b = new Integer[8];
                var0_7 = 1186299178379457918L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0011\u00ea\u0083z\u00df\u0084<\u00f9 \u00d1\u0006\u008a\u0087\u00d2\fb\u0013`\u00f8\u00a8\u0017Z+v";
                var5_11 = "\u0011\u00ea\u0083z\u00df\u0084<\u00f9 \u00d1\u0006\u008a\u0087\u00d2\fb\u0013`\u00f8\u00a8\u0017Z+v".length();
                var2_12 = 0;
                while (true) {
                    break block14;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block15;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v5 = var3_9++;
            ** while (true)
        }
        ue_0.c = var6_8;
        ue_0.d = new Long[3];
        ue_0.z = null;
        ue_0.z = new int[ue_0.a(14616, 5077368662220421584L)];
        for (var16_14 = 0; var16_14 < ue_0.a(30363, 1219690253098055254L); ++var16_14) {
            var17_15 = var16_14;
            var18_16 = ue_0.a(12581, 3548653720626737646L);
            while (--var18_16 >= 0) {
                if ((var17_15 & 1) != 0) {
                    var17_15 = ue_0.a(4974, 1461477008570422177L) ^ var17_15 >>> 1;
                    continue;
                }
                var17_15 >>>= 1;
            }
            ue_0.z[var16_14] = var17_15;
        }
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC9;
        if (b[n11] == null) {
            ue_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3CDA) & Short.MAX_VALUE;
        if (d[n11] == null) {
            ue_0.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

