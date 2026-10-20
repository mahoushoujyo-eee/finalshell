/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.dm_2;
import com.ic_2;
import com.pc_0;
import com.pj_1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * Renamed from com.Ei
 */
public class ei_0
implements ic_2 {
    private static int Y;
    private String P;
    private int h;
    private InputStream Z;
    private OutputStream w;
    private Socket G;
    private String M;
    private String L;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public ei_0(String string) {
        block4: {
            String string2;
            int n10;
            block5: {
                boolean bl = dm_2.J();
                boolean bl2 = bl;
                n10 = Y;
                string2 = string;
                try {
                    if (bl2) break block4;
                    if (string.indexOf(ei_0.a(23778, 96189199492760108L)) == -1) break block5;
                }
                catch (Exception exception) {
                    throw ei_0.a(exception);
                }
                try {
                    string2 = string.substring(0, string.indexOf(ei_0.a(629, 8067234565891628217L)));
                    n10 = Integer.parseInt(string.substring(string.indexOf(ei_0.a(629, 8067234565891628217L)) + 1));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            this.P = string2;
            this.h = n10;
        }
    }

    public ei_0(String string, int n10) {
        this.P = string;
        this.h = n10;
    }

    public void U(String string, String string2) {
        this.M = string;
        this.L = string2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void e(pj_1 var1_1, String var2_2, int var3_3, int var4_4) throws pc_0 {
        var5_5 = dm_2.J();
        try {
            block69: {
                block70: {
                    block66: {
                        block64: {
                            block65: {
                                block79: {
                                    block63: {
                                        block62: {
                                            block77: {
                                                if (var5_5) break block62;
                                                if (var1_1 != null) ** GOTO lbl19
                                                break block77;
                                                catch (Exception v0) {
                                                    throw ei_0.a(v0);
                                                }
                                            }
                                            try {
                                                block78: {
                                                    this.G = E8.k(this.P, this.h, var4_4);
                                                    this.Z = this.G.getInputStream();
                                                    this.w = this.G.getOutputStream();
                                                    if (!var5_5) break block63;
                                                    break block78;
                                                    catch (Exception v1) {
                                                        throw ei_0.a(v1);
                                                    }
                                                }
                                                this.G = var1_1.y(this.P, this.h);
                                                this.Z = var1_1.j(this.G);
                                            }
                                            catch (Exception v2) {
                                                throw ei_0.a(v2);
                                            }
                                        }
                                        this.w = var1_1.P(this.G);
                                    }
                                    try {
                                        if (var4_4 > 0) {
                                            this.G.setSoTimeout(var4_4);
                                        }
                                    }
                                    catch (Exception v3) {
                                        throw ei_0.a(v3);
                                    }
                                    this.G.setTcpNoDelay(true);
                                    this.w.write(E8.J(ei_0.a(-26010, -21574) + var2_2 + ":" + var3_3 + ei_0.a(-26012, 18334)));
                                    v4 = this;
                                    if (var5_5) break block64;
                                    if (v4.M == null) break block65;
                                    break block79;
                                    catch (Exception v5) {
                                        throw ei_0.a(v5);
                                    }
                                }
                                try {
                                    block80: {
                                        v4 = this;
                                        if (var5_5) break block64;
                                        break block80;
                                        catch (Exception v6) {
                                            throw ei_0.a(v6);
                                        }
                                    }
                                    if (v4.L == null) break block65;
                                }
                                catch (Exception v7) {
                                    throw ei_0.a(v7);
                                }
                                var6_6 = E8.J(this.M + ":" + this.L);
                                var6_6 = E8.V(var6_6, 0, var6_6.length, true);
                                this.w.write(E8.J(ei_0.a(-26009, 21552)));
                                this.w.write(var6_6);
                                this.w.write(E8.J(ei_0.a(-26016, 27314)));
                            }
                            this.w.write(E8.J(ei_0.a(-26011, 8136)));
                            v4 = this;
                        }
                        v4.w.flush();
                        var6_7 = 0;
                        var7_10 = new StringBuilder();
                        while (var6_7 >= 0) {
                            block67: {
                                block68: {
                                    block81: {
                                        var6_7 = this.Z.read();
                                        v8 = var6_7;
                                        if (var5_5) break block66;
                                        v9 = ei_0.a(9378, 6398244208591845992L);
                                        if (var5_5) break block67;
                                        break block81;
                                        catch (Exception v10) {
                                            throw ei_0.a(v10);
                                        }
                                    }
                                    try {
                                        block82: {
                                            if (v8 == v9) break block68;
                                            break block82;
                                            catch (Exception v11) {
                                                throw ei_0.a(v11);
                                            }
                                        }
                                        var7_10.append((char)var6_7);
                                        if (!var5_5) continue;
                                    }
                                    catch (Exception v12) {
                                        throw ei_0.a(v12);
                                    }
                                }
                                var6_7 = this.Z.read();
                                try {
                                    v8 = var6_7;
                                    if (var5_5) break block66;
                                    v9 = ei_0.a(4388, 3747558605785370595L);
                                }
                                catch (Exception v13) {
                                    throw ei_0.a(v13);
                                }
                            }
                            try {
                                if (v8 != v9 && !var5_5) continue;
                                break;
                            }
                            catch (Exception v14) {
                                throw ei_0.a(v14);
                            }
                        }
                        v8 = var6_7;
                    }
                    try {
                        if (v8 < 0) {
                            throw new IOException();
                        }
                    }
                    catch (Exception v15) {
                        throw ei_0.a(v15);
                    }
                    var8_13 = var7_10.toString();
                    var9_14 = ei_0.a(-26014, -14721);
                    var10_15 = -1;
                    try {
                        var6_7 = var8_13.indexOf(ei_0.a(17690, 216738344300534741L));
                        var11_16 = var8_13.indexOf(ei_0.a(15621, 6151627178397344717L), var6_7 + 1);
                        var10_15 = Integer.parseInt(var8_13.substring(var6_7 + 1, var11_16));
                        var9_14 = var8_13.substring(var11_16 + 1);
                    }
                    catch (Exception var11_17) {
                        // empty catch block
                    }
                    v16 = var10_15;
                    if (var5_5) break block69;
                    try {
                        block83: {
                            if (v16 == ei_0.a(25303, 2397709623815863313L)) break block70;
                            break block83;
                            catch (Exception v17) {
                                throw ei_0.a(v17);
                            }
                        }
                        throw new IOException(ei_0.a(-26013, 30339) + var9_14);
                    }
                    catch (Exception v18) {
                        throw ei_0.a(v18);
                    }
                }
                v16 = 0;
            }
            var11_16 = v16;
            block56: while (true) {
                var11_16 = 0;
                while (var6_7 >= 0) {
                    block71: {
                        block72: {
                            block84: {
                                var6_7 = this.Z.read();
                                v19 = var6_7;
                                if (var5_5) ** GOTO lbl186
                                v20 = ei_0.a(14366, 6673198822416852695L);
                                if (var5_5) break block71;
                                break block84;
                                catch (Exception v21) {
                                    throw ei_0.a(v21);
                                }
                            }
                            try {
                                block85: {
                                    if (v19 == v20) break block72;
                                    break block85;
                                    catch (Exception v22) {
                                        throw ei_0.a(v22);
                                    }
                                }
                                ++var11_16;
                                if (!var5_5) continue;
                            }
                            catch (Exception v23) {
                                throw ei_0.a(v23);
                            }
                        }
                        var6_7 = this.Z.read();
                        try {
                            v19 = var6_7;
                            if (!var5_5) {
                                v20 = ei_0.a(31860, 2387458014775403199L);
                            }
                            ** GOTO lbl186
                        }
                        catch (Exception v24) {
                            throw ei_0.a(v24);
                        }
                    }
                    try {
                        if (v19 != v20 && !var5_5) continue;
                        break;
                    }
                    catch (Exception v25) {
                        throw ei_0.a(v25);
                    }
                }
                do {
                    block73: {
                        block74: {
                            v19 = var6_7;
lbl186:
                            // 4 sources

                            if (var5_5) break block73;
                            try {
                                block86: {
                                    if (v19 >= 0) break block74;
                                    break block86;
                                    catch (Exception v26) {
                                        throw ei_0.a(v26);
                                    }
                                }
                                throw new IOException();
                            }
                            catch (Exception v27) {
                                throw ei_0.a(v27);
                            }
                        }
                        v19 = var11_16;
                    }
                    if (v19 != 0) continue block56;
                } while (var5_5);
                break;
            }
        }
        catch (RuntimeException var6_8) {
            throw var6_8;
        }
        catch (Exception var6_9) {
            block76: {
                try {
                    block75: {
                        v28 = this.G;
                        if (var5_5) break block75;
                        try {
                            block87: {
                                if (v28 == null) break block76;
                                break block87;
                                catch (Exception v29) {
                                    throw ei_0.a(v29);
                                }
                            }
                            v28 = this.G;
                        }
                        catch (Exception v30) {
                            throw ei_0.a(v30);
                        }
                    }
                    v28.close();
                }
                catch (Exception var7_11) {
                    // empty catch block
                }
            }
            var7_12 = ei_0.a(-26015, -21586) + var6_9.toString();
            throw new pc_0(var7_12, var6_9);
        }
    }

    @Override
    public InputStream R() {
        return this.Z;
    }

    @Override
    public OutputStream p() {
        return this.w;
    }

    @Override
    public Socket W() {
        return this.G;
    }

    /*
     * Loose catch block
     */
    @Override
    public void n() {
        block19: {
            boolean bl = dm_2.F();
            try {
                Socket socket;
                block18: {
                    ei_0 ei_02;
                    block16: {
                        block17: {
                            block14: {
                                block15: {
                                    ei_02 = this;
                                    if (!bl) break block14;
                                    try {
                                        block20: {
                                            if (ei_02.Z == null) break block15;
                                            break block20;
                                            catch (Exception exception) {
                                                throw ei_0.a(exception);
                                            }
                                        }
                                        this.Z.close();
                                    }
                                    catch (Exception exception) {
                                        throw ei_0.a(exception);
                                    }
                                }
                                ei_02 = this;
                            }
                            if (!bl) break block16;
                            try {
                                block21: {
                                    if (ei_02.w == null) break block17;
                                    break block21;
                                    catch (Exception exception) {
                                        throw ei_0.a(exception);
                                    }
                                }
                                this.w.close();
                            }
                            catch (Exception exception) {
                                throw ei_0.a(exception);
                            }
                        }
                        ei_02 = this;
                    }
                    socket = ei_02.G;
                    if (!bl) break block18;
                    try {
                        block22: {
                            if (socket == null) break block19;
                            break block22;
                            catch (Exception exception) {
                                throw ei_0.a(exception);
                            }
                        }
                        socket = this.G;
                    }
                    catch (Exception exception) {
                        throw ei_0.a(exception);
                    }
                }
                socket.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.Z = null;
        this.w = null;
        this.G = null;
    }

    public static int u() {
        return Y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[8];
                        var11_1 = 0;
                        var10_2 = "i\u00a3\u0090\u00d5c\u00d8s)]\u000e#\u0002Y<\b\u00c9\u00d1\u0091f\u000f\u009b,\u00ae\u001b\u0095\u0098J\u00e3M\u00b5\u00ca\u009dP\u00cd+Q\u001d\u0018PV\u00e3\u00eb\u00a9V\u00c2#\t\u00d0\u00b1\u009b\u00c1\u0002 t\u000b\u00e3\u00cf\u0084\t\u0094\u008d\u00e4r\u0006g\u000e";
                        var12_3 = "i\u00a3\u0090\u00d5c\u00d8s)]\u000e#\u0002Y<\b\u00c9\u00d1\u0091f\u000f\u009b,\u00ae\u001b\u0095\u0098J\u00e3M\u00b5\u00ca\u009dP\u00cd+Q\u001d\u0018PV\u00e3\u00eb\u00a9V\u00c2#\t\u00d0\u00b1\u009b\u00c1\u0002 t\u000b\u00e3\u00cf\u0084\t\u0094\u008d\u00e4r\u0006g\u000e".length();
                        var9_4 = 11;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 61;
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
                            var10_2 = "\u007f\u0006\u00bc\u00b3\u000b;\u00bdP\u00e8\u0090\u0019\u00c5\u00c9\r\u00a9\u00df\u00e3\u0001r\u00ee\u0003W\u00c5~H\u0082\u008c";
                            var12_3 = "\u007f\u0006\u00bc\u00b3\u000b;\u00bdP\u00e8\u0090\u0019\u00c5\u00c9\r\u00a9\u00df\u00e3\u0001r\u00ee\u0003W\u00c5~H\u0082\u008c".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 127;
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
                                    v15 = 96;
                                    break;
                                }
                                case 1: {
                                    v15 = 107;
                                    break;
                                }
                                case 2: {
                                    v15 = 91;
                                    break;
                                }
                                case 3: {
                                    v15 = 67;
                                    break;
                                }
                                case 4: {
                                    v15 = 14;
                                    break;
                                }
                                case 5: {
                                    v15 = 97;
                                    break;
                                }
                                default: {
                                    v15 = 47;
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
                ei_0.a = var13;
                ei_0.b = new String[8];
                var0_7 = 6216293777466471678L;
                var6_8 = new long[10];
                var3_9 = 0;
                var4_10 = "|\u000f\u00be\u00f4lao\u000bs\u00e8\u0018\u00eac\u00a2\u00f6\u00e8\u0087\u00e8\"&\u007fQX\u00a0\u0011\u009b\u0098Y\"\u00e5(}Z\u0080>\u0001\u001f\u0084\u00d6K\u00ea0-\u009f\u000e\r\u000e\u009b\u00f0\u00f2LQT\u00ea\u0012$\u00e2Lc\u0087._\u0017\u0013";
                var5_11 = "|\u000f\u00be\u00f4lao\u000bs\u00e8\u0018\u00eac\u00a2\u00f6\u00e8\u0087\u00e8\"&\u007fQX\u00a0\u0011\u009b\u0098Y\"\u00e5(}Z\u0080>\u0001\u001f\u0084\u00d6K\u00ea0-\u009f\u000e\r\u000e\u009b\u00f0\u00f2LQT\u00ea\u0012$\u00e2Lc\u0087._\u0017\u0013".length();
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
                    var4_10 = "\u0000\u00d7FI\t\u0097\u00bb\u0017\u008aw\u00dd\u00e9[HH'";
                    var5_11 = "\u0000\u00d7FI\t\u0097\u00bb\u0017\u008aw\u00dd\u00e9[HH'".length();
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
        ei_0.c = var6_8;
        ei_0.d = new Integer[10];
        ei_0.Y = ei_0.a(29379, 5665530054152383502L);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9A64) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 208;
                    break;
                }
                case 1: {
                    n14 = 251;
                    break;
                }
                case 2: {
                    n14 = 255;
                    break;
                }
                case 3: {
                    n14 = 146;
                    break;
                }
                case 4: {
                    n14 = 191;
                    break;
                }
                case 5: {
                    n14 = 79;
                    break;
                }
                case 6: {
                    n14 = 201;
                    break;
                }
                case 7: {
                    n14 = 161;
                    break;
                }
                case 8: {
                    n14 = 175;
                    break;
                }
                case 9: {
                    n14 = 220;
                    break;
                }
                case 10: {
                    n14 = 53;
                    break;
                }
                case 11: {
                    n14 = 23;
                    break;
                }
                case 12: {
                    n14 = 177;
                    break;
                }
                case 13: {
                    n14 = 150;
                    break;
                }
                case 14: {
                    n14 = 183;
                    break;
                }
                case 15: {
                    n14 = 30;
                    break;
                }
                case 16: {
                    n14 = 35;
                    break;
                }
                case 17: {
                    n14 = 87;
                    break;
                }
                case 18: {
                    n14 = 214;
                    break;
                }
                case 19: {
                    n14 = 61;
                    break;
                }
                case 20: {
                    n14 = 48;
                    break;
                }
                case 21: {
                    n14 = 33;
                    break;
                }
                case 22: {
                    n14 = 117;
                    break;
                }
                case 23: {
                    n14 = 38;
                    break;
                }
                case 24: {
                    n14 = 168;
                    break;
                }
                case 25: {
                    n14 = 10;
                    break;
                }
                case 26: {
                    n14 = 195;
                    break;
                }
                case 27: {
                    n14 = 159;
                    break;
                }
                case 28: {
                    n14 = 157;
                    break;
                }
                case 29: {
                    n14 = 126;
                    break;
                }
                case 30: {
                    n14 = 113;
                    break;
                }
                case 31: {
                    n14 = 77;
                    break;
                }
                case 32: {
                    n14 = 213;
                    break;
                }
                case 33: {
                    n14 = 162;
                    break;
                }
                case 34: {
                    n14 = 102;
                    break;
                }
                case 35: {
                    n14 = 226;
                    break;
                }
                case 36: {
                    n14 = 55;
                    break;
                }
                case 37: {
                    n14 = 125;
                    break;
                }
                case 38: {
                    n14 = 68;
                    break;
                }
                case 39: {
                    n14 = 119;
                    break;
                }
                case 40: {
                    n14 = 75;
                    break;
                }
                case 41: {
                    n14 = 143;
                    break;
                }
                case 42: {
                    n14 = 252;
                    break;
                }
                case 43: {
                    n14 = 188;
                    break;
                }
                case 44: {
                    n14 = 234;
                    break;
                }
                case 45: {
                    n14 = 40;
                    break;
                }
                case 46: {
                    n14 = 200;
                    break;
                }
                case 47: {
                    n14 = 225;
                    break;
                }
                case 48: {
                    n14 = 93;
                    break;
                }
                case 49: {
                    n14 = 2;
                    break;
                }
                case 50: {
                    n14 = 121;
                    break;
                }
                case 51: {
                    n14 = 54;
                    break;
                }
                case 52: {
                    n14 = 138;
                    break;
                }
                case 53: {
                    n14 = 199;
                    break;
                }
                case 54: {
                    n14 = 124;
                    break;
                }
                case 55: {
                    n14 = 242;
                    break;
                }
                case 56: {
                    n14 = 63;
                    break;
                }
                case 57: {
                    n14 = 164;
                    break;
                }
                case 58: {
                    n14 = 89;
                    break;
                }
                case 59: {
                    n14 = 58;
                    break;
                }
                case 60: {
                    n14 = 206;
                    break;
                }
                case 61: {
                    n14 = 231;
                    break;
                }
                case 62: {
                    n14 = 232;
                    break;
                }
                case 63: {
                    n14 = 82;
                    break;
                }
                case 64: {
                    n14 = 229;
                    break;
                }
                case 65: {
                    n14 = 170;
                    break;
                }
                case 66: {
                    n14 = 45;
                    break;
                }
                case 67: {
                    n14 = 49;
                    break;
                }
                case 68: {
                    n14 = 133;
                    break;
                }
                case 69: {
                    n14 = 46;
                    break;
                }
                case 70: {
                    n14 = 41;
                    break;
                }
                case 71: {
                    n14 = 217;
                    break;
                }
                case 72: {
                    n14 = 230;
                    break;
                }
                case 73: {
                    n14 = 197;
                    break;
                }
                case 74: {
                    n14 = 169;
                    break;
                }
                case 75: {
                    n14 = 101;
                    break;
                }
                case 76: {
                    n14 = 148;
                    break;
                }
                case 77: {
                    n14 = 247;
                    break;
                }
                case 78: {
                    n14 = 204;
                    break;
                }
                case 79: {
                    n14 = 132;
                    break;
                }
                case 80: {
                    n14 = 209;
                    break;
                }
                case 81: {
                    n14 = 22;
                    break;
                }
                case 82: {
                    n14 = 167;
                    break;
                }
                case 83: {
                    n14 = 112;
                    break;
                }
                case 84: {
                    n14 = 25;
                    break;
                }
                case 85: {
                    n14 = 155;
                    break;
                }
                case 86: {
                    n14 = 34;
                    break;
                }
                case 87: {
                    n14 = 250;
                    break;
                }
                case 88: {
                    n14 = 39;
                    break;
                }
                case 89: {
                    n14 = 90;
                    break;
                }
                case 90: {
                    n14 = 218;
                    break;
                }
                case 91: {
                    n14 = 184;
                    break;
                }
                case 92: {
                    n14 = 249;
                    break;
                }
                case 93: {
                    n14 = 151;
                    break;
                }
                case 94: {
                    n14 = 224;
                    break;
                }
                case 95: {
                    n14 = 0;
                    break;
                }
                case 96: {
                    n14 = 74;
                    break;
                }
                case 97: {
                    n14 = 223;
                    break;
                }
                case 98: {
                    n14 = 98;
                    break;
                }
                case 99: {
                    n14 = 116;
                    break;
                }
                case 100: {
                    n14 = 24;
                    break;
                }
                case 101: {
                    n14 = 194;
                    break;
                }
                case 102: {
                    n14 = 141;
                    break;
                }
                case 103: {
                    n14 = 149;
                    break;
                }
                case 104: {
                    n14 = 123;
                    break;
                }
                case 105: {
                    n14 = 110;
                    break;
                }
                case 106: {
                    n14 = 244;
                    break;
                }
                case 107: {
                    n14 = 205;
                    break;
                }
                case 108: {
                    n14 = 154;
                    break;
                }
                case 109: {
                    n14 = 237;
                    break;
                }
                case 110: {
                    n14 = 83;
                    break;
                }
                case 111: {
                    n14 = 198;
                    break;
                }
                case 112: {
                    n14 = 131;
                    break;
                }
                case 113: {
                    n14 = 120;
                    break;
                }
                case 114: {
                    n14 = 70;
                    break;
                }
                case 115: {
                    n14 = 109;
                    break;
                }
                case 116: {
                    n14 = 60;
                    break;
                }
                case 117: {
                    n14 = 6;
                    break;
                }
                case 118: {
                    n14 = 144;
                    break;
                }
                case 119: {
                    n14 = 76;
                    break;
                }
                case 120: {
                    n14 = 211;
                    break;
                }
                case 121: {
                    n14 = 85;
                    break;
                }
                case 122: {
                    n14 = 111;
                    break;
                }
                case 123: {
                    n14 = 67;
                    break;
                }
                case 124: {
                    n14 = 239;
                    break;
                }
                case 125: {
                    n14 = 66;
                    break;
                }
                case 126: {
                    n14 = 193;
                    break;
                }
                case 127: {
                    n14 = 37;
                    break;
                }
                case 128: {
                    n14 = 253;
                    break;
                }
                case 129: {
                    n14 = 245;
                    break;
                }
                case 130: {
                    n14 = 182;
                    break;
                }
                case 131: {
                    n14 = 88;
                    break;
                }
                case 132: {
                    n14 = 32;
                    break;
                }
                case 133: {
                    n14 = 99;
                    break;
                }
                case 134: {
                    n14 = 65;
                    break;
                }
                case 135: {
                    n14 = 185;
                    break;
                }
                case 136: {
                    n14 = 72;
                    break;
                }
                case 137: {
                    n14 = 36;
                    break;
                }
                case 138: {
                    n14 = 147;
                    break;
                }
                case 139: {
                    n14 = 11;
                    break;
                }
                case 140: {
                    n14 = 246;
                    break;
                }
                case 141: {
                    n14 = 42;
                    break;
                }
                case 142: {
                    n14 = 8;
                    break;
                }
                case 143: {
                    n14 = 187;
                    break;
                }
                case 144: {
                    n14 = 69;
                    break;
                }
                case 145: {
                    n14 = 96;
                    break;
                }
                case 146: {
                    n14 = 156;
                    break;
                }
                case 147: {
                    n14 = 59;
                    break;
                }
                case 148: {
                    n14 = 227;
                    break;
                }
                case 149: {
                    n14 = 228;
                    break;
                }
                case 150: {
                    n14 = 94;
                    break;
                }
                case 151: {
                    n14 = 216;
                    break;
                }
                case 152: {
                    n14 = 84;
                    break;
                }
                case 153: {
                    n14 = 29;
                    break;
                }
                case 154: {
                    n14 = 100;
                    break;
                }
                case 155: {
                    n14 = 139;
                    break;
                }
                case 156: {
                    n14 = 15;
                    break;
                }
                case 157: {
                    n14 = 106;
                    break;
                }
                case 158: {
                    n14 = 163;
                    break;
                }
                case 159: {
                    n14 = 173;
                    break;
                }
                case 160: {
                    n14 = 207;
                    break;
                }
                case 161: {
                    n14 = 3;
                    break;
                }
                case 162: {
                    n14 = 176;
                    break;
                }
                case 163: {
                    n14 = 51;
                    break;
                }
                case 164: {
                    n14 = 202;
                    break;
                }
                case 165: {
                    n14 = 174;
                    break;
                }
                case 166: {
                    n14 = 91;
                    break;
                }
                case 167: {
                    n14 = 145;
                    break;
                }
                case 168: {
                    n14 = 158;
                    break;
                }
                case 169: {
                    n14 = 241;
                    break;
                }
                case 170: {
                    n14 = 5;
                    break;
                }
                case 171: {
                    n14 = 80;
                    break;
                }
                case 172: {
                    n14 = 97;
                    break;
                }
                case 173: {
                    n14 = 95;
                    break;
                }
                case 174: {
                    n14 = 240;
                    break;
                }
                case 175: {
                    n14 = 57;
                    break;
                }
                case 176: {
                    n14 = 52;
                    break;
                }
                case 177: {
                    n14 = 20;
                    break;
                }
                case 178: {
                    n14 = 103;
                    break;
                }
                case 179: {
                    n14 = 1;
                    break;
                }
                case 180: {
                    n14 = 254;
                    break;
                }
                case 181: {
                    n14 = 13;
                    break;
                }
                case 182: {
                    n14 = 189;
                    break;
                }
                case 183: {
                    n14 = 165;
                    break;
                }
                case 184: {
                    n14 = 44;
                    break;
                }
                case 185: {
                    n14 = 178;
                    break;
                }
                case 186: {
                    n14 = 142;
                    break;
                }
                case 187: {
                    n14 = 130;
                    break;
                }
                case 188: {
                    n14 = 4;
                    break;
                }
                case 189: {
                    n14 = 248;
                    break;
                }
                case 190: {
                    n14 = 192;
                    break;
                }
                case 191: {
                    n14 = 235;
                    break;
                }
                case 192: {
                    n14 = 18;
                    break;
                }
                case 193: {
                    n14 = 233;
                    break;
                }
                case 194: {
                    n14 = 136;
                    break;
                }
                case 195: {
                    n14 = 181;
                    break;
                }
                case 196: {
                    n14 = 127;
                    break;
                }
                case 197: {
                    n14 = 92;
                    break;
                }
                case 198: {
                    n14 = 17;
                    break;
                }
                case 199: {
                    n14 = 115;
                    break;
                }
                case 200: {
                    n14 = 152;
                    break;
                }
                case 201: {
                    n14 = 47;
                    break;
                }
                case 202: {
                    n14 = 12;
                    break;
                }
                case 203: {
                    n14 = 105;
                    break;
                }
                case 204: {
                    n14 = 86;
                    break;
                }
                case 205: {
                    n14 = 243;
                    break;
                }
                case 206: {
                    n14 = 219;
                    break;
                }
                case 207: {
                    n14 = 21;
                    break;
                }
                case 208: {
                    n14 = 215;
                    break;
                }
                case 209: {
                    n14 = 43;
                    break;
                }
                case 210: {
                    n14 = 50;
                    break;
                }
                case 211: {
                    n14 = 135;
                    break;
                }
                case 212: {
                    n14 = 108;
                    break;
                }
                case 213: {
                    n14 = 71;
                    break;
                }
                case 214: {
                    n14 = 62;
                    break;
                }
                case 215: {
                    n14 = 16;
                    break;
                }
                case 216: {
                    n14 = 31;
                    break;
                }
                case 217: {
                    n14 = 238;
                    break;
                }
                case 218: {
                    n14 = 56;
                    break;
                }
                case 219: {
                    n14 = 137;
                    break;
                }
                case 220: {
                    n14 = 28;
                    break;
                }
                case 221: {
                    n14 = 160;
                    break;
                }
                case 222: {
                    n14 = 78;
                    break;
                }
                case 223: {
                    n14 = 222;
                    break;
                }
                case 224: {
                    n14 = 212;
                    break;
                }
                case 225: {
                    n14 = 180;
                    break;
                }
                case 226: {
                    n14 = 236;
                    break;
                }
                case 227: {
                    n14 = 166;
                    break;
                }
                case 228: {
                    n14 = 27;
                    break;
                }
                case 229: {
                    n14 = 19;
                    break;
                }
                case 230: {
                    n14 = 140;
                    break;
                }
                case 231: {
                    n14 = 64;
                    break;
                }
                case 232: {
                    n14 = 172;
                    break;
                }
                case 233: {
                    n14 = 14;
                    break;
                }
                case 234: {
                    n14 = 179;
                    break;
                }
                case 235: {
                    n14 = 134;
                    break;
                }
                case 236: {
                    n14 = 128;
                    break;
                }
                case 237: {
                    n14 = 153;
                    break;
                }
                case 238: {
                    n14 = 210;
                    break;
                }
                case 239: {
                    n14 = 104;
                    break;
                }
                case 240: {
                    n14 = 171;
                    break;
                }
                case 241: {
                    n14 = 186;
                    break;
                }
                case 242: {
                    n14 = 203;
                    break;
                }
                case 243: {
                    n14 = 9;
                    break;
                }
                case 244: {
                    n14 = 221;
                    break;
                }
                case 245: {
                    n14 = 73;
                    break;
                }
                case 246: {
                    n14 = 81;
                    break;
                }
                case 247: {
                    n14 = 7;
                    break;
                }
                case 248: {
                    n14 = 129;
                    break;
                }
                case 249: {
                    n14 = 26;
                    break;
                }
                case 250: {
                    n14 = 190;
                    break;
                }
                case 251: {
                    n14 = 114;
                    break;
                }
                case 252: {
                    n14 = 196;
                    break;
                }
                case 253: {
                    n14 = 122;
                    break;
                }
                case 254: {
                    n14 = 118;
                    break;
                }
                default: {
                    n14 = 107;
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
            ei_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1ECF;
        if (d[n11] == null) {
            ei_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

