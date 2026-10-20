/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.dy_1;
import com.ky_2;
import com.po_1;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from lF
 */
public class lf_1
implements po_1 {
    boolean p;
    zD G;
    lv_2 q;
    int J;
    L0 v;
    KV e;
    boolean O;
    int n;
    ArrayList s;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] f;
    private static final Long[] g;

    lf_1(lv_2 lv_22, boolean bl) {
        this.J = lf_1.a(4063, 527846010556201822L);
        this.O = true;
        this.s = new ArrayList();
        this.q = lv_22;
        this.p = bl;
    }

    void D() {
        try {
            this.G.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void I() {
        block61: {
            block59: {
                block60: {
                    block58: {
                        block57: {
                            block66: {
                                block55: {
                                    block56: {
                                        this.v = new L0(3);
                                        this.e = new KV();
                                        try {
                                            yt_1.F.J(new ur_2(this));
                                        }
                                        catch (InvocationTargetException v0) {
                                            throw v0.getTargetException();
                                        }
                                        v1 = dl_2.K();
                                        this.G = new zD((lv_2)this.q, null, zD.E);
                                        try {
                                            this.G.e(true);
                                        }
                                        catch (InvocationTargetException v2) {
                                            throw v2.getTargetException();
                                        }
                                        var1_1 = v1;
                                        var2_2 = new Random();
                                        var3_3 = (String)dd_1.t + "upload.temp";
                                        var4_4 = (String)dd_1.t + "download_" + Math.abs(var2_2.nextInt(lf_1.a(9149, 1704643278018549565L))) + ".temp";
                                        var5_5 = new File((String)dd_1.t);
                                        v3 = var5_5;
                                        if (var1_1 == null) break block55;
                                        try {
                                            block65: {
                                                if (v3.exists()) break block56;
                                                break block65;
                                                catch (Exception v4) {
                                                    throw lf_1.a(v4);
                                                }
                                            }
                                            var5_5.mkdirs();
                                        }
                                        catch (Exception v5) {
                                            throw lf_1.a(v5);
                                        }
                                    }
                                    v3 = new File(var3_3);
                                }
                                var6_6 = v3;
                                var7_7 = new File(var4_4);
                                try {
                                    this.G.S();
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                                try {
                                    yt_1.F.J(new go_0(this));
                                }
                                catch (InvocationTargetException v7) {
                                    throw v7.getTargetException();
                                }
                                try {
                                    v8 = (dy_1)this.G.H();
                                }
                                catch (InvocationTargetException v9) {
                                    throw v9.getTargetException();
                                }
                                var8_8 = v8;
                                v10 = this.p;
                                if (var1_1 == null) break block57;
                                if (!v10) ** GOTO lbl81
                                break block66;
                                catch (Exception v11) {
                                    throw lf_1.a(v11);
                                }
                            }
                            try {
                                block67: {
                                    var8_8.K("/dev/zero", var4_4, this, 0);
                                    if (var1_1 != null) break block58;
                                    break block67;
                                    catch (Exception v12) {
                                        throw lf_1.a(v12);
                                    }
                                }
                                v10 = var6_6.exists();
                            }
                            catch (Exception v13) {
                                throw lf_1.a(v13);
                            }
                        }
                        if (!v10) {
                            var9_10 = new RandomAccessFile(var3_3, "rw");
                            var9_10.seek(lf_1.b(10891, 1626721030563178870L));
                            var9_10.write(0);
                            var9_10.close();
                        }
                        var8_8.d(var6_6.getAbsolutePath(), "/dev/null", this, 0);
                    }
                    try {
                        this.v.X();
                    }
                    catch (InvocationTargetException v14) {
                        throw v14.getTargetException();
                    }
                    this.O = false;
                    v15 = var6_6.exists();
                    if (var1_1 == null) break block59;
                    try {
                        block68: {
                            if (!v15) break block60;
                            break block68;
                            catch (Exception v16) {
                                throw lf_1.a(v16);
                            }
                        }
                        var6_6.delete();
                    }
                    catch (Exception v17) {
                        throw lf_1.a(v17);
                    }
                }
                v15 = var7_7.exists();
            }
            if (var1_1 == null) break block61;
            try {
                block69: {
                    if (!v15) break block61;
                    break block69;
                    catch (Exception v18) {
                        throw lf_1.a(v18);
                    }
                }
                v15 = var7_7.delete();
                break block61;
            }
            catch (Exception v19) {
                throw lf_1.a(v19);
            }
            catch (Exception var8_9) {
                try {
                    var8_9.printStackTrace();
                }
                catch (Throwable var10_11) {
                    block64: {
                        block62: {
                            block63: {
                                try {
                                    try {
                                        try {
                                            this.v.X();
                                        }
                                        catch (InvocationTargetException v20) {
                                            throw v20.getTargetException();
                                        }
                                        this.O = false;
                                        v21 = var6_6.exists();
                                        if (var1_1 == null) break block62;
                                        if (!v21) break block63;
                                    }
                                    catch (Exception v22) {
                                        throw lf_1.a(v22);
                                    }
                                    var6_6.delete();
                                }
                                catch (Exception v23) {
                                    throw lf_1.a(v23);
                                }
                            }
                            v21 = var7_7.exists();
                        }
                        try {
                            try {
                                if (var1_1 == null || !v21) break block64;
                            }
                            catch (Exception v24) {
                                throw lf_1.a(v24);
                            }
                            v21 = var7_7.delete();
                        }
                        catch (Exception v25) {
                            throw lf_1.a(v25);
                        }
                    }
                    throw var10_11;
                }
                try {
                    this.v.X();
                }
                catch (InvocationTargetException v26) {
                    throw v26.getTargetException();
                }
                this.O = false;
                v27 = var6_6.exists();
                if (var1_1 != null) {
                    try {
                        if (v27) {
                            var6_6.delete();
                        }
                    }
                    catch (Exception v28) {
                        throw lf_1.a(v28);
                    }
                    v27 = var7_7.exists();
                }
                if (var1_1 == null) break block61;
                try {
                    block70: {
                        if (!v27) break block61;
                        break block70;
                        catch (Exception v29) {
                            throw lf_1.a(v29);
                        }
                    }
                    v27 = var7_7.delete();
                }
                catch (Exception v30) {
                    throw lf_1.a(v30);
                }
            }
        }
    }

    @Override
    public void b(int n10, String string, String string2, long l2) {
    }

    @Override
    public boolean o(long l2) {
        lf_1 lf_12 = this;
        lf_12.n = (int)((long)lf_12.n + l2 / lf_1.b(17911, 1102625745494197771L));
        try {
            this.v.T((int)l2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        VO vO = new VO(null, 1);
        try {
            vO.Y(this.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.B(vO);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return true;
    }

    @Override
    public void c() {
    }

    public void f(cq_0 cq_02) {
        ((ArrayList)this.s).add(cq_02);
    }

    void B(VO vO) {
        Iterator iterator = ((ArrayList)this.s).iterator();
        ky_2[] ky_2Array = dl_2.K();
        while (iterator.hasNext()) {
            cq_0 cq_02 = (cq_0)iterator.next();
            try {
                cq_02.u(vO);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (ky_2Array != null) continue;
        }
    }

    public KV l() {
        return (KV)this.e;
    }

    public void M(KV kV) {
        this.e = kV;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                var21 = new String[6];
                                var19_1 = 0;
                                var18_2 = "'\u0087'b\u00e1@N\u000f\u001d\u0002\u00cf\u00aa\u0005\u00ceH;\u0092=\tU|i\u001d(\u00bbg\u00f8)";
                                var20_3 = "'\u0087'b\u00e1@N\u000f\u001d\u0002\u00cf\u00aa\u0005\u00ceH;\u0092=\tU|i\u001d(\u00bbg\u00f8)".length();
                                var17_4 = 9;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 40;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block23;
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
                                    var18_2 = "\u00be$\u00af:5\u00d8\u00ab\u00ec;\u00c5q\t\u0087\u00d1\u00a0y\u00a1\u009a\u00da\u00de\u0089";
                                    var20_3 = "\u00be$\u00af:5\u00d8\u00ab\u00ec;\u00c5q\t\u0087\u00d1\u00a0y\u00a1\u009a\u00da\u00de\u0089".length();
                                    var17_4 = 11;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 70;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block23;
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
                                    break block24;
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
                                            v15 = 42;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 107;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 4;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 76;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 78;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 126;
                                            break;
                                        }
                                        default: {
                                            v15 = 41;
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
                        lf_1.a = var21;
                        lf_1.b = new String[6];
                        var8_7 = 6864103703478266204L;
                        var14_8 = new long[2];
                        var11_9 = 0;
                        var12_10 = "\u00f6\u0096U\f\u0000\fNB=?\u00c4\u009f\u00fcN}\u0089";
                        var13_11 = "\u00f6\u0096U\f\u0000\fNB=?\u00c4\u009f\u00fcN}\u0089".length();
                        var10_12 = 0;
                        while (true) {
                            break block25;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block26;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                lf_1.c = var14_8;
                lf_1.d = new Integer[2];
                var0_14 = 5435298123751007692L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "]\u00fdH\u00f0\u0001f\u008c\u00baD#^\u009e\u0092\u00e7c\u00c4";
                var5_18 = "]\u00fdH\u00f0\u0001f\u008c\u00baD#^\u009e\u0092\u00e7c\u00c4".length();
                var2_19 = 0;
                while (true) {
                    break block27;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block28;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        lf_1.f = var6_15;
        lf_1.g = new Long[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFA8F8) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 97;
                    break;
                }
                case 1: {
                    n14 = 110;
                    break;
                }
                case 2: {
                    n14 = 199;
                    break;
                }
                case 3: {
                    n14 = 128;
                    break;
                }
                case 4: {
                    n14 = 52;
                    break;
                }
                case 5: {
                    n14 = 206;
                    break;
                }
                case 6: {
                    n14 = 113;
                    break;
                }
                case 7: {
                    n14 = 123;
                    break;
                }
                case 8: {
                    n14 = 162;
                    break;
                }
                case 9: {
                    n14 = 116;
                    break;
                }
                case 10: {
                    n14 = 137;
                    break;
                }
                case 11: {
                    n14 = 90;
                    break;
                }
                case 12: {
                    n14 = 53;
                    break;
                }
                case 13: {
                    n14 = 195;
                    break;
                }
                case 14: {
                    n14 = 34;
                    break;
                }
                case 15: {
                    n14 = 197;
                    break;
                }
                case 16: {
                    n14 = 205;
                    break;
                }
                case 17: {
                    n14 = 92;
                    break;
                }
                case 18: {
                    n14 = 168;
                    break;
                }
                case 19: {
                    n14 = 148;
                    break;
                }
                case 20: {
                    n14 = 166;
                    break;
                }
                case 21: {
                    n14 = 57;
                    break;
                }
                case 22: {
                    n14 = 176;
                    break;
                }
                case 23: {
                    n14 = 158;
                    break;
                }
                case 24: {
                    n14 = 120;
                    break;
                }
                case 25: {
                    n14 = 163;
                    break;
                }
                case 26: {
                    n14 = 17;
                    break;
                }
                case 27: {
                    n14 = 215;
                    break;
                }
                case 28: {
                    n14 = 107;
                    break;
                }
                case 29: {
                    n14 = 200;
                    break;
                }
                case 30: {
                    n14 = 157;
                    break;
                }
                case 31: {
                    n14 = 243;
                    break;
                }
                case 32: {
                    n14 = 214;
                    break;
                }
                case 33: {
                    n14 = 172;
                    break;
                }
                case 34: {
                    n14 = 216;
                    break;
                }
                case 35: {
                    n14 = 78;
                    break;
                }
                case 36: {
                    n14 = 156;
                    break;
                }
                case 37: {
                    n14 = 23;
                    break;
                }
                case 38: {
                    n14 = 186;
                    break;
                }
                case 39: {
                    n14 = 20;
                    break;
                }
                case 40: {
                    n14 = 153;
                    break;
                }
                case 41: {
                    n14 = 6;
                    break;
                }
                case 42: {
                    n14 = 125;
                    break;
                }
                case 43: {
                    n14 = 68;
                    break;
                }
                case 44: {
                    n14 = 219;
                    break;
                }
                case 45: {
                    n14 = 101;
                    break;
                }
                case 46: {
                    n14 = 71;
                    break;
                }
                case 47: {
                    n14 = 188;
                    break;
                }
                case 48: {
                    n14 = 79;
                    break;
                }
                case 49: {
                    n14 = 58;
                    break;
                }
                case 50: {
                    n14 = 159;
                    break;
                }
                case 51: {
                    n14 = 142;
                    break;
                }
                case 52: {
                    n14 = 250;
                    break;
                }
                case 53: {
                    n14 = 146;
                    break;
                }
                case 54: {
                    n14 = 44;
                    break;
                }
                case 55: {
                    n14 = 240;
                    break;
                }
                case 56: {
                    n14 = 171;
                    break;
                }
                case 57: {
                    n14 = 198;
                    break;
                }
                case 58: {
                    n14 = 15;
                    break;
                }
                case 59: {
                    n14 = 61;
                    break;
                }
                case 60: {
                    n14 = 127;
                    break;
                }
                case 61: {
                    n14 = 86;
                    break;
                }
                case 62: {
                    n14 = 155;
                    break;
                }
                case 63: {
                    n14 = 145;
                    break;
                }
                case 64: {
                    n14 = 100;
                    break;
                }
                case 65: {
                    n14 = 94;
                    break;
                }
                case 66: {
                    n14 = 169;
                    break;
                }
                case 67: {
                    n14 = 83;
                    break;
                }
                case 68: {
                    n14 = 203;
                    break;
                }
                case 69: {
                    n14 = 223;
                    break;
                }
                case 70: {
                    n14 = 54;
                    break;
                }
                case 71: {
                    n14 = 217;
                    break;
                }
                case 72: {
                    n14 = 201;
                    break;
                }
                case 73: {
                    n14 = 46;
                    break;
                }
                case 74: {
                    n14 = 14;
                    break;
                }
                case 75: {
                    n14 = 29;
                    break;
                }
                case 76: {
                    n14 = 175;
                    break;
                }
                case 77: {
                    n14 = 252;
                    break;
                }
                case 78: {
                    n14 = 87;
                    break;
                }
                case 79: {
                    n14 = 119;
                    break;
                }
                case 80: {
                    n14 = 95;
                    break;
                }
                case 81: {
                    n14 = 212;
                    break;
                }
                case 82: {
                    n14 = 77;
                    break;
                }
                case 83: {
                    n14 = 76;
                    break;
                }
                case 84: {
                    n14 = 65;
                    break;
                }
                case 85: {
                    n14 = 2;
                    break;
                }
                case 86: {
                    n14 = 32;
                    break;
                }
                case 87: {
                    n14 = 75;
                    break;
                }
                case 88: {
                    n14 = 64;
                    break;
                }
                case 89: {
                    n14 = 151;
                    break;
                }
                case 90: {
                    n14 = 81;
                    break;
                }
                case 91: {
                    n14 = 174;
                    break;
                }
                case 92: {
                    n14 = 24;
                    break;
                }
                case 93: {
                    n14 = 242;
                    break;
                }
                case 94: {
                    n14 = 112;
                    break;
                }
                case 95: {
                    n14 = 56;
                    break;
                }
                case 96: {
                    n14 = 177;
                    break;
                }
                case 97: {
                    n14 = 59;
                    break;
                }
                case 98: {
                    n14 = 66;
                    break;
                }
                case 99: {
                    n14 = 167;
                    break;
                }
                case 100: {
                    n14 = 152;
                    break;
                }
                case 101: {
                    n14 = 246;
                    break;
                }
                case 102: {
                    n14 = 165;
                    break;
                }
                case 103: {
                    n14 = 237;
                    break;
                }
                case 104: {
                    n14 = 207;
                    break;
                }
                case 105: {
                    n14 = 232;
                    break;
                }
                case 106: {
                    n14 = 30;
                    break;
                }
                case 107: {
                    n14 = 140;
                    break;
                }
                case 108: {
                    n14 = 180;
                    break;
                }
                case 109: {
                    n14 = 18;
                    break;
                }
                case 110: {
                    n14 = 96;
                    break;
                }
                case 111: {
                    n14 = 194;
                    break;
                }
                case 112: {
                    n14 = 132;
                    break;
                }
                case 113: {
                    n14 = 179;
                    break;
                }
                case 114: {
                    n14 = 85;
                    break;
                }
                case 115: {
                    n14 = 229;
                    break;
                }
                case 116: {
                    n14 = 93;
                    break;
                }
                case 117: {
                    n14 = 187;
                    break;
                }
                case 118: {
                    n14 = 21;
                    break;
                }
                case 119: {
                    n14 = 35;
                    break;
                }
                case 120: {
                    n14 = 208;
                    break;
                }
                case 121: {
                    n14 = 244;
                    break;
                }
                case 122: {
                    n14 = 98;
                    break;
                }
                case 123: {
                    n14 = 236;
                    break;
                }
                case 124: {
                    n14 = 141;
                    break;
                }
                case 125: {
                    n14 = 241;
                    break;
                }
                case 126: {
                    n14 = 72;
                    break;
                }
                case 127: {
                    n14 = 69;
                    break;
                }
                case 128: {
                    n14 = 80;
                    break;
                }
                case 129: {
                    n14 = 45;
                    break;
                }
                case 130: {
                    n14 = 70;
                    break;
                }
                case 131: {
                    n14 = 239;
                    break;
                }
                case 132: {
                    n14 = 181;
                    break;
                }
                case 133: {
                    n14 = 136;
                    break;
                }
                case 134: {
                    n14 = 62;
                    break;
                }
                case 135: {
                    n14 = 88;
                    break;
                }
                case 136: {
                    n14 = 74;
                    break;
                }
                case 137: {
                    n14 = 47;
                    break;
                }
                case 138: {
                    n14 = 89;
                    break;
                }
                case 139: {
                    n14 = 192;
                    break;
                }
                case 140: {
                    n14 = 31;
                    break;
                }
                case 141: {
                    n14 = 193;
                    break;
                }
                case 142: {
                    n14 = 251;
                    break;
                }
                case 143: {
                    n14 = 121;
                    break;
                }
                case 144: {
                    n14 = 231;
                    break;
                }
                case 145: {
                    n14 = 131;
                    break;
                }
                case 146: {
                    n14 = 238;
                    break;
                }
                case 147: {
                    n14 = 63;
                    break;
                }
                case 148: {
                    n14 = 28;
                    break;
                }
                case 149: {
                    n14 = 189;
                    break;
                }
                case 150: {
                    n14 = 235;
                    break;
                }
                case 151: {
                    n14 = 124;
                    break;
                }
                case 152: {
                    n14 = 103;
                    break;
                }
                case 153: {
                    n14 = 202;
                    break;
                }
                case 154: {
                    n14 = 43;
                    break;
                }
                case 155: {
                    n14 = 22;
                    break;
                }
                case 156: {
                    n14 = 182;
                    break;
                }
                case 157: {
                    n14 = 224;
                    break;
                }
                case 158: {
                    n14 = 25;
                    break;
                }
                case 159: {
                    n14 = 118;
                    break;
                }
                case 160: {
                    n14 = 170;
                    break;
                }
                case 161: {
                    n14 = 115;
                    break;
                }
                case 162: {
                    n14 = 228;
                    break;
                }
                case 163: {
                    n14 = 230;
                    break;
                }
                case 164: {
                    n14 = 139;
                    break;
                }
                case 165: {
                    n14 = 211;
                    break;
                }
                case 166: {
                    n14 = 129;
                    break;
                }
                case 167: {
                    n14 = 253;
                    break;
                }
                case 168: {
                    n14 = 173;
                    break;
                }
                case 169: {
                    n14 = 196;
                    break;
                }
                case 170: {
                    n14 = 109;
                    break;
                }
                case 171: {
                    n14 = 51;
                    break;
                }
                case 172: {
                    n14 = 42;
                    break;
                }
                case 173: {
                    n14 = 218;
                    break;
                }
                case 174: {
                    n14 = 36;
                    break;
                }
                case 175: {
                    n14 = 191;
                    break;
                }
                case 176: {
                    n14 = 26;
                    break;
                }
                case 177: {
                    n14 = 185;
                    break;
                }
                case 178: {
                    n14 = 161;
                    break;
                }
                case 179: {
                    n14 = 105;
                    break;
                }
                case 180: {
                    n14 = 33;
                    break;
                }
                case 181: {
                    n14 = 154;
                    break;
                }
                case 182: {
                    n14 = 150;
                    break;
                }
                case 183: {
                    n14 = 234;
                    break;
                }
                case 184: {
                    n14 = 91;
                    break;
                }
                case 185: {
                    n14 = 249;
                    break;
                }
                case 186: {
                    n14 = 41;
                    break;
                }
                case 187: {
                    n14 = 37;
                    break;
                }
                case 188: {
                    n14 = 233;
                    break;
                }
                case 189: {
                    n14 = 13;
                    break;
                }
                case 190: {
                    n14 = 12;
                    break;
                }
                case 191: {
                    n14 = 213;
                    break;
                }
                case 192: {
                    n14 = 27;
                    break;
                }
                case 193: {
                    n14 = 114;
                    break;
                }
                case 194: {
                    n14 = 184;
                    break;
                }
                case 195: {
                    n14 = 3;
                    break;
                }
                case 196: {
                    n14 = 106;
                    break;
                }
                case 197: {
                    n14 = 11;
                    break;
                }
                case 198: {
                    n14 = 164;
                    break;
                }
                case 199: {
                    n14 = 143;
                    break;
                }
                case 200: {
                    n14 = 226;
                    break;
                }
                case 201: {
                    n14 = 104;
                    break;
                }
                case 202: {
                    n14 = 209;
                    break;
                }
                case 203: {
                    n14 = 111;
                    break;
                }
                case 204: {
                    n14 = 8;
                    break;
                }
                case 205: {
                    n14 = 135;
                    break;
                }
                case 206: {
                    n14 = 178;
                    break;
                }
                case 207: {
                    n14 = 204;
                    break;
                }
                case 208: {
                    n14 = 39;
                    break;
                }
                case 209: {
                    n14 = 102;
                    break;
                }
                case 210: {
                    n14 = 49;
                    break;
                }
                case 211: {
                    n14 = 5;
                    break;
                }
                case 212: {
                    n14 = 9;
                    break;
                }
                case 213: {
                    n14 = 138;
                    break;
                }
                case 214: {
                    n14 = 82;
                    break;
                }
                case 215: {
                    n14 = 149;
                    break;
                }
                case 216: {
                    n14 = 134;
                    break;
                }
                case 217: {
                    n14 = 19;
                    break;
                }
                case 218: {
                    n14 = 60;
                    break;
                }
                case 219: {
                    n14 = 16;
                    break;
                }
                case 220: {
                    n14 = 190;
                    break;
                }
                case 221: {
                    n14 = 183;
                    break;
                }
                case 222: {
                    n14 = 248;
                    break;
                }
                case 223: {
                    n14 = 10;
                    break;
                }
                case 224: {
                    n14 = 1;
                    break;
                }
                case 225: {
                    n14 = 144;
                    break;
                }
                case 226: {
                    n14 = 50;
                    break;
                }
                case 227: {
                    n14 = 117;
                    break;
                }
                case 228: {
                    n14 = 255;
                    break;
                }
                case 229: {
                    n14 = 38;
                    break;
                }
                case 230: {
                    n14 = 99;
                    break;
                }
                case 231: {
                    n14 = 40;
                    break;
                }
                case 232: {
                    n14 = 108;
                    break;
                }
                case 233: {
                    n14 = 55;
                    break;
                }
                case 234: {
                    n14 = 73;
                    break;
                }
                case 235: {
                    n14 = 7;
                    break;
                }
                case 236: {
                    n14 = 133;
                    break;
                }
                case 237: {
                    n14 = 245;
                    break;
                }
                case 238: {
                    n14 = 210;
                    break;
                }
                case 239: {
                    n14 = 147;
                    break;
                }
                case 240: {
                    n14 = 67;
                    break;
                }
                case 241: {
                    n14 = 225;
                    break;
                }
                case 242: {
                    n14 = 221;
                    break;
                }
                case 243: {
                    n14 = 0;
                    break;
                }
                case 244: {
                    n14 = 227;
                    break;
                }
                case 245: {
                    n14 = 130;
                    break;
                }
                case 246: {
                    n14 = 126;
                    break;
                }
                case 247: {
                    n14 = 247;
                    break;
                }
                case 248: {
                    n14 = 222;
                    break;
                }
                case 249: {
                    n14 = 220;
                    break;
                }
                case 250: {
                    n14 = 160;
                    break;
                }
                case 251: {
                    n14 = 84;
                    break;
                }
                case 252: {
                    n14 = 48;
                    break;
                }
                case 253: {
                    n14 = 122;
                    break;
                }
                case 254: {
                    n14 = 4;
                    break;
                }
                default: {
                    n14 = 254;
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
            lf_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3481;
        if (d[n11] == null) {
            lf_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3FD) & Short.MAX_VALUE;
        if (g[n11] == null) {
            lf_1.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

