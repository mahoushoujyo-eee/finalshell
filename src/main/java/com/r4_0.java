/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C_;
import com.YK;
import com.c;
import com.il_2;
import com.ky_2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from com.r4
 */
public class r4_0 {
    private byte[] D;
    private long O;
    private long t;
    private long d;
    private static ReentrantLock j;
    private static Long o;
    public static boolean e;
    private File v;
    private static int[] y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] f;
    private static final long[] g;
    private static final Long[] h;

    public r4_0(String string) throws Exception {
        block8: {
            r4_0 r4_02;
            block7: {
                int[] nArray = r4_0.g();
                int[] nArray2 = nArray;
                try {
                    try {
                        this.v = new File(string);
                        r4_02 = this;
                        if (nArray2 != null) break block7;
                        r4_02.r();
                        if (!e) break block8;
                    }
                    catch (Exception exception) {
                        throw r4_0.a(exception);
                    }
                    r4_02 = this;
                }
                catch (Exception exception) {
                    throw r4_0.a(exception);
                }
            }
            r4_02.y();
        }
        try {
            if (ky_2.F() != null) {
                r4_0.f(new int[1]);
            }
        }
        catch (Exception exception) {
            throw r4_0.a(exception);
        }
    }

    private void y() {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new YK(this), r4_0.b(31601, 8695304516048138132L), r4_0.b(21306, 3557292601280301017L), TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private void r() throws Exception {
        block26: {
            block24: {
                r4_0.o = this.v.lastModified();
                var1_1 = r4_0.g();
                var2_2 = null;
                var3_3 = null;
                r4_0.j.lock();
                try {
                    v0 = (Boolean)vk_0.f();
                }
                catch (InvocationTargetException v1) {
                    throw v1.getTargetException();
                }
                var4_4 = r4_0.a(5889, -22192) + this.v.getAbsolutePath() + " " + this.v.exists() + " " + v0;
                try {
                    var2_2 = new ByteArrayOutputStream();
                    var5_5 = new byte[r4_0.a(5076, 8279689753463652462L)];
                    var3_3 = new FileInputStream(this.v);
                    while (var3_3.read(var5_5) != -1) {
                        try {
                            var2_2.write(var5_5);
                            if (var1_1 == null) {
                                if (var1_1 == null) continue;
                                break;
                            }
                            break block24;
                        }
                        catch (IOException v2) {
                            throw r4_0.a(v2);
                        }
                    }
                    try {
                        this.D = var2_2.toByteArray();
                        this.O = this.O(0);
                        this.t = this.O(4);
                        this.d = (this.t - this.O) / r4_0.b(20724, 3577195196498838550L) + 1L;
                        v3 = var3_3;
                        if (var1_1 == null) {
                            v3.close();
                            var2_2.close();
                        }
                        ** GOTO lbl76
                    }
                    catch (IOException v4) {
                        throw r4_0.a(v4);
                    }
                }
                catch (Throwable var6_7) {
                    block30: {
                        try {
                            block29: {
                                block28: {
                                    block27: {
                                        try {
                                            v5 = var2_2;
                                            if (var1_1 != null) break block27;
                                            if (v5 == null) break block28;
                                        }
                                        catch (IOException v6) {
                                            throw r4_0.a(v6);
                                        }
                                        v5 = var2_2;
                                    }
                                    v5.close();
                                }
                                try {
                                    v7 = var3_3;
                                    if (var1_1 != null) break block29;
                                    if (v7 == null) break block30;
                                }
                                catch (IOException v8) {
                                    throw r4_0.a(v8);
                                }
                                v7 = var3_3;
                            }
                            v7.close();
                        }
                        catch (IOException var7_8) {
                            var7_8.printStackTrace();
                        }
                    }
                    r4_0.j.unlock();
                    throw var6_7;
                }
            }
            try {
                block25: {
                    try {
                        if (var2_2 != null) {
                            var2_2.close();
                        }
                    }
                    catch (IOException v9) {
                        throw r4_0.a(v9);
                    }
                    v3 = var3_3;
lbl76:
                    // 2 sources

                    try {
                        if (var1_1 != null) break block25;
                        if (v3 == null) break block26;
                    }
                    catch (IOException v10) {
                        throw r4_0.a(v10);
                    }
                    v3 = var3_3;
                }
                v3.close();
            }
            catch (IOException var5_6) {
                var5_6.printStackTrace();
            }
        }
        r4_0.j.unlock();
    }

    private long O(int n10) {
        long l2 = this.D[n10] & r4_0.a(25230, 2632127247376478522L);
        l2 |= (long)(this.D[n10 + 1] << r4_0.a(19144, 2468756639767943549L)) & r4_0.b(20914, 5217348183741760862L);
        l2 |= (long)(this.D[n10 + 2] << r4_0.a(476, 1303789394006053475L)) & r4_0.b(23788, 2107798338649327626L);
        return l2 |= (long)(this.D[n10 + 3] << r4_0.a(4649, 1689306692724097438L)) & r4_0.b(3469, 815612526011504996L);
    }

    private long j(int n10) {
        long l2 = this.D[n10] & r4_0.a(22791, 4089509435033275065L);
        l2 |= (long)(this.D[n10 + 1] << r4_0.a(19144, 2468756639767943549L) & r4_0.a(3032, 4441935611611551844L));
        return l2 |= (long)(this.D[n10 + 2] << r4_0.a(476, 1303789394006053475L) & r4_0.a(1996, 5028095084433183860L));
    }

    /*
     * Unable to fully structure code
     */
    private long G(long var1_1) {
        block20: {
            var4_2 = 0L;
            var3_3 = r4_0.g();
            var6_4 = this.d;
            var8_5 = 0L;
            while (var4_2 <= var6_4) {
                block24: {
                    block25: {
                        block23: {
                            block21: {
                                block22: {
                                    var8_5 = var4_2 + var6_4 >>> 1;
                                    var10_6 = this.O((int)(this.O + (var8_5 - 1L) * r4_0.b(23099, 9002145119942676180L)));
                                    var12_7 = this.O((int)(this.O + var8_5 * r4_0.b(23099, 9002145119942676180L)));
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = var10_6;
                                                        if (var3_3 != null) break block20;
                                                        cfr_temp_0 = v0 - var1_1;
                                                        v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                        if (var3_3 != null) break block21;
                                                    }
                                                    catch (NullPointerException v2) {
                                                        throw r4_0.a(v2);
                                                    }
                                                    if (v1 > 0) break block22;
                                                }
                                                catch (NullPointerException v3) {
                                                    throw r4_0.a(v3);
                                                }
                                                v1 = var1_1 == var12_7 ? 0 : (var1_1 < var12_7 ? -1 : 1);
                                                if (var3_3 != null) break block21;
                                            }
                                            catch (NullPointerException v4) {
                                                throw r4_0.a(v4);
                                            }
                                            if (v1 >= 0) break block22;
                                        }
                                        catch (NullPointerException v5) {
                                            throw r4_0.a(v5);
                                        }
                                        return this.j((int)(this.O + (var8_5 - 1L) * r4_0.b(23099, 9002145119942676180L) + r4_0.b(24383, 7845551952059632596L)));
                                    }
                                    catch (NullPointerException v6) {
                                        throw r4_0.a(v6);
                                    }
                                }
                                v1 = var1_1 == var10_6 ? 0 : (var1_1 < var10_6 ? -1 : 1);
                            }
                            try {
                                if (var3_3 != null) break block23;
                                if (v1 > 0) {
                                }
                                ** GOTO lbl52
                            }
                            catch (NullPointerException v7) {
                                throw r4_0.a(v7);
                            }
                            var4_2 = var8_5 + 1L;
                            try {
                                try {
                                    if (var3_3 == null) break block24;
lbl52:
                                    // 2 sources

                                    v8 = var1_1;
                                    v9 = var10_6;
                                    if (var3_3 != null) break block25;
                                }
                                catch (NullPointerException v10) {
                                    throw r4_0.a(v10);
                                }
                                cfr_temp_1 = v8 - v9;
                                v1 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            }
                            catch (NullPointerException v11) {
                                throw r4_0.a(v11);
                            }
                        }
                        try {
                            if (v1 >= 0) break block24;
                            v8 = var8_5;
                            v9 = 1L;
                        }
                        catch (NullPointerException v12) {
                            throw r4_0.a(v12);
                        }
                    }
                    var6_4 = v8 - v9;
                }
                if (var3_3 == null) continue;
            }
            v0 = r4_0.b(28367, 8696487647896189487L);
        }
        return v0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public C_ n(String string) {
        C_ c_;
        int[] nArray;
        block7: {
            long l2 = r4_0.d(string);
            j.lock();
            long l3 = this.G(l2);
            nArray = r4_0.g();
            try {
                block8: {
                    try {
                        if (nArray != null) break block7;
                        if (l3 == r4_0.b(2225, 2626678007929494608L)) break block8;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw r4_0.a(nullPointerException);
                    }
                    C_ c_2 = this.T((int)l3);
                    j.unlock();
                    return c_2;
                }
                j.unlock();
            }
            catch (Throwable throwable) {
                j.unlock();
                throw throwable;
            }
        }
        try {
            c_ = null;
            if (nArray != null) {
                ky_2.K(new String[5]);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw r4_0.a(nullPointerException);
        }
        return c_;
    }

    /*
     * Unable to fully structure code
     */
    private C_ T(int var1_1) {
        var3_2 = new C_();
        var2_3 = r4_0.g();
        try {
            block13: {
                block14: {
                    block11: {
                        block12: {
                            block15: {
                                var4_4 = this.D[var1_1 + 4];
                                try {
                                    v0 = var4_4;
                                    v1 = 1;
                                    if (var2_3 != null) break block11;
                                    if (v0 == v1) {
                                    }
                                    ** GOTO lbl36
                                }
                                catch (Exception v2) {
                                    throw r4_0.a(v2);
                                }
                                var5_6 = this.j(var1_1 + 5);
                                v3 = this;
                                if (var2_3 != null) break block15;
                                var4_4 = v3.D[(int)var5_6];
                                if (var4_4 != 2) ** GOTO lbl24
                                var7_8 = this.a((int)this.j((int)var5_6 + 1));
                                var3_2.w = var7_8.O;
                                var5_6 += r4_0.b(30020, 3415162406771466659L);
                                try {
                                    if (var2_3 == null) break block12;
lbl24:
                                    // 2 sources

                                    v3 = this;
                                }
                                catch (Exception v4) {
                                    throw r4_0.a(v4);
                                }
                            }
                            var7_8 = v3.a((int)var5_6);
                            var3_2.w = var7_8.O;
                            var5_6 += (long)var7_8.r;
                        }
                        try {
                            var3_2.N = this.R((int)var5_6);
                            if (var2_3 == null) break block13;
lbl36:
                            // 2 sources

                            v0 = var4_4;
                            v1 = 2;
                        }
                        catch (Exception v5) {
                            throw r4_0.a(v5);
                        }
                    }
                    try {
                        if (v0 != v1) break block14;
                        var3_2.w = this.a((int)((int)this.j((int)(var1_1 + 5)))).O;
                        var3_2.N = this.R(var1_1 + r4_0.a(19144, 2468756639767943549L));
                        if (var2_3 == null) break block13;
                    }
                    catch (Exception v6) {
                        throw r4_0.a(v6);
                    }
                }
                var5_7 = this.a(var1_1 + 4);
                var3_2.w = var5_7.O;
                var3_2.N = this.R(var1_1 + 4 + var5_7.r);
            }
            return var3_2;
        }
        catch (Exception var4_5) {
            return null;
        }
    }

    private String R(int n10) {
        block10: {
            block9: {
                int n11;
                int n12;
                block8: {
                    int n13 = this.D[n10];
                    int[] nArray = r4_0.g();
                    try {
                        try {
                            n12 = n13;
                            n11 = 1;
                            if (nArray != null) break block8;
                            if (n12 == n11) break block9;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw r4_0.a(nullPointerException);
                        }
                        n12 = n13;
                        n11 = 2;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw r4_0.a(nullPointerException);
                    }
                }
                if (n12 != n11) break block10;
            }
            long l2 = this.j(n10 + 1);
            try {
                if (l2 == 0L) {
                    return "";
                }
            }
            catch (NullPointerException nullPointerException) {
                throw r4_0.a(nullPointerException);
            }
            return this.a((int)((int)l2)).O;
        }
        return this.a((int)n10).O;
    }

    private il_2 a(int n10) {
        int n11 = n10;
        byte[] byArray = new byte[r4_0.a(1019, 2338536723095588930L)];
        int n12 = 0;
        byArray[n12] = this.D[n11++];
        int[] nArray = r4_0.g();
        while (byArray[n12] != 0) {
            byArray[++n12] = this.D[n11++];
            if (nArray == null) continue;
        }
        try {
            return new il_2(this, new String(byArray, 0, n12, r4_0.a(5888, -8985)), n12 + 1);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new il_2(this, "", 0);
        }
    }

    private static long d(String string) {
        String string2;
        block4: {
            block5: {
                int[] nArray = r4_0.g();
                try {
                    try {
                        string2 = string;
                        if (nArray != null) break block4;
                        if (string2 != null) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw r4_0.a(nullPointerException);
                    }
                    throw new NullPointerException(r4_0.a(5891, -32717));
                }
                catch (NullPointerException nullPointerException) {
                    throw r4_0.a(nullPointerException);
                }
            }
            string2 = string;
        }
        String[] stringArray = string2.split(r4_0.a(5890, -14364));
        long l2 = (Long.parseLong(stringArray[0]) & r4_0.b(9321, 7500518462892961927L)) << r4_0.a(29308, 6429960134631678410L) & r4_0.b(22767, 1101859275428924418L);
        l2 |= (Long.parseLong(stringArray[1]) & r4_0.b(4917, 842564939137632209L)) << r4_0.a(15019, 3351328360253597968L) & r4_0.b(21286, 5273684623249999822L);
        l2 |= (Long.parseLong(stringArray[2]) & r4_0.b(4917, 842564939137632209L)) << r4_0.a(7660, 6411686299430129233L) & r4_0.b(1697, 3791498003938005579L);
        return l2 |= Long.parseLong(stringArray[3]) & r4_0.b(4917, 842564939137632209L);
    }

    static File B(r4_0 r4_02) {
        return r4_02.v;
    }

    static Long A() {
        return o;
    }

    static Long N(Long l2) {
        o = l2;
        return o;
    }

    static void J(r4_0 r4_02) throws Exception {
        r4_02.r();
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
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 = "\u00c8\u0016\u4edc\u807a\u4e3e\u7a12\u0002\u00cf\u00a4";
                                var20_3 = "\u00c8\u0016\u4edc\u807a\u4e3e\u7a12\u0002\u00cf\u00a4".length();
                                r4_0.f(null);
                                var17_4 = 6;
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 33;
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
                                    var18_2 = "\u5271\u8f33\u00b00\u5e3d\u00f2\u0003\u00de\u00d8|";
                                    var20_3 = "\u5271\u8f33\u00b00\u5e3d\u00f2\u0003\u00de\u00d8|".length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 47;
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
                                            v15 = 87;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 99;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 99;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 82;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 90;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 42;
                                            break;
                                        }
                                        default: {
                                            v15 = 102;
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
                        r4_0.a = var21;
                        r4_0.b = new String[4];
                        var8_7 = 3262880761365241226L;
                        var14_8 = new long[12];
                        var11_9 = 0;
                        var12_10 = "\u00ea\u00e9(0\u00d5d\u0013\u00d3n[D\u00d7P\u00e2\u00fa\u00ee\u00bcj\u001b\u0084\u001e\u0006\u008f\u00f9\u009eQ\u0082\u00fc)e\u00d7\u00cc\u0080\u0092Z\u00e4\u00a7\u00f0\rH\u008b\tf\u00b4\t\u00d9\u0089\u00feIG\u00e0\u0000\u00e3:4\u008a\u00e8\u0092\u00f7\u00b3X\u0005\u0019\u00e4rj\u00f4\u00b2\u00a3\u00e0\u00c4\u00ff\u00f0\u0083`\u0014\u00fa!\u00ecO";
                        var13_11 = "\u00ea\u00e9(0\u00d5d\u0013\u00d3n[D\u00d7P\u00e2\u00fa\u00ee\u00bcj\u001b\u0084\u001e\u0006\u008f\u00f9\u009eQ\u0082\u00fc)e\u00d7\u00cc\u0080\u0092Z\u00e4\u00a7\u00f0\rH\u008b\tf\u00b4\t\u00d9\u0089\u00feIG\u00e0\u0000\u00e3:4\u008a\u00e8\u0092\u00f7\u00b3X\u0005\u0019\u00e4rj\u00f4\u00b2\u00a3\u00e0\u00c4\u00ff\u00f0\u0083`\u0014\u00fa!\u00ecO".length();
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
                            var12_10 = "\u0001\u00aa^jM#\u001c\f\u00b2\u00c4\u00a1P\u0005\u0005|X";
                            var13_11 = "\u0001\u00aa^jM#\u001c\f\u00b2\u00c4\u00a1P\u0005\u0005|X".length();
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
                r4_0.c = var14_8;
                r4_0.f = new Integer[12];
                var0_14 = 7576068204085732757L;
                var6_15 = new long[16];
                var3_16 = 0;
                var4_17 = "]\u00bd\u0082\u00bc\u00f9\u00faH\u00de\u0005\u00c3f\n\u0083\u00canE \f}\u00dd\u0010\u0017\u00e2[br:\u00a1\u00ca\u00ef<\u00f1\u00014\u00a8)!W\u0015\u00ed\u0015\u00cd\u0092\u00ae\u00d8\u001akF!D'c\u009b\u00dc\u009f\u00cbfi\u000e\u00c8\u00fd\u00c0i\u0097X\u0087Y\u00f0A%a\u0084X}\u0093\"W\u00d9q\u00c4\u00eelGk;: E\u00b2\u00af\u00b3\u00a0\u00ec\u00a1F:tc\u00fe\u008f\u00b3\fm\u009fFF\u0081\u00f9\u000bH\u00c42";
                var5_18 = "]\u00bd\u0082\u00bc\u00f9\u00faH\u00de\u0005\u00c3f\n\u0083\u00canE \f}\u00dd\u0010\u0017\u00e2[br:\u00a1\u00ca\u00ef<\u00f1\u00014\u00a8)!W\u0015\u00ed\u0015\u00cd\u0092\u00ae\u00d8\u001akF!D'c\u009b\u00dc\u009f\u00cbfi\u000e\u00c8\u00fd\u00c0i\u0097X\u0087Y\u00f0A%a\u0084X}\u0093\"W\u00d9q\u00c4\u00eelGk;: E\u00b2\u00af\u00b3\u00a0\u00ec\u00a1F:tc\u00fe\u008f\u00b3\fm\u009fFF\u0081\u00f9\u000bH\u00c42".length();
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
                    var4_17 = "b\u0092\u00fd\u00bdK\u00d6\"\u00bb\u0011\u0088t\u0087nOI\u00e9";
                    var5_18 = "b\u0092\u00fd\u00bdK\u00d6\"\u00bb\u0011\u0088t\u0087nOI\u00e9".length();
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
        r4_0.g = var6_15;
        r4_0.h = new Long[16];
        r4_0.j = new ReentrantLock();
        r4_0.o = 0L;
        r4_0.e = false;
    }

    public static void f(int[] nArray) {
        y = nArray;
    }

    public static int[] g() {
        return y;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1703) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 68;
                    break;
                }
                case 1: {
                    n14 = 140;
                    break;
                }
                case 2: {
                    n14 = 239;
                    break;
                }
                case 3: {
                    n14 = 127;
                    break;
                }
                case 4: {
                    n14 = 51;
                    break;
                }
                case 5: {
                    n14 = 9;
                    break;
                }
                case 6: {
                    n14 = 56;
                    break;
                }
                case 7: {
                    n14 = 123;
                    break;
                }
                case 8: {
                    n14 = 19;
                    break;
                }
                case 9: {
                    n14 = 167;
                    break;
                }
                case 10: {
                    n14 = 198;
                    break;
                }
                case 11: {
                    n14 = 146;
                    break;
                }
                case 12: {
                    n14 = 125;
                    break;
                }
                case 13: {
                    n14 = 93;
                    break;
                }
                case 14: {
                    n14 = 57;
                    break;
                }
                case 15: {
                    n14 = 205;
                    break;
                }
                case 16: {
                    n14 = 234;
                    break;
                }
                case 17: {
                    n14 = 245;
                    break;
                }
                case 18: {
                    n14 = 61;
                    break;
                }
                case 19: {
                    n14 = 107;
                    break;
                }
                case 20: {
                    n14 = 158;
                    break;
                }
                case 21: {
                    n14 = 211;
                    break;
                }
                case 22: {
                    n14 = 90;
                    break;
                }
                case 23: {
                    n14 = 117;
                    break;
                }
                case 24: {
                    n14 = 108;
                    break;
                }
                case 25: {
                    n14 = 60;
                    break;
                }
                case 26: {
                    n14 = 85;
                    break;
                }
                case 27: {
                    n14 = 155;
                    break;
                }
                case 28: {
                    n14 = 71;
                    break;
                }
                case 29: {
                    n14 = 76;
                    break;
                }
                case 30: {
                    n14 = 87;
                    break;
                }
                case 31: {
                    n14 = 145;
                    break;
                }
                case 32: {
                    n14 = 249;
                    break;
                }
                case 33: {
                    n14 = 134;
                    break;
                }
                case 34: {
                    n14 = 240;
                    break;
                }
                case 35: {
                    n14 = 88;
                    break;
                }
                case 36: {
                    n14 = 232;
                    break;
                }
                case 37: {
                    n14 = 162;
                    break;
                }
                case 38: {
                    n14 = 216;
                    break;
                }
                case 39: {
                    n14 = 115;
                    break;
                }
                case 40: {
                    n14 = 100;
                    break;
                }
                case 41: {
                    n14 = 225;
                    break;
                }
                case 42: {
                    n14 = 3;
                    break;
                }
                case 43: {
                    n14 = 131;
                    break;
                }
                case 44: {
                    n14 = 182;
                    break;
                }
                case 45: {
                    n14 = 23;
                    break;
                }
                case 46: {
                    n14 = 26;
                    break;
                }
                case 47: {
                    n14 = 144;
                    break;
                }
                case 48: {
                    n14 = 132;
                    break;
                }
                case 49: {
                    n14 = 252;
                    break;
                }
                case 50: {
                    n14 = 25;
                    break;
                }
                case 51: {
                    n14 = 73;
                    break;
                }
                case 52: {
                    n14 = 59;
                    break;
                }
                case 53: {
                    n14 = 48;
                    break;
                }
                case 54: {
                    n14 = 224;
                    break;
                }
                case 55: {
                    n14 = 236;
                    break;
                }
                case 56: {
                    n14 = 253;
                    break;
                }
                case 57: {
                    n14 = 243;
                    break;
                }
                case 58: {
                    n14 = 174;
                    break;
                }
                case 59: {
                    n14 = 20;
                    break;
                }
                case 60: {
                    n14 = 151;
                    break;
                }
                case 61: {
                    n14 = 94;
                    break;
                }
                case 62: {
                    n14 = 166;
                    break;
                }
                case 63: {
                    n14 = 196;
                    break;
                }
                case 64: {
                    n14 = 33;
                    break;
                }
                case 65: {
                    n14 = 248;
                    break;
                }
                case 66: {
                    n14 = 91;
                    break;
                }
                case 67: {
                    n14 = 18;
                    break;
                }
                case 68: {
                    n14 = 113;
                    break;
                }
                case 69: {
                    n14 = 126;
                    break;
                }
                case 70: {
                    n14 = 62;
                    break;
                }
                case 71: {
                    n14 = 226;
                    break;
                }
                case 72: {
                    n14 = 10;
                    break;
                }
                case 73: {
                    n14 = 14;
                    break;
                }
                case 74: {
                    n14 = 241;
                    break;
                }
                case 75: {
                    n14 = 254;
                    break;
                }
                case 76: {
                    n14 = 135;
                    break;
                }
                case 77: {
                    n14 = 99;
                    break;
                }
                case 78: {
                    n14 = 217;
                    break;
                }
                case 79: {
                    n14 = 13;
                    break;
                }
                case 80: {
                    n14 = 207;
                    break;
                }
                case 81: {
                    n14 = 1;
                    break;
                }
                case 82: {
                    n14 = 74;
                    break;
                }
                case 83: {
                    n14 = 209;
                    break;
                }
                case 84: {
                    n14 = 65;
                    break;
                }
                case 85: {
                    n14 = 96;
                    break;
                }
                case 86: {
                    n14 = 165;
                    break;
                }
                case 87: {
                    n14 = 129;
                    break;
                }
                case 88: {
                    n14 = 177;
                    break;
                }
                case 89: {
                    n14 = 102;
                    break;
                }
                case 90: {
                    n14 = 55;
                    break;
                }
                case 91: {
                    n14 = 179;
                    break;
                }
                case 92: {
                    n14 = 238;
                    break;
                }
                case 93: {
                    n14 = 121;
                    break;
                }
                case 94: {
                    n14 = 219;
                    break;
                }
                case 95: {
                    n14 = 220;
                    break;
                }
                case 96: {
                    n14 = 250;
                    break;
                }
                case 97: {
                    n14 = 110;
                    break;
                }
                case 98: {
                    n14 = 0;
                    break;
                }
                case 99: {
                    n14 = 139;
                    break;
                }
                case 100: {
                    n14 = 244;
                    break;
                }
                case 101: {
                    n14 = 137;
                    break;
                }
                case 102: {
                    n14 = 124;
                    break;
                }
                case 103: {
                    n14 = 66;
                    break;
                }
                case 104: {
                    n14 = 97;
                    break;
                }
                case 105: {
                    n14 = 194;
                    break;
                }
                case 106: {
                    n14 = 175;
                    break;
                }
                case 107: {
                    n14 = 80;
                    break;
                }
                case 108: {
                    n14 = 105;
                    break;
                }
                case 109: {
                    n14 = 112;
                    break;
                }
                case 110: {
                    n14 = 181;
                    break;
                }
                case 111: {
                    n14 = 50;
                    break;
                }
                case 112: {
                    n14 = 47;
                    break;
                }
                case 113: {
                    n14 = 153;
                    break;
                }
                case 114: {
                    n14 = 142;
                    break;
                }
                case 115: {
                    n14 = 141;
                    break;
                }
                case 116: {
                    n14 = 81;
                    break;
                }
                case 117: {
                    n14 = 44;
                    break;
                }
                case 118: {
                    n14 = 43;
                    break;
                }
                case 119: {
                    n14 = 45;
                    break;
                }
                case 120: {
                    n14 = 176;
                    break;
                }
                case 121: {
                    n14 = 16;
                    break;
                }
                case 122: {
                    n14 = 119;
                    break;
                }
                case 123: {
                    n14 = 180;
                    break;
                }
                case 124: {
                    n14 = 72;
                    break;
                }
                case 125: {
                    n14 = 201;
                    break;
                }
                case 126: {
                    n14 = 4;
                    break;
                }
                case 127: {
                    n14 = 143;
                    break;
                }
                case 128: {
                    n14 = 214;
                    break;
                }
                case 129: {
                    n14 = 251;
                    break;
                }
                case 130: {
                    n14 = 53;
                    break;
                }
                case 131: {
                    n14 = 70;
                    break;
                }
                case 132: {
                    n14 = 178;
                    break;
                }
                case 133: {
                    n14 = 15;
                    break;
                }
                case 134: {
                    n14 = 52;
                    break;
                }
                case 135: {
                    n14 = 163;
                    break;
                }
                case 136: {
                    n14 = 221;
                    break;
                }
                case 137: {
                    n14 = 172;
                    break;
                }
                case 138: {
                    n14 = 154;
                    break;
                }
                case 139: {
                    n14 = 37;
                    break;
                }
                case 140: {
                    n14 = 133;
                    break;
                }
                case 141: {
                    n14 = 197;
                    break;
                }
                case 142: {
                    n14 = 161;
                    break;
                }
                case 143: {
                    n14 = 114;
                    break;
                }
                case 144: {
                    n14 = 147;
                    break;
                }
                case 145: {
                    n14 = 42;
                    break;
                }
                case 146: {
                    n14 = 193;
                    break;
                }
                case 147: {
                    n14 = 169;
                    break;
                }
                case 148: {
                    n14 = 89;
                    break;
                }
                case 149: {
                    n14 = 218;
                    break;
                }
                case 150: {
                    n14 = 95;
                    break;
                }
                case 151: {
                    n14 = 195;
                    break;
                }
                case 152: {
                    n14 = 11;
                    break;
                }
                case 153: {
                    n14 = 185;
                    break;
                }
                case 154: {
                    n14 = 17;
                    break;
                }
                case 155: {
                    n14 = 39;
                    break;
                }
                case 156: {
                    n14 = 41;
                    break;
                }
                case 157: {
                    n14 = 191;
                    break;
                }
                case 158: {
                    n14 = 202;
                    break;
                }
                case 159: {
                    n14 = 103;
                    break;
                }
                case 160: {
                    n14 = 32;
                    break;
                }
                case 161: {
                    n14 = 136;
                    break;
                }
                case 162: {
                    n14 = 235;
                    break;
                }
                case 163: {
                    n14 = 228;
                    break;
                }
                case 164: {
                    n14 = 30;
                    break;
                }
                case 165: {
                    n14 = 38;
                    break;
                }
                case 166: {
                    n14 = 6;
                    break;
                }
                case 167: {
                    n14 = 160;
                    break;
                }
                case 168: {
                    n14 = 190;
                    break;
                }
                case 169: {
                    n14 = 22;
                    break;
                }
                case 170: {
                    n14 = 58;
                    break;
                }
                case 171: {
                    n14 = 200;
                    break;
                }
                case 172: {
                    n14 = 152;
                    break;
                }
                case 173: {
                    n14 = 21;
                    break;
                }
                case 174: {
                    n14 = 83;
                    break;
                }
                case 175: {
                    n14 = 168;
                    break;
                }
                case 176: {
                    n14 = 98;
                    break;
                }
                case 177: {
                    n14 = 213;
                    break;
                }
                case 178: {
                    n14 = 222;
                    break;
                }
                case 179: {
                    n14 = 12;
                    break;
                }
                case 180: {
                    n14 = 148;
                    break;
                }
                case 181: {
                    n14 = 159;
                    break;
                }
                case 182: {
                    n14 = 229;
                    break;
                }
                case 183: {
                    n14 = 192;
                    break;
                }
                case 184: {
                    n14 = 208;
                    break;
                }
                case 185: {
                    n14 = 255;
                    break;
                }
                case 186: {
                    n14 = 120;
                    break;
                }
                case 187: {
                    n14 = 40;
                    break;
                }
                case 188: {
                    n14 = 2;
                    break;
                }
                case 189: {
                    n14 = 35;
                    break;
                }
                case 190: {
                    n14 = 92;
                    break;
                }
                case 191: {
                    n14 = 173;
                    break;
                }
                case 192: {
                    n14 = 150;
                    break;
                }
                case 193: {
                    n14 = 84;
                    break;
                }
                case 194: {
                    n14 = 188;
                    break;
                }
                case 195: {
                    n14 = 46;
                    break;
                }
                case 196: {
                    n14 = 5;
                    break;
                }
                case 197: {
                    n14 = 138;
                    break;
                }
                case 198: {
                    n14 = 118;
                    break;
                }
                case 199: {
                    n14 = 204;
                    break;
                }
                case 200: {
                    n14 = 34;
                    break;
                }
                case 201: {
                    n14 = 8;
                    break;
                }
                case 202: {
                    n14 = 24;
                    break;
                }
                case 203: {
                    n14 = 28;
                    break;
                }
                case 204: {
                    n14 = 215;
                    break;
                }
                case 205: {
                    n14 = 227;
                    break;
                }
                case 206: {
                    n14 = 130;
                    break;
                }
                case 207: {
                    n14 = 111;
                    break;
                }
                case 208: {
                    n14 = 64;
                    break;
                }
                case 209: {
                    n14 = 122;
                    break;
                }
                case 210: {
                    n14 = 101;
                    break;
                }
                case 211: {
                    n14 = 31;
                    break;
                }
                case 212: {
                    n14 = 187;
                    break;
                }
                case 213: {
                    n14 = 86;
                    break;
                }
                case 214: {
                    n14 = 36;
                    break;
                }
                case 215: {
                    n14 = 246;
                    break;
                }
                case 216: {
                    n14 = 186;
                    break;
                }
                case 217: {
                    n14 = 54;
                    break;
                }
                case 218: {
                    n14 = 203;
                    break;
                }
                case 219: {
                    n14 = 78;
                    break;
                }
                case 220: {
                    n14 = 104;
                    break;
                }
                case 221: {
                    n14 = 206;
                    break;
                }
                case 222: {
                    n14 = 156;
                    break;
                }
                case 223: {
                    n14 = 210;
                    break;
                }
                case 224: {
                    n14 = 247;
                    break;
                }
                case 225: {
                    n14 = 171;
                    break;
                }
                case 226: {
                    n14 = 75;
                    break;
                }
                case 227: {
                    n14 = 183;
                    break;
                }
                case 228: {
                    n14 = 69;
                    break;
                }
                case 229: {
                    n14 = 106;
                    break;
                }
                case 230: {
                    n14 = 231;
                    break;
                }
                case 231: {
                    n14 = 29;
                    break;
                }
                case 232: {
                    n14 = 242;
                    break;
                }
                case 233: {
                    n14 = 7;
                    break;
                }
                case 234: {
                    n14 = 116;
                    break;
                }
                case 235: {
                    n14 = 82;
                    break;
                }
                case 236: {
                    n14 = 128;
                    break;
                }
                case 237: {
                    n14 = 109;
                    break;
                }
                case 238: {
                    n14 = 149;
                    break;
                }
                case 239: {
                    n14 = 212;
                    break;
                }
                case 240: {
                    n14 = 77;
                    break;
                }
                case 241: {
                    n14 = 199;
                    break;
                }
                case 242: {
                    n14 = 189;
                    break;
                }
                case 243: {
                    n14 = 170;
                    break;
                }
                case 244: {
                    n14 = 223;
                    break;
                }
                case 245: {
                    n14 = 164;
                    break;
                }
                case 246: {
                    n14 = 67;
                    break;
                }
                case 247: {
                    n14 = 233;
                    break;
                }
                case 248: {
                    n14 = 79;
                    break;
                }
                case 249: {
                    n14 = 184;
                    break;
                }
                case 250: {
                    n14 = 157;
                    break;
                }
                case 251: {
                    n14 = 237;
                    break;
                }
                case 252: {
                    n14 = 63;
                    break;
                }
                case 253: {
                    n14 = 49;
                    break;
                }
                case 254: {
                    n14 = 27;
                    break;
                }
                default: {
                    n14 = 230;
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
            r4_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x13BD;
        if (f[n11] == null) {
            r4_0.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x54EA) & Short.MAX_VALUE;
        if (h[n11] == null) {
            r4_0.h[n11] = g[n11] ^ l2;
        }
        return h[n11];
    }
}

