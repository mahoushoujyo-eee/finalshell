/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.YU;
import com.cs_2;
import com.dm_2;
import com.i8_0;
import com.pc_0;
import com.uJ;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;

/*
 * Renamed from com.de
 */
class de_2
extends dm_2 {
    private static String T;
    private static int R;
    private boolean g = true;
    static byte[] a;
    private static byte[] N;
    private static Hashtable i;
    private static Hashtable q;
    private static byte[] D;
    private Socket s = null;
    private byte[] v = new byte[0];
    private static final String[] f;
    private static final String[] h;
    private static final long[] l;
    private static final Integer[] n;

    static int Z(byte by) {
        byte by2;
        block3: {
            boolean bl = dm_2.F();
            for (int i2 = 0; i2 < D.length; ++i2) {
                by2 = D[i2];
                if (bl) {
                    int n10;
                    if (bl) {
                        if (by2 != by) continue;
                        n10 = i2;
                    }
                    return n10;
                }
                break block3;
            }
            by2 = 0;
        }
        return by2;
    }

    static void n(String string) {
        N = E8.J(string);
        a = new byte[de_2.b(15479, 3892102147387622338L)];
        boolean bl = dm_2.J();
        for (int i2 = 0; i2 < de_2.b(5018, 3043138607408491561L); ++i2) {
            de_2.a[i2] = (byte)(de_2.Z(N[i2 * 2]) << 4 & de_2.b(26101, 2242645871466076790L) | de_2.Z(N[i2 * 2 + 1]) & de_2.b(23365, 5238429322795902175L));
            if (!bl) continue;
        }
    }

    static void N(String string) {
        T = string;
    }

    static void o(int n10) {
        R = n10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static byte[] N(DI dI) {
        Hashtable hashtable = q;
        synchronized (hashtable) {
            Object object;
            boolean bl = dm_2.F();
            byte[] byArray = object = (byte[])q.get(dI);
            if (bl) {
                if (byArray == null) {
                    Object object2;
                    block10: {
                        i8_0 i8_02 = DI.p;
                        object = new byte[de_2.b(5018, 3043138607408491561L)];
                        object2 = i8_02;
                        synchronized (object2) {
                            i8_02.Y((byte[])object, 0, de_2.b(5018, 3043138607408491561L));
                        }
                        i.put(dI, object);
                        object2 = new byte[de_2.b(2400, 7589435299227449079L)];
                        for (int i2 = 0; i2 < de_2.b(5018, 3043138607408491561L); ++i2) {
                            object2[2 * i2] = D[object[i2] >>> 4 & de_2.b(17237, 2906693066227252457L)];
                            object2[2 * i2 + 1] = D[object[i2] & de_2.b(17237, 2906693066227252457L)];
                            if (bl) {
                                if (bl) continue;
                            }
                            break block10;
                        }
                        q.put(dI, object2);
                    }
                    object = object2;
                }
                byArray = object;
            }
            return byArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void k(DI dI) {
        Hashtable hashtable = q;
        synchronized (hashtable) {
            q.remove(dI);
            i.remove(dI);
        }
    }

    de_2() {
        this.M(de_2.b(9065, 1550131024430537963L));
        this.Q(de_2.b(4349, 5341490096153210712L));
        this.f(de_2.b(1200, 8703884275044891402L));
        this.Y = E8.J(de_2.b(22203, 29240));
        this.X = true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    void S() {
        block25: {
            block27: {
                var1_1 = dm_2.J();
                try {
                    this.s = E8.k(de_2.T, de_2.R, de_2.b(32525, 7568760149801975945L));
                    this.s.setTcpNoDelay(true);
                    this.o = new cs_2();
                    this.o.U(this.s.getInputStream());
                    this.o.H(this.s.getOutputStream());
                    this.l();
                }
                catch (Exception var2_2) {
                    this.d(1);
                    this.S = true;
                    this.r();
                    return;
                }
                this.Z = Thread.currentThread();
                var2_3 = new uJ(this.c);
                var3_4 = new YU(var2_3);
                var4_5 = 0;
                try {
                    var5_6 = this.T();
                    while (this.Z != null) {
                        block29: {
                            block33: {
                                block28: {
                                    block26: {
                                        block30: {
                                            v0 = this;
                                            if (var1_1) break block25;
                                            v1 = v0.o;
                                            if (var1_1) break block26;
                                            break block30;
                                            catch (Exception v2) {
                                                throw de_2.b(v2);
                                            }
                                        }
                                        try {
                                            block31: {
                                                if (v1 == null) break block27;
                                                break block31;
                                                catch (Exception v3) {
                                                    throw de_2.b(v3);
                                                }
                                            }
                                            v1 = this.o;
                                        }
                                        catch (Exception v4) {
                                            throw de_2.b(v4);
                                        }
                                    }
                                    v5 = v1.I;
                                    if (var1_1) break block28;
                                    try {
                                        block32: {
                                            if (v5 == null) break block27;
                                            break block32;
                                            catch (Exception v6) {
                                                throw de_2.b(v6);
                                            }
                                        }
                                        v5 = this.o.I;
                                    }
                                    catch (Exception v7) {
                                        throw de_2.b(v7);
                                    }
                                }
                                var4_5 = v5.read(var2_3.g, de_2.b(31490, 1780719780754343050L), var2_3.g.length - de_2.b(31490, 1780719780754343050L) - var5_6.D());
                                v8 = var4_5;
                                if (var1_1) break block29;
                                if (v8 > 0) ** GOTO lbl73
                                break block33;
                                catch (Exception v9) {
                                    throw de_2.b(v9);
                                }
                            }
                            try {
                                block34: {
                                    this.F();
                                    if (!var1_1) break block27;
                                    break block34;
                                    catch (Exception v10) {
                                        throw de_2.b(v10);
                                    }
                                }
                                v8 = (int)this.S;
                            }
                            catch (Exception v11) {
                                throw de_2.b(v11);
                            }
                        }
                        if (v8 == 0) ** GOTO lbl86
                        try {
                            block35: {
                                if (!var1_1) break block27;
                                break block35;
                                catch (Exception v12) {
                                    throw de_2.b(v12);
                                }
                            }
                            var3_4.M();
                            var2_3.V((byte)de_2.b(7502, 5902723997094650576L));
                            var2_3.u(this.V);
                            var2_3.u(var4_5);
                            var2_3.S(var4_5);
                            var5_6.O(var3_4, this, var4_5);
                            if (!var1_1) continue;
                            break;
                        }
                        catch (Exception v13) {
                            throw de_2.b(v13);
                        }
                    }
                }
                catch (Exception var5_7) {
                    // empty catch block
                }
            }
            v0 = this;
        }
        v0.r();
    }

    private byte[] n(byte[] byArray, int n10, int n11) {
        byte[] byArray2 = new byte[this.v.length + n11];
        boolean bl = dm_2.F();
        System.arraycopy(byArray, n10, byArray2, this.v.length, n11);
        boolean bl2 = bl;
        byte[] byArray3 = this.v;
        if (bl2) {
            if (byArray3.length > 0) {
                System.arraycopy(this.v, 0, byArray2, 0, this.v.length);
            }
            byArray3 = this.v = byArray2;
        }
        return byArray3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    void Y(byte[] var1_1, int var2_2, int var3_3) throws IOException {
        block26: {
            block27: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block32: {
                                        block30: {
                                            block31: {
                                                block28: {
                                                    block29: {
                                                        var4_4 = dm_2.F();
                                                        try {
                                                            v0 = this;
                                                            if (!var4_4) break block26;
                                                            if (!v0.g) break block27;
                                                        }
                                                        catch (pc_0 v1) {
                                                            throw de_2.b(v1);
                                                        }
                                                        var5_5 = null;
                                                        try {
                                                            var5_5 = this.T();
                                                        }
                                                        catch (pc_0 var6_6) {
                                                            throw new IOException(var6_6.toString(), var6_6);
                                                        }
                                                        var1_1 = this.n(var1_1, var2_2, var3_3);
                                                        var2_2 = 0;
                                                        var3_3 = var1_1.length;
                                                        try {
                                                            v2 = var3_3;
                                                            v3 = de_2.b(1905, 215624192667662533L);
                                                            if (!var4_4) break block28;
                                                            if (v2 >= v3) break block29;
                                                        }
                                                        catch (pc_0 v4) {
                                                            throw de_2.b(v4);
                                                        }
                                                        return;
                                                    }
                                                    v2 = (var1_1[var2_2 + de_2.b(8061, 4668245192539054322L)] & de_2.b(8622, 7870557331696393771L)) * de_2.b(26215, 6777984795340331510L);
                                                    v3 = var1_1[var2_2 + de_2.b(19634, 15136764019503875L)] & de_2.b(32668, 5349928785747918875L);
                                                }
                                                var6_7 = v2 + v3;
                                                var7_8 = (var1_1[var2_2 + de_2.b(26918, 8935925369140631211L)] & de_2.b(32668, 5349928785747918875L)) * de_2.b(21037, 4443307185599278483L) + (var1_1[var2_2 + de_2.b(1905, 215624192667662533L)] & de_2.b(32668, 5349928785747918875L));
                                                try {
                                                    v5 = var1_1[var2_2] & de_2.b(32668, 5349928785747918875L);
                                                    v6 = de_2.b(7129, 3696925017577333836L);
                                                    if (!var4_4) break block30;
                                                    if (v5 != v6) break block31;
                                                    break block32;
                                                }
                                                catch (pc_0 v7) {
                                                    throw de_2.b(v7);
                                                }
                                            }
                                            v5 = var1_1[var2_2] & de_2.b(32668, 5349928785747918875L);
                                            v6 = de_2.b(21151, 1387367090897579303L);
                                        }
                                        try {
                                            if (!var4_4) break block33;
                                            if (v5 != v6) break block32;
                                        }
                                        catch (pc_0 v8) {
                                            throw de_2.b(v8);
                                        }
                                        var6_7 = var6_7 >>> de_2.b(26918, 8935925369140631211L) & de_2.b(32668, 5349928785747918875L) | var6_7 << de_2.b(26918, 8935925369140631211L) & de_2.b(23224, 7169757534720353578L);
                                        var7_8 = var7_8 >>> de_2.b(26918, 8935925369140631211L) & de_2.b(32668, 5349928785747918875L) | var7_8 << de_2.b(26918, 8935925369140631211L) & de_2.b(7432, 4517758544310772353L);
                                    }
                                    try {
                                        v5 = var3_3;
                                        if (!var4_4) break block34;
                                        v6 = de_2.b(1350, 4688771383502879450L) + var6_7 + (-var6_7 & 3) + var7_8;
                                    }
                                    catch (pc_0 v9) {
                                        throw de_2.b(v9);
                                    }
                                }
                                if (v5 < v6) {
                                    return;
                                }
                                v5 = var7_8;
                            }
                            var8_9 = new byte[v5];
                            System.arraycopy(var1_1, var2_2 + de_2.b(1350, 4688771383502879450L) + var6_7 + (-var6_7 & 3), var8_9, 0, var7_8);
                            var9_10 = null;
                            var10_11 = de_2.i;
                            synchronized (var10_11) {
                                var9_10 = (byte[])de_2.i.get(var5_5);
                            }
                            try {
                                try {
                                    v10 = var8_9;
                                    if (!var4_4) break block35;
                                    if (de_2.e(v10, var9_10)) {
                                    }
                                    ** GOTO lbl101
                                }
                                catch (pc_0 v11) {
                                    throw de_2.b(v11);
                                }
                                v10 = de_2.a;
                            }
                            catch (pc_0 v12) {
                                throw de_2.b(v12);
                            }
                        }
                        try {
                            if (!var4_4) break block36;
                            if (v10 == null) break block37;
                        }
                        catch (pc_0 v13) {
                            throw de_2.b(v13);
                        }
                        v10 = de_2.a;
                    }
                    try {
                        System.arraycopy(v10, 0, var1_1, var2_2 + de_2.b(1350, 4688771383502879450L) + var6_7 + (-var6_7 & 3), var7_8);
                        if (var4_4) break block37;
lbl101:
                        // 2 sources

                        this.Z = null;
                        this.F();
                        this.o.Z();
                        this.r();
                    }
                    catch (pc_0 v14) {
                        throw de_2.b(v14);
                    }
                }
                this.g = false;
                this.o.z(var1_1, var2_2, var3_3);
                this.v = null;
                return;
            }
            v0 = this;
        }
        v0.o.z(var1_1, var2_2, var3_3);
    }

    private static boolean e(byte[] byArray, byte[] byArray2) {
        byte by;
        block6: {
            int n10;
            boolean bl = dm_2.J();
            int n11 = byArray.length;
            if (!bl) {
                if (n11 != byArray2.length) {
                    return false;
                }
                n11 = n10 = 0;
            }
            while (n10 < byArray.length) {
                block8: {
                    boolean bl2;
                    block7: {
                        by = byArray[n10];
                        if (bl) break block6;
                        if (bl) break block7;
                        if (by == byArray2[n10]) break block8;
                        bl2 = false;
                    }
                    return bl2;
                }
                ++n10;
                if (!bl) continue;
            }
            by = 1;
        }
        return by != 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00fas7\t\u0017-\u00ec\u00bc\u00a95\u00a9i\u00d4";
                    var12_3 = "\u00fas7\t\u0017-\u00ec\u00bc\u00a95\u00a9i\u00d4".length();
                    var9_4 = 3;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 110;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 37;
                                    break;
                                }
                                case 1: {
                                    v11 = 47;
                                    break;
                                }
                                case 2: {
                                    v11 = 41;
                                    break;
                                }
                                case 3: {
                                    v11 = 5;
                                    break;
                                }
                                case 4: {
                                    v11 = 83;
                                    break;
                                }
                                case 5: {
                                    v11 = 100;
                                    break;
                                }
                                default: {
                                    v11 = 83;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
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
                    } while (v6 > var14_6);
                    ** while (true)
                }
                de_2.f = var13;
                de_2.h = new String[2];
                var0_7 = 8366153390349842794L;
                var6_8 = new long[51];
                var3_9 = 0;
                var4_10 = "`N\u00fe\u00fbxxO\u00bd\u00bc\u0083]YR\u0099\u00aa\u0091z\u000b\u0005I\u00a9\u00c8\u00ddde\u00bb\u0010\u00ef\u00cf\u00a3\u00d6+\u00a9\r\u00d6\u00fb\u009dwZ\u009fn\u00db\u00b0\u0087n\u0094c@_i\u00b04[y!\u009c \u00c1\u00a6\u00d5\u000e\u00a5\u00a5\u0005Lp\u00c0\u00cd\u0084\r\u0010\u009f\u00ab\u00bfj\u00a9F;[\u00e4\u00ef\u00bftzf\u0019\u001c\u00e8\u009cq\u00a5X\u00e2\u008f\u00c3\u00bc\u008a\u00e5\u0088E\u00d0N\u008d\n\u00ec\u00c5\u00cb\u00de>\u0006\u001d\u00ba\u00c4\u00bf\u001eA\u0010\u00a3\u00c7\u00ae\u00c0\u00b5\u00bc\u0013t\u0007O\u0090\u001ev\u008f\u0083x\u001f9\u008e\u00f0l\u00e74\u00ec\u001aIj\"\n\u0090\u0001\u00bc'g\u00be5\u0006\u00e6\u00b1\u009f/\u001e\u00f3\u00cca\u00f3\u00f7u\u0080#\u00ec\u0017\u00d4V(\u00e2G\u00e5\u0081\u00aa$\u00ed\u009bn\u00e1h\u0088z\u00b7\u0012A\u001dm\u00e7>\u0094\u00a1\u0083\u0099!\u008cY\u009eZ\f\u00f0_\u00d0\u00f4\u001c\u00c2\u0096@\u00d4\u00d8\u009f</\u00c9C\u00c6A\u009b\u00ba\u00cc\u00c2c\u00fc\u00e2w\u00e5\u0013\u00cc\u00fag\u00df\u00c5\u00d2\u00dc\u00ee\u008b\u00bc3@M\u00ceEv\u009a\u00a4\u00eb(\u00f6\u00d8Opd\u00bd\u00ee+Z=3/\u0007g\u00f6\u0013\u00d9\n\u00a1{%\u00f0\u00e0\u00e4\u00eaO\u00cc\u00ec\u00a8z\u00b8\u0093\u00ed\b\u0002X\u00d4\u00c1\u00a6\u00aeh\u00a3\u00fcx\u00e7US\u0094\u00d8n\u0081\u008a<\u00d1\u00e9\u00d6\u001fx\u00d0JU\nn\u0016\u00e4-\u00da;\u009b\u00ca#ql\u0002\u001e\u00f1K\u00df\u00be\u00c8eW\u00ae1\u00ae\u0095\u00f9\u00cfX\u0098o\u001e\u001b.\u00f8*\u00bd\u00beMK\u00ab\u0085\u008cW.\u008d7\u00b4\u00f1d\u0088\u001cC\u001e\u00f4\u00c4\u0013\u0082`n7\u000e\u00ae\u00f08\u00cd\u0081\u0094\u00d5\u008f\u0083\n?\u0014!\u00b4g\u008c\f\u008cH\u00a1T";
                var5_11 = "`N\u00fe\u00fbxxO\u00bd\u00bc\u0083]YR\u0099\u00aa\u0091z\u000b\u0005I\u00a9\u00c8\u00ddde\u00bb\u0010\u00ef\u00cf\u00a3\u00d6+\u00a9\r\u00d6\u00fb\u009dwZ\u009fn\u00db\u00b0\u0087n\u0094c@_i\u00b04[y!\u009c \u00c1\u00a6\u00d5\u000e\u00a5\u00a5\u0005Lp\u00c0\u00cd\u0084\r\u0010\u009f\u00ab\u00bfj\u00a9F;[\u00e4\u00ef\u00bftzf\u0019\u001c\u00e8\u009cq\u00a5X\u00e2\u008f\u00c3\u00bc\u008a\u00e5\u0088E\u00d0N\u008d\n\u00ec\u00c5\u00cb\u00de>\u0006\u001d\u00ba\u00c4\u00bf\u001eA\u0010\u00a3\u00c7\u00ae\u00c0\u00b5\u00bc\u0013t\u0007O\u0090\u001ev\u008f\u0083x\u001f9\u008e\u00f0l\u00e74\u00ec\u001aIj\"\n\u0090\u0001\u00bc'g\u00be5\u0006\u00e6\u00b1\u009f/\u001e\u00f3\u00cca\u00f3\u00f7u\u0080#\u00ec\u0017\u00d4V(\u00e2G\u00e5\u0081\u00aa$\u00ed\u009bn\u00e1h\u0088z\u00b7\u0012A\u001dm\u00e7>\u0094\u00a1\u0083\u0099!\u008cY\u009eZ\f\u00f0_\u00d0\u00f4\u001c\u00c2\u0096@\u00d4\u00d8\u009f</\u00c9C\u00c6A\u009b\u00ba\u00cc\u00c2c\u00fc\u00e2w\u00e5\u0013\u00cc\u00fag\u00df\u00c5\u00d2\u00dc\u00ee\u008b\u00bc3@M\u00ceEv\u009a\u00a4\u00eb(\u00f6\u00d8Opd\u00bd\u00ee+Z=3/\u0007g\u00f6\u0013\u00d9\n\u00a1{%\u00f0\u00e0\u00e4\u00eaO\u00cc\u00ec\u00a8z\u00b8\u0093\u00ed\b\u0002X\u00d4\u00c1\u00a6\u00aeh\u00a3\u00fcx\u00e7US\u0094\u00d8n\u0081\u008a<\u00d1\u00e9\u00d6\u001fx\u00d0JU\nn\u0016\u00e4-\u00da;\u009b\u00ca#ql\u0002\u001e\u00f1K\u00df\u00be\u00c8eW\u00ae1\u00ae\u0095\u00f9\u00cfX\u0098o\u001e\u001b.\u00f8*\u00bd\u00beMK\u00ab\u0085\u008cW.\u008d7\u00b4\u00f1d\u0088\u001cC\u001e\u00f4\u00c4\u0013\u0082`n7\u000e\u00ae\u00f08\u00cd\u0081\u0094\u00d5\u008f\u0083\n?\u0014!\u00b4g\u008c\f\u008cH\u00a1T".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "Bv\u0005\u00a6\u00d4_/r\u008f\u00f0\u00192\u00e0C\u00d62";
                    var5_11 = "Bv\u0005\u00a6\u00d4_/r\u008f\u00f0\u00192\u00e0C\u00d62".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
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
        de_2.l = var6_8;
        de_2.n = new Integer[51];
        de_2.T = de_2.b(22202, 29056);
        de_2.R = de_2.b(13609, 8070901454368017042L);
        de_2.a = null;
        de_2.N = null;
        de_2.i = new Hashtable<K, V>();
        de_2.q = new Hashtable<K, V>();
        v17 = new byte[de_2.b(5018, 3043138607408491561L)];
        v17[0] = de_2.b(27022, 7962152073362167336L);
        v17[1] = de_2.b(1204, 7547392352964819768L);
        v17[2] = de_2.b(19401, 2206496864129643602L);
        v17[3] = de_2.b(27742, 8380671225153901512L);
        v17[4] = de_2.b(2918, 1662942794567890143L);
        v17[5] = de_2.b(2391, 3280916419536762575L);
        v17[de_2.b((int)3968, (long)8187888141456191494L)] = de_2.b(8477, 269345572039433898L);
        v17[de_2.b((int)13883, (long)6975816083359828365L)] = de_2.b(23057, 639843822784701855L);
        v17[de_2.b((int)3313, (long)7957817832201302849L)] = de_2.b(11867, 7685691254249230810L);
        v17[de_2.b((int)4316, (long)8616035975968632648L)] = de_2.b(23078, 699496003293832635L);
        v17[de_2.b((int)5947, (long)661197202576091273L)] = de_2.b(6410, 5630745526664210101L);
        v17[de_2.b((int)15501, (long)8197039543027204870L)] = de_2.b(26701, 8777126574775359472L);
        v17[de_2.b((int)25587, (long)6557098287480888419L)] = de_2.b(7173, 194981015474414486L);
        v17[de_2.b((int)336, (long)2864688802895019721L)] = de_2.b(22030, 4273606956036811153L);
        v17[de_2.b((int)26519, (long)6343066119178541104L)] = de_2.b(31414, 5693739669946156348L);
        v17[de_2.b((int)17237, (long)2906693066227252457L)] = de_2.b(8626, 6894505932044541490L);
        de_2.D = v17;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x56BB) & 0xFFFF;
        if (h[n12] == null) {
            int n13;
            int n14;
            char[] cArray = f[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 188;
                    break;
                }
                case 1: {
                    n14 = 227;
                    break;
                }
                case 2: {
                    n14 = 214;
                    break;
                }
                case 3: {
                    n14 = 48;
                    break;
                }
                case 4: {
                    n14 = 199;
                    break;
                }
                case 5: {
                    n14 = 79;
                    break;
                }
                case 6: {
                    n14 = 9;
                    break;
                }
                case 7: {
                    n14 = 160;
                    break;
                }
                case 8: {
                    n14 = 118;
                    break;
                }
                case 9: {
                    n14 = 180;
                    break;
                }
                case 10: {
                    n14 = 212;
                    break;
                }
                case 11: {
                    n14 = 123;
                    break;
                }
                case 12: {
                    n14 = 136;
                    break;
                }
                case 13: {
                    n14 = 236;
                    break;
                }
                case 14: {
                    n14 = 133;
                    break;
                }
                case 15: {
                    n14 = 208;
                    break;
                }
                case 16: {
                    n14 = 168;
                    break;
                }
                case 17: {
                    n14 = 169;
                    break;
                }
                case 18: {
                    n14 = 93;
                    break;
                }
                case 19: {
                    n14 = 36;
                    break;
                }
                case 20: {
                    n14 = 54;
                    break;
                }
                case 21: {
                    n14 = 51;
                    break;
                }
                case 22: {
                    n14 = 119;
                    break;
                }
                case 23: {
                    n14 = 182;
                    break;
                }
                case 24: {
                    n14 = 39;
                    break;
                }
                case 25: {
                    n14 = 164;
                    break;
                }
                case 26: {
                    n14 = 213;
                    break;
                }
                case 27: {
                    n14 = 106;
                    break;
                }
                case 28: {
                    n14 = 63;
                    break;
                }
                case 29: {
                    n14 = 210;
                    break;
                }
                case 30: {
                    n14 = 241;
                    break;
                }
                case 31: {
                    n14 = 60;
                    break;
                }
                case 32: {
                    n14 = 157;
                    break;
                }
                case 33: {
                    n14 = 203;
                    break;
                }
                case 34: {
                    n14 = 70;
                    break;
                }
                case 35: {
                    n14 = 155;
                    break;
                }
                case 36: {
                    n14 = 146;
                    break;
                }
                case 37: {
                    n14 = 184;
                    break;
                }
                case 38: {
                    n14 = 170;
                    break;
                }
                case 39: {
                    n14 = 116;
                    break;
                }
                case 40: {
                    n14 = 96;
                    break;
                }
                case 41: {
                    n14 = 31;
                    break;
                }
                case 42: {
                    n14 = 33;
                    break;
                }
                case 43: {
                    n14 = 141;
                    break;
                }
                case 44: {
                    n14 = 174;
                    break;
                }
                case 45: {
                    n14 = 192;
                    break;
                }
                case 46: {
                    n14 = 200;
                    break;
                }
                case 47: {
                    n14 = 151;
                    break;
                }
                case 48: {
                    n14 = 254;
                    break;
                }
                case 49: {
                    n14 = 150;
                    break;
                }
                case 50: {
                    n14 = 175;
                    break;
                }
                case 51: {
                    n14 = 201;
                    break;
                }
                case 52: {
                    n14 = 91;
                    break;
                }
                case 53: {
                    n14 = 41;
                    break;
                }
                case 54: {
                    n14 = 103;
                    break;
                }
                case 55: {
                    n14 = 255;
                    break;
                }
                case 56: {
                    n14 = 73;
                    break;
                }
                case 57: {
                    n14 = 23;
                    break;
                }
                case 58: {
                    n14 = 100;
                    break;
                }
                case 59: {
                    n14 = 17;
                    break;
                }
                case 60: {
                    n14 = 181;
                    break;
                }
                case 61: {
                    n14 = 129;
                    break;
                }
                case 62: {
                    n14 = 92;
                    break;
                }
                case 63: {
                    n14 = 64;
                    break;
                }
                case 64: {
                    n14 = 18;
                    break;
                }
                case 65: {
                    n14 = 14;
                    break;
                }
                case 66: {
                    n14 = 189;
                    break;
                }
                case 67: {
                    n14 = 250;
                    break;
                }
                case 68: {
                    n14 = 197;
                    break;
                }
                case 69: {
                    n14 = 30;
                    break;
                }
                case 70: {
                    n14 = 223;
                    break;
                }
                case 71: {
                    n14 = 225;
                    break;
                }
                case 72: {
                    n14 = 68;
                    break;
                }
                case 73: {
                    n14 = 186;
                    break;
                }
                case 74: {
                    n14 = 251;
                    break;
                }
                case 75: {
                    n14 = 55;
                    break;
                }
                case 76: {
                    n14 = 216;
                    break;
                }
                case 77: {
                    n14 = 108;
                    break;
                }
                case 78: {
                    n14 = 112;
                    break;
                }
                case 79: {
                    n14 = 179;
                    break;
                }
                case 80: {
                    n14 = 215;
                    break;
                }
                case 81: {
                    n14 = 156;
                    break;
                }
                case 82: {
                    n14 = 102;
                    break;
                }
                case 83: {
                    n14 = 245;
                    break;
                }
                case 84: {
                    n14 = 98;
                    break;
                }
                case 85: {
                    n14 = 205;
                    break;
                }
                case 86: {
                    n14 = 95;
                    break;
                }
                case 87: {
                    n14 = 7;
                    break;
                }
                case 88: {
                    n14 = 29;
                    break;
                }
                case 89: {
                    n14 = 187;
                    break;
                }
                case 90: {
                    n14 = 83;
                    break;
                }
                case 91: {
                    n14 = 37;
                    break;
                }
                case 92: {
                    n14 = 19;
                    break;
                }
                case 93: {
                    n14 = 16;
                    break;
                }
                case 94: {
                    n14 = 82;
                    break;
                }
                case 95: {
                    n14 = 253;
                    break;
                }
                case 96: {
                    n14 = 77;
                    break;
                }
                case 97: {
                    n14 = 232;
                    break;
                }
                case 98: {
                    n14 = 142;
                    break;
                }
                case 99: {
                    n14 = 176;
                    break;
                }
                case 100: {
                    n14 = 109;
                    break;
                }
                case 101: {
                    n14 = 94;
                    break;
                }
                case 102: {
                    n14 = 132;
                    break;
                }
                case 103: {
                    n14 = 163;
                    break;
                }
                case 104: {
                    n14 = 218;
                    break;
                }
                case 105: {
                    n14 = 50;
                    break;
                }
                case 106: {
                    n14 = 193;
                    break;
                }
                case 107: {
                    n14 = 45;
                    break;
                }
                case 108: {
                    n14 = 125;
                    break;
                }
                case 109: {
                    n14 = 247;
                    break;
                }
                case 110: {
                    n14 = 138;
                    break;
                }
                case 111: {
                    n14 = 46;
                    break;
                }
                case 112: {
                    n14 = 154;
                    break;
                }
                case 113: {
                    n14 = 69;
                    break;
                }
                case 114: {
                    n14 = 134;
                    break;
                }
                case 115: {
                    n14 = 67;
                    break;
                }
                case 116: {
                    n14 = 43;
                    break;
                }
                case 117: {
                    n14 = 107;
                    break;
                }
                case 118: {
                    n14 = 57;
                    break;
                }
                case 119: {
                    n14 = 131;
                    break;
                }
                case 120: {
                    n14 = 152;
                    break;
                }
                case 121: {
                    n14 = 198;
                    break;
                }
                case 122: {
                    n14 = 191;
                    break;
                }
                case 123: {
                    n14 = 202;
                    break;
                }
                case 124: {
                    n14 = 166;
                    break;
                }
                case 125: {
                    n14 = 62;
                    break;
                }
                case 126: {
                    n14 = 147;
                    break;
                }
                case 127: {
                    n14 = 122;
                    break;
                }
                case 128: {
                    n14 = 56;
                    break;
                }
                case 129: {
                    n14 = 42;
                    break;
                }
                case 130: {
                    n14 = 229;
                    break;
                }
                case 131: {
                    n14 = 135;
                    break;
                }
                case 132: {
                    n14 = 144;
                    break;
                }
                case 133: {
                    n14 = 140;
                    break;
                }
                case 134: {
                    n14 = 224;
                    break;
                }
                case 135: {
                    n14 = 183;
                    break;
                }
                case 136: {
                    n14 = 49;
                    break;
                }
                case 137: {
                    n14 = 53;
                    break;
                }
                case 138: {
                    n14 = 120;
                    break;
                }
                case 139: {
                    n14 = 217;
                    break;
                }
                case 140: {
                    n14 = 99;
                    break;
                }
                case 141: {
                    n14 = 231;
                    break;
                }
                case 142: {
                    n14 = 246;
                    break;
                }
                case 143: {
                    n14 = 211;
                    break;
                }
                case 144: {
                    n14 = 89;
                    break;
                }
                case 145: {
                    n14 = 75;
                    break;
                }
                case 146: {
                    n14 = 185;
                    break;
                }
                case 147: {
                    n14 = 226;
                    break;
                }
                case 148: {
                    n14 = 85;
                    break;
                }
                case 149: {
                    n14 = 11;
                    break;
                }
                case 150: {
                    n14 = 222;
                    break;
                }
                case 151: {
                    n14 = 38;
                    break;
                }
                case 152: {
                    n14 = 228;
                    break;
                }
                case 153: {
                    n14 = 66;
                    break;
                }
                case 154: {
                    n14 = 32;
                    break;
                }
                case 155: {
                    n14 = 104;
                    break;
                }
                case 156: {
                    n14 = 167;
                    break;
                }
                case 157: {
                    n14 = 80;
                    break;
                }
                case 158: {
                    n14 = 165;
                    break;
                }
                case 159: {
                    n14 = 137;
                    break;
                }
                case 160: {
                    n14 = 240;
                    break;
                }
                case 161: {
                    n14 = 47;
                    break;
                }
                case 162: {
                    n14 = 230;
                    break;
                }
                case 163: {
                    n14 = 5;
                    break;
                }
                case 164: {
                    n14 = 162;
                    break;
                }
                case 165: {
                    n14 = 114;
                    break;
                }
                case 166: {
                    n14 = 219;
                    break;
                }
                case 167: {
                    n14 = 234;
                    break;
                }
                case 168: {
                    n14 = 40;
                    break;
                }
                case 169: {
                    n14 = 12;
                    break;
                }
                case 170: {
                    n14 = 4;
                    break;
                }
                case 171: {
                    n14 = 249;
                    break;
                }
                case 172: {
                    n14 = 26;
                    break;
                }
                case 173: {
                    n14 = 65;
                    break;
                }
                case 174: {
                    n14 = 248;
                    break;
                }
                case 175: {
                    n14 = 128;
                    break;
                }
                case 176: {
                    n14 = 84;
                    break;
                }
                case 177: {
                    n14 = 111;
                    break;
                }
                case 178: {
                    n14 = 239;
                    break;
                }
                case 179: {
                    n14 = 233;
                    break;
                }
                case 180: {
                    n14 = 117;
                    break;
                }
                case 181: {
                    n14 = 173;
                    break;
                }
                case 182: {
                    n14 = 88;
                    break;
                }
                case 183: {
                    n14 = 58;
                    break;
                }
                case 184: {
                    n14 = 171;
                    break;
                }
                case 185: {
                    n14 = 161;
                    break;
                }
                case 186: {
                    n14 = 115;
                    break;
                }
                case 187: {
                    n14 = 21;
                    break;
                }
                case 188: {
                    n14 = 61;
                    break;
                }
                case 189: {
                    n14 = 242;
                    break;
                }
                case 190: {
                    n14 = 3;
                    break;
                }
                case 191: {
                    n14 = 87;
                    break;
                }
                case 192: {
                    n14 = 126;
                    break;
                }
                case 193: {
                    n14 = 6;
                    break;
                }
                case 194: {
                    n14 = 52;
                    break;
                }
                case 195: {
                    n14 = 28;
                    break;
                }
                case 196: {
                    n14 = 139;
                    break;
                }
                case 197: {
                    n14 = 15;
                    break;
                }
                case 198: {
                    n14 = 44;
                    break;
                }
                case 199: {
                    n14 = 13;
                    break;
                }
                case 200: {
                    n14 = 81;
                    break;
                }
                case 201: {
                    n14 = 74;
                    break;
                }
                case 202: {
                    n14 = 145;
                    break;
                }
                case 203: {
                    n14 = 34;
                    break;
                }
                case 204: {
                    n14 = 143;
                    break;
                }
                case 205: {
                    n14 = 2;
                    break;
                }
                case 206: {
                    n14 = 220;
                    break;
                }
                case 207: {
                    n14 = 110;
                    break;
                }
                case 208: {
                    n14 = 127;
                    break;
                }
                case 209: {
                    n14 = 71;
                    break;
                }
                case 210: {
                    n14 = 0;
                    break;
                }
                case 211: {
                    n14 = 121;
                    break;
                }
                case 212: {
                    n14 = 194;
                    break;
                }
                case 213: {
                    n14 = 207;
                    break;
                }
                case 214: {
                    n14 = 101;
                    break;
                }
                case 215: {
                    n14 = 221;
                    break;
                }
                case 216: {
                    n14 = 244;
                    break;
                }
                case 217: {
                    n14 = 20;
                    break;
                }
                case 218: {
                    n14 = 124;
                    break;
                }
                case 219: {
                    n14 = 78;
                    break;
                }
                case 220: {
                    n14 = 59;
                    break;
                }
                case 221: {
                    n14 = 172;
                    break;
                }
                case 222: {
                    n14 = 204;
                    break;
                }
                case 223: {
                    n14 = 25;
                    break;
                }
                case 224: {
                    n14 = 178;
                    break;
                }
                case 225: {
                    n14 = 195;
                    break;
                }
                case 226: {
                    n14 = 235;
                    break;
                }
                case 227: {
                    n14 = 196;
                    break;
                }
                case 228: {
                    n14 = 177;
                    break;
                }
                case 229: {
                    n14 = 113;
                    break;
                }
                case 230: {
                    n14 = 72;
                    break;
                }
                case 231: {
                    n14 = 238;
                    break;
                }
                case 232: {
                    n14 = 97;
                    break;
                }
                case 233: {
                    n14 = 22;
                    break;
                }
                case 234: {
                    n14 = 10;
                    break;
                }
                case 235: {
                    n14 = 159;
                    break;
                }
                case 236: {
                    n14 = 8;
                    break;
                }
                case 237: {
                    n14 = 27;
                    break;
                }
                case 238: {
                    n14 = 90;
                    break;
                }
                case 239: {
                    n14 = 252;
                    break;
                }
                case 240: {
                    n14 = 86;
                    break;
                }
                case 241: {
                    n14 = 35;
                    break;
                }
                case 242: {
                    n14 = 243;
                    break;
                }
                case 243: {
                    n14 = 76;
                    break;
                }
                case 244: {
                    n14 = 190;
                    break;
                }
                case 245: {
                    n14 = 158;
                    break;
                }
                case 246: {
                    n14 = 1;
                    break;
                }
                case 247: {
                    n14 = 149;
                    break;
                }
                case 248: {
                    n14 = 206;
                    break;
                }
                case 249: {
                    n14 = 148;
                    break;
                }
                case 250: {
                    n14 = 209;
                    break;
                }
                case 251: {
                    n14 = 153;
                    break;
                }
                case 252: {
                    n14 = 237;
                    break;
                }
                case 253: {
                    n14 = 105;
                    break;
                }
                case 254: {
                    n14 = 24;
                    break;
                }
                default: {
                    n14 = 130;
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
            de_2.h[n12] = new String(cArray).intern();
        }
        return h[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3F97;
        if (n[n11] == null) {
            de_2.n[n11] = (int)(l[n11] ^ l2);
        }
        return n[n11];
    }
}

