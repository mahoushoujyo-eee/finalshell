/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from Wi
 */
public class wi_0 {
    private Hashtable u;
    private RandomAccessFile H;
    private MappedByteBuffer t;
    private static wi_0 J;
    private long C;
    private long B;
    private kh_1 F;
    private byte[] U;
    private byte[] p;
    private byte[] f;
    private static int y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] g;

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
                                var21 = new String[14];
                                var19_1 = 0;
                                var18_2 = "\u00ceD\u570e\u5745\u4f00\u6072\u6559\u4ea9\u6ccd\u6793\u6285\u527c\ufff0\u00f3P\u6610\u79ed\u52b3\u802b\u5ce1\u65c4\u6cbc\u4f2b\u7557\u0004\u6777\u777d\u5736\u531b\n\u95de\u8bd3\u76e2\u00f6\u000e\u6533\u63f6\u5e18\u65ca\u4e93\t\u0006\u00fb9\u00bb\u0018\u009bqN\u00cd\u0004\u67df\u7710\u56ee\u5b3a\f_\u001f\u0007;M\u00b2\u0087%\u00d2\u0011\u0007\u00a8\u0003\u0006\u00a4\u00a3\nE\u0003\u0094\u009f\u00a9\u00ee$|>\u0094\u0003\u0083!\u0013\u0019Q\u00f1\u57fd\u57f3\u4f7e\u60a4\u6596\u4e73\u68a9\u5fce\u6750\u9538\u8b30\uff32\u00ce\u00ab\u6600\u79c2\u5270\u8025\u5c67\u6595\u6ccf\u4fb6\u7569\toK\u0014\u00ad\u00bdY\u00c5\u0016[\u0004\u6708\u77e8\u57d9\u53a9";
                                var20_3 = "\u00ceD\u570e\u5745\u4f00\u6072\u6559\u4ea9\u6ccd\u6793\u6285\u527c\ufff0\u00f3P\u6610\u79ed\u52b3\u802b\u5ce1\u65c4\u6cbc\u4f2b\u7557\u0004\u6777\u777d\u5736\u531b\n\u95de\u8bd3\u76e2\u00f6\u000e\u6533\u63f6\u5e18\u65ca\u4e93\t\u0006\u00fb9\u00bb\u0018\u009bqN\u00cd\u0004\u67df\u7710\u56ee\u5b3a\f_\u001f\u0007;M\u00b2\u0087%\u00d2\u0011\u0007\u00a8\u0003\u0006\u00a4\u00a3\nE\u0003\u0094\u009f\u00a9\u00ee$|>\u0094\u0003\u0083!\u0013\u0019Q\u00f1\u57fd\u57f3\u4f7e\u60a4\u6596\u4e73\u68a9\u5fce\u6750\u9538\u8b30\uff32\u00ce\u00ab\u6600\u79c2\u5270\u8025\u5c67\u6595\u6ccf\u4fb6\u7569\toK\u0014\u00ad\u00bdY\u00c5\u0016[\u0004\u6708\u77e8\u57d9\u53a9".length();
                                var17_4 = 24;
                                var16_5 = -1;
                                wi_0.F(30);
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 56;
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
                                    var18_2 = "\u959c\u8bc3\u7628v\u00d5\u65a1\u630f\u5ec8\u6577\u4e0b\f5\u001c\u00c8\u00d96lj|\u00ed\u00b8b\u001f";
                                    var20_3 = "\u959c\u8bc3\u7628v\u00d5\u65a1\u630f\u5ec8\u6577\u4e0b\f5\u001c\u00c8\u00d96lj|\u00ed\u00b8b\u001f".length();
                                    var17_4 = 10;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 87;
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
                                            v15 = 69;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 36;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 16;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 108;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 43;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 79;
                                            break;
                                        }
                                        default: {
                                            v15 = 89;
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
                        wi_0.a = var21;
                        wi_0.b = new String[14];
                        var8_7 = 6315840134985664308L;
                        var14_8 = new long[15];
                        var11_9 = 0;
                        var12_10 = "O}V\u0007\u0019aWo\u00c7ww\u00ce\u00b3\u0080\u008e!\u00de\n-\"\u00d5\u00c3\u00f8\u00c0\u0003\u0096\u00a2\u00c4\u00ec\u00be\u00e4G\u008a\u007f\u00e8\u008f\u00b8\u00a2\u00a7\u00a2\f\u008e<\u00fe|S\u001es\u00ba\u00f8\u008a\u008e\u009f\u00f2\u00c6s\u001c\u00f3\u00a4\u00d4/\u0094\u00baP\u00e2\u00e5y3;\u00be\u0006\u00f6\u00f4lO\u00b4\u0089\u001cksF0\u00b4\u00f3\u009d\u00a9\u00bcH\u00b4\u00be\u00cfz<\u0001C5&\u008d\u0096\u00c2T\u00e2(v";
                        var13_11 = "O}V\u0007\u0019aWo\u00c7ww\u00ce\u00b3\u0080\u008e!\u00de\n-\"\u00d5\u00c3\u00f8\u00c0\u0003\u0096\u00a2\u00c4\u00ec\u00be\u00e4G\u008a\u007f\u00e8\u008f\u00b8\u00a2\u00a7\u00a2\f\u008e<\u00fe|S\u001es\u00ba\u00f8\u008a\u008e\u009f\u00f2\u00c6s\u001c\u00f3\u00a4\u00d4/\u0094\u00baP\u00e2\u00e5y3;\u00be\u0006\u00f6\u00f4lO\u00b4\u0089\u001cksF0\u00b4\u00f3\u009d\u00a9\u00bcH\u00b4\u00be\u00cfz<\u0001C5&\u008d\u0096\u00c2T\u00e2(v".length();
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
                            var12_10 = "\u00ca\u00f8]\u00b5\u000b\u00e3\u00b0\u00d5\u00b9\t\u00b5\u00a2A\u0086\u00b4\u00f5";
                            var13_11 = "\u00ca\u00f8]\u00b5\u000b\u00e3\u00b0\u00d5\u00b9\t\u00b5\u00a2A\u0086\u00b4\u00f5".length();
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
                wi_0.c = var14_8;
                wi_0.d = new Integer[15];
                var0_14 = 7207021069962838389L;
                var6_15 = new long[7];
                var3_16 = 0;
                var4_17 = "\u009c\u0017\u00e9\u00ac\u00db\u0089\u00de\u00e7\u0013\\2\u00d8M\u00a1k\u00ae\\i\u008a3T\u00e8:\u00bei>\u00ff\u00f6v\u00d7\u00f51h\u0094U}\u0095`Gy";
                var5_18 = "\u009c\u0017\u00e9\u00ac\u00db\u0089\u00de\u00e7\u0013\\2\u00d8M\u00a1k\u00ae\\i\u008a3T\u00e8:\u00bei>\u00ff\u00f6v\u00d7\u00f51h\u0094U}\u0095`Gy".length();
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
                    var4_17 = "c\u0012\n*\u00ac\u001dT\u00e3\u00bb\u00dc\u00a5\u0001\u009a\u0000s?";
                    var5_18 = "c\u0012\n*\u00ac\u001dT\u00e3\u00bb\u00dc\u00a5\u0001\u009a\u0000s?".length();
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
        wi_0.e = var6_15;
        wi_0.g = new Long[7];
        wi_0.J = new wi_0();
    }

    private wi_0() {
        block7: {
            this.u = new Hashtable();
            this.F = new kh_1(this);
            this.U = new byte[wi_0.a(5053, 987590011349778320L)];
            this.p = new byte[4];
            this.f = new byte[3];
            try {
                this.H = new RandomAccessFile(wi_0.a(24647, -555), "r");
            }
            catch (FileNotFoundException fileNotFoundException) {
                System.out.println(wi_0.class.getResource(wi_0.a(24645, 12505)).toString());
                System.out.println(wi_0.a(24655, 1589));
                System.out.println(wi_0.a(24642, 3584));
                this.H = null;
            }
            if (this.H != null) {
                try {
                    try {
                        this.C = this.c(0L);
                        this.B = this.c(wi_0.b(16642, 953220012220609600L));
                        if (this.C != wi_0.b(14578, 2316857388119592373L) && this.B != wi_0.b(14578, 2316857388119592373L)) break block7;
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        throw wi_0.a(fileNotFoundException);
                    }
                    this.H.close();
                    this.H = null;
                }
                catch (IOException iOException) {
                    System.out.println(wi_0.a(24651, -860));
                    this.H = null;
                }
            }
        }
    }

    public static wi_0 x() {
        return J;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List u(String string) {
        ArrayList<nf_0> arrayList = new ArrayList<nf_0>();
        long l2 = this.B + wi_0.b(16642, 953220012220609600L);
        int n10 = wi_0.d();
        long l3 = this.C + wi_0.b(16642, 953220012220609600L);
        boolean bl = true;
        do {
            long l4;
            long l5;
            block9: {
                block10: {
                    kh_1 kh_12;
                    long l6;
                    block8: {
                        int n11;
                        int n12;
                        block7: {
                            if (bl && !(bl = false) && n10 == 0) continue;
                            l5 = l6 = this.z(l3);
                            l4 = wi_0.b(14578, 2316857388119592373L);
                            if (n10 != 0) break block9;
                            if (l5 == l4) break block10;
                            kh_12 = this.h(l6);
                            try {
                                try {
                                    n12 = kh_12.I.indexOf(string);
                                    n11 = -1;
                                    if (n10 != 0) break block7;
                                    if (n12 != n11) break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw wi_0.a(illegalArgumentException);
                                }
                                n12 = kh_12.f.indexOf(string);
                                n11 = -1;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw wi_0.a(illegalArgumentException);
                            }
                        }
                        if (n12 == n11) break block10;
                    }
                    nf_0 nf_02 = new nf_0();
                    nf_02.e = kh_12.I;
                    nf_02.a = kh_12.f;
                    this.p(l3 - wi_0.b(16642, 953220012220609600L), this.p);
                    nf_02.N = kj_1.U(this.p);
                    this.p(l6, this.p);
                    nf_02.r = kj_1.U(this.p);
                    arrayList.add(nf_02);
                }
                l5 = l3;
                l4 = wi_0.b(24789, 510720196835104145L);
            }
            l3 = l5 + l4;
        } while (l3 <= l2);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public List p(String var1_1) {
        var3_2 = new ArrayList<nf_0>();
        var2_3 = wi_0.p();
        try {
            block11: {
                block12: {
                    try {
                        v0 = this;
                        if (var2_3 == 0) break block11;
                        if (v0.t != null) break block12;
                    }
                    catch (IOException v1) {
                        throw wi_0.a(v1);
                    }
                    var4_4 = this.H.getChannel();
                    this.t = var4_4.map(FileChannel.MapMode.READ_ONLY, 0L, this.H.length());
                    this.t.order(ByteOrder.LITTLE_ENDIAN);
                }
                v0 = this;
            }
            var4_5 = (int)v0.B;
            var5_7 = (int)this.C + 4;
            if (var2_3 != 0) ** GOTO lbl53
            do {
                block15: {
                    block14: {
                        block13: {
                            if ((var6_8 = this.Y(var5_7)) == -1) break block15;
                            var7_9 = this.Y(var6_8);
                            v2 = var7_9.I.indexOf(var1_1);
                            v3 = -1;
                            if (var2_3 == 0) break block13;
                            try {
                                block16: {
                                    if (v2 != v3) break block14;
                                    break block16;
                                    catch (IOException v4) {
                                        throw wi_0.a(v4);
                                    }
                                }
                                v2 = var7_9.f.indexOf(var1_1);
                                v3 = -1;
                            }
                            catch (IOException v5) {
                                throw wi_0.a(v5);
                            }
                        }
                        if (v2 == v3) break block15;
                    }
                    var8_10 = new nf_0();
                    var8_10.e = var7_9.I;
                    var8_10.a = var7_9.f;
                    this.x(var5_7 - 4, this.p);
                    var8_10.N = kj_1.U(this.p);
                    this.x(var6_8, this.p);
                    var8_10.r = kj_1.U(this.p);
                    var3_2.add(var8_10);
                }
                var5_7 += 7;
lbl53:
                // 2 sources

            } while (var5_7 <= var4_5);
        }
        catch (IOException var4_6) {
            System.out.println(var4_6.getMessage());
        }
        return var3_2;
    }

    private int Y(int n10) {
        this.t.position(n10);
        return this.t.getInt() & wi_0.a(32670, 1032755141651616696L);
    }

    private int w() {
        return this.t.getInt() & wi_0.a(4634, 6111818812132703805L);
    }

    public String z(byte[] byArray) {
        wi_0 wi_02;
        String string;
        block5: {
            block6: {
                int n10 = wi_0.d();
                try {
                    if (this.H == null) {
                        return wi_0.a(24654, 2112);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                string = kj_1.U(byArray);
                try {
                    wi_02 = this;
                    if (n10 != 0) break block5;
                    if (!wi_02.u.containsKey(string)) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                kh_1 kh_12 = (kh_1)this.u.get(string);
                return kh_12.I;
            }
            wi_02 = this;
        }
        kh_1 kh_13 = wi_02.O(byArray);
        this.u.put(string, kh_13.T());
        return kh_13.I;
    }

    public String q(String string) {
        return this.z(kj_1.S(string));
    }

    public String e(byte[] byArray) {
        wi_0 wi_02;
        String string;
        block5: {
            block6: {
                int n10 = wi_0.d();
                try {
                    if (this.H == null) {
                        return wi_0.a(24640, -29915);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                string = kj_1.U(byArray);
                try {
                    wi_02 = this;
                    if (n10 != 0) break block5;
                    if (!wi_02.u.containsKey(string)) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                kh_1 kh_12 = (kh_1)this.u.get(string);
                return kh_12.f;
            }
            wi_02 = this;
        }
        kh_1 kh_13 = wi_02.O(byArray);
        this.u.put(string, kh_13.T());
        return kh_13.f;
    }

    public String f(String string) {
        return this.e(kj_1.S(string));
    }

    private kh_1 O(byte[] byArray) {
        kh_1 kh_12;
        block3: {
            kh_1 kh_13;
            block4: {
                kh_13 = null;
                long l2 = this.M(byArray);
                int n10 = wi_0.d();
                if (l2 != wi_0.b(14578, 2316857388119592373L)) {
                    kh_13 = this.h(l2);
                }
                try {
                    kh_12 = kh_13;
                    if (n10 != 0) break block3;
                    if (kh_12 != null) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                kh_13 = new kh_1(this);
                kh_13.I = wi_0.a(24646, 20976);
                kh_13.f = wi_0.a(24649, 22437);
            }
            kh_12 = kh_13;
        }
        return kh_12;
    }

    private long c(long l2) {
        long l3 = 0L;
        try {
            this.H.seek(l2);
            l3 |= (long)(this.H.readByte() & wi_0.a(24351, 5617242215471346494L));
            l3 |= (long)(this.H.readByte() << wi_0.a(17257, 4731128747596181322L) & wi_0.a(17268, 7376524008412966747L));
            l3 |= (long)(this.H.readByte() << wi_0.a(25899, 776355949353453829L) & wi_0.a(30061, 2063336393913260359L));
            return l3 |= (long)(this.H.readByte() << wi_0.a(23515, 6655502624317143033L) & wi_0.a(22361, 4864237945379388284L));
        }
        catch (IOException iOException) {
            return wi_0.b(14578, 2316857388119592373L);
        }
    }

    private long z(long l2) {
        long l3 = 0L;
        try {
            this.H.seek(l2);
            this.H.readFully(this.f);
            l3 |= (long)(this.f[0] & wi_0.a(24351, 5617242215471346494L));
            l3 |= (long)(this.f[1] << wi_0.a(17257, 4731128747596181322L) & wi_0.a(17268, 7376524008412966747L));
            return l3 |= (long)(this.f[2] << wi_0.a(25899, 776355949353453829L) & wi_0.a(30061, 2063336393913260359L));
        }
        catch (IOException iOException) {
            return wi_0.b(14578, 2316857388119592373L);
        }
    }

    private long y() {
        long l2 = 0L;
        try {
            this.H.readFully(this.f);
            l2 |= (long)(this.f[0] & wi_0.a(4000, 1553644771816711052L));
            l2 |= (long)(this.f[1] << wi_0.a(11622, 2909534357893611855L) & wi_0.a(13245, 8156324745887588246L));
            return l2 |= (long)(this.f[2] << wi_0.a(20828, 2534770315061198196L) & wi_0.a(10277, 5960516838072222721L));
        }
        catch (IOException iOException) {
            return wi_0.b(5420, 570951278575886445L);
        }
    }

    private void p(long l2, byte[] byArray) {
        try {
            this.H.seek(l2);
            this.H.readFully(byArray);
            byte by = byArray[0];
            byArray[0] = byArray[3];
            byArray[3] = by;
            by = byArray[1];
            byArray[1] = byArray[2];
            byArray[2] = by;
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    private void x(int n10, byte[] byArray) {
        this.t.position(n10);
        this.t.get(byArray);
        byte by = byArray[0];
        byArray[0] = byArray[3];
        byArray[3] = by;
        by = byArray[1];
        byArray[1] = byArray[2];
        byArray[2] = by;
    }

    /*
     * Unable to fully structure code
     */
    private int W(byte[] var1_1, byte[] var2_2) {
        var4_3 = 0;
        var3_4 = wi_0.p();
        try {
            if (var3_4 == 0) {
                while (true) {
                    v0 = this.I(var1_1[var4_3], var2_2[var4_3]);
                    break;
                }
            }
            ** GOTO lbl20
        }
        catch (IllegalArgumentException v1) {
            throw wi_0.a(v1);
        }
        do {
            block10: {
                block9: {
                    v2 = var5_5 = v0;
                    if (var3_4 == 0) break block9;
                    if (v2 == 0) break block10;
                    v2 = var5_5;
                }
                return v2;
            }
            ++var4_3;
lbl20:
            // 2 sources

            if (var4_3 < 4) ** continue;
            v0 = 0;
        } while (var3_4 == 0);
        return v0;
    }

    private int I(byte by, byte by2) {
        int n10;
        block10: {
            block11: {
                int n11;
                int n12;
                int n13;
                block8: {
                    block9: {
                        n13 = wi_0.d();
                        try {
                            try {
                                n12 = by & wi_0.a(24351, 5617242215471346494L);
                                n11 = by2 & wi_0.a(24351, 5617242215471346494L);
                                if (n13 != 0) break block8;
                                if (n12 <= n11) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw wi_0.a(illegalArgumentException);
                            }
                            return 1;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw wi_0.a(illegalArgumentException);
                        }
                    }
                    n12 = by;
                    n11 = by2;
                }
                try {
                    try {
                        n10 = n12 ^ n11;
                        if (n13 != 0) break block10;
                        if (n10 != 0) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw wi_0.a(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
            }
            n10 = -1;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    private long M(byte[] var1_1) {
        block32: {
            block27: {
                block28: {
                    var3_2 = 0L;
                    var2_3 = wi_0.d();
                    this.p(this.C, this.p);
                    var5_4 = this.W(var1_1, this.p);
                    try {
                        try {
                            v0 = var5_4;
                            if (var2_3 != 0) break block27;
                            if (v0 != 0) break block28;
                        }
                        catch (IllegalArgumentException v1) {
                            throw wi_0.a(v1);
                        }
                        return this.C;
                    }
                    catch (IllegalArgumentException v2) {
                        throw wi_0.a(v2);
                    }
                }
                v0 = var5_4;
            }
            try {
                if (v0 < 0) {
                    return wi_0.b(14578, 2316857388119592373L);
                }
            }
            catch (IllegalArgumentException v3) {
                throw wi_0.a(v3);
            }
            var6_5 = this.C;
            var8_6 = this.B;
            if (var2_3 == 0) ** GOTO lbl78
            block20: while (true) {
                var3_2 = this.P(var6_5, var8_6);
                this.p(var3_2, this.p);
                v4 = var5_4 = this.W(var1_1, this.p);
                do {
                    block29: {
                        block31: {
                            block30: {
                                block33: {
                                    if (var2_3 != 0) break block33;
                                    if (v4 <= 0) ** GOTO lbl38
                                    var6_5 = var3_2;
                                    try {
                                        if (var2_3 == 0) break block29;
lbl38:
                                        // 2 sources

                                        v4 = var5_4;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw wi_0.a(v5);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var2_3 != 0) break block30;
                                            if (v4 < 0) {
                                            }
                                            ** GOTO lbl75
                                        }
                                        catch (IllegalArgumentException v6) {
                                            throw wi_0.a(v6);
                                        }
                                        v7 = var3_2;
                                        if (var2_3 != 0) break block31;
                                    }
                                    catch (IllegalArgumentException v8) {
                                        throw wi_0.a(v8);
                                    }
                                    cfr_temp_0 = v7 - var8_6;
                                    v4 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                }
                                catch (IllegalArgumentException v9) {
                                    throw wi_0.a(v9);
                                }
                            }
                            if (v4 != 0) ** GOTO lbl67
                            var3_2 = var8_6 -= wi_0.b(24476, 8599704451923929820L);
                            try {
                                if (var2_3 == 0) break block29;
lbl67:
                                // 2 sources

                                v7 = var3_2;
                            }
                            catch (IllegalArgumentException v10) {
                                throw wi_0.a(v10);
                            }
                        }
                        var8_6 = v7;
                        try {
                            if (var2_3 == 0) break block29;
lbl75:
                            // 2 sources

                            return this.z(var3_2 + wi_0.b(16642, 953220012220609600L));
                        }
                        catch (IllegalArgumentException v11) {
                            throw wi_0.a(v11);
                        }
                    }
                    if (var6_5 < var8_6) continue block20;
                    v12 = this.z(var3_2 + wi_0.b(16642, 953220012220609600L));
                    if (var2_3 != 0) break block32;
                    var3_2 = v12;
                    this.p(var3_2, this.p);
                    v13 = var5_4 = this.W(var1_1, this.p);
                } while (var2_3 != 0);
                break;
            }
            try {
                if (v13 <= 0) {
                    return var3_2;
                }
            }
            catch (IllegalArgumentException v14) {
                throw wi_0.a(v14);
            }
            v12 = wi_0.b(14578, 2316857388119592373L);
        }
        return v12;
    }

    private long P(long l2, long l3) {
        long l4;
        long l5;
        block2: {
            long l6;
            block3: {
                l6 = (l3 - l2) / wi_0.b(24476, 8599704451923929820L);
                l6 >>= 1;
                int n10 = wi_0.p();
                try {
                    l5 = l6;
                    l4 = 0L;
                    if (n10 == 0) break block2;
                    if (l5 != l4) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
                l6 = 1L;
            }
            l5 = l2;
            l4 = l6 * wi_0.b(24476, 8599704451923929820L);
        }
        return l5 + l4;
    }

    /*
     * Unable to fully structure code
     */
    private kh_1 h(long var1_1) {
        var3_2 = wi_0.d();
        try {
            block17: {
                block15: {
                    block16: {
                        block18: {
                            this.H.seek(var1_1 + wi_0.b(3724, 4066171338162453455L));
                            var4_3 = this.H.readByte();
                            try {
                                v0 = var4_3;
                                v1 = 1;
                                if (var3_2 != 0) break block15;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl39
                            }
                            catch (IOException v2) {
                                throw wi_0.a(v2);
                            }
                            var5_5 = this.y();
                            this.H.seek(var5_5);
                            v3 = this;
                            if (var3_2 != 0) break block18;
                            var4_3 = v3.H.readByte();
                            if (var4_3 != 2) ** GOTO lbl28
                            try {
                                block19: {
                                    this.F.I = this.K(this.y());
                                    this.H.seek(var5_5 + wi_0.b(16642, 953220012220609600L));
                                    if (var3_2 == 0) break block16;
                                    break block19;
                                    catch (IOException v4) {
                                        throw wi_0.a(v4);
                                    }
                                }
                                v3 = this;
                            }
                            catch (IOException v5) {
                                throw wi_0.a(v5);
                            }
                        }
                        v3.F.I = this.K(var5_5);
                    }
                    try {
                        this.F.f = this.Y(this.H.getFilePointer());
                        if (var3_2 == 0) break block17;
lbl39:
                        // 2 sources

                        v0 = var4_3;
                        v1 = 2;
                    }
                    catch (IOException v6) {
                        throw wi_0.a(v6);
                    }
                }
                if (v0 != v1) ** GOTO lbl54
                try {
                    block20: {
                        this.F.I = this.K(this.y());
                        this.F.f = this.Y(var1_1 + wi_0.b(29505, 905274133213103620L));
                        if (var3_2 == 0) break block17;
                        break block20;
                        catch (IOException v7) {
                            throw wi_0.a(v7);
                        }
                    }
                    this.F.I = this.K(this.H.getFilePointer() - 1L);
                    this.F.f = this.Y(this.H.getFilePointer());
                }
                catch (IOException v8) {
                    throw wi_0.a(v8);
                }
            }
            return this.F;
        }
        catch (IOException var4_4) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private kh_1 Y(int var1_1) {
        block17: {
            block14: {
                block16: {
                    v0 = wi_0.p();
                    this.t.position(var1_1 + 4);
                    var3_2 = this.t.get();
                    var2_3 = v0;
                    try {
                        v1 = var3_2;
                        v2 = 1;
                        if (var2_3 == 0) break block14;
                        if (v1 == v2) {
                        }
                        ** GOTO lbl41
                    }
                    catch (IllegalArgumentException v3) {
                        throw wi_0.a(v3);
                    }
                    var4_4 = this.w();
                    this.t.position(var4_4);
                    v4 = this;
                    if (var2_3 != 0) {
                        var3_2 = v4.t.get();
                        try {
                            block15: {
                                try {
                                    if (var3_2 != 2) break block15;
                                    this.F.I = this.i(this.w());
                                    this.t.position(var4_4 + 4);
                                    if (var2_3 != 0) break block16;
                                }
                                catch (IllegalArgumentException v5) {
                                    throw wi_0.a(v5);
                                }
                            }
                            v4 = this;
                        }
                        catch (IllegalArgumentException v6) {
                            throw wi_0.a(v6);
                        }
                    }
                    v4.F.I = this.i(var4_4);
                }
                try {
                    this.F.f = this.X(this.t.position());
                    if (var2_3 != 0) break block17;
lbl41:
                    // 2 sources

                    v1 = var3_2;
                    v2 = 2;
                }
                catch (IllegalArgumentException v7) {
                    throw wi_0.a(v7);
                }
            }
            try {
                block18: {
                    try {
                        if (v1 != v2) break block18;
                        this.F.I = this.i(this.w());
                        this.F.f = this.X(var1_1 + wi_0.a(17257, 4731128747596181322L));
                        if (var2_3 != 0) break block17;
                    }
                    catch (IllegalArgumentException v8) {
                        throw wi_0.a(v8);
                    }
                }
                this.F.I = this.i(this.t.position() - 1);
                this.F.f = this.X(this.t.position());
            }
            catch (IllegalArgumentException v9) {
                throw wi_0.a(v9);
            }
        }
        return this.F;
    }

    private String Y(long l2) throws IOException {
        block10: {
            block9: {
                int n10;
                int n11;
                block8: {
                    int n12 = wi_0.p();
                    this.H.seek(l2);
                    int n13 = n12;
                    int n14 = this.H.readByte();
                    try {
                        try {
                            n11 = n14;
                            n10 = 1;
                            if (n13 == 0) break block8;
                            if (n11 == n10) break block9;
                        }
                        catch (IOException iOException) {
                            throw wi_0.a(iOException);
                        }
                        n11 = n14;
                        n10 = 2;
                    }
                    catch (IOException iOException) {
                        throw wi_0.a(iOException);
                    }
                }
                if (n11 != n10) break block10;
            }
            long l3 = this.z(l2 + 1L);
            try {
                if (l3 == 0L) {
                    return wi_0.a(24643, -24002);
                }
            }
            catch (IOException iOException) {
                throw wi_0.a(iOException);
            }
            return this.K(l3);
        }
        return this.K(l2);
    }

    private String X(int n10) {
        block13: {
            int n11;
            block11: {
                this.t.position(n10);
                int n12 = this.t.get();
                int n13 = wi_0.p();
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    n11 = n12;
                                    if (n13 == 0) break block11;
                                    if (n11 == 1) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw wi_0.a(illegalArgumentException);
                                }
                                n11 = n12;
                                if (n13 == 0) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw wi_0.a(illegalArgumentException);
                            }
                            if (n11 != 2) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw wi_0.a(illegalArgumentException);
                        }
                    }
                    n11 = this.w();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw wi_0.a(illegalArgumentException);
                }
            }
            int n14 = n11;
            try {
                if (n14 == 0) {
                    return wi_0.a(24643, -24002);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw wi_0.a(illegalArgumentException);
            }
            return this.i(n14);
        }
        return this.i(n10);
    }

    /*
     * Unable to fully structure code
     */
    private String K(long var1_1) {
        var3_2 = wi_0.d();
        try {
            this.H.seek(var1_1);
            var4_3 = 0;
            try {
                this.U[var4_3] = this.H.readByte();
                if (var3_2 != 0) {
                    while (true) {
                        this.U[++var4_3] = this.H.readByte();
                        continue;
                        break;
                    }
                }
            }
            catch (IOException v0) {
                throw wi_0.a(v0);
            }
            if (this.U[var4_3] != 0) ** continue;
            if (var4_3 != 0) {
                return kj_1.Q(this.U, 0, var4_3, wi_0.a(24650, 29356));
            }
        }
        catch (IOException var4_4) {
            System.out.println(var4_4.getMessage());
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    private String i(int var1_1) {
        var2_2 = wi_0.p();
        try {
            this.t.position(var1_1);
            var3_3 = 0;
            try {
                this.U[var3_3] = this.t.get();
                if (var2_2 == 0) {
                    while (true) {
                        this.U[++var3_3] = this.t.get();
                        continue;
                        break;
                    }
                }
            }
            catch (IllegalArgumentException v0) {
                throw wi_0.a(v0);
            }
            if (this.U[var3_3] != 0) ** continue;
            if (var3_3 != 0) {
                return kj_1.Q(this.U, 0, var3_3, wi_0.a(24644, -20238));
            }
        }
        catch (IllegalArgumentException var3_4) {
            System.out.println(var3_4.getMessage());
        }
        return "";
    }

    public String N(String string) {
        String string2;
        String string3;
        String string4;
        int n10;
        block16: {
            String string5;
            wi_0 wi_02;
            block14: {
                block15: {
                    String string6;
                    block13: {
                        String string7;
                        wi_0 wi_03;
                        block11: {
                            block12: {
                                n10 = wi_0.d();
                                try {
                                    try {
                                        wi_03 = this;
                                        string7 = string;
                                        if (n10 != 0) break block11;
                                        if (!wi_03.q(string7).equals(wi_0.a(24648, 5170))) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw wi_0.a(illegalArgumentException);
                                    }
                                    string6 = "";
                                    break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw wi_0.a(illegalArgumentException);
                                }
                            }
                            wi_03 = this;
                            string7 = string;
                        }
                        string6 = wi_03.q(string7);
                    }
                    string4 = string6;
                    try {
                        try {
                            wi_02 = this;
                            string5 = string;
                            if (n10 != 0) break block14;
                            if (!wi_02.f(string5).equals(wi_0.a(24641, 23057))) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw wi_0.a(illegalArgumentException);
                        }
                        string3 = "";
                        break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw wi_0.a(illegalArgumentException);
                    }
                }
                wi_02 = this;
                string5 = string;
            }
            string3 = wi_02.f(string5);
        }
        String string8 = string3;
        String string9 = String.valueOf(string4) + " " + string8;
        try {
            string2 = string9.trim();
            if (ky_2.F() != null) {
                wi_0.F(++n10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw wi_0.a(illegalArgumentException);
        }
        return string2;
    }

    public static void F(int n10) {
        y = n10;
    }

    public static int p() {
        return y;
    }

    public static int d() {
        int n10 = wi_0.p();
        try {
            if (n10 == 0) {
                return 118;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw wi_0.a(illegalArgumentException);
        }
        return 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6042) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 201;
                    break;
                }
                case 1: {
                    n14 = 58;
                    break;
                }
                case 2: {
                    n14 = 127;
                    break;
                }
                case 3: {
                    n14 = 136;
                    break;
                }
                case 4: {
                    n14 = 152;
                    break;
                }
                case 5: {
                    n14 = 233;
                    break;
                }
                case 6: {
                    n14 = 206;
                    break;
                }
                case 7: {
                    n14 = 31;
                    break;
                }
                case 8: {
                    n14 = 44;
                    break;
                }
                case 9: {
                    n14 = 177;
                    break;
                }
                case 10: {
                    n14 = 30;
                    break;
                }
                case 11: {
                    n14 = 216;
                    break;
                }
                case 12: {
                    n14 = 163;
                    break;
                }
                case 13: {
                    n14 = 183;
                    break;
                }
                case 14: {
                    n14 = 60;
                    break;
                }
                case 15: {
                    n14 = 87;
                    break;
                }
                case 16: {
                    n14 = 47;
                    break;
                }
                case 17: {
                    n14 = 135;
                    break;
                }
                case 18: {
                    n14 = 0;
                    break;
                }
                case 19: {
                    n14 = 113;
                    break;
                }
                case 20: {
                    n14 = 112;
                    break;
                }
                case 21: {
                    n14 = 236;
                    break;
                }
                case 22: {
                    n14 = 105;
                    break;
                }
                case 23: {
                    n14 = 4;
                    break;
                }
                case 24: {
                    n14 = 61;
                    break;
                }
                case 25: {
                    n14 = 52;
                    break;
                }
                case 26: {
                    n14 = 195;
                    break;
                }
                case 27: {
                    n14 = 25;
                    break;
                }
                case 28: {
                    n14 = 193;
                    break;
                }
                case 29: {
                    n14 = 254;
                    break;
                }
                case 30: {
                    n14 = 227;
                    break;
                }
                case 31: {
                    n14 = 36;
                    break;
                }
                case 32: {
                    n14 = 156;
                    break;
                }
                case 33: {
                    n14 = 161;
                    break;
                }
                case 34: {
                    n14 = 138;
                    break;
                }
                case 35: {
                    n14 = 181;
                    break;
                }
                case 36: {
                    n14 = 196;
                    break;
                }
                case 37: {
                    n14 = 48;
                    break;
                }
                case 38: {
                    n14 = 198;
                    break;
                }
                case 39: {
                    n14 = 231;
                    break;
                }
                case 40: {
                    n14 = 164;
                    break;
                }
                case 41: {
                    n14 = 91;
                    break;
                }
                case 42: {
                    n14 = 120;
                    break;
                }
                case 43: {
                    n14 = 228;
                    break;
                }
                case 44: {
                    n14 = 63;
                    break;
                }
                case 45: {
                    n14 = 11;
                    break;
                }
                case 46: {
                    n14 = 222;
                    break;
                }
                case 47: {
                    n14 = 168;
                    break;
                }
                case 48: {
                    n14 = 62;
                    break;
                }
                case 49: {
                    n14 = 232;
                    break;
                }
                case 50: {
                    n14 = 16;
                    break;
                }
                case 51: {
                    n14 = 54;
                    break;
                }
                case 52: {
                    n14 = 238;
                    break;
                }
                case 53: {
                    n14 = 215;
                    break;
                }
                case 54: {
                    n14 = 176;
                    break;
                }
                case 55: {
                    n14 = 79;
                    break;
                }
                case 56: {
                    n14 = 194;
                    break;
                }
                case 57: {
                    n14 = 197;
                    break;
                }
                case 58: {
                    n14 = 33;
                    break;
                }
                case 59: {
                    n14 = 139;
                    break;
                }
                case 60: {
                    n14 = 240;
                    break;
                }
                case 61: {
                    n14 = 234;
                    break;
                }
                case 62: {
                    n14 = 205;
                    break;
                }
                case 63: {
                    n14 = 106;
                    break;
                }
                case 64: {
                    n14 = 244;
                    break;
                }
                case 65: {
                    n14 = 13;
                    break;
                }
                case 66: {
                    n14 = 235;
                    break;
                }
                case 67: {
                    n14 = 133;
                    break;
                }
                case 68: {
                    n14 = 115;
                    break;
                }
                case 69: {
                    n14 = 64;
                    break;
                }
                case 70: {
                    n14 = 187;
                    break;
                }
                case 71: {
                    n14 = 100;
                    break;
                }
                case 72: {
                    n14 = 46;
                    break;
                }
                case 73: {
                    n14 = 95;
                    break;
                }
                case 74: {
                    n14 = 28;
                    break;
                }
                case 75: {
                    n14 = 73;
                    break;
                }
                case 76: {
                    n14 = 65;
                    break;
                }
                case 77: {
                    n14 = 42;
                    break;
                }
                case 78: {
                    n14 = 53;
                    break;
                }
                case 79: {
                    n14 = 214;
                    break;
                }
                case 80: {
                    n14 = 229;
                    break;
                }
                case 81: {
                    n14 = 81;
                    break;
                }
                case 82: {
                    n14 = 154;
                    break;
                }
                case 83: {
                    n14 = 251;
                    break;
                }
                case 84: {
                    n14 = 149;
                    break;
                }
                case 85: {
                    n14 = 159;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 248;
                    break;
                }
                case 88: {
                    n14 = 223;
                    break;
                }
                case 89: {
                    n14 = 142;
                    break;
                }
                case 90: {
                    n14 = 200;
                    break;
                }
                case 91: {
                    n14 = 151;
                    break;
                }
                case 92: {
                    n14 = 128;
                    break;
                }
                case 93: {
                    n14 = 217;
                    break;
                }
                case 94: {
                    n14 = 9;
                    break;
                }
                case 95: {
                    n14 = 75;
                    break;
                }
                case 96: {
                    n14 = 82;
                    break;
                }
                case 97: {
                    n14 = 204;
                    break;
                }
                case 98: {
                    n14 = 50;
                    break;
                }
                case 99: {
                    n14 = 255;
                    break;
                }
                case 100: {
                    n14 = 146;
                    break;
                }
                case 101: {
                    n14 = 78;
                    break;
                }
                case 102: {
                    n14 = 126;
                    break;
                }
                case 103: {
                    n14 = 39;
                    break;
                }
                case 104: {
                    n14 = 141;
                    break;
                }
                case 105: {
                    n14 = 157;
                    break;
                }
                case 106: {
                    n14 = 55;
                    break;
                }
                case 107: {
                    n14 = 245;
                    break;
                }
                case 108: {
                    n14 = 51;
                    break;
                }
                case 109: {
                    n14 = 96;
                    break;
                }
                case 110: {
                    n14 = 69;
                    break;
                }
                case 111: {
                    n14 = 150;
                    break;
                }
                case 112: {
                    n14 = 130;
                    break;
                }
                case 113: {
                    n14 = 143;
                    break;
                }
                case 114: {
                    n14 = 17;
                    break;
                }
                case 115: {
                    n14 = 140;
                    break;
                }
                case 116: {
                    n14 = 210;
                    break;
                }
                case 117: {
                    n14 = 70;
                    break;
                }
                case 118: {
                    n14 = 160;
                    break;
                }
                case 119: {
                    n14 = 225;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 41;
                    break;
                }
                case 122: {
                    n14 = 103;
                    break;
                }
                case 123: {
                    n14 = 182;
                    break;
                }
                case 124: {
                    n14 = 68;
                    break;
                }
                case 125: {
                    n14 = 209;
                    break;
                }
                case 126: {
                    n14 = 67;
                    break;
                }
                case 127: {
                    n14 = 148;
                    break;
                }
                case 128: {
                    n14 = 186;
                    break;
                }
                case 129: {
                    n14 = 213;
                    break;
                }
                case 130: {
                    n14 = 102;
                    break;
                }
                case 131: {
                    n14 = 83;
                    break;
                }
                case 132: {
                    n14 = 179;
                    break;
                }
                case 133: {
                    n14 = 92;
                    break;
                }
                case 134: {
                    n14 = 19;
                    break;
                }
                case 135: {
                    n14 = 167;
                    break;
                }
                case 136: {
                    n14 = 212;
                    break;
                }
                case 137: {
                    n14 = 239;
                    break;
                }
                case 138: {
                    n14 = 137;
                    break;
                }
                case 139: {
                    n14 = 116;
                    break;
                }
                case 140: {
                    n14 = 93;
                    break;
                }
                case 141: {
                    n14 = 10;
                    break;
                }
                case 142: {
                    n14 = 169;
                    break;
                }
                case 143: {
                    n14 = 119;
                    break;
                }
                case 144: {
                    n14 = 191;
                    break;
                }
                case 145: {
                    n14 = 172;
                    break;
                }
                case 146: {
                    n14 = 14;
                    break;
                }
                case 147: {
                    n14 = 188;
                    break;
                }
                case 148: {
                    n14 = 109;
                    break;
                }
                case 149: {
                    n14 = 132;
                    break;
                }
                case 150: {
                    n14 = 8;
                    break;
                }
                case 151: {
                    n14 = 24;
                    break;
                }
                case 152: {
                    n14 = 32;
                    break;
                }
                case 153: {
                    n14 = 153;
                    break;
                }
                case 154: {
                    n14 = 71;
                    break;
                }
                case 155: {
                    n14 = 221;
                    break;
                }
                case 156: {
                    n14 = 226;
                    break;
                }
                case 157: {
                    n14 = 34;
                    break;
                }
                case 158: {
                    n14 = 207;
                    break;
                }
                case 159: {
                    n14 = 242;
                    break;
                }
                case 160: {
                    n14 = 21;
                    break;
                }
                case 161: {
                    n14 = 66;
                    break;
                }
                case 162: {
                    n14 = 104;
                    break;
                }
                case 163: {
                    n14 = 107;
                    break;
                }
                case 164: {
                    n14 = 90;
                    break;
                }
                case 165: {
                    n14 = 89;
                    break;
                }
                case 166: {
                    n14 = 99;
                    break;
                }
                case 167: {
                    n14 = 117;
                    break;
                }
                case 168: {
                    n14 = 158;
                    break;
                }
                case 169: {
                    n14 = 180;
                    break;
                }
                case 170: {
                    n14 = 18;
                    break;
                }
                case 171: {
                    n14 = 252;
                    break;
                }
                case 172: {
                    n14 = 208;
                    break;
                }
                case 173: {
                    n14 = 12;
                    break;
                }
                case 174: {
                    n14 = 124;
                    break;
                }
                case 175: {
                    n14 = 7;
                    break;
                }
                case 176: {
                    n14 = 43;
                    break;
                }
                case 177: {
                    n14 = 15;
                    break;
                }
                case 178: {
                    n14 = 72;
                    break;
                }
                case 179: {
                    n14 = 6;
                    break;
                }
                case 180: {
                    n14 = 123;
                    break;
                }
                case 181: {
                    n14 = 237;
                    break;
                }
                case 182: {
                    n14 = 166;
                    break;
                }
                case 183: {
                    n14 = 230;
                    break;
                }
                case 184: {
                    n14 = 98;
                    break;
                }
                case 185: {
                    n14 = 199;
                    break;
                }
                case 186: {
                    n14 = 192;
                    break;
                }
                case 187: {
                    n14 = 220;
                    break;
                }
                case 188: {
                    n14 = 125;
                    break;
                }
                case 189: {
                    n14 = 224;
                    break;
                }
                case 190: {
                    n14 = 122;
                    break;
                }
                case 191: {
                    n14 = 178;
                    break;
                }
                case 192: {
                    n14 = 35;
                    break;
                }
                case 193: {
                    n14 = 134;
                    break;
                }
                case 194: {
                    n14 = 121;
                    break;
                }
                case 195: {
                    n14 = 249;
                    break;
                }
                case 196: {
                    n14 = 2;
                    break;
                }
                case 197: {
                    n14 = 202;
                    break;
                }
                case 198: {
                    n14 = 155;
                    break;
                }
                case 199: {
                    n14 = 94;
                    break;
                }
                case 200: {
                    n14 = 203;
                    break;
                }
                case 201: {
                    n14 = 101;
                    break;
                }
                case 202: {
                    n14 = 84;
                    break;
                }
                case 203: {
                    n14 = 22;
                    break;
                }
                case 204: {
                    n14 = 86;
                    break;
                }
                case 205: {
                    n14 = 23;
                    break;
                }
                case 206: {
                    n14 = 37;
                    break;
                }
                case 207: {
                    n14 = 45;
                    break;
                }
                case 208: {
                    n14 = 165;
                    break;
                }
                case 209: {
                    n14 = 85;
                    break;
                }
                case 210: {
                    n14 = 118;
                    break;
                }
                case 211: {
                    n14 = 190;
                    break;
                }
                case 212: {
                    n14 = 114;
                    break;
                }
                case 213: {
                    n14 = 26;
                    break;
                }
                case 214: {
                    n14 = 40;
                    break;
                }
                case 215: {
                    n14 = 144;
                    break;
                }
                case 216: {
                    n14 = 59;
                    break;
                }
                case 217: {
                    n14 = 1;
                    break;
                }
                case 218: {
                    n14 = 49;
                    break;
                }
                case 219: {
                    n14 = 131;
                    break;
                }
                case 220: {
                    n14 = 77;
                    break;
                }
                case 221: {
                    n14 = 108;
                    break;
                }
                case 222: {
                    n14 = 111;
                    break;
                }
                case 223: {
                    n14 = 246;
                    break;
                }
                case 224: {
                    n14 = 218;
                    break;
                }
                case 225: {
                    n14 = 29;
                    break;
                }
                case 226: {
                    n14 = 20;
                    break;
                }
                case 227: {
                    n14 = 110;
                    break;
                }
                case 228: {
                    n14 = 147;
                    break;
                }
                case 229: {
                    n14 = 129;
                    break;
                }
                case 230: {
                    n14 = 247;
                    break;
                }
                case 231: {
                    n14 = 184;
                    break;
                }
                case 232: {
                    n14 = 219;
                    break;
                }
                case 233: {
                    n14 = 27;
                    break;
                }
                case 234: {
                    n14 = 80;
                    break;
                }
                case 235: {
                    n14 = 3;
                    break;
                }
                case 236: {
                    n14 = 97;
                    break;
                }
                case 237: {
                    n14 = 189;
                    break;
                }
                case 238: {
                    n14 = 241;
                    break;
                }
                case 239: {
                    n14 = 211;
                    break;
                }
                case 240: {
                    n14 = 88;
                    break;
                }
                case 241: {
                    n14 = 170;
                    break;
                }
                case 242: {
                    n14 = 74;
                    break;
                }
                case 243: {
                    n14 = 174;
                    break;
                }
                case 244: {
                    n14 = 38;
                    break;
                }
                case 245: {
                    n14 = 185;
                    break;
                }
                case 246: {
                    n14 = 76;
                    break;
                }
                case 247: {
                    n14 = 162;
                    break;
                }
                case 248: {
                    n14 = 175;
                    break;
                }
                case 249: {
                    n14 = 173;
                    break;
                }
                case 250: {
                    n14 = 171;
                    break;
                }
                case 251: {
                    n14 = 253;
                    break;
                }
                case 252: {
                    n14 = 56;
                    break;
                }
                case 253: {
                    n14 = 57;
                    break;
                }
                case 254: {
                    n14 = 243;
                    break;
                }
                default: {
                    n14 = 145;
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
            wi_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2C2F;
        if (d[n11] == null) {
            wi_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3541) & Short.MAX_VALUE;
        if (g[n11] == null) {
            wi_0.g[n11] = e[n11] ^ l2;
        }
        return g[n11];
    }
}

