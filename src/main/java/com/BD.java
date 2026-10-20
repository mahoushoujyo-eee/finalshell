/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_2;
import com.pj_2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class BD {
    private byte[] y;
    private long n;
    private long A;
    private long q;
    private String p;
    private File G;
    private static boolean D;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public BD(String string) throws Exception {
        this.p = string;
        this.G = new File(this.p);
        this.r();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private void r() throws Exception {
        block24: {
            block22: {
                var2_1 = null;
                var3_2 = null;
                var1_3 = BD.h();
                try {
                    var2_1 = new ByteArrayOutputStream();
                    var4_4 = new byte[BD.a(15669, 4977162344121140272L)];
                    var3_2 = new FileInputStream(this.G);
                    while (var3_2.read(var4_4) != -1) {
                        try {
                            var2_1.write(var4_4);
                            if (!var1_3) {
                                if (!var1_3) continue;
                                break;
                            }
                            break block22;
                        }
                        catch (IOException v0) {
                            throw BD.a(v0);
                        }
                    }
                    try {
                        this.y = var2_1.toByteArray();
                        this.n = this.O(0);
                        this.A = this.O(4);
                        this.q = (this.A - this.n) / BD.b(26036, 7808328855899678747L) + 1L;
                        v1 = var3_2;
                        if (!var1_3) {
                            v1.close();
                            var2_1.close();
                        }
                        ** GOTO lbl67
                    }
                    catch (IOException v2) {
                        throw BD.a(v2);
                    }
                }
                catch (Throwable var5_6) {
                    block28: {
                        try {
                            block27: {
                                block26: {
                                    block25: {
                                        try {
                                            v3 = var2_1;
                                            if (var1_3) break block25;
                                            if (v3 == null) break block26;
                                        }
                                        catch (IOException v4) {
                                            throw BD.a(v4);
                                        }
                                        v3 = var2_1;
                                    }
                                    v3.close();
                                }
                                try {
                                    v5 = var3_2;
                                    if (var1_3) break block27;
                                    if (v5 == null) break block28;
                                }
                                catch (IOException v6) {
                                    throw BD.a(v6);
                                }
                                v5 = var3_2;
                            }
                            v5.close();
                        }
                        catch (IOException var6_7) {
                            var6_7.printStackTrace();
                        }
                    }
                    throw var5_6;
                }
            }
            try {
                block23: {
                    try {
                        if (var2_1 != null) {
                            var2_1.close();
                        }
                    }
                    catch (IOException v7) {
                        throw BD.a(v7);
                    }
                    v1 = var3_2;
lbl67:
                    // 2 sources

                    try {
                        if (var1_3) break block23;
                        if (v1 == null) break block24;
                    }
                    catch (IOException v8) {
                        throw BD.a(v8);
                    }
                    v1 = var3_2;
                }
                v1.close();
            }
            catch (IOException var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    private static long M(String string) {
        String string2;
        block4: {
            block5: {
                boolean bl = BD.h();
                try {
                    try {
                        string2 = string;
                        if (bl) break block4;
                        if (string2 != null) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw BD.a(nullPointerException);
                    }
                    throw new NullPointerException(BD.a(-21824, -18516));
                }
                catch (NullPointerException nullPointerException) {
                    throw BD.a(nullPointerException);
                }
            }
            string2 = string;
        }
        String[] stringArray = string2.split(BD.a(-21819, -29187));
        long l2 = (Long.parseLong(stringArray[0]) & BD.b(26465, 5325268516799163087L)) << BD.a(20960, 1019616471333431524L) & BD.b(24222, 8478916455119819573L);
        l2 |= (Long.parseLong(stringArray[1]) & BD.b(26465, 5325268516799163087L)) << BD.a(6777, 2862388184473117566L) & BD.b(4488, 7620616610307109L);
        l2 |= (Long.parseLong(stringArray[2]) & BD.b(26465, 5325268516799163087L)) << BD.a(9977, 8176550324397449201L) & BD.b(22452, 5983505725482375700L);
        return l2 |= Long.parseLong(stringArray[3]) & BD.b(26465, 5325268516799163087L);
    }

    private long O(int n10) {
        long l2 = this.y[n10] & BD.a(19420, 3548665031136932575L);
        l2 |= (long)(this.y[n10 + 1] << BD.a(2636, 2002754935698207562L)) & BD.b(15834, 4328919274552029305L);
        l2 |= (long)(this.y[n10 + 2] << BD.a(4895, 4972002295813024287L)) & BD.b(19012, 9171893212349138912L);
        return l2 |= (long)(this.y[n10 + 3] << BD.a(8517, 2455967397775579204L)) & BD.b(1568, 3208836424022969222L);
    }

    private long v(int n10) {
        long l2 = (long)this.y[n10] & BD.b(23745, 164400053362594157L);
        l2 |= (long)(this.y[n10 + 1] << BD.a(9977, 8176550324397449201L)) & BD.b(22452, 5983505725482375700L);
        return l2 |= (long)(this.y[n10 + 2] << BD.a(6777, 2862388184473117566L)) & BD.b(4488, 7620616610307109L);
    }

    /*
     * Unable to fully structure code
     */
    public co_2 h(String var1_1) {
        var3_2 = BD.M(var1_1);
        var5_3 = 1L;
        var7_4 = this.q;
        var2_5 = BD.h();
        while (var5_3 <= var7_4) {
            block19: {
                block20: {
                    block18: {
                        block16: {
                            block17: {
                                var9_6 = var5_3 + var7_4 >>> 1;
                                var11_7 = this.O((int)(this.n + (var9_6 - 1L) * BD.b(9264, 1705378341840939415L)));
                                var13_8 = this.O((int)(this.n + var9_6 * BD.b(9264, 1705378341840939415L)));
                                try {
                                    try {
                                        try {
                                            v0 = var11_7 == var3_2 ? 0 : (var11_7 < var3_2 ? -1 : 1);
                                            if (var2_5) break block16;
                                            if (v0 > 0) break block17;
                                        }
                                        catch (NullPointerException v1) {
                                            throw BD.a(v1);
                                        }
                                        v0 = var3_2 == var13_8 ? 0 : (var3_2 < var13_8 ? -1 : 1);
                                        if (var2_5) break block16;
                                    }
                                    catch (NullPointerException v2) {
                                        throw BD.a(v2);
                                    }
                                    if (v0 >= 0) break block17;
                                }
                                catch (NullPointerException v3) {
                                    throw BD.a(v3);
                                }
                                var15_9 = this.v((int)(this.n + (var9_6 - 1L) * BD.b(9264, 1705378341840939415L) + BD.b(15736, 731199114024644826L)));
                                var17_10 = this.v((int)(this.n + (var9_6 - 1L) * BD.b(9264, 1705378341840939415L) + BD.b(27779, 1471151141639725350L) + BD.b(4826, 7935107364368113531L)));
                                var19_11 = new co_2();
                                var19_11.o(var1_1);
                                var19_11.s(this.Z((int)var15_9));
                                var19_11.m(this.Z((int)var17_10));
                                return var19_11;
                            }
                            v0 = var3_2 == var11_7 ? 0 : (var3_2 < var11_7 ? -1 : 1);
                        }
                        try {
                            if (var2_5) break block18;
                            if (v0 > 0) {
                            }
                            ** GOTO lbl48
                        }
                        catch (NullPointerException v4) {
                            throw BD.a(v4);
                        }
                        var5_3 = var9_6 + 1L;
                        try {
                            try {
                                if (!var2_5) break block19;
lbl48:
                                // 2 sources

                                v5 = var3_2;
                                v6 = var11_7;
                                if (var2_5) break block20;
                            }
                            catch (NullPointerException v7) {
                                throw BD.a(v7);
                            }
                            cfr_temp_0 = v5 - v6;
                            v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        }
                        catch (NullPointerException v8) {
                            throw BD.a(v8);
                        }
                    }
                    try {
                        if (v0 >= 0) break block19;
                        v5 = var9_6;
                        v6 = 1L;
                    }
                    catch (NullPointerException v9) {
                        throw BD.a(v9);
                    }
                }
                var7_4 = v5 - v6;
            }
            if (!var2_5) continue;
        }
        return null;
    }

    private pj_2 h(int n10) {
        int n11 = n10;
        byte[] byArray = new byte[BD.a(25053, 6629400678468475103L)];
        boolean bl = BD.h();
        int n12 = 0;
        byArray[n12] = this.y[n11++];
        while (byArray[n12] != 0) {
            byArray[++n12] = this.y[n11++];
            if (!bl) continue;
        }
        try {
            return new pj_2(this, new String(byArray, 0, n12, BD.a(-21817, 238)), n12 + 1);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new pj_2(this, "", 0);
        }
    }

    private String Z(int n10) {
        try {
            pj_2 pj_22 = this.h(n10);
            String string = pj_22.B;
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void main(String[] stringArray) throws Exception {
        BD bD = new BD(BD.a(-21818, -9141));
        System.out.println(bD.h(BD.a(-21820, 12732)));
    }

    public static void T(boolean bl) {
        D = bl;
    }

    public static boolean v() {
        return D;
    }

    public static boolean h() {
        boolean bl = BD.v();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw BD.a(nullPointerException);
        }
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[5];
                                var19_1 = 0;
                                var18_2 = "Y\u00bb$\u00ea\u00cc\u0084\u00baw\u0099\u001a\u00db\u00f3v\u00a44\u0002?K\nz\u009e\u00fc\u00bb\u00dd\u00ca\u008az\u00d4\u00ff";
                                var20_3 = "Y\u00bb$\u00ea\u00cc\u0084\u00baw\u0099\u001a\u00db\u00f3v\u00a44\u0002?K\nz\u009e\u00fc\u00bb\u00dd\u00ca\u008az\u00d4\u00ff".length();
                                var17_4 = 15;
                                BD.T(true);
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 45;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u0010\u0095q\u0006\u00a6\u00c6\u4e0a\u8027\u4ea7\u7a67";
                                    var20_3 = "\u0010\u0095q\u0006\u00a6\u00c6\u4e0a\u8027\u4ea7\u7a67".length();
                                    var17_4 = 3;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 17;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl86
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 60;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 74;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 35;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 6;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 72;
                                            break;
                                        }
                                        default: {
                                            v15 = 110;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl86:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl96:
                                // 1 sources

                                ** continue;
                            }
                        }
                        BD.a = var21;
                        BD.b = new String[5];
                        var8_7 = 4770705750479796043L;
                        var14_8 = new long[9];
                        var11_9 = 0;
                        var12_10 = "\u00d0\u0093N\u00f3Y\u001e]D\u001b\u00af\u0098\u00c9\u0095\u0018o\u0017\u008c\b[\b\u0090\u009a.\u0094W\u00f3\u0092\u00b7\u00de\u0086\u0085ksqNr\u00dd\u00b5\u009f\u00b7\u0016\u0003\u00ee\u00ef\u00b7\u0088w{P\u00e3\u00f5\u0089S1D\t";
                        var13_11 = "\u00d0\u0093N\u00f3Y\u001e]D\u001b\u00af\u0098\u00c9\u0095\u0018o\u0017\u008c\b[\b\u0090\u009a.\u0094W\u00f3\u0092\u00b7\u00de\u0086\u0085ksqNr\u00dd\u00b5\u009f\u00b7\u0016\u0003\u00ee\u00ef\u00b7\u0088w{P\u00e3\u00f5\u0089S1D\t".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl113:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u0092E\u008c\u00d4\u00f1\u0089T%\u00ed\u0005\u00f9\u0012t\u0092h\u00b2";
                            var13_11 = "\u0092E\u008c\u00d4\u00f1\u0089T%\u00ed\u0005\u00f9\u0012t\u0092h\u00b2".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl126:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl137:
                        // 1 sources

                        ** continue;
                    }
                }
                BD.c = var14_8;
                BD.d = new Integer[9];
                var0_14 = 652205058281862883L;
                var6_15 = new long[13];
                var3_16 = 0;
                var4_17 = "\u001e\u00a7\u00a1\u009a\u0082\u0088\u009f~%\u0085\n\u00b2\u0080\u00a3=e\u001dg\u008d \u00bb\u00c2\u00d7\u00c1vD\u0005C\u00a4\u0086q\u00035\u001ep.\u0086\u0099y\u009a\u0003(\u00a4\u00b3\u00d8\u001e\u0086=g\u00123\u0010\u0098%)\u009bZ\u0004\u00b7\u00ca\u00dd~\u0013\u00f7eQ\u00d8\u00b2\u00e2\u00cf^\u00f2@\u00ea>\u008b\u00e6\u00f8\u00dc\u00d3\t\u0016\u000b\u00e2\u0091c\u00aa\u00c6";
                var5_18 = "\u001e\u00a7\u00a1\u009a\u0082\u0088\u009f~%\u0085\n\u00b2\u0080\u00a3=e\u001dg\u008d \u00bb\u00c2\u00d7\u00c1vD\u0005C\u00a4\u0086q\u00035\u001ep.\u0086\u0099y\u009a\u0003(\u00a4\u00b3\u00d8\u001e\u0086=g\u00123\u0010\u0098%)\u009bZ\u0004\u00b7\u00ca\u00dd~\u0013\u00f7eQ\u00d8\u00b2\u00e2\u00cf^\u00f2@\u00ea>\u008b\u00e6\u00f8\u00dc\u00d3\t\u0016\u000b\u00e2\u0091c\u00aa\u00c6".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl154:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\u000bE\t\u00f1\u00be!\u00e7q|\u00a60\u009c\u00c7;\u00e5\u00d6";
                    var5_18 = "\u000bE\t\u00f1\u00be!\u00e7q|\u00a60\u009c\u00c7;\u00e5\u00d6".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl167:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl178:
                // 1 sources

                ** continue;
            }
        }
        BD.e = var6_15;
        BD.f = new Long[13];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAAC4) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 9;
                    break;
                }
                case 1: {
                    n14 = 32;
                    break;
                }
                case 2: {
                    n14 = 130;
                    break;
                }
                case 3: {
                    n14 = 112;
                    break;
                }
                case 4: {
                    n14 = 162;
                    break;
                }
                case 5: {
                    n14 = 141;
                    break;
                }
                case 6: {
                    n14 = 105;
                    break;
                }
                case 7: {
                    n14 = 204;
                    break;
                }
                case 8: {
                    n14 = 8;
                    break;
                }
                case 9: {
                    n14 = 236;
                    break;
                }
                case 10: {
                    n14 = 49;
                    break;
                }
                case 11: {
                    n14 = 182;
                    break;
                }
                case 12: {
                    n14 = 144;
                    break;
                }
                case 13: {
                    n14 = 164;
                    break;
                }
                case 14: {
                    n14 = 243;
                    break;
                }
                case 15: {
                    n14 = 18;
                    break;
                }
                case 16: {
                    n14 = 39;
                    break;
                }
                case 17: {
                    n14 = 85;
                    break;
                }
                case 18: {
                    n14 = 183;
                    break;
                }
                case 19: {
                    n14 = 184;
                    break;
                }
                case 20: {
                    n14 = 237;
                    break;
                }
                case 21: {
                    n14 = 231;
                    break;
                }
                case 22: {
                    n14 = 206;
                    break;
                }
                case 23: {
                    n14 = 53;
                    break;
                }
                case 24: {
                    n14 = 167;
                    break;
                }
                case 25: {
                    n14 = 68;
                    break;
                }
                case 26: {
                    n14 = 159;
                    break;
                }
                case 27: {
                    n14 = 174;
                    break;
                }
                case 28: {
                    n14 = 239;
                    break;
                }
                case 29: {
                    n14 = 58;
                    break;
                }
                case 30: {
                    n14 = 108;
                    break;
                }
                case 31: {
                    n14 = 157;
                    break;
                }
                case 32: {
                    n14 = 115;
                    break;
                }
                case 33: {
                    n14 = 29;
                    break;
                }
                case 34: {
                    n14 = 21;
                    break;
                }
                case 35: {
                    n14 = 87;
                    break;
                }
                case 36: {
                    n14 = 114;
                    break;
                }
                case 37: {
                    n14 = 63;
                    break;
                }
                case 38: {
                    n14 = 235;
                    break;
                }
                case 39: {
                    n14 = 122;
                    break;
                }
                case 40: {
                    n14 = 88;
                    break;
                }
                case 41: {
                    n14 = 149;
                    break;
                }
                case 42: {
                    n14 = 110;
                    break;
                }
                case 43: {
                    n14 = 170;
                    break;
                }
                case 44: {
                    n14 = 143;
                    break;
                }
                case 45: {
                    n14 = 136;
                    break;
                }
                case 46: {
                    n14 = 139;
                    break;
                }
                case 47: {
                    n14 = 103;
                    break;
                }
                case 48: {
                    n14 = 7;
                    break;
                }
                case 49: {
                    n14 = 220;
                    break;
                }
                case 50: {
                    n14 = 44;
                    break;
                }
                case 51: {
                    n14 = 113;
                    break;
                }
                case 52: {
                    n14 = 137;
                    break;
                }
                case 53: {
                    n14 = 92;
                    break;
                }
                case 54: {
                    n14 = 15;
                    break;
                }
                case 55: {
                    n14 = 77;
                    break;
                }
                case 56: {
                    n14 = 31;
                    break;
                }
                case 57: {
                    n14 = 131;
                    break;
                }
                case 58: {
                    n14 = 104;
                    break;
                }
                case 59: {
                    n14 = 253;
                    break;
                }
                case 60: {
                    n14 = 37;
                    break;
                }
                case 61: {
                    n14 = 116;
                    break;
                }
                case 62: {
                    n14 = 238;
                    break;
                }
                case 63: {
                    n14 = 20;
                    break;
                }
                case 64: {
                    n14 = 117;
                    break;
                }
                case 65: {
                    n14 = 50;
                    break;
                }
                case 66: {
                    n14 = 133;
                    break;
                }
                case 67: {
                    n14 = 138;
                    break;
                }
                case 68: {
                    n14 = 169;
                    break;
                }
                case 69: {
                    n14 = 91;
                    break;
                }
                case 70: {
                    n14 = 185;
                    break;
                }
                case 71: {
                    n14 = 119;
                    break;
                }
                case 72: {
                    n14 = 67;
                    break;
                }
                case 73: {
                    n14 = 10;
                    break;
                }
                case 74: {
                    n14 = 254;
                    break;
                }
                case 75: {
                    n14 = 177;
                    break;
                }
                case 76: {
                    n14 = 132;
                    break;
                }
                case 77: {
                    n14 = 247;
                    break;
                }
                case 78: {
                    n14 = 56;
                    break;
                }
                case 79: {
                    n14 = 46;
                    break;
                }
                case 80: {
                    n14 = 180;
                    break;
                }
                case 81: {
                    n14 = 214;
                    break;
                }
                case 82: {
                    n14 = 25;
                    break;
                }
                case 83: {
                    n14 = 205;
                    break;
                }
                case 84: {
                    n14 = 219;
                    break;
                }
                case 85: {
                    n14 = 62;
                    break;
                }
                case 86: {
                    n14 = 100;
                    break;
                }
                case 87: {
                    n14 = 192;
                    break;
                }
                case 88: {
                    n14 = 120;
                    break;
                }
                case 89: {
                    n14 = 17;
                    break;
                }
                case 90: {
                    n14 = 155;
                    break;
                }
                case 91: {
                    n14 = 255;
                    break;
                }
                case 92: {
                    n14 = 195;
                    break;
                }
                case 93: {
                    n14 = 179;
                    break;
                }
                case 94: {
                    n14 = 199;
                    break;
                }
                case 95: {
                    n14 = 26;
                    break;
                }
                case 96: {
                    n14 = 142;
                    break;
                }
                case 97: {
                    n14 = 93;
                    break;
                }
                case 98: {
                    n14 = 215;
                    break;
                }
                case 99: {
                    n14 = 248;
                    break;
                }
                case 100: {
                    n14 = 161;
                    break;
                }
                case 101: {
                    n14 = 178;
                    break;
                }
                case 102: {
                    n14 = 224;
                    break;
                }
                case 103: {
                    n14 = 78;
                    break;
                }
                case 104: {
                    n14 = 30;
                    break;
                }
                case 105: {
                    n14 = 70;
                    break;
                }
                case 106: {
                    n14 = 212;
                    break;
                }
                case 107: {
                    n14 = 6;
                    break;
                }
                case 108: {
                    n14 = 126;
                    break;
                }
                case 109: {
                    n14 = 197;
                    break;
                }
                case 110: {
                    n14 = 240;
                    break;
                }
                case 111: {
                    n14 = 233;
                    break;
                }
                case 112: {
                    n14 = 61;
                    break;
                }
                case 113: {
                    n14 = 241;
                    break;
                }
                case 114: {
                    n14 = 168;
                    break;
                }
                case 115: {
                    n14 = 135;
                    break;
                }
                case 116: {
                    n14 = 47;
                    break;
                }
                case 117: {
                    n14 = 66;
                    break;
                }
                case 118: {
                    n14 = 82;
                    break;
                }
                case 119: {
                    n14 = 229;
                    break;
                }
                case 120: {
                    n14 = 171;
                    break;
                }
                case 121: {
                    n14 = 84;
                    break;
                }
                case 122: {
                    n14 = 193;
                    break;
                }
                case 123: {
                    n14 = 166;
                    break;
                }
                case 124: {
                    n14 = 234;
                    break;
                }
                case 125: {
                    n14 = 216;
                    break;
                }
                case 126: {
                    n14 = 12;
                    break;
                }
                case 127: {
                    n14 = 59;
                    break;
                }
                case 128: {
                    n14 = 111;
                    break;
                }
                case 129: {
                    n14 = 101;
                    break;
                }
                case 130: {
                    n14 = 209;
                    break;
                }
                case 131: {
                    n14 = 33;
                    break;
                }
                case 132: {
                    n14 = 250;
                    break;
                }
                case 133: {
                    n14 = 16;
                    break;
                }
                case 134: {
                    n14 = 150;
                    break;
                }
                case 135: {
                    n14 = 189;
                    break;
                }
                case 136: {
                    n14 = 217;
                    break;
                }
                case 137: {
                    n14 = 154;
                    break;
                }
                case 138: {
                    n14 = 198;
                    break;
                }
                case 139: {
                    n14 = 202;
                    break;
                }
                case 140: {
                    n14 = 129;
                    break;
                }
                case 141: {
                    n14 = 232;
                    break;
                }
                case 142: {
                    n14 = 2;
                    break;
                }
                case 143: {
                    n14 = 43;
                    break;
                }
                case 144: {
                    n14 = 158;
                    break;
                }
                case 145: {
                    n14 = 72;
                    break;
                }
                case 146: {
                    n14 = 181;
                    break;
                }
                case 147: {
                    n14 = 76;
                    break;
                }
                case 148: {
                    n14 = 200;
                    break;
                }
                case 149: {
                    n14 = 151;
                    break;
                }
                case 150: {
                    n14 = 210;
                    break;
                }
                case 151: {
                    n14 = 97;
                    break;
                }
                case 152: {
                    n14 = 244;
                    break;
                }
                case 153: {
                    n14 = 90;
                    break;
                }
                case 154: {
                    n14 = 69;
                    break;
                }
                case 155: {
                    n14 = 222;
                    break;
                }
                case 156: {
                    n14 = 41;
                    break;
                }
                case 157: {
                    n14 = 19;
                    break;
                }
                case 158: {
                    n14 = 0;
                    break;
                }
                case 159: {
                    n14 = 134;
                    break;
                }
                case 160: {
                    n14 = 191;
                    break;
                }
                case 161: {
                    n14 = 128;
                    break;
                }
                case 162: {
                    n14 = 211;
                    break;
                }
                case 163: {
                    n14 = 48;
                    break;
                }
                case 164: {
                    n14 = 89;
                    break;
                }
                case 165: {
                    n14 = 203;
                    break;
                }
                case 166: {
                    n14 = 79;
                    break;
                }
                case 167: {
                    n14 = 194;
                    break;
                }
                case 168: {
                    n14 = 213;
                    break;
                }
                case 169: {
                    n14 = 172;
                    break;
                }
                case 170: {
                    n14 = 75;
                    break;
                }
                case 171: {
                    n14 = 98;
                    break;
                }
                case 172: {
                    n14 = 246;
                    break;
                }
                case 173: {
                    n14 = 201;
                    break;
                }
                case 174: {
                    n14 = 3;
                    break;
                }
                case 175: {
                    n14 = 163;
                    break;
                }
                case 176: {
                    n14 = 160;
                    break;
                }
                case 177: {
                    n14 = 36;
                    break;
                }
                case 178: {
                    n14 = 52;
                    break;
                }
                case 179: {
                    n14 = 14;
                    break;
                }
                case 180: {
                    n14 = 145;
                    break;
                }
                case 181: {
                    n14 = 99;
                    break;
                }
                case 182: {
                    n14 = 95;
                    break;
                }
                case 183: {
                    n14 = 147;
                    break;
                }
                case 184: {
                    n14 = 196;
                    break;
                }
                case 185: {
                    n14 = 13;
                    break;
                }
                case 186: {
                    n14 = 146;
                    break;
                }
                case 187: {
                    n14 = 42;
                    break;
                }
                case 188: {
                    n14 = 127;
                    break;
                }
                case 189: {
                    n14 = 86;
                    break;
                }
                case 190: {
                    n14 = 156;
                    break;
                }
                case 191: {
                    n14 = 106;
                    break;
                }
                case 192: {
                    n14 = 4;
                    break;
                }
                case 193: {
                    n14 = 38;
                    break;
                }
                case 194: {
                    n14 = 225;
                    break;
                }
                case 195: {
                    n14 = 107;
                    break;
                }
                case 196: {
                    n14 = 186;
                    break;
                }
                case 197: {
                    n14 = 207;
                    break;
                }
                case 198: {
                    n14 = 54;
                    break;
                }
                case 199: {
                    n14 = 140;
                    break;
                }
                case 200: {
                    n14 = 249;
                    break;
                }
                case 201: {
                    n14 = 121;
                    break;
                }
                case 202: {
                    n14 = 221;
                    break;
                }
                case 203: {
                    n14 = 223;
                    break;
                }
                case 204: {
                    n14 = 251;
                    break;
                }
                case 205: {
                    n14 = 102;
                    break;
                }
                case 206: {
                    n14 = 152;
                    break;
                }
                case 207: {
                    n14 = 227;
                    break;
                }
                case 208: {
                    n14 = 35;
                    break;
                }
                case 209: {
                    n14 = 165;
                    break;
                }
                case 210: {
                    n14 = 40;
                    break;
                }
                case 211: {
                    n14 = 74;
                    break;
                }
                case 212: {
                    n14 = 245;
                    break;
                }
                case 213: {
                    n14 = 242;
                    break;
                }
                case 214: {
                    n14 = 22;
                    break;
                }
                case 215: {
                    n14 = 94;
                    break;
                }
                case 216: {
                    n14 = 187;
                    break;
                }
                case 217: {
                    n14 = 11;
                    break;
                }
                case 218: {
                    n14 = 65;
                    break;
                }
                case 219: {
                    n14 = 230;
                    break;
                }
                case 220: {
                    n14 = 175;
                    break;
                }
                case 221: {
                    n14 = 27;
                    break;
                }
                case 222: {
                    n14 = 1;
                    break;
                }
                case 223: {
                    n14 = 173;
                    break;
                }
                case 224: {
                    n14 = 176;
                    break;
                }
                case 225: {
                    n14 = 23;
                    break;
                }
                case 226: {
                    n14 = 218;
                    break;
                }
                case 227: {
                    n14 = 64;
                    break;
                }
                case 228: {
                    n14 = 124;
                    break;
                }
                case 229: {
                    n14 = 188;
                    break;
                }
                case 230: {
                    n14 = 228;
                    break;
                }
                case 231: {
                    n14 = 190;
                    break;
                }
                case 232: {
                    n14 = 28;
                    break;
                }
                case 233: {
                    n14 = 60;
                    break;
                }
                case 234: {
                    n14 = 226;
                    break;
                }
                case 235: {
                    n14 = 5;
                    break;
                }
                case 236: {
                    n14 = 45;
                    break;
                }
                case 237: {
                    n14 = 109;
                    break;
                }
                case 238: {
                    n14 = 51;
                    break;
                }
                case 239: {
                    n14 = 148;
                    break;
                }
                case 240: {
                    n14 = 24;
                    break;
                }
                case 241: {
                    n14 = 252;
                    break;
                }
                case 242: {
                    n14 = 125;
                    break;
                }
                case 243: {
                    n14 = 55;
                    break;
                }
                case 244: {
                    n14 = 71;
                    break;
                }
                case 245: {
                    n14 = 208;
                    break;
                }
                case 246: {
                    n14 = 73;
                    break;
                }
                case 247: {
                    n14 = 57;
                    break;
                }
                case 248: {
                    n14 = 153;
                    break;
                }
                case 249: {
                    n14 = 34;
                    break;
                }
                case 250: {
                    n14 = 96;
                    break;
                }
                case 251: {
                    n14 = 80;
                    break;
                }
                case 252: {
                    n14 = 118;
                    break;
                }
                case 253: {
                    n14 = 81;
                    break;
                }
                case 254: {
                    n14 = 123;
                    break;
                }
                default: {
                    n14 = 83;
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
            BD.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3900;
        if (d[n11] == null) {
            BD.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x4DA7) & Short.MAX_VALUE;
        if (f[n11] == null) {
            BD.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

