/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CT;
import com.ky_2;
import com.wb_1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from com.yF
 */
public class yf_1 {
    private MappedByteBuffer O;
    private static Long P;
    public static boolean Y;
    private static ReentrantLock e;
    private File f;
    private long z;
    private long m;
    private long F;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] g;
    private static final Long[] h;

    public yf_1(String string) throws Exception {
        block5: {
            yf_1 yf_12;
            block4: {
                String[] stringArray = CT.U();
                String[] stringArray2 = stringArray;
                try {
                    try {
                        this.f = new File(string);
                        yf_12 = this;
                        if (stringArray2 != null) break block4;
                        yf_12.S();
                        if (!Y) break block5;
                    }
                    catch (Exception exception) {
                        throw yf_1.a(exception);
                    }
                    yf_12 = this;
                }
                catch (Exception exception) {
                    throw yf_1.a(exception);
                }
            }
            yf_12.K();
        }
    }

    private void K() {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new wb_1(this), yf_1.b(7240, 5737250785477756354L), yf_1.b(19717, 5402170713819370631L), TimeUnit.MILLISECONDS);
    }

    public long J(long l2) {
        this.O.position((int)l2);
        return yf_1.b(24221, 803000466833229596L) & (long)this.O.getInt();
    }

    public long r(long l2) {
        this.O.position((int)l2);
        return yf_1.b(27438, 1729320179848999589L) & (long)this.O.getInt();
    }

    private void S() throws Exception {
        P = this.f.lastModified();
        e.lock();
        try {
            this.O = new RandomAccessFile(this.f, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, this.f.length());
            this.O.order(ByteOrder.LITTLE_ENDIAN);
            this.z = this.J(0L);
            this.m = this.J(yf_1.b(1909, 7803391171410501371L));
            this.F = (this.m - this.z) / yf_1.b(11761, 3097485896832267388L) + 1L;
        }
        finally {
            e.unlock();
        }
    }

    private static long g(String string) {
        String string2;
        block4: {
            block5: {
                String[] stringArray = CT.U();
                try {
                    try {
                        string2 = string;
                        if (stringArray != null) break block4;
                        if (string2 != null) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw yf_1.a(nullPointerException);
                    }
                    throw new NullPointerException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50524 out of bounds for length 7");
                }
                catch (NullPointerException nullPointerException) {
                    throw yf_1.a(nullPointerException);
                }
            }
            string2 = string;
        }
        String[] stringArray = string2.split("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50526 out of bounds for length 7");
        long l2 = (Long.parseLong(stringArray[0]) & yf_1.b(21414, 3307886158582008361L)) << yf_1.a(1451, 6151861944656237841L) & yf_1.b(16215, 6049422395875927775L);
        l2 |= (Long.parseLong(stringArray[1]) & yf_1.b(7061, 2984564376461443612L)) << yf_1.a(31995, 7425800068082363458L) & yf_1.b(5971, 6042086115667578582L);
        l2 |= (Long.parseLong(stringArray[2]) & yf_1.b(7061, 2984564376461443612L)) << yf_1.a(8777, 6288625195790054129L) & yf_1.b(27051, 8616371521400434727L);
        return l2 |= Long.parseLong(stringArray[3]) & yf_1.b(7061, 2984564376461443612L);
    }

    /*
     * Unable to fully structure code
     */
    private long t(long var1_1) {
        block20: {
            var4_2 = 0L;
            var6_3 = this.F;
            var8_4 = 0L;
            var3_5 = CT.U();
            while (var4_2 <= var6_3) {
                block24: {
                    block25: {
                        block23: {
                            block21: {
                                block22: {
                                    var8_4 = var4_2 + var6_3 >>> 1;
                                    var10_6 = this.J(this.z + (var8_4 - 1L) * yf_1.b(30256, 6257363873197191092L));
                                    var12_7 = this.J(this.z + var8_4 * yf_1.b(30256, 6257363873197191092L));
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = var10_6;
                                                        if (var3_5 != null) break block20;
                                                        cfr_temp_0 = v0 - var1_1;
                                                        v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                        if (var3_5 != null) break block21;
                                                    }
                                                    catch (NullPointerException v2) {
                                                        throw yf_1.a(v2);
                                                    }
                                                    if (v1 > 0) break block22;
                                                }
                                                catch (NullPointerException v3) {
                                                    throw yf_1.a(v3);
                                                }
                                                v1 = var1_1 == var12_7 ? 0 : (var1_1 < var12_7 ? -1 : 1);
                                                if (var3_5 != null) break block21;
                                            }
                                            catch (NullPointerException v4) {
                                                throw yf_1.a(v4);
                                            }
                                            if (v1 >= 0) break block22;
                                        }
                                        catch (NullPointerException v5) {
                                            throw yf_1.a(v5);
                                        }
                                        return this.r(this.z + (var8_4 - 1L) * yf_1.b(30256, 6257363873197191092L) + yf_1.b(18865, 6468231742540009521L));
                                    }
                                    catch (NullPointerException v6) {
                                        throw yf_1.a(v6);
                                    }
                                }
                                v1 = var1_1 == var10_6 ? 0 : (var1_1 < var10_6 ? -1 : 1);
                            }
                            try {
                                if (var3_5 != null) break block23;
                                if (v1 > 0) {
                                }
                                ** GOTO lbl52
                            }
                            catch (NullPointerException v7) {
                                throw yf_1.a(v7);
                            }
                            var4_2 = var8_4 + 1L;
                            try {
                                try {
                                    if (var3_5 == null) break block24;
lbl52:
                                    // 2 sources

                                    v8 = var1_1;
                                    v9 = var10_6;
                                    if (var3_5 != null) break block25;
                                }
                                catch (NullPointerException v10) {
                                    throw yf_1.a(v10);
                                }
                                cfr_temp_1 = v8 - v9;
                                v1 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            }
                            catch (NullPointerException v11) {
                                throw yf_1.a(v11);
                            }
                        }
                        try {
                            if (v1 >= 0) break block24;
                            v8 = var8_4;
                            v9 = 1L;
                        }
                        catch (NullPointerException v12) {
                            throw yf_1.a(v12);
                        }
                    }
                    var6_3 = v8 - v9;
                }
                if (var3_5 == null) continue;
            }
            v0 = yf_1.b(29027, 3307149551166941412L);
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private CT Z(long var1_1) {
        var3_2 = CT.U();
        try {
            block21: {
                block18: {
                    block20: {
                        block19: {
                            this.O.position((int)var1_1 + 4);
                            var4_3 = new CT();
                            var5_5 = this.O.get();
                            try {
                                v0 = var5_5;
                                v1 = 1;
                                if (var3_2 != null) break block18;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl45
                            }
                            catch (Exception v2) {
                                throw yf_1.a(v2);
                            }
                            var6_6 = this.r((int)var1_1 + 5);
                            this.O.position((int)var6_6);
                            var5_5 = this.O.get();
                            if (var3_2 != null) break block19;
                            try {
                                block22: {
                                    if (var5_5 != 2) ** GOTO lbl37
                                    break block22;
                                    catch (Exception v3) {
                                        throw yf_1.a(v3);
                                    }
                                }
                                var4_3.d = this.y(this.r(var6_6 + 1L));
                                this.O.position((int)var6_6 + 4);
                            }
                            catch (Exception v4) {
                                throw yf_1.a(v4);
                            }
                        }
                        try {
                            if (var3_2 == null) break block20;
lbl37:
                            // 2 sources

                            var4_3.d = this.y(var6_6);
                        }
                        catch (Exception v5) {
                            throw yf_1.a(v5);
                        }
                    }
                    try {
                        var4_3.I = this.j(this.O.position());
                        if (var3_2 == null) break block21;
lbl45:
                        // 2 sources

                        v0 = var5_5;
                        v1 = 2;
                    }
                    catch (Exception v6) {
                        throw yf_1.a(v6);
                    }
                }
                if (v0 != v1) ** GOTO lbl60
                try {
                    block23: {
                        var4_3.d = this.y(this.r((int)var1_1 + 5));
                        var4_3.I = this.j((int)var1_1 + yf_1.a(15952, 4775624520579034859L));
                        if (var3_2 == null) break block21;
                        break block23;
                        catch (Exception v7) {
                            throw yf_1.a(v7);
                        }
                    }
                    var4_3.d = this.y(this.O.position() - 1);
                    var4_3.I = this.j(this.O.position());
                }
                catch (Exception v8) {
                    throw yf_1.a(v8);
                }
            }
            return var4_3;
        }
        catch (Exception var4_4) {
            return null;
        }
    }

    private String j(int n10) {
        block10: {
            block9: {
                int n11;
                int n12;
                block8: {
                    String[] stringArray = CT.U();
                    this.O.position(n10);
                    String[] stringArray2 = stringArray;
                    int n13 = this.O.get();
                    try {
                        try {
                            n12 = n13;
                            n11 = 1;
                            if (stringArray2 != null) break block8;
                            if (n12 == n11) break block9;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw yf_1.a(nullPointerException);
                        }
                        n12 = n13;
                        n11 = 2;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw yf_1.a(nullPointerException);
                    }
                }
                if (n12 != n11) break block10;
            }
            long l2 = this.r(n10 + 1);
            try {
                if (l2 == 0L) {
                    return "";
                }
            }
            catch (NullPointerException nullPointerException) {
                throw yf_1.a(nullPointerException);
            }
            return this.y(l2);
        }
        return this.y(n10);
    }

    private String y(long l2) {
        block7: {
            String[] stringArray = CT.U();
            try {
                this.O.position((int)l2);
                byte[] byArray = new byte[yf_1.a(10537, 5583825071595108756L)];
                int n10 = 0;
                byArray[n10] = this.O.get();
                while (byArray[n10] != 0) {
                    try {
                        byArray[++n10] = this.O.get();
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                            break;
                        }
                        break block7;
                    }
                    catch (IOException iOException) {
                        throw yf_1.a(iOException);
                    }
                }
                if (n10 != 0) {
                    return new String(byArray, 0, n10, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 50525 out of bounds for length 7");
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return "";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CT K(String string) {
        CT cT;
        String[] stringArray;
        block7: {
            String[] stringArray2 = CT.U();
            e.lock();
            stringArray = stringArray2;
            try {
                block8: {
                    long l2 = this.t(yf_1.g(string));
                    try {
                        if (stringArray != null) break block7;
                        if (l2 == yf_1.b(30374, 3134635223823839008L)) break block8;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw yf_1.a(nullPointerException);
                    }
                    CT cT2 = this.Z(l2);
                    e.unlock();
                    return cT2;
                }
                e.unlock();
            }
            catch (Throwable throwable) {
                e.unlock();
                throw throwable;
            }
        }
        try {
            cT = null;
            if (stringArray != null) {
                ky_2.K(new String[1]);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw yf_1.a(nullPointerException);
        }
        return cT;
    }

    static File Y(yf_1 yf_12) {
        return yf_12.f;
    }

    static Long C() {
        return P;
    }

    static Long e(Long l2) {
        P = l2;
        return P;
    }

    static void R(yf_1 yf_12) throws Exception {
        yf_12.S();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var21 = new String[3];
                            var19_1 = 0;
                            var18_2 = "V\u00c8\u4e20\u8093\u4efa\u7a12\u0003Q0m\u0002\u009b^";
                            var20_3 = "V\u00c8\u4e20\u8093\u4efa\u7a12\u0003Q0m\u0002\u009b^".length();
                            var17_4 = 6;
                            var16_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block27;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v3 = v2.length;
                            var22_6 = 0;
                            v4 = 61;
                            v5 = v2;
                            v6 = v3;
                            if (v3 > 1) ** GOTO lbl67
                            do {
                                v7 = v4;
                                v5 = v5;
                                v8 = v5;
                                v9 = v4;
                                v10 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v11 = 97;
                                            break;
                                        }
                                        case 1: {
                                            v11 = 38;
                                            break;
                                        }
                                        case 2: {
                                            v11 = 21;
                                            break;
                                        }
                                        case 3: {
                                            v11 = 87;
                                            break;
                                        }
                                        case 4: {
                                            v11 = 80;
                                            break;
                                        }
                                        case 5: {
                                            v11 = 40;
                                            break;
                                        }
                                        default: {
                                            v11 = 61;
                                        }
                                    }
                                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                    ++var22_6;
                                    v4 = v7;
                                    if (v7 != 0) break;
                                    v7 = v4;
                                    v5 = v5;
                                    v10 = v4;
                                    v8 = v5;
                                    v9 = v4;
                                }
lbl67:
                                // 2 sources

                                v0 = v5;
                                v6 = v6;
                            } while (v6 > var22_6);
                            ** while (true)
                        }
                        yf_1.a = var21;
                        yf_1.b = new String[3];
                        var8_7 = 1517923266482109072L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "\u00ad\u008c)|Y\u00e9\u0096\u00c2S\u0082\u00ae,.THi\u00bd\u0098Z^\u00df5Ts";
                        var13_11 = "\u00ad\u008c)|Y\u00e9\u0096\u00c2S\u0082\u00ae,.THi\u00bd\u0098Z^\u00df5Ts".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v12 = var14_8;
                            v13 = var11_9++;
                            v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v15 = -1;
                            break block28;
                            break;
                        }
lbl90:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00bf\u00ea\u00cb7\u0018\u008d\u00ef\u0099\"Y\u0091j^\u00af\u00c3\u0084";
                            var13_11 = "\u00bf\u00ea\u00cb7\u0018\u008d\u00ef\u0099\"Y\u0091j^\u00af\u00c3\u0084".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v12 = var14_8;
                                v13 = var11_9++;
                                v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v15 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl103:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            break block29;
                            break;
                        }
                    }
                    v16 = v14 ^ var8_7;
                    switch (v15) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl114:
                        // 1 sources

                        ** continue;
                    }
                }
                yf_1.c = var14_8;
                yf_1.d = new Integer[5];
                var0_14 = 2409682403067875491L;
                var6_15 = new long[15];
                var3_16 = 0;
                var4_17 = "V\u00e3i_\u00a1\u0083_\u0084\u000b\u008c\u0092c\u00f9&\u00e4\u00d8M;\u00df\u008d\u00f7\tN\\\f\u0097\u0011\u008f\u0087\u00e8\u009aur\u00834\u00fe=$\u00f6|\b\u001b\u00a4\u001c$\u001b\u00d2@n\u00ee&Q\u00c7\u00e5V\u00896\u008f.\u00eafq]\u00f9w\u00a6v*\u00c4\u0019?\u0010r\u00a9$/\u00ba\u000e^u\u00f5\u000f`\u00bf\u00df\u00d3@|\u00f3jLa\u00bf\u00c4\u00c7\u00b8x\u00b3/\u001f\u0003^\u0000\u0096";
                var5_18 = "V\u00e3i_\u00a1\u0083_\u0084\u000b\u008c\u0092c\u00f9&\u00e4\u00d8M;\u00df\u008d\u00f7\tN\\\f\u0097\u0011\u008f\u0087\u00e8\u009aur\u00834\u00fe=$\u00f6|\b\u001b\u00a4\u001c$\u001b\u00d2@n\u00ee&Q\u00c7\u00e5V\u00896\u008f.\u00eafq]\u00f9w\u00a6v*\u00c4\u0019?\u0010r\u00a9$/\u00ba\u000e^u\u00f5\u000f`\u00bf\u00df\u00d3@|\u00f3jLa\u00bf\u00c4\u00c7\u00b8x\u00b3/\u001f\u0003^\u0000\u0096".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v17 = var6_15;
                    v18 = var3_16++;
                    v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "*T=\u00cb\u009b\u00b0h@k\u0088\u00b4\u00c4\u0085fq\u0014";
                    var5_18 = "*T=\u00cb\u009b\u00b0h@k\u0088\u00b4\u00c4\u0085fq\u0014".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v17 = var6_15;
                        v18 = var3_16++;
                        v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl144:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_14;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl155:
                // 1 sources

                ** continue;
            }
        }
        yf_1.g = var6_15;
        yf_1.h = new Long[15];
        yf_1.P = 0L;
        yf_1.Y = false;
        yf_1.e = new ReentrantLock();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3BB5) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 7;
                    break;
                }
                case 1: {
                    n14 = 200;
                    break;
                }
                case 2: {
                    n14 = 74;
                    break;
                }
                case 3: {
                    n14 = 218;
                    break;
                }
                case 4: {
                    n14 = 122;
                    break;
                }
                case 5: {
                    n14 = 39;
                    break;
                }
                case 6: {
                    n14 = 92;
                    break;
                }
                case 7: {
                    n14 = 33;
                    break;
                }
                case 8: {
                    n14 = 214;
                    break;
                }
                case 9: {
                    n14 = 18;
                    break;
                }
                case 10: {
                    n14 = 60;
                    break;
                }
                case 11: {
                    n14 = 134;
                    break;
                }
                case 12: {
                    n14 = 25;
                    break;
                }
                case 13: {
                    n14 = 31;
                    break;
                }
                case 14: {
                    n14 = 0;
                    break;
                }
                case 15: {
                    n14 = 63;
                    break;
                }
                case 16: {
                    n14 = 181;
                    break;
                }
                case 17: {
                    n14 = 167;
                    break;
                }
                case 18: {
                    n14 = 76;
                    break;
                }
                case 19: {
                    n14 = 165;
                    break;
                }
                case 20: {
                    n14 = 38;
                    break;
                }
                case 21: {
                    n14 = 30;
                    break;
                }
                case 22: {
                    n14 = 187;
                    break;
                }
                case 23: {
                    n14 = 46;
                    break;
                }
                case 24: {
                    n14 = 173;
                    break;
                }
                case 25: {
                    n14 = 215;
                    break;
                }
                case 26: {
                    n14 = 90;
                    break;
                }
                case 27: {
                    n14 = 62;
                    break;
                }
                case 28: {
                    n14 = 55;
                    break;
                }
                case 29: {
                    n14 = 234;
                    break;
                }
                case 30: {
                    n14 = 138;
                    break;
                }
                case 31: {
                    n14 = 148;
                    break;
                }
                case 32: {
                    n14 = 11;
                    break;
                }
                case 33: {
                    n14 = 226;
                    break;
                }
                case 34: {
                    n14 = 108;
                    break;
                }
                case 35: {
                    n14 = 240;
                    break;
                }
                case 36: {
                    n14 = 98;
                    break;
                }
                case 37: {
                    n14 = 147;
                    break;
                }
                case 38: {
                    n14 = 242;
                    break;
                }
                case 39: {
                    n14 = 17;
                    break;
                }
                case 40: {
                    n14 = 128;
                    break;
                }
                case 41: {
                    n14 = 126;
                    break;
                }
                case 42: {
                    n14 = 106;
                    break;
                }
                case 43: {
                    n14 = 85;
                    break;
                }
                case 44: {
                    n14 = 139;
                    break;
                }
                case 45: {
                    n14 = 142;
                    break;
                }
                case 46: {
                    n14 = 104;
                    break;
                }
                case 47: {
                    n14 = 119;
                    break;
                }
                case 48: {
                    n14 = 29;
                    break;
                }
                case 49: {
                    n14 = 89;
                    break;
                }
                case 50: {
                    n14 = 52;
                    break;
                }
                case 51: {
                    n14 = 109;
                    break;
                }
                case 52: {
                    n14 = 15;
                    break;
                }
                case 53: {
                    n14 = 32;
                    break;
                }
                case 54: {
                    n14 = 135;
                    break;
                }
                case 55: {
                    n14 = 152;
                    break;
                }
                case 56: {
                    n14 = 59;
                    break;
                }
                case 57: {
                    n14 = 210;
                    break;
                }
                case 58: {
                    n14 = 195;
                    break;
                }
                case 59: {
                    n14 = 64;
                    break;
                }
                case 60: {
                    n14 = 223;
                    break;
                }
                case 61: {
                    n14 = 178;
                    break;
                }
                case 62: {
                    n14 = 222;
                    break;
                }
                case 63: {
                    n14 = 241;
                    break;
                }
                case 64: {
                    n14 = 188;
                    break;
                }
                case 65: {
                    n14 = 115;
                    break;
                }
                case 66: {
                    n14 = 111;
                    break;
                }
                case 67: {
                    n14 = 82;
                    break;
                }
                case 68: {
                    n14 = 208;
                    break;
                }
                case 69: {
                    n14 = 172;
                    break;
                }
                case 70: {
                    n14 = 131;
                    break;
                }
                case 71: {
                    n14 = 252;
                    break;
                }
                case 72: {
                    n14 = 209;
                    break;
                }
                case 73: {
                    n14 = 118;
                    break;
                }
                case 74: {
                    n14 = 48;
                    break;
                }
                case 75: {
                    n14 = 154;
                    break;
                }
                case 76: {
                    n14 = 193;
                    break;
                }
                case 77: {
                    n14 = 224;
                    break;
                }
                case 78: {
                    n14 = 232;
                    break;
                }
                case 79: {
                    n14 = 239;
                    break;
                }
                case 80: {
                    n14 = 95;
                    break;
                }
                case 81: {
                    n14 = 6;
                    break;
                }
                case 82: {
                    n14 = 21;
                    break;
                }
                case 83: {
                    n14 = 34;
                    break;
                }
                case 84: {
                    n14 = 171;
                    break;
                }
                case 85: {
                    n14 = 140;
                    break;
                }
                case 86: {
                    n14 = 177;
                    break;
                }
                case 87: {
                    n14 = 13;
                    break;
                }
                case 88: {
                    n14 = 124;
                    break;
                }
                case 89: {
                    n14 = 238;
                    break;
                }
                case 90: {
                    n14 = 12;
                    break;
                }
                case 91: {
                    n14 = 65;
                    break;
                }
                case 92: {
                    n14 = 3;
                    break;
                }
                case 93: {
                    n14 = 194;
                    break;
                }
                case 94: {
                    n14 = 14;
                    break;
                }
                case 95: {
                    n14 = 100;
                    break;
                }
                case 96: {
                    n14 = 22;
                    break;
                }
                case 97: {
                    n14 = 220;
                    break;
                }
                case 98: {
                    n14 = 250;
                    break;
                }
                case 99: {
                    n14 = 97;
                    break;
                }
                case 100: {
                    n14 = 245;
                    break;
                }
                case 101: {
                    n14 = 114;
                    break;
                }
                case 102: {
                    n14 = 132;
                    break;
                }
                case 103: {
                    n14 = 249;
                    break;
                }
                case 104: {
                    n14 = 42;
                    break;
                }
                case 105: {
                    n14 = 155;
                    break;
                }
                case 106: {
                    n14 = 198;
                    break;
                }
                case 107: {
                    n14 = 244;
                    break;
                }
                case 108: {
                    n14 = 170;
                    break;
                }
                case 109: {
                    n14 = 8;
                    break;
                }
                case 110: {
                    n14 = 151;
                    break;
                }
                case 111: {
                    n14 = 51;
                    break;
                }
                case 112: {
                    n14 = 88;
                    break;
                }
                case 113: {
                    n14 = 231;
                    break;
                }
                case 114: {
                    n14 = 186;
                    break;
                }
                case 115: {
                    n14 = 116;
                    break;
                }
                case 116: {
                    n14 = 229;
                    break;
                }
                case 117: {
                    n14 = 45;
                    break;
                }
                case 118: {
                    n14 = 27;
                    break;
                }
                case 119: {
                    n14 = 182;
                    break;
                }
                case 120: {
                    n14 = 243;
                    break;
                }
                case 121: {
                    n14 = 110;
                    break;
                }
                case 122: {
                    n14 = 219;
                    break;
                }
                case 123: {
                    n14 = 19;
                    break;
                }
                case 124: {
                    n14 = 56;
                    break;
                }
                case 125: {
                    n14 = 23;
                    break;
                }
                case 126: {
                    n14 = 68;
                    break;
                }
                case 127: {
                    n14 = 71;
                    break;
                }
                case 128: {
                    n14 = 207;
                    break;
                }
                case 129: {
                    n14 = 190;
                    break;
                }
                case 130: {
                    n14 = 86;
                    break;
                }
                case 131: {
                    n14 = 183;
                    break;
                }
                case 132: {
                    n14 = 253;
                    break;
                }
                case 133: {
                    n14 = 40;
                    break;
                }
                case 134: {
                    n14 = 203;
                    break;
                }
                case 135: {
                    n14 = 78;
                    break;
                }
                case 136: {
                    n14 = 112;
                    break;
                }
                case 137: {
                    n14 = 41;
                    break;
                }
                case 138: {
                    n14 = 83;
                    break;
                }
                case 139: {
                    n14 = 54;
                    break;
                }
                case 140: {
                    n14 = 75;
                    break;
                }
                case 141: {
                    n14 = 133;
                    break;
                }
                case 142: {
                    n14 = 57;
                    break;
                }
                case 143: {
                    n14 = 237;
                    break;
                }
                case 144: {
                    n14 = 94;
                    break;
                }
                case 145: {
                    n14 = 84;
                    break;
                }
                case 146: {
                    n14 = 105;
                    break;
                }
                case 147: {
                    n14 = 127;
                    break;
                }
                case 148: {
                    n14 = 77;
                    break;
                }
                case 149: {
                    n14 = 130;
                    break;
                }
                case 150: {
                    n14 = 145;
                    break;
                }
                case 151: {
                    n14 = 141;
                    break;
                }
                case 152: {
                    n14 = 174;
                    break;
                }
                case 153: {
                    n14 = 28;
                    break;
                }
                case 154: {
                    n14 = 36;
                    break;
                }
                case 155: {
                    n14 = 199;
                    break;
                }
                case 156: {
                    n14 = 157;
                    break;
                }
                case 157: {
                    n14 = 61;
                    break;
                }
                case 158: {
                    n14 = 248;
                    break;
                }
                case 159: {
                    n14 = 201;
                    break;
                }
                case 160: {
                    n14 = 121;
                    break;
                }
                case 161: {
                    n14 = 168;
                    break;
                }
                case 162: {
                    n14 = 91;
                    break;
                }
                case 163: {
                    n14 = 70;
                    break;
                }
                case 164: {
                    n14 = 227;
                    break;
                }
                case 165: {
                    n14 = 87;
                    break;
                }
                case 166: {
                    n14 = 1;
                    break;
                }
                case 167: {
                    n14 = 163;
                    break;
                }
                case 168: {
                    n14 = 144;
                    break;
                }
                case 169: {
                    n14 = 213;
                    break;
                }
                case 170: {
                    n14 = 247;
                    break;
                }
                case 171: {
                    n14 = 143;
                    break;
                }
                case 172: {
                    n14 = 120;
                    break;
                }
                case 173: {
                    n14 = 53;
                    break;
                }
                case 174: {
                    n14 = 99;
                    break;
                }
                case 175: {
                    n14 = 192;
                    break;
                }
                case 176: {
                    n14 = 205;
                    break;
                }
                case 177: {
                    n14 = 47;
                    break;
                }
                case 178: {
                    n14 = 197;
                    break;
                }
                case 179: {
                    n14 = 251;
                    break;
                }
                case 180: {
                    n14 = 123;
                    break;
                }
                case 181: {
                    n14 = 159;
                    break;
                }
                case 182: {
                    n14 = 149;
                    break;
                }
                case 183: {
                    n14 = 254;
                    break;
                }
                case 184: {
                    n14 = 228;
                    break;
                }
                case 185: {
                    n14 = 153;
                    break;
                }
                case 186: {
                    n14 = 156;
                    break;
                }
                case 187: {
                    n14 = 58;
                    break;
                }
                case 188: {
                    n14 = 180;
                    break;
                }
                case 189: {
                    n14 = 2;
                    break;
                }
                case 190: {
                    n14 = 136;
                    break;
                }
                case 191: {
                    n14 = 80;
                    break;
                }
                case 192: {
                    n14 = 101;
                    break;
                }
                case 193: {
                    n14 = 189;
                    break;
                }
                case 194: {
                    n14 = 164;
                    break;
                }
                case 195: {
                    n14 = 175;
                    break;
                }
                case 196: {
                    n14 = 93;
                    break;
                }
                case 197: {
                    n14 = 191;
                    break;
                }
                case 198: {
                    n14 = 43;
                    break;
                }
                case 199: {
                    n14 = 24;
                    break;
                }
                case 200: {
                    n14 = 50;
                    break;
                }
                case 201: {
                    n14 = 196;
                    break;
                }
                case 202: {
                    n14 = 212;
                    break;
                }
                case 203: {
                    n14 = 235;
                    break;
                }
                case 204: {
                    n14 = 44;
                    break;
                }
                case 205: {
                    n14 = 67;
                    break;
                }
                case 206: {
                    n14 = 20;
                    break;
                }
                case 207: {
                    n14 = 236;
                    break;
                }
                case 208: {
                    n14 = 230;
                    break;
                }
                case 209: {
                    n14 = 5;
                    break;
                }
                case 210: {
                    n14 = 72;
                    break;
                }
                case 211: {
                    n14 = 4;
                    break;
                }
                case 212: {
                    n14 = 202;
                    break;
                }
                case 213: {
                    n14 = 255;
                    break;
                }
                case 214: {
                    n14 = 233;
                    break;
                }
                case 215: {
                    n14 = 81;
                    break;
                }
                case 216: {
                    n14 = 176;
                    break;
                }
                case 217: {
                    n14 = 107;
                    break;
                }
                case 218: {
                    n14 = 96;
                    break;
                }
                case 219: {
                    n14 = 26;
                    break;
                }
                case 220: {
                    n14 = 169;
                    break;
                }
                case 221: {
                    n14 = 49;
                    break;
                }
                case 222: {
                    n14 = 204;
                    break;
                }
                case 223: {
                    n14 = 246;
                    break;
                }
                case 224: {
                    n14 = 137;
                    break;
                }
                case 225: {
                    n14 = 117;
                    break;
                }
                case 226: {
                    n14 = 166;
                    break;
                }
                case 227: {
                    n14 = 216;
                    break;
                }
                case 228: {
                    n14 = 158;
                    break;
                }
                case 229: {
                    n14 = 221;
                    break;
                }
                case 230: {
                    n14 = 150;
                    break;
                }
                case 231: {
                    n14 = 160;
                    break;
                }
                case 232: {
                    n14 = 79;
                    break;
                }
                case 233: {
                    n14 = 146;
                    break;
                }
                case 234: {
                    n14 = 37;
                    break;
                }
                case 235: {
                    n14 = 69;
                    break;
                }
                case 236: {
                    n14 = 211;
                    break;
                }
                case 237: {
                    n14 = 129;
                    break;
                }
                case 238: {
                    n14 = 9;
                    break;
                }
                case 239: {
                    n14 = 225;
                    break;
                }
                case 240: {
                    n14 = 161;
                    break;
                }
                case 241: {
                    n14 = 179;
                    break;
                }
                case 242: {
                    n14 = 66;
                    break;
                }
                case 243: {
                    n14 = 16;
                    break;
                }
                case 244: {
                    n14 = 125;
                    break;
                }
                case 245: {
                    n14 = 35;
                    break;
                }
                case 246: {
                    n14 = 162;
                    break;
                }
                case 247: {
                    n14 = 102;
                    break;
                }
                case 248: {
                    n14 = 10;
                    break;
                }
                case 249: {
                    n14 = 217;
                    break;
                }
                case 250: {
                    n14 = 185;
                    break;
                }
                case 251: {
                    n14 = 184;
                    break;
                }
                case 252: {
                    n14 = 103;
                    break;
                }
                case 253: {
                    n14 = 73;
                    break;
                }
                case 254: {
                    n14 = 113;
                    break;
                }
                default: {
                    n14 = 206;
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
            yf_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x10B9;
        if (d[n11] == null) {
            yf_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x198C) & Short.MAX_VALUE;
        if (h[n11] == null) {
            yf_1.h[n11] = g[n11] ^ l2;
        }
        return h[n11];
    }
}

