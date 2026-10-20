/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.GN;
import com.Y;
import com.dm_2;
import com.pc_0;
import com.xe_0;

public class DQ {
    private static final byte[][] g;
    protected String f;
    protected String Y;
    protected int h;
    protected byte[] v;
    protected String U;
    private static final String[] a;
    private static final String[] b;
    private static final long[] e;
    private static final Integer[] i;

    public DQ(String string, byte[] byArray) throws pc_0 {
        this(string, 0, byArray);
    }

    public DQ(String string, int n10, byte[] byArray) throws pc_0 {
        this(string, n10, byArray, null);
    }

    public DQ(String string, int n10, byte[] byArray, String string2) throws pc_0 {
        this("", string, n10, byArray, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DQ(String string, String string2, int n10, byte[] byArray, String string3) throws pc_0 {
        block68: {
            block64: {
                DQ dQ;
                block65: {
                    int n11;
                    byte by;
                    boolean bl;
                    block79: {
                        block77: {
                            block75: {
                                block73: {
                                    block71: {
                                        block69: {
                                            block66: {
                                                boolean bl2 = dm_2.J();
                                                this.f = string;
                                                bl = bl2;
                                                try {
                                                    block67: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        dQ = this;
                                                                        if (bl) break block64;
                                                                        dQ.Y = string2;
                                                                        if (n10 != 0) break block65;
                                                                    }
                                                                    catch (pc_0 pc_02) {
                                                                        throw DQ.a(pc_02);
                                                                    }
                                                                    by = byArray[DQ.a(1442, 2008269334481741623L)];
                                                                    n11 = DQ.a(30550, 6904243569250096587L);
                                                                    if (bl) break block66;
                                                                }
                                                                catch (pc_0 pc_03) {
                                                                    throw DQ.a(pc_03);
                                                                }
                                                                if (by != n11) break block67;
                                                            }
                                                            catch (pc_0 pc_04) {
                                                                throw DQ.a(pc_04);
                                                            }
                                                            this.h = 1;
                                                            if (!bl) break block68;
                                                        }
                                                        catch (pc_0 pc_05) {
                                                            throw DQ.a(pc_05);
                                                        }
                                                    }
                                                    by = byArray[DQ.a(10901, 7804555461999134741L)];
                                                    n11 = DQ.a(1108, 5251181019159045836L);
                                                }
                                                catch (pc_0 pc_06) {
                                                    throw DQ.a(pc_06);
                                                }
                                            }
                                            try {
                                                block70: {
                                                    try {
                                                        try {
                                                            if (bl) break block69;
                                                            if (by != n11) break block70;
                                                        }
                                                        catch (pc_0 pc_07) {
                                                            throw DQ.a(pc_07);
                                                        }
                                                        this.h = DQ.a(23575, 3781714820315807363L);
                                                        if (!bl) break block68;
                                                    }
                                                    catch (pc_0 pc_08) {
                                                        throw DQ.a(pc_08);
                                                    }
                                                }
                                                by = byArray[DQ.a(10901, 7804555461999134741L)];
                                                n11 = DQ.a(24644, 2707396131081667269L);
                                            }
                                            catch (pc_0 pc_09) {
                                                throw DQ.a(pc_09);
                                            }
                                        }
                                        try {
                                            block72: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (bl) break block71;
                                                                if (by != n11) break block72;
                                                            }
                                                            catch (pc_0 pc_010) {
                                                                throw DQ.a(pc_010);
                                                            }
                                                            by = byArray[DQ.a(9680, 3918355996874671956L)];
                                                            n11 = DQ.a(11928, 461802674278829066L);
                                                            if (bl) break block71;
                                                        }
                                                        catch (pc_0 pc_011) {
                                                            throw DQ.a(pc_011);
                                                        }
                                                        if (by != n11) break block72;
                                                    }
                                                    catch (pc_0 pc_012) {
                                                        throw DQ.a(pc_012);
                                                    }
                                                    this.h = DQ.a(9708, 6325326380741461857L);
                                                    if (!bl) break block68;
                                                }
                                                catch (pc_0 pc_013) {
                                                    throw DQ.a(pc_013);
                                                }
                                            }
                                            by = byArray[DQ.a(10901, 7804555461999134741L)];
                                            n11 = DQ.a(18507, 2919593415484336846L);
                                        }
                                        catch (pc_0 pc_014) {
                                            throw DQ.a(pc_014);
                                        }
                                    }
                                    try {
                                        block74: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (bl) break block73;
                                                            if (by != n11) break block74;
                                                        }
                                                        catch (pc_0 pc_015) {
                                                            throw DQ.a(pc_015);
                                                        }
                                                        by = byArray[DQ.a(5778, 7506249650081051656L)];
                                                        n11 = DQ.a(8840, 2762093213379690506L);
                                                        if (bl) break block73;
                                                    }
                                                    catch (pc_0 pc_016) {
                                                        throw DQ.a(pc_016);
                                                    }
                                                    if (by != n11) break block74;
                                                }
                                                catch (pc_0 pc_017) {
                                                    throw DQ.a(pc_017);
                                                }
                                                this.h = DQ.a(30256, 2925202608942732457L);
                                                if (!bl) break block68;
                                            }
                                            catch (pc_0 pc_018) {
                                                throw DQ.a(pc_018);
                                            }
                                        }
                                        by = byArray[DQ.a(10901, 7804555461999134741L)];
                                        n11 = DQ.a(24102, 3839684704532561079L);
                                    }
                                    catch (pc_0 pc_019) {
                                        throw DQ.a(pc_019);
                                    }
                                }
                                try {
                                    block76: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (bl) break block75;
                                                        if (by != n11) break block76;
                                                    }
                                                    catch (pc_0 pc_020) {
                                                        throw DQ.a(pc_020);
                                                    }
                                                    by = byArray[DQ.a(26417, 1919007467341661614L)];
                                                    n11 = DQ.a(3511, 7340168163495259945L);
                                                    if (bl) break block75;
                                                }
                                                catch (pc_0 pc_021) {
                                                    throw DQ.a(pc_021);
                                                }
                                                if (by != n11) break block76;
                                            }
                                            catch (pc_0 pc_022) {
                                                throw DQ.a(pc_022);
                                            }
                                            this.h = DQ.a(5154, 8099864774327547582L);
                                            if (!bl) break block68;
                                        }
                                        catch (pc_0 pc_023) {
                                            throw DQ.a(pc_023);
                                        }
                                    }
                                    by = byArray[DQ.a(10901, 7804555461999134741L)];
                                    n11 = DQ.a(3661, 5635713706786991306L);
                                }
                                catch (pc_0 pc_024) {
                                    throw DQ.a(pc_024);
                                }
                            }
                            try {
                                block78: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (bl) break block77;
                                                    if (by != n11) break block78;
                                                }
                                                catch (pc_0 pc_025) {
                                                    throw DQ.a(pc_025);
                                                }
                                                by = byArray[DQ.a(30300, 8678656782350963911L)];
                                                n11 = DQ.a(24206, 8984947641618693133L);
                                                if (bl) break block77;
                                            }
                                            catch (pc_0 pc_026) {
                                                throw DQ.a(pc_026);
                                            }
                                            if (by != n11) break block78;
                                        }
                                        catch (pc_0 pc_027) {
                                            throw DQ.a(pc_027);
                                        }
                                        this.h = DQ.a(29906, 227132057531930206L);
                                        if (!bl) break block68;
                                    }
                                    catch (pc_0 pc_028) {
                                        throw DQ.a(pc_028);
                                    }
                                }
                                by = byArray[DQ.a(10901, 7804555461999134741L)];
                                n11 = DQ.a(3661, 5635713706786991306L);
                            }
                            catch (pc_0 pc_029) {
                                throw DQ.a(pc_029);
                            }
                        }
                        try {
                            try {
                                if (bl) break block79;
                                if (by != n11) throw new pc_0(DQ.a(-26701, -12494));
                            }
                            catch (pc_0 pc_030) {
                                throw DQ.a(pc_030);
                            }
                            by = byArray[DQ.a(30300, 8678656782350963911L)];
                            n11 = DQ.a(2805, 3117040135571810402L);
                        }
                        catch (pc_0 pc_031) {
                            throw DQ.a(pc_031);
                        }
                    }
                    try {
                        try {
                            if (by != n11) throw new pc_0(DQ.a(-26701, -12494));
                            this.h = DQ.a(32030, 563467607327170456L);
                            if (!bl) break block68;
                            throw new pc_0(DQ.a(-26701, -12494));
                        }
                        catch (pc_0 pc_032) {
                            throw DQ.a(pc_032);
                        }
                    }
                    catch (pc_0 pc_033) {
                        throw DQ.a(pc_033);
                    }
                }
                dQ = this;
            }
            dQ.h = n10;
        }
        this.v = byArray;
        this.U = string3;
    }

    public String c() {
        return this.Y;
    }

    public String J() {
        block9: {
            block3: {
                int n10;
                int n11;
                block8: {
                    boolean bl;
                    block7: {
                        block6: {
                            block5: {
                                block4: {
                                    block2: {
                                        bl = dm_2.J();
                                        n11 = this.h;
                                        n10 = 1;
                                        if (bl) break block2;
                                        if (n11 == n10) break block3;
                                        n11 = this.h;
                                        n10 = 2;
                                    }
                                    if (bl) break block4;
                                    if (n11 == n10) break block3;
                                    n11 = this.h;
                                    n10 = DQ.a(9708, 6325326380741461857L);
                                }
                                if (bl) break block5;
                                if (n11 == n10) break block3;
                                n11 = this.h;
                                n10 = DQ.a(30256, 2925202608942732457L);
                            }
                            if (bl) break block6;
                            if (n11 == n10) break block3;
                            n11 = this.h;
                            n10 = 3;
                        }
                        if (bl) break block7;
                        if (n11 == n10) break block3;
                        n11 = this.h;
                        n10 = 4;
                    }
                    if (bl) break block8;
                    if (n11 == n10) break block3;
                    n11 = this.h;
                    n10 = 5;
                }
                if (n11 != n10) break block9;
            }
            return E8.B(g[this.h - 1]);
        }
        return DQ.a(-26698, 26046);
    }

    protected static int v(String string) {
        int n10;
        block3: {
            boolean bl = dm_2.F();
            for (int i2 = 0; i2 < g.length; ++i2) {
                n10 = E8.B(g[i2]).equals(string) ? 1 : 0;
                if (bl) {
                    int n11;
                    if (bl) {
                        if (n10 == 0) continue;
                        n11 = i2 + 1;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    public String C() {
        return E8.B(E8.V(this.v, 0, this.v.length, true));
    }

    public String A(xe_0 xe_02) {
        Y y2;
        block7: {
            y2 = null;
            boolean bl = dm_2.F();
            try {
                String string = xe_0.r(DQ.a(-26704, -16425)).toLowerCase();
                Class<Y> clazz = Class.forName(xe_0.r(string)).asSubclass(Y.class);
                y2 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            catch (Exception exception) {
                int n10;
                GN gN2;
                block6: {
                    try {
                        try {
                            gN2 = xe_02.p();
                            n10 = 3;
                            if (!bl) break block6;
                            if (!gN2.K(n10)) break block7;
                        }
                        catch (Exception exception2) {
                            throw DQ.a(exception2);
                        }
                        gN2 = xe_02.p();
                        n10 = 3;
                    }
                    catch (Exception exception3) {
                        throw DQ.a(exception3);
                    }
                }
                gN2.c(n10, DQ.a(-26702, -9584) + exception.getMessage(), exception);
            }
        }
        return E8.s(y2, this.v, false, true);
    }

    public String y() {
        return this.U;
    }

    public String T() {
        return this.f;
    }

    boolean p(String string) {
        return this.l(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(String string) {
        int n10 = 0;
        String string2 = this.Y;
        int n11 = string2.length();
        int n12 = string.length();
        boolean bl = dm_2.J();
        do {
            int n13;
            int n14;
            int n15;
            if (n10 >= n11) return 0 != 0;
            int n16 = n15 = string2.indexOf(DQ.a(20730, 1343142608657707625L), n10);
            if (bl) return n16 != 0;
            int n17 = -1;
            if (!bl) {
                if (n16 == n17) {
                    int n18 = n12;
                    if (bl) return n18 != 0;
                    if (n18 != n11 - n10) {
                        return false;
                    }
                    n18 = string2.regionMatches(true, n10, string, 0, n12) ? 1 : 0;
                    return n18 != 0;
                }
                n14 = n12;
                n17 = n15 - n10;
            }
            if (!bl) {
                if (n14 == n17) {
                    n13 = string2.regionMatches(true, n10, string, 0, n12) ? 1 : 0;
                    if (bl) continue;
                    if (n13 != 0) {
                        return true;
                    }
                }
                n14 = n15;
                n17 = 1;
            }
            n13 = n10 = n14 + n17;
        } while (!bl);
        return 0 != 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "\u00fb\u0005\u009c\u00d0b\u0080\u0098\u00d6\u0082\u00c3<\u001a\u00ccy\u008f\u00afw\u00b2\u00d4\t3n]\u00f1\u00d3xm\u00f5\u00ca\u0007\rf\u009a\u00f0<O0\u0007\u00a47n#\u00d8\u001e\u0019\u0007\u0003U[\u0096\u0012\u00833\u000f\u00aeZ{d\u00d1\u00dfi\u0093\u00d7n\u00c6^\u00e9\u0013>\u0010\u00d7T\u0086D|\u0006\u00e0\u0082r_=z/\u00f8I\u00c1\u0010\u00ab\u00dc\u00c4\u0018sI\u00a7\u00c9\u00e0\u00ee^\u00963\b\u00d96\u000bT\u0005\u00b1\u009cN\u00d5\u00d8A\u00b7\u00c4P";
                        var12_3 = "\u00fb\u0005\u009c\u00d0b\u0080\u0098\u00d6\u0082\u00c3<\u001a\u00ccy\u008f\u00afw\u00b2\u00d4\t3n]\u00f1\u00d3xm\u00f5\u00ca\u0007\rf\u009a\u00f0<O0\u0007\u00a47n#\u00d8\u001e\u0019\u0007\u0003U[\u0096\u0012\u00833\u000f\u00aeZ{d\u00d1\u00dfi\u0093\u00d7n\u00c6^\u00e9\u0013>\u0010\u00d7T\u0086D|\u0006\u00e0\u0082r_=z/\u00f8I\u00c1\u0010\u00ab\u00dc\u00c4\u0018sI\u00a7\u00c9\u00e0\u00ee^\u00963\b\u00d96\u000bT\u0005\u00b1\u009cN\u00d5\u00d8A\u00b7\u00c4P".length();
                        var9_4 = 19;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 82;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "0#,\u00dd\u00bd\u00e8\u00aa\u0012\r\u0092\u0004\u00f9\u0002\u00cc\u009f\u00d0\u00bb\u0093d\u0013W\u0083\u00c0\u00c9 j\u0019B{\u0098\u00ca\u00b8\u00db\u00e4\u00a4\u00d5\u00da9\u008b";
                            var12_3 = "0#,\u00dd\u00bd\u00e8\u00aa\u0012\r\u0092\u0004\u00f9\u0002\u00cc\u009f\u00d0\u00bb\u0093d\u0013W\u0083\u00c0\u00c9 j\u0019B{\u0098\u00ca\u00b8\u00db\u00e4\u00a4\u00d5\u00da9\u008b".length();
                            var9_4 = 19;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 55;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 49;
                                    break;
                                }
                                case 1: {
                                    v15 = 18;
                                    break;
                                }
                                case 2: {
                                    v15 = 112;
                                    break;
                                }
                                case 3: {
                                    v15 = 86;
                                    break;
                                }
                                case 4: {
                                    v15 = 110;
                                    break;
                                }
                                case 5: {
                                    v15 = 120;
                                    break;
                                }
                                default: {
                                    v15 = 63;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                DQ.a = var13;
                DQ.b = new String[11];
                var0_7 = 1515512188181007762L;
                var6_8 = new long[26];
                var3_9 = 0;
                var4_10 = "\u00a5\u00dc\u00fa\u00f6\u0087\u008d3\u0013\u00f4\u00b1\u0088\u00a4\u00faU\u00ea\u00ad%\u00d2\u00e9\u008c\u0097\u00d1\u0089\u0094]\u0005):2)e\u00c5\u009a\u007f\n\u00bb^)\u009c:\u00db\u008e'G\u0012d1D\u00f2Hh\u009d\u00d9\u00fa\u00c1\u00aa\u008fb\u0092\u00d2*\u00f6?\u00d7.I\u0014.\u00d73\u00fb/\u0014X%\u0088\u0016\u00a0\u0098=\u00c8\u0093\t{5\u0089\u00e2\u0089\u00b4O|\u0019\u00f1u\b(\u00ad\u000f\u00c1\u00d7\u009frk,.\u00a2*\u00da\u007f^\u0019<xX\u00ad\u00b2I6\u00f9\u0090yt\u00c6o\u0092\u00dd\u0099A\u00eaN\u00ee^\u00ecqJ\u00cch\u009a\u00f9o\u001f\u00ce\u00a79\u0095R\u00a6=\u008ca\u0012\u000f\u00c2\u00fc\u00cac\u00f1\u009ba9\u0015\u00a9\u00dc/\u009b\u0006\u00c5\u008f\u000f\u007f\u00d2\u0087\u00ee.\u000f2\u00ba\u00f7\u00a9\u00ea\u0089NM\u00ac\u0095\u00c9\u00d7\u00c4\u00a5g\u00b1\u00ac";
                var5_11 = "\u00a5\u00dc\u00fa\u00f6\u0087\u008d3\u0013\u00f4\u00b1\u0088\u00a4\u00faU\u00ea\u00ad%\u00d2\u00e9\u008c\u0097\u00d1\u0089\u0094]\u0005):2)e\u00c5\u009a\u007f\n\u00bb^)\u009c:\u00db\u008e'G\u0012d1D\u00f2Hh\u009d\u00d9\u00fa\u00c1\u00aa\u008fb\u0092\u00d2*\u00f6?\u00d7.I\u0014.\u00d73\u00fb/\u0014X%\u0088\u0016\u00a0\u0098=\u00c8\u0093\t{5\u0089\u00e2\u0089\u00b4O|\u0019\u00f1u\b(\u00ad\u000f\u00c1\u00d7\u009frk,.\u00a2*\u00da\u007f^\u0019<xX\u00ad\u00b2I6\u00f9\u0090yt\u00c6o\u0092\u00dd\u0099A\u00eaN\u00ee^\u00ecqJ\u00cch\u009a\u00f9o\u001f\u00ce\u00a79\u0095R\u00a6=\u008ca\u0012\u000f\u00c2\u00fc\u00cac\u00f1\u009ba9\u0015\u00a9\u00dc/\u009b\u0006\u00c5\u008f\u000f\u007f\u00d2\u0087\u00ee.\u000f2\u00ba\u00f7\u00a9\u00ea\u0089NM\u00ac\u0095\u00c9\u00d7\u00c4\u00a5g\u00b1\u00ac".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00a1hn\u00f4\u001b\u0006\u009b\u00c8\u00fcZe\u008f\u00b1\u00cdJ\u00f5";
                    var5_11 = "\u00a1hn\u00f4\u001b\u0006\u009b\u00c8\u00fcZe\u008f\u00b1\u00cdJ\u00f5".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        DQ.e = var6_8;
        DQ.i = new Integer[26];
        v22 = new byte[DQ.a(26263, 2655291601502094337L)][];
        v22[0] = E8.J(DQ.a(-26703, 28701));
        v22[1] = E8.J(DQ.a(-26697, 12022));
        v22[2] = E8.J(DQ.a(-26699, -8780));
        v22[3] = E8.J(DQ.a(-26689, -10940));
        v22[4] = E8.J(DQ.a(-26692, 16430));
        v22[5] = E8.J(DQ.a(-26691, 7210));
        v22[DQ.a((int)29502, (long)2254596169774944686L)] = E8.J(DQ.a(-26700, 16133));
        DQ.g = v22;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF97B5) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 175;
                    break;
                }
                case 1: {
                    n14 = 57;
                    break;
                }
                case 2: {
                    n14 = 200;
                    break;
                }
                case 3: {
                    n14 = 199;
                    break;
                }
                case 4: {
                    n14 = 87;
                    break;
                }
                case 5: {
                    n14 = 69;
                    break;
                }
                case 6: {
                    n14 = 95;
                    break;
                }
                case 7: {
                    n14 = 31;
                    break;
                }
                case 8: {
                    n14 = 58;
                    break;
                }
                case 9: {
                    n14 = 243;
                    break;
                }
                case 10: {
                    n14 = 153;
                    break;
                }
                case 11: {
                    n14 = 212;
                    break;
                }
                case 12: {
                    n14 = 105;
                    break;
                }
                case 13: {
                    n14 = 147;
                    break;
                }
                case 14: {
                    n14 = 142;
                    break;
                }
                case 15: {
                    n14 = 195;
                    break;
                }
                case 16: {
                    n14 = 168;
                    break;
                }
                case 17: {
                    n14 = 47;
                    break;
                }
                case 18: {
                    n14 = 64;
                    break;
                }
                case 19: {
                    n14 = 96;
                    break;
                }
                case 20: {
                    n14 = 70;
                    break;
                }
                case 21: {
                    n14 = 100;
                    break;
                }
                case 22: {
                    n14 = 191;
                    break;
                }
                case 23: {
                    n14 = 71;
                    break;
                }
                case 24: {
                    n14 = 248;
                    break;
                }
                case 25: {
                    n14 = 172;
                    break;
                }
                case 26: {
                    n14 = 253;
                    break;
                }
                case 27: {
                    n14 = 203;
                    break;
                }
                case 28: {
                    n14 = 7;
                    break;
                }
                case 29: {
                    n14 = 68;
                    break;
                }
                case 30: {
                    n14 = 41;
                    break;
                }
                case 31: {
                    n14 = 165;
                    break;
                }
                case 32: {
                    n14 = 233;
                    break;
                }
                case 33: {
                    n14 = 202;
                    break;
                }
                case 34: {
                    n14 = 178;
                    break;
                }
                case 35: {
                    n14 = 148;
                    break;
                }
                case 36: {
                    n14 = 143;
                    break;
                }
                case 37: {
                    n14 = 17;
                    break;
                }
                case 38: {
                    n14 = 18;
                    break;
                }
                case 39: {
                    n14 = 249;
                    break;
                }
                case 40: {
                    n14 = 54;
                    break;
                }
                case 41: {
                    n14 = 33;
                    break;
                }
                case 42: {
                    n14 = 151;
                    break;
                }
                case 43: {
                    n14 = 239;
                    break;
                }
                case 44: {
                    n14 = 62;
                    break;
                }
                case 45: {
                    n14 = 38;
                    break;
                }
                case 46: {
                    n14 = 119;
                    break;
                }
                case 47: {
                    n14 = 135;
                    break;
                }
                case 48: {
                    n14 = 4;
                    break;
                }
                case 49: {
                    n14 = 48;
                    break;
                }
                case 50: {
                    n14 = 60;
                    break;
                }
                case 51: {
                    n14 = 29;
                    break;
                }
                case 52: {
                    n14 = 224;
                    break;
                }
                case 53: {
                    n14 = 108;
                    break;
                }
                case 54: {
                    n14 = 219;
                    break;
                }
                case 55: {
                    n14 = 230;
                    break;
                }
                case 56: {
                    n14 = 52;
                    break;
                }
                case 57: {
                    n14 = 93;
                    break;
                }
                case 58: {
                    n14 = 228;
                    break;
                }
                case 59: {
                    n14 = 0;
                    break;
                }
                case 60: {
                    n14 = 12;
                    break;
                }
                case 61: {
                    n14 = 123;
                    break;
                }
                case 62: {
                    n14 = 50;
                    break;
                }
                case 63: {
                    n14 = 182;
                    break;
                }
                case 64: {
                    n14 = 9;
                    break;
                }
                case 65: {
                    n14 = 25;
                    break;
                }
                case 66: {
                    n14 = 241;
                    break;
                }
                case 67: {
                    n14 = 94;
                    break;
                }
                case 68: {
                    n14 = 122;
                    break;
                }
                case 69: {
                    n14 = 42;
                    break;
                }
                case 70: {
                    n14 = 121;
                    break;
                }
                case 71: {
                    n14 = 159;
                    break;
                }
                case 72: {
                    n14 = 86;
                    break;
                }
                case 73: {
                    n14 = 220;
                    break;
                }
                case 74: {
                    n14 = 180;
                    break;
                }
                case 75: {
                    n14 = 215;
                    break;
                }
                case 76: {
                    n14 = 242;
                    break;
                }
                case 77: {
                    n14 = 113;
                    break;
                }
                case 78: {
                    n14 = 221;
                    break;
                }
                case 79: {
                    n14 = 197;
                    break;
                }
                case 80: {
                    n14 = 226;
                    break;
                }
                case 81: {
                    n14 = 16;
                    break;
                }
                case 82: {
                    n14 = 80;
                    break;
                }
                case 83: {
                    n14 = 170;
                    break;
                }
                case 84: {
                    n14 = 205;
                    break;
                }
                case 85: {
                    n14 = 90;
                    break;
                }
                case 86: {
                    n14 = 179;
                    break;
                }
                case 87: {
                    n14 = 157;
                    break;
                }
                case 88: {
                    n14 = 73;
                    break;
                }
                case 89: {
                    n14 = 51;
                    break;
                }
                case 90: {
                    n14 = 134;
                    break;
                }
                case 91: {
                    n14 = 223;
                    break;
                }
                case 92: {
                    n14 = 115;
                    break;
                }
                case 93: {
                    n14 = 40;
                    break;
                }
                case 94: {
                    n14 = 238;
                    break;
                }
                case 95: {
                    n14 = 130;
                    break;
                }
                case 96: {
                    n14 = 10;
                    break;
                }
                case 97: {
                    n14 = 101;
                    break;
                }
                case 98: {
                    n14 = 236;
                    break;
                }
                case 99: {
                    n14 = 192;
                    break;
                }
                case 100: {
                    n14 = 176;
                    break;
                }
                case 101: {
                    n14 = 131;
                    break;
                }
                case 102: {
                    n14 = 75;
                    break;
                }
                case 103: {
                    n14 = 15;
                    break;
                }
                case 104: {
                    n14 = 49;
                    break;
                }
                case 105: {
                    n14 = 156;
                    break;
                }
                case 106: {
                    n14 = 174;
                    break;
                }
                case 107: {
                    n14 = 132;
                    break;
                }
                case 108: {
                    n14 = 214;
                    break;
                }
                case 109: {
                    n14 = 88;
                    break;
                }
                case 110: {
                    n14 = 217;
                    break;
                }
                case 111: {
                    n14 = 89;
                    break;
                }
                case 112: {
                    n14 = 186;
                    break;
                }
                case 113: {
                    n14 = 209;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 252;
                    break;
                }
                case 116: {
                    n14 = 22;
                    break;
                }
                case 117: {
                    n14 = 35;
                    break;
                }
                case 118: {
                    n14 = 138;
                    break;
                }
                case 119: {
                    n14 = 189;
                    break;
                }
                case 120: {
                    n14 = 102;
                    break;
                }
                case 121: {
                    n14 = 139;
                    break;
                }
                case 122: {
                    n14 = 36;
                    break;
                }
                case 123: {
                    n14 = 20;
                    break;
                }
                case 124: {
                    n14 = 235;
                    break;
                }
                case 125: {
                    n14 = 32;
                    break;
                }
                case 126: {
                    n14 = 216;
                    break;
                }
                case 127: {
                    n14 = 13;
                    break;
                }
                case 128: {
                    n14 = 169;
                    break;
                }
                case 129: {
                    n14 = 34;
                    break;
                }
                case 130: {
                    n14 = 117;
                    break;
                }
                case 131: {
                    n14 = 152;
                    break;
                }
                case 132: {
                    n14 = 164;
                    break;
                }
                case 133: {
                    n14 = 126;
                    break;
                }
                case 134: {
                    n14 = 116;
                    break;
                }
                case 135: {
                    n14 = 166;
                    break;
                }
                case 136: {
                    n14 = 206;
                    break;
                }
                case 137: {
                    n14 = 145;
                    break;
                }
                case 138: {
                    n14 = 136;
                    break;
                }
                case 139: {
                    n14 = 28;
                    break;
                }
                case 140: {
                    n14 = 210;
                    break;
                }
                case 141: {
                    n14 = 184;
                    break;
                }
                case 142: {
                    n14 = 232;
                    break;
                }
                case 143: {
                    n14 = 213;
                    break;
                }
                case 144: {
                    n14 = 83;
                    break;
                }
                case 145: {
                    n14 = 120;
                    break;
                }
                case 146: {
                    n14 = 3;
                    break;
                }
                case 147: {
                    n14 = 109;
                    break;
                }
                case 148: {
                    n14 = 198;
                    break;
                }
                case 149: {
                    n14 = 125;
                    break;
                }
                case 150: {
                    n14 = 98;
                    break;
                }
                case 151: {
                    n14 = 193;
                    break;
                }
                case 152: {
                    n14 = 183;
                    break;
                }
                case 153: {
                    n14 = 72;
                    break;
                }
                case 154: {
                    n14 = 53;
                    break;
                }
                case 155: {
                    n14 = 160;
                    break;
                }
                case 156: {
                    n14 = 144;
                    break;
                }
                case 157: {
                    n14 = 196;
                    break;
                }
                case 158: {
                    n14 = 37;
                    break;
                }
                case 159: {
                    n14 = 188;
                    break;
                }
                case 160: {
                    n14 = 26;
                    break;
                }
                case 161: {
                    n14 = 133;
                    break;
                }
                case 162: {
                    n14 = 92;
                    break;
                }
                case 163: {
                    n14 = 154;
                    break;
                }
                case 164: {
                    n14 = 111;
                    break;
                }
                case 165: {
                    n14 = 104;
                    break;
                }
                case 166: {
                    n14 = 201;
                    break;
                }
                case 167: {
                    n14 = 2;
                    break;
                }
                case 168: {
                    n14 = 103;
                    break;
                }
                case 169: {
                    n14 = 211;
                    break;
                }
                case 170: {
                    n14 = 227;
                    break;
                }
                case 171: {
                    n14 = 74;
                    break;
                }
                case 172: {
                    n14 = 14;
                    break;
                }
                case 173: {
                    n14 = 158;
                    break;
                }
                case 174: {
                    n14 = 99;
                    break;
                }
                case 175: {
                    n14 = 112;
                    break;
                }
                case 176: {
                    n14 = 124;
                    break;
                }
                case 177: {
                    n14 = 11;
                    break;
                }
                case 178: {
                    n14 = 79;
                    break;
                }
                case 179: {
                    n14 = 19;
                    break;
                }
                case 180: {
                    n14 = 85;
                    break;
                }
                case 181: {
                    n14 = 141;
                    break;
                }
                case 182: {
                    n14 = 218;
                    break;
                }
                case 183: {
                    n14 = 81;
                    break;
                }
                case 184: {
                    n14 = 208;
                    break;
                }
                case 185: {
                    n14 = 1;
                    break;
                }
                case 186: {
                    n14 = 244;
                    break;
                }
                case 187: {
                    n14 = 231;
                    break;
                }
                case 188: {
                    n14 = 106;
                    break;
                }
                case 189: {
                    n14 = 5;
                    break;
                }
                case 190: {
                    n14 = 250;
                    break;
                }
                case 191: {
                    n14 = 128;
                    break;
                }
                case 192: {
                    n14 = 171;
                    break;
                }
                case 193: {
                    n14 = 118;
                    break;
                }
                case 194: {
                    n14 = 67;
                    break;
                }
                case 195: {
                    n14 = 207;
                    break;
                }
                case 196: {
                    n14 = 229;
                    break;
                }
                case 197: {
                    n14 = 150;
                    break;
                }
                case 198: {
                    n14 = 181;
                    break;
                }
                case 199: {
                    n14 = 44;
                    break;
                }
                case 200: {
                    n14 = 225;
                    break;
                }
                case 201: {
                    n14 = 246;
                    break;
                }
                case 202: {
                    n14 = 177;
                    break;
                }
                case 203: {
                    n14 = 187;
                    break;
                }
                case 204: {
                    n14 = 146;
                    break;
                }
                case 205: {
                    n14 = 76;
                    break;
                }
                case 206: {
                    n14 = 185;
                    break;
                }
                case 207: {
                    n14 = 162;
                    break;
                }
                case 208: {
                    n14 = 161;
                    break;
                }
                case 209: {
                    n14 = 110;
                    break;
                }
                case 210: {
                    n14 = 222;
                    break;
                }
                case 211: {
                    n14 = 255;
                    break;
                }
                case 212: {
                    n14 = 234;
                    break;
                }
                case 213: {
                    n14 = 84;
                    break;
                }
                case 214: {
                    n14 = 237;
                    break;
                }
                case 215: {
                    n14 = 77;
                    break;
                }
                case 216: {
                    n14 = 43;
                    break;
                }
                case 217: {
                    n14 = 23;
                    break;
                }
                case 218: {
                    n14 = 65;
                    break;
                }
                case 219: {
                    n14 = 127;
                    break;
                }
                case 220: {
                    n14 = 63;
                    break;
                }
                case 221: {
                    n14 = 173;
                    break;
                }
                case 222: {
                    n14 = 59;
                    break;
                }
                case 223: {
                    n14 = 107;
                    break;
                }
                case 224: {
                    n14 = 245;
                    break;
                }
                case 225: {
                    n14 = 140;
                    break;
                }
                case 226: {
                    n14 = 163;
                    break;
                }
                case 227: {
                    n14 = 8;
                    break;
                }
                case 228: {
                    n14 = 167;
                    break;
                }
                case 229: {
                    n14 = 61;
                    break;
                }
                case 230: {
                    n14 = 55;
                    break;
                }
                case 231: {
                    n14 = 204;
                    break;
                }
                case 232: {
                    n14 = 137;
                    break;
                }
                case 233: {
                    n14 = 78;
                    break;
                }
                case 234: {
                    n14 = 6;
                    break;
                }
                case 235: {
                    n14 = 97;
                    break;
                }
                case 236: {
                    n14 = 46;
                    break;
                }
                case 237: {
                    n14 = 56;
                    break;
                }
                case 238: {
                    n14 = 91;
                    break;
                }
                case 239: {
                    n14 = 21;
                    break;
                }
                case 240: {
                    n14 = 149;
                    break;
                }
                case 241: {
                    n14 = 24;
                    break;
                }
                case 242: {
                    n14 = 82;
                    break;
                }
                case 243: {
                    n14 = 155;
                    break;
                }
                case 244: {
                    n14 = 254;
                    break;
                }
                case 245: {
                    n14 = 240;
                    break;
                }
                case 246: {
                    n14 = 45;
                    break;
                }
                case 247: {
                    n14 = 251;
                    break;
                }
                case 248: {
                    n14 = 39;
                    break;
                }
                case 249: {
                    n14 = 247;
                    break;
                }
                case 250: {
                    n14 = 27;
                    break;
                }
                case 251: {
                    n14 = 129;
                    break;
                }
                case 252: {
                    n14 = 66;
                    break;
                }
                case 253: {
                    n14 = 190;
                    break;
                }
                case 254: {
                    n14 = 30;
                    break;
                }
                default: {
                    n14 = 194;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            DQ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2294;
        if (i[n11] == null) {
            DQ.i[n11] = (int)(e[n11] ^ l2);
        }
        return i[n11];
    }
}

