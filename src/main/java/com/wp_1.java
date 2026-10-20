/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_2;
import com.kr_2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from com.wP
 */
public class wp_1 {
    private byte[] i;
    private long N;
    private long B;
    private long a;
    private static ReentrantLock R;
    private static Long d;
    public static boolean Q;
    private File V;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final long[] g;
    private static final Long[] h;

    public wp_1(String string) throws Exception {
        block5: {
            wp_1 wp_12;
            block4: {
                this.V = new File(string);
                String string2 = co_2.n();
                try {
                    try {
                        wp_12 = this;
                        if (string2 != null) break block4;
                        wp_12.F();
                        if (!Q) break block5;
                    }
                    catch (Exception exception) {
                        throw wp_1.a(exception);
                    }
                    wp_12 = this;
                }
                catch (Exception exception) {
                    throw wp_1.a(exception);
                }
            }
            wp_12.x();
        }
    }

    private void x() {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new kr_2(this), wp_1.b(3657, 7962660249290777586L), wp_1.b(26937, 2012428184418403467L), TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private void F() throws Exception {
        block24: {
            block22: {
                wp_1.d = this.V.lastModified();
                var1_1 = co_2.n();
                var2_2 = null;
                var3_3 = null;
                wp_1.R.lock();
                try {
                    var2_2 = new ByteArrayOutputStream();
                    var4_4 = new byte[wp_1.a(32610, 7788410548130961347L)];
                    var3_3 = new FileInputStream(this.V);
                    while (var3_3.read(var4_4) != -1) {
                        try {
                            var2_2.write(var4_4);
                            if (var1_1 == null) {
                                if (var1_1 == null) continue;
                                break;
                            }
                            break block22;
                        }
                        catch (IOException v0) {
                            throw wp_1.a(v0);
                        }
                    }
                    try {
                        this.i = var2_2.toByteArray();
                        this.N = this.M(0);
                        this.B = this.M(4);
                        this.a = (this.B - this.N) / wp_1.b(26339, 7678955157537409886L) + 1L;
                        v1 = var3_3;
                        if (var1_1 == null) {
                            v1.close();
                            var2_2.close();
                        }
                        ** GOTO lbl70
                    }
                    catch (IOException v2) {
                        throw wp_1.a(v2);
                    }
                }
                catch (Throwable var5_6) {
                    block28: {
                        try {
                            block27: {
                                block26: {
                                    block25: {
                                        try {
                                            v3 = var2_2;
                                            if (var1_1 != null) break block25;
                                            if (v3 == null) break block26;
                                        }
                                        catch (IOException v4) {
                                            throw wp_1.a(v4);
                                        }
                                        v3 = var2_2;
                                    }
                                    v3.close();
                                }
                                try {
                                    v5 = var3_3;
                                    if (var1_1 != null) break block27;
                                    if (v5 == null) break block28;
                                }
                                catch (IOException v6) {
                                    throw wp_1.a(v6);
                                }
                                v5 = var3_3;
                            }
                            v5.close();
                        }
                        catch (IOException var6_7) {
                            var6_7.printStackTrace();
                        }
                    }
                    wp_1.R.unlock();
                    throw var5_6;
                }
            }
            try {
                block23: {
                    try {
                        if (var2_2 != null) {
                            var2_2.close();
                        }
                    }
                    catch (IOException v7) {
                        throw wp_1.a(v7);
                    }
                    v1 = var3_3;
lbl70:
                    // 2 sources

                    try {
                        if (var1_1 != null) break block23;
                        if (v1 == null) break block24;
                    }
                    catch (IOException v8) {
                        throw wp_1.a(v8);
                    }
                    v1 = var3_3;
                }
                v1.close();
            }
            catch (IOException var4_5) {
                var4_5.printStackTrace();
            }
        }
        wp_1.R.unlock();
    }

    private long M(int n10) {
        long l2 = this.i[n10] & wp_1.a(14828, 3223381710762348876L);
        l2 |= (long)(this.i[n10 + 1] << wp_1.a(18481, 8325728160593731733L)) & wp_1.b(26165, 8030282212614261637L);
        l2 |= (long)(this.i[n10 + 2] << wp_1.a(24260, 7412995842788718177L)) & wp_1.b(25622, 8048238410777741737L);
        return l2 |= (long)(this.i[n10 + 3] << wp_1.a(31883, 3030968669311325220L)) & wp_1.b(25497, 8699545119522049569L);
    }

    private long f(int n10) {
        long l2 = this.i[n10] & wp_1.a(20299, 7138310426090170342L);
        l2 |= (long)(this.i[n10 + 1] << wp_1.a(27782, 7708190420057408545L) & wp_1.a(32053, 1488828853466650003L));
        return l2 |= (long)(this.i[n10 + 2] << wp_1.a(12091, 7044446676016924569L) & wp_1.a(24950, 4957810942667737557L));
    }

    /*
     * Unable to fully structure code
     */
    private co_2 k(long var1_1) {
        var4_2 = 0L;
        var3_3 = co_2.n();
        var6_4 = this.a;
        var8_5 = 0L;
        while (var4_2 <= var6_4) {
            block21: {
                block22: {
                    block20: {
                        block18: {
                            block19: {
                                var8_5 = var4_2 + var6_4 >>> 1;
                                var10_6 = this.M((int)(this.N + (var8_5 - 1L) * wp_1.b(30745, 1484632164805662127L)));
                                var12_7 = this.M((int)(this.N + var8_5 * wp_1.b(26339, 7678955157537409886L)));
                                try {
                                    try {
                                        try {
                                            try {
                                                v0 = var10_6 == var1_1 ? 0 : (var10_6 < var1_1 ? -1 : 1);
                                                if (var3_3 != null) break block18;
                                                if (v0 > 0) break block19;
                                            }
                                            catch (NullPointerException v1) {
                                                throw wp_1.a(v1);
                                            }
                                            v0 = var1_1 == var12_7 ? 0 : (var1_1 < var12_7 ? -1 : 1);
                                            if (var3_3 != null) break block18;
                                        }
                                        catch (NullPointerException v2) {
                                            throw wp_1.a(v2);
                                        }
                                        if (v0 >= 0) break block19;
                                    }
                                    catch (NullPointerException v3) {
                                        throw wp_1.a(v3);
                                    }
                                    return this.C((int)this.f((int)(this.N + (var8_5 - 1L) * wp_1.b(26339, 7678955157537409886L) + wp_1.b(5, 9031695613097717170L))), (int)this.f((int)(this.N + (var8_5 - 1L) * wp_1.b(26339, 7678955157537409886L) + wp_1.b(3430, 9195321388771254487L))));
                                }
                                catch (NullPointerException v4) {
                                    throw wp_1.a(v4);
                                }
                            }
                            v0 = var1_1 == var10_6 ? 0 : (var1_1 < var10_6 ? -1 : 1);
                        }
                        try {
                            if (var3_3 != null) break block20;
                            if (v0 > 0) {
                            }
                            ** GOTO lbl45
                        }
                        catch (NullPointerException v5) {
                            throw wp_1.a(v5);
                        }
                        var4_2 = var8_5 + 1L;
                        try {
                            try {
                                if (var3_3 == null) break block21;
lbl45:
                                // 2 sources

                                v6 = var1_1;
                                v7 = var10_6;
                                if (var3_3 != null) break block22;
                            }
                            catch (NullPointerException v8) {
                                throw wp_1.a(v8);
                            }
                            cfr_temp_0 = v6 - v7;
                            v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        }
                        catch (NullPointerException v9) {
                            throw wp_1.a(v9);
                        }
                    }
                    try {
                        if (v0 >= 0) break block21;
                        v6 = var8_5;
                        v7 = 1L;
                    }
                    catch (NullPointerException v10) {
                        throw wp_1.a(v10);
                    }
                }
                var6_4 = v6 - v7;
            }
            if (var3_3 == null) continue;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public co_2 v(String string) {
        long l2 = wp_1.s(string);
        R.lock();
        try {
            co_2 co_22 = this.k(l2);
            return co_22;
        }
        finally {
            R.unlock();
        }
    }

    private co_2 C(int n10, int n11) {
        co_2 co_22 = new co_2();
        try {
            co_22.e = this.B(n10);
            co_22.x = this.B(n11);
            return co_22;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private String B(int n10) {
        int n11 = n10;
        byte[] byArray = new byte[wp_1.a(31395, 9142221259539960333L)];
        int n12 = 0;
        byArray[n12] = this.i[n11++];
        String string = co_2.n();
        while (byArray[n12] != 0) {
            byArray[++n12] = this.i[n11++];
            if (string == null) continue;
        }
        try {
            return new String(byArray, 0, n12, wp_1.a(10175, 16877));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String("");
        }
    }

    private static long s(String string) {
        String string2;
        block4: {
            block5: {
                String string3 = co_2.n();
                try {
                    try {
                        string2 = string;
                        if (string3 != null) break block4;
                        if (string2 != null) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw wp_1.a(nullPointerException);
                    }
                    throw new NullPointerException(wp_1.a(10173, 13679));
                }
                catch (NullPointerException nullPointerException) {
                    throw wp_1.a(nullPointerException);
                }
            }
            string2 = string;
        }
        String[] stringArray = string2.split(wp_1.a(10172, 1014));
        long l2 = (Long.parseLong(stringArray[0]) & wp_1.b(30582, 4444391853501110991L)) << wp_1.a(12449, 2027589126606985229L) & wp_1.b(29227, 1699530181132246935L);
        l2 |= (Long.parseLong(stringArray[1]) & wp_1.b(25150, 7138689974477016960L)) << wp_1.a(24260, 7412995842788718177L) & wp_1.b(31993, 5532040005086597450L);
        l2 |= (Long.parseLong(stringArray[2]) & wp_1.b(25150, 7138689974477016960L)) << wp_1.a(18481, 8325728160593731733L) & wp_1.b(25483, 6529429953164103217L);
        return l2 |= Long.parseLong(stringArray[3]) & wp_1.b(25150, 7138689974477016960L);
    }

    public static void main(String[] stringArray) {
        try {
            wp_1 wp_12 = new wp_1(wp_1.a(10168, -29760));
            System.out.println(wp_12.v(wp_1.a(10174, 32537)));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static File h(wp_1 wp_12) {
        return wp_12.V;
    }

    static Long T() {
        return d;
    }

    static Long D(Long l2) {
        d = l2;
        return d;
    }

    static void p(wp_1 wp_12) throws Exception {
        wp_12.F();
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
                                var18_2 = "\u009b\u009f\u0006\u00cd\u00e7\u4e17\u80cd\u4eee\u7a7d\r\u0098[\u00d2\u00e0\u00e62w\u00fe\"\u00eb\u00c6\u00ea\u00f8";
                                var20_3 = "\u009b\u009f\u0006\u00cd\u00e7\u4e17\u80cd\u4eee\u7a7d\r\u0098[\u00d2\u00e0\u00e62w\u00fe\"\u00eb\u00c6\u00ea\u00f8".length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 110;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00d2\u0012\u00a9\b\u00dfjv\u00b4\u00d5\u00a1D\u00d0";
                                    var20_3 = "\u00d2\u0012\u00a9\b\u00dfjv\u00b4\u00d5\u00a1D\u00d0".length();
                                    var17_4 = 3;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 88;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
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
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 32;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 73;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 64;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 56;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 49;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 88;
                                            break;
                                        }
                                        default: {
                                            v15 = 1;
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
lbl85:
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
lbl95:
                                // 1 sources

                                ** continue;
                            }
                        }
                        wp_1.b = var21;
                        wp_1.c = new String[5];
                        var8_7 = 2100641318089096732L;
                        var14_8 = new long[12];
                        var11_9 = 0;
                        var12_10 = "\b?\u00f6\u00d5\u0013\u000e\u00d4\u008f\u00e0@#y\u00c5\u00a2:5\u00db\u00be\u00e1?\u00a9\u0092\u009e\u0081\u008eO\u00ed\u001cW\u00eb\bm\u00fb\u00a7\"\u0092\u00ee\u001e\u00f9\u0095\u00a8\u0087\u00a5\u00f9\u00c8\u008b7\u00c9:\u00e2\u00a4\u00edXNo\u00af\u00c5u\u00ff\u00a0\u00dbu-\u00df\u00deM\u00a9ge\u00d2,\u0091\u001e\u00d2Yv\u0006\u0096\u00aa ";
                        var13_11 = "\b?\u00f6\u00d5\u0013\u000e\u00d4\u008f\u00e0@#y\u00c5\u00a2:5\u00db\u00be\u00e1?\u00a9\u0092\u009e\u0081\u008eO\u00ed\u001cW\u00eb\bm\u00fb\u00a7\"\u0092\u00ee\u001e\u00f9\u0095\u00a8\u0087\u00a5\u00f9\u00c8\u008b7\u00c9:\u00e2\u00a4\u00edXNo\u00af\u00c5u\u00ff\u00a0\u00dbu-\u00df\u00deM\u00a9ge\u00d2,\u0091\u001e\u00d2Yv\u0006\u0096\u00aa ".length();
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
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00a1P\b\u00b1D\u00ef\u00e6\t\u008d\u0083\u00b0\u00e16\u00a7\u0019\u0005";
                            var13_11 = "\u00a1P\b\u00b1D\u00ef\u00e6\t\u008d\u0083\u00b0\u00e16\u00a7\u0019\u0005".length();
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
lbl125:
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
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                wp_1.e = var14_8;
                wp_1.f = new Integer[12];
                var0_14 = 5819792364533243225L;
                var6_15 = new long[14];
                var3_16 = 0;
                var4_17 = "\nY?\u00a0\u009a\u00aclh>E\u0003\u001d \u0091}C(~\u00f0cy\u0010\u0093xmi\u00a8\u0085\u00cc\u001a\u0007i3\u00d5\u00b6\u00e7\u00b0\u00d0\u0092&?u\u0018c\\x\u0014\u00f0GQ\u00ff\u00e3.\u00f9\u0082\u00ce:U/U\u00c1\u00a3\u0016\rK)\u009a\u0097V\u00b6\u008aZ\u001c\u0001\u00cfA0\u0018\f\u0013?\u00b5Erc\u008a\u00e9\u00dc/XVG\u00a7\u00cb\u00fd\u0089";
                var5_18 = "\nY?\u00a0\u009a\u00aclh>E\u0003\u001d \u0091}C(~\u00f0cy\u0010\u0093xmi\u00a8\u0085\u00cc\u001a\u0007i3\u00d5\u00b6\u00e7\u00b0\u00d0\u0092&?u\u0018c\\x\u0014\u00f0GQ\u00ff\u00e3.\u00f9\u0082\u00ce:U/U\u00c1\u00a3\u0016\rK)\u009a\u0097V\u00b6\u008aZ\u001c\u0001\u00cfA0\u0018\f\u0013?\u00b5Erc\u008a\u00e9\u00dc/XVG\u00a7\u00cb\u00fd\u0089".length();
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
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "D^wD\u00af\u00d4\u0088\u00fc-\u0093\t\u001c\u00c8\u00acp\u00ef";
                    var5_18 = "D^wD\u00af\u00d4\u0088\u00fc-\u0093\t\u001c\u00c8\u00acp\u00ef".length();
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
lbl166:
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
lbl177:
                // 1 sources

                ** continue;
            }
        }
        wp_1.g = var6_15;
        wp_1.h = new Long[14];
        wp_1.R = new ReentrantLock();
        wp_1.d = 0L;
        wp_1.Q = false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x27BC) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 60;
                    break;
                }
                case 1: {
                    n14 = 185;
                    break;
                }
                case 2: {
                    n14 = 208;
                    break;
                }
                case 3: {
                    n14 = 118;
                    break;
                }
                case 4: {
                    n14 = 57;
                    break;
                }
                case 5: {
                    n14 = 230;
                    break;
                }
                case 6: {
                    n14 = 17;
                    break;
                }
                case 7: {
                    n14 = 127;
                    break;
                }
                case 8: {
                    n14 = 212;
                    break;
                }
                case 9: {
                    n14 = 96;
                    break;
                }
                case 10: {
                    n14 = 149;
                    break;
                }
                case 11: {
                    n14 = 42;
                    break;
                }
                case 12: {
                    n14 = 76;
                    break;
                }
                case 13: {
                    n14 = 181;
                    break;
                }
                case 14: {
                    n14 = 235;
                    break;
                }
                case 15: {
                    n14 = 157;
                    break;
                }
                case 16: {
                    n14 = 30;
                    break;
                }
                case 17: {
                    n14 = 89;
                    break;
                }
                case 18: {
                    n14 = 163;
                    break;
                }
                case 19: {
                    n14 = 201;
                    break;
                }
                case 20: {
                    n14 = 114;
                    break;
                }
                case 21: {
                    n14 = 179;
                    break;
                }
                case 22: {
                    n14 = 251;
                    break;
                }
                case 23: {
                    n14 = 238;
                    break;
                }
                case 24: {
                    n14 = 217;
                    break;
                }
                case 25: {
                    n14 = 15;
                    break;
                }
                case 26: {
                    n14 = 46;
                    break;
                }
                case 27: {
                    n14 = 4;
                    break;
                }
                case 28: {
                    n14 = 182;
                    break;
                }
                case 29: {
                    n14 = 218;
                    break;
                }
                case 30: {
                    n14 = 198;
                    break;
                }
                case 31: {
                    n14 = 159;
                    break;
                }
                case 32: {
                    n14 = 176;
                    break;
                }
                case 33: {
                    n14 = 231;
                    break;
                }
                case 34: {
                    n14 = 206;
                    break;
                }
                case 35: {
                    n14 = 124;
                    break;
                }
                case 36: {
                    n14 = 202;
                    break;
                }
                case 37: {
                    n14 = 136;
                    break;
                }
                case 38: {
                    n14 = 8;
                    break;
                }
                case 39: {
                    n14 = 28;
                    break;
                }
                case 40: {
                    n14 = 203;
                    break;
                }
                case 41: {
                    n14 = 51;
                    break;
                }
                case 42: {
                    n14 = 249;
                    break;
                }
                case 43: {
                    n14 = 111;
                    break;
                }
                case 44: {
                    n14 = 33;
                    break;
                }
                case 45: {
                    n14 = 246;
                    break;
                }
                case 46: {
                    n14 = 41;
                    break;
                }
                case 47: {
                    n14 = 34;
                    break;
                }
                case 48: {
                    n14 = 141;
                    break;
                }
                case 49: {
                    n14 = 170;
                    break;
                }
                case 50: {
                    n14 = 1;
                    break;
                }
                case 51: {
                    n14 = 209;
                    break;
                }
                case 52: {
                    n14 = 162;
                    break;
                }
                case 53: {
                    n14 = 93;
                    break;
                }
                case 54: {
                    n14 = 11;
                    break;
                }
                case 55: {
                    n14 = 131;
                    break;
                }
                case 56: {
                    n14 = 234;
                    break;
                }
                case 57: {
                    n14 = 166;
                    break;
                }
                case 58: {
                    n14 = 186;
                    break;
                }
                case 59: {
                    n14 = 21;
                    break;
                }
                case 60: {
                    n14 = 64;
                    break;
                }
                case 61: {
                    n14 = 129;
                    break;
                }
                case 62: {
                    n14 = 139;
                    break;
                }
                case 63: {
                    n14 = 90;
                    break;
                }
                case 64: {
                    n14 = 14;
                    break;
                }
                case 65: {
                    n14 = 68;
                    break;
                }
                case 66: {
                    n14 = 221;
                    break;
                }
                case 67: {
                    n14 = 132;
                    break;
                }
                case 68: {
                    n14 = 20;
                    break;
                }
                case 69: {
                    n14 = 248;
                    break;
                }
                case 70: {
                    n14 = 146;
                    break;
                }
                case 71: {
                    n14 = 59;
                    break;
                }
                case 72: {
                    n14 = 5;
                    break;
                }
                case 73: {
                    n14 = 178;
                    break;
                }
                case 74: {
                    n14 = 63;
                    break;
                }
                case 75: {
                    n14 = 81;
                    break;
                }
                case 76: {
                    n14 = 7;
                    break;
                }
                case 77: {
                    n14 = 110;
                    break;
                }
                case 78: {
                    n14 = 236;
                    break;
                }
                case 79: {
                    n14 = 113;
                    break;
                }
                case 80: {
                    n14 = 91;
                    break;
                }
                case 81: {
                    n14 = 224;
                    break;
                }
                case 82: {
                    n14 = 116;
                    break;
                }
                case 83: {
                    n14 = 191;
                    break;
                }
                case 84: {
                    n14 = 61;
                    break;
                }
                case 85: {
                    n14 = 66;
                    break;
                }
                case 86: {
                    n14 = 67;
                    break;
                }
                case 87: {
                    n14 = 253;
                    break;
                }
                case 88: {
                    n14 = 79;
                    break;
                }
                case 89: {
                    n14 = 32;
                    break;
                }
                case 90: {
                    n14 = 240;
                    break;
                }
                case 91: {
                    n14 = 121;
                    break;
                }
                case 92: {
                    n14 = 184;
                    break;
                }
                case 93: {
                    n14 = 211;
                    break;
                }
                case 94: {
                    n14 = 36;
                    break;
                }
                case 95: {
                    n14 = 40;
                    break;
                }
                case 96: {
                    n14 = 54;
                    break;
                }
                case 97: {
                    n14 = 35;
                    break;
                }
                case 98: {
                    n14 = 123;
                    break;
                }
                case 99: {
                    n14 = 140;
                    break;
                }
                case 100: {
                    n14 = 27;
                    break;
                }
                case 101: {
                    n14 = 97;
                    break;
                }
                case 102: {
                    n14 = 115;
                    break;
                }
                case 103: {
                    n14 = 228;
                    break;
                }
                case 104: {
                    n14 = 56;
                    break;
                }
                case 105: {
                    n14 = 158;
                    break;
                }
                case 106: {
                    n14 = 143;
                    break;
                }
                case 107: {
                    n14 = 171;
                    break;
                }
                case 108: {
                    n14 = 99;
                    break;
                }
                case 109: {
                    n14 = 138;
                    break;
                }
                case 110: {
                    n14 = 47;
                    break;
                }
                case 111: {
                    n14 = 175;
                    break;
                }
                case 112: {
                    n14 = 195;
                    break;
                }
                case 113: {
                    n14 = 168;
                    break;
                }
                case 114: {
                    n14 = 122;
                    break;
                }
                case 115: {
                    n14 = 53;
                    break;
                }
                case 116: {
                    n14 = 18;
                    break;
                }
                case 117: {
                    n14 = 44;
                    break;
                }
                case 118: {
                    n14 = 167;
                    break;
                }
                case 119: {
                    n14 = 24;
                    break;
                }
                case 120: {
                    n14 = 237;
                    break;
                }
                case 121: {
                    n14 = 107;
                    break;
                }
                case 122: {
                    n14 = 188;
                    break;
                }
                case 123: {
                    n14 = 31;
                    break;
                }
                case 124: {
                    n14 = 194;
                    break;
                }
                case 125: {
                    n14 = 148;
                    break;
                }
                case 126: {
                    n14 = 244;
                    break;
                }
                case 127: {
                    n14 = 137;
                    break;
                }
                case 128: {
                    n14 = 225;
                    break;
                }
                case 129: {
                    n14 = 227;
                    break;
                }
                case 130: {
                    n14 = 145;
                    break;
                }
                case 131: {
                    n14 = 133;
                    break;
                }
                case 132: {
                    n14 = 80;
                    break;
                }
                case 133: {
                    n14 = 128;
                    break;
                }
                case 134: {
                    n14 = 62;
                    break;
                }
                case 135: {
                    n14 = 2;
                    break;
                }
                case 136: {
                    n14 = 86;
                    break;
                }
                case 137: {
                    n14 = 71;
                    break;
                }
                case 138: {
                    n14 = 197;
                    break;
                }
                case 139: {
                    n14 = 58;
                    break;
                }
                case 140: {
                    n14 = 75;
                    break;
                }
                case 141: {
                    n14 = 84;
                    break;
                }
                case 142: {
                    n14 = 77;
                    break;
                }
                case 143: {
                    n14 = 144;
                    break;
                }
                case 144: {
                    n14 = 23;
                    break;
                }
                case 145: {
                    n14 = 160;
                    break;
                }
                case 146: {
                    n14 = 3;
                    break;
                }
                case 147: {
                    n14 = 10;
                    break;
                }
                case 148: {
                    n14 = 39;
                    break;
                }
                case 149: {
                    n14 = 239;
                    break;
                }
                case 150: {
                    n14 = 94;
                    break;
                }
                case 151: {
                    n14 = 95;
                    break;
                }
                case 152: {
                    n14 = 172;
                    break;
                }
                case 153: {
                    n14 = 83;
                    break;
                }
                case 154: {
                    n14 = 169;
                    break;
                }
                case 155: {
                    n14 = 156;
                    break;
                }
                case 156: {
                    n14 = 192;
                    break;
                }
                case 157: {
                    n14 = 87;
                    break;
                }
                case 158: {
                    n14 = 134;
                    break;
                }
                case 159: {
                    n14 = 38;
                    break;
                }
                case 160: {
                    n14 = 190;
                    break;
                }
                case 161: {
                    n14 = 112;
                    break;
                }
                case 162: {
                    n14 = 204;
                    break;
                }
                case 163: {
                    n14 = 19;
                    break;
                }
                case 164: {
                    n14 = 189;
                    break;
                }
                case 165: {
                    n14 = 242;
                    break;
                }
                case 166: {
                    n14 = 82;
                    break;
                }
                case 167: {
                    n14 = 55;
                    break;
                }
                case 168: {
                    n14 = 187;
                    break;
                }
                case 169: {
                    n14 = 52;
                    break;
                }
                case 170: {
                    n14 = 0;
                    break;
                }
                case 171: {
                    n14 = 22;
                    break;
                }
                case 172: {
                    n14 = 25;
                    break;
                }
                case 173: {
                    n14 = 142;
                    break;
                }
                case 174: {
                    n14 = 74;
                    break;
                }
                case 175: {
                    n14 = 9;
                    break;
                }
                case 176: {
                    n14 = 200;
                    break;
                }
                case 177: {
                    n14 = 216;
                    break;
                }
                case 178: {
                    n14 = 48;
                    break;
                }
                case 179: {
                    n14 = 180;
                    break;
                }
                case 180: {
                    n14 = 119;
                    break;
                }
                case 181: {
                    n14 = 105;
                    break;
                }
                case 182: {
                    n14 = 73;
                    break;
                }
                case 183: {
                    n14 = 120;
                    break;
                }
                case 184: {
                    n14 = 247;
                    break;
                }
                case 185: {
                    n14 = 150;
                    break;
                }
                case 186: {
                    n14 = 245;
                    break;
                }
                case 187: {
                    n14 = 205;
                    break;
                }
                case 188: {
                    n14 = 161;
                    break;
                }
                case 189: {
                    n14 = 210;
                    break;
                }
                case 190: {
                    n14 = 103;
                    break;
                }
                case 191: {
                    n14 = 213;
                    break;
                }
                case 192: {
                    n14 = 214;
                    break;
                }
                case 193: {
                    n14 = 6;
                    break;
                }
                case 194: {
                    n14 = 154;
                    break;
                }
                case 195: {
                    n14 = 241;
                    break;
                }
                case 196: {
                    n14 = 147;
                    break;
                }
                case 197: {
                    n14 = 13;
                    break;
                }
                case 198: {
                    n14 = 98;
                    break;
                }
                case 199: {
                    n14 = 250;
                    break;
                }
                case 200: {
                    n14 = 207;
                    break;
                }
                case 201: {
                    n14 = 164;
                    break;
                }
                case 202: {
                    n14 = 177;
                    break;
                }
                case 203: {
                    n14 = 254;
                    break;
                }
                case 204: {
                    n14 = 29;
                    break;
                }
                case 205: {
                    n14 = 106;
                    break;
                }
                case 206: {
                    n14 = 130;
                    break;
                }
                case 207: {
                    n14 = 43;
                    break;
                }
                case 208: {
                    n14 = 100;
                    break;
                }
                case 209: {
                    n14 = 215;
                    break;
                }
                case 210: {
                    n14 = 222;
                    break;
                }
                case 211: {
                    n14 = 232;
                    break;
                }
                case 212: {
                    n14 = 70;
                    break;
                }
                case 213: {
                    n14 = 109;
                    break;
                }
                case 214: {
                    n14 = 50;
                    break;
                }
                case 215: {
                    n14 = 152;
                    break;
                }
                case 216: {
                    n14 = 233;
                    break;
                }
                case 217: {
                    n14 = 72;
                    break;
                }
                case 218: {
                    n14 = 78;
                    break;
                }
                case 219: {
                    n14 = 223;
                    break;
                }
                case 220: {
                    n14 = 193;
                    break;
                }
                case 221: {
                    n14 = 12;
                    break;
                }
                case 222: {
                    n14 = 173;
                    break;
                }
                case 223: {
                    n14 = 151;
                    break;
                }
                case 224: {
                    n14 = 117;
                    break;
                }
                case 225: {
                    n14 = 65;
                    break;
                }
                case 226: {
                    n14 = 37;
                    break;
                }
                case 227: {
                    n14 = 125;
                    break;
                }
                case 228: {
                    n14 = 126;
                    break;
                }
                case 229: {
                    n14 = 220;
                    break;
                }
                case 230: {
                    n14 = 219;
                    break;
                }
                case 231: {
                    n14 = 174;
                    break;
                }
                case 232: {
                    n14 = 16;
                    break;
                }
                case 233: {
                    n14 = 92;
                    break;
                }
                case 234: {
                    n14 = 102;
                    break;
                }
                case 235: {
                    n14 = 108;
                    break;
                }
                case 236: {
                    n14 = 196;
                    break;
                }
                case 237: {
                    n14 = 104;
                    break;
                }
                case 238: {
                    n14 = 252;
                    break;
                }
                case 239: {
                    n14 = 49;
                    break;
                }
                case 240: {
                    n14 = 45;
                    break;
                }
                case 241: {
                    n14 = 155;
                    break;
                }
                case 242: {
                    n14 = 199;
                    break;
                }
                case 243: {
                    n14 = 243;
                    break;
                }
                case 244: {
                    n14 = 183;
                    break;
                }
                case 245: {
                    n14 = 229;
                    break;
                }
                case 246: {
                    n14 = 135;
                    break;
                }
                case 247: {
                    n14 = 69;
                    break;
                }
                case 248: {
                    n14 = 153;
                    break;
                }
                case 249: {
                    n14 = 85;
                    break;
                }
                case 250: {
                    n14 = 255;
                    break;
                }
                case 251: {
                    n14 = 26;
                    break;
                }
                case 252: {
                    n14 = 165;
                    break;
                }
                case 253: {
                    n14 = 101;
                    break;
                }
                case 254: {
                    n14 = 226;
                    break;
                }
                default: {
                    n14 = 88;
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
            wp_1.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x28A6;
        if (f[n11] == null) {
            wp_1.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2DBA) & Short.MAX_VALUE;
        if (h[n11] == null) {
            wp_1.h[n11] = g[n11] ^ l2;
        }
        return h[n11];
    }
}

