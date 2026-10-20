/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.zx_0;
import java.util.ArrayList;

class DV {
    byte[] Q;
    int r;
    int F;
    private static final long[] a;
    private static final Integer[] b;

    DV(byte[] byArray) throws zx_0 {
        this(byArray, 0, byArray.length);
    }

    DV(byte[] byArray, int n10, int n11) throws zx_0 {
        this.Q = byArray;
        this.r = n10;
        this.F = n11;
        if (n10 + n11 > byArray.length) {
            throw new zx_0();
        }
    }

    int O() {
        return this.Q[this.r] & DV.a(12224, 2723626974890989789L);
    }

    boolean s() {
        int n10;
        block4: {
            block5: {
                boolean bl = dm_2.F();
                try {
                    try {
                        n10 = this.O();
                        if (!bl) break block4;
                        if (n10 != DV.a(8678, 6714178906185012979L)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    n10 = 1;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    boolean b() {
        boolean bl;
        block4: {
            block5: {
                boolean bl2 = dm_2.J();
                try {
                    try {
                        bl = this.O();
                        if (bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    boolean N() {
        int n10;
        block4: {
            block5: {
                boolean bl = dm_2.J();
                try {
                    try {
                        n10 = this.O();
                        if (bl) break block4;
                        if (n10 != DV.a(3554, 5085158879246301942L)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    n10 = 1;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    boolean E() {
        boolean bl;
        block4: {
            block5: {
                boolean bl2 = dm_2.F();
                try {
                    try {
                        bl = this.O();
                        if (!bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    boolean n() {
        boolean bl;
        block4: {
            block5: {
                boolean bl2 = dm_2.J();
                try {
                    try {
                        bl = this.O();
                        if (bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    boolean M() {
        boolean bl;
        block4: {
            block5: {
                boolean bl2 = dm_2.F();
                try {
                    try {
                        bl = this.O();
                        if (!bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean l(int n10) {
        int n11;
        boolean bl;
        block13: {
            block14: {
                block12: {
                    bl = dm_2.J();
                    try {
                        try {
                            n11 = n10 & DV.a(438, 8600125400224249513L);
                            if (bl) break block12;
                            if (n11 != 0) throw new IllegalArgumentException();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw DV.a(illegalArgumentException);
                        }
                        n11 = n10 & DV.a(1985, 5365791785387208927L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (bl) break block13;
                        if (n11 == 0) break block14;
                        throw new IllegalArgumentException();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            n11 = this.O();
        }
        try {
            try {
                if (bl) return n11 != 0;
                if (n11 != ((n10 | DV.a(18491, 2794541937957175081L)) & DV.a(6019, 9141183010196430996L))) return 0 != 0;
                return 1 != 0;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw DV.a(illegalArgumentException);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw DV.a(illegalArgumentException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean U(int n10) {
        int n11;
        boolean bl;
        block13: {
            block14: {
                block12: {
                    bl = dm_2.J();
                    try {
                        try {
                            n11 = n10 & DV.a(30395, 9015111320856609185L);
                            if (bl) break block12;
                            if (n11 != 0) throw new IllegalArgumentException();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw DV.a(illegalArgumentException);
                        }
                        n11 = n10 & DV.a(7595, 5213582827411188413L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (bl) break block13;
                        if (n11 == 0) break block14;
                        throw new IllegalArgumentException();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw DV.a(illegalArgumentException);
                }
            }
            n11 = this.O();
        }
        try {
            try {
                if (bl) return n11 != 0;
                if (n11 != ((n10 | DV.a(27395, 2528241380214823954L)) & DV.a(12224, 2723626974890989789L))) return 0 != 0;
                return 1 != 0;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw DV.a(illegalArgumentException);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw DV.a(illegalArgumentException);
        }
    }

    private int J(int[] nArray) {
        int n10;
        block6: {
            int n11;
            block8: {
                int n12;
                block7: {
                    n12 = nArray[0];
                    boolean bl = dm_2.J();
                    n11 = this.Q[n12++] & DV.a(12224, 2723626974890989789L);
                    try {
                        n10 = n11 & DV.a(24214, 5923694986973145482L);
                        if (bl) break block6;
                        if (n10 == 0) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw DV.a(illegalArgumentException);
                    }
                    int n13 = n11 & DV.a(11085, 8708010207749446749L);
                    n11 = 0;
                    while (n13-- > 0) {
                        n11 = (n11 << DV.a(4510, 833681332703307405L)) + (this.Q[n12++] & DV.a(12224, 2723626974890989789L));
                        try {
                            if (!bl) {
                                if (!bl) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw DV.a(illegalArgumentException);
                        }
                    }
                }
                nArray[0] = n12;
            }
            n10 = n11;
        }
        return n10;
    }

    byte[] c() {
        int[] nArray = new int[]{this.r + 1};
        int n10 = this.J(nArray);
        int n11 = nArray[0];
        byte[] byArray = new byte[n10];
        System.arraycopy(this.Q, n11, byArray, 0, byArray.length);
        return byArray;
    }

    DV[] P() throws zx_0 {
        int n10;
        ArrayList<DV> arrayList;
        block8: {
            int n11;
            int n12;
            boolean bl;
            int[] nArray;
            block6: {
                block7: {
                    int n13 = this.Q[this.r];
                    nArray = new int[]{this.r + 1};
                    bl = dm_2.F();
                    n12 = this.J(nArray);
                    try {
                        try {
                            n11 = n13;
                            if (!bl) break block6;
                            if (n11 != 5) break block7;
                        }
                        catch (zx_0 zx_02) {
                            throw DV.a(zx_02);
                        }
                        return new DV[0];
                    }
                    catch (zx_0 zx_03) {
                        throw DV.a(zx_03);
                    }
                }
                n11 = nArray[0];
            }
            int n14 = n11;
            arrayList = new ArrayList<DV>();
            while (n12 > 0) {
                --n12;
                int n15 = ++n14;
                nArray[0] = n14;
                int n16 = this.J(nArray);
                n14 = nArray[0];
                n12 -= n14 - n15;
                arrayList.add(new DV(this.Q, n15 - 1, 1 + (n14 - n15) + n16));
                n14 += n16;
                n10 = n12 - n16;
                if (bl) {
                    n12 = n10;
                    if (bl) continue;
                }
                break block8;
            }
            n10 = arrayList.size();
        }
        DV[] dVArray = new DV[n10];
        arrayList.toArray(dVArray);
        return dVArray;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7412574990355210624L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "\u000e\u00e0s\u00adQ\u00fa\u008b}$B\u0011\u00aa&\u0089\u0001\u00ebV\u009cn\u00d3\u00cc\u00f7\u001bpB\u00af\u0016,v\u00857C\u00e2\u0096K\u00a9\u0002\u00cf^)\u00c8\u00d8\u000e@h\u00b6\u0087\u0005\u0097\u001c\b\u001b\u00bep\u00bd\u00a2{5\u008e\u00fa\u00fd4\u00fd2O\u00db\u00cco9\u00a7\u0091?\u00fe\u00c2;\u00c6\u00ac\u00c0\u00e8)p\u00ee\u0098V\u0083Z\u00c8\u008a";
                var5_4 = "\u000e\u00e0s\u00adQ\u00fa\u008b}$B\u0011\u00aa&\u0089\u0001\u00ebV\u009cn\u00d3\u00cc\u00f7\u001bpB\u00af\u0016,v\u00857C\u00e2\u0096K\u00a9\u0002\u00cf^)\u00c8\u00d8\u000e@h\u00b6\u0087\u0005\u0097\u001c\b\u001b\u00bep\u00bd\u00a2{5\u008e\u00fa\u00fd4\u00fd2O\u00db\u00cco9\u00a7\u0091?\u00fe\u00c2;\u00c6\u00ac\u00c0\u00e8)p\u00ee\u0098V\u0083Z\u00c8\u008a".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u0088z:[\u0080\u001d\u00b9\u00a2\u00ff\u00cb\u0089\u00b2\u00ae\u00ac\u001f!";
                    var5_4 = "\u0088z:[\u0080\u001d\u00b9\u00a2\u00ff\u00cb\u0089\u00b2\u00ae\u00ac\u001f!".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
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
        DV.a = var6_1;
        DV.b = new Integer[13];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3716;
        if (b[n11] == null) {
            DV.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

