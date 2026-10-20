/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kj_2;
import com.ky_2;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Renamed from com.p4
 */
public class p4_0 {
    private final int g;
    private final int x;
    private final byte[] S;
    private final int a;
    private int z;
    private int D;
    int h;
    int Z;
    int V;
    int X;
    int[] d;
    int[] J;
    int H;
    int L;
    boolean G;
    int U;
    int W;
    int m;
    int I;
    int Q;
    int[] B;
    int R;
    byte[] f;
    private static final long[] b;
    private static final Integer[] c;

    p4_0(int n10, int n11, byte[] byArray, int n12) {
        ky_2[] ky_2Array = kj_2.d();
        this.Z = p4_0.a(23188, 7711734704620450771L);
        this.X = p4_0.a(432, 2357350484718938362L);
        ky_2[] ky_2Array2 = ky_2Array;
        this.d = new int[p4_0.a(32268, 1402356889283729265L)];
        this.J = new int[p4_0.a(17148, 8387878617645132721L)];
        this.H = p4_0.a(17148, 8387878617645132721L);
        this.L = 0;
        this.G = false;
        this.I = 0;
        this.Q = 0;
        int[] nArray = new int[p4_0.a(4045, 6346920828874876574L)];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 3;
        nArray[3] = p4_0.a(17364, 7202264991543274129L);
        nArray[4] = p4_0.a(27821, 6960800015077836257L);
        nArray[5] = p4_0.a(19941, 1221823719686218905L);
        nArray[p4_0.a((int)22284, (long)1684266695584890455L)] = p4_0.a(11807, 6457157969564321628L);
        nArray[p4_0.a((int)3148, (long)7219560503460717850L)] = p4_0.a(18881, 3448547466843791517L);
        nArray[p4_0.a((int)13184, (long)7967115493810166482L)] = p4_0.a(22875, 3585342920667246611L);
        nArray[p4_0.a((int)5800, (long)424791115309252579L)] = p4_0.a(17547, 2591646184835296706L);
        nArray[p4_0.a((int)30534, (long)939170754969968132L)] = p4_0.a(17604, 3391431268792184194L);
        nArray[p4_0.a((int)5463, (long)406921236491009038L)] = p4_0.a(30440, 7762398030644322229L);
        nArray[p4_0.a((int)11947, (long)7646462328727521253L)] = p4_0.a(18261, 2852886083778031124L);
        nArray[p4_0.a((int)12806, (long)4657545342652734329L)] = p4_0.a(13871, 8294920902705799024L);
        nArray[p4_0.a((int)27780, (long)3243132885943059908L)] = p4_0.a(12545, 6461061564852394073L);
        nArray[p4_0.a((int)7023, (long)4436605272131859006L)] = p4_0.a(21686, 6342580050738986482L);
        nArray[p4_0.a((int)12236, (long)7979561018637633177L)] = p4_0.a(7927, 2728571986722387885L);
        this.B = nArray;
        this.f = new byte[p4_0.a(3529, 1676098211751879838L)];
        this.g = n10;
        this.x = n11;
        this.S = byArray;
        this.a = Math.max(2, n12);
        if (ky_2Array2 == null) {
            ky_2.K(new String[1]);
        }
    }

    void i(byte by, OutputStream outputStream) throws IOException {
        block5: {
            p4_0 p4_02;
            block4: {
                this.f[this.R++] = by;
                ky_2[] ky_2Array = kj_2.d();
                try {
                    try {
                        p4_02 = this;
                        if (ky_2Array == null) break block4;
                        if (p4_02.R < p4_0.a(14170, 6226793814904692238L)) break block5;
                    }
                    catch (IOException iOException) {
                        throw p4_0.a(iOException);
                    }
                    p4_02 = this;
                }
                catch (IOException iOException) {
                    throw p4_0.a(iOException);
                }
            }
            p4_02.H(outputStream);
        }
    }

    void t(OutputStream outputStream) throws IOException {
        this.C(this.H);
        this.L = this.W + 2;
        this.G = true;
        this.x(this.W, outputStream);
    }

    void C(int n10) {
        ky_2[] ky_2Array = kj_2.d();
        for (int i2 = 0; i2 < n10; ++i2) {
            this.d[i2] = -1;
            if (ky_2Array != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    void O(int var1_1, OutputStream var2_2) throws IOException {
        block24: {
            block23: {
                this.U = var1_1;
                this.G = false;
                this.h = this.U;
                this.V = this.t(this.h);
                var3_3 = kj_2.d();
                this.W = 1 << var1_1 - 1;
                this.m = this.W + 1;
                this.L = this.W + 2;
                this.R = 0;
                var7_4 = this.K();
                var10_5 = 0;
                for (var4_6 = this.H; var4_6 < p4_0.a(13466, 8560583206025551317L); var4_6 *= 2) {
                    ++var10_5;
                    try {
                        if (var3_3 != null) {
                            if (var3_3 != null) continue;
                            break;
                        }
                        break block23;
                    }
                    catch (IOException v0) {
                        throw p4_0.a(v0);
                    }
                }
                var10_5 = p4_0.a(14292, 713517377204412042L) - var10_5;
            }
            var9_7 = this.H;
            this.C(var9_7);
            this.x(this.W, var2_2);
            block17: while (true) lbl-1000:
            // 5 sources

            {
                v1 = this.K();
                v2 = -1;
                while (v1 != v2) {
                    block31: {
                        block32: {
                            block27: {
                                block28: {
                                    block29: {
                                        block25: {
                                            block26: {
                                                var4_6 = (var6_9 << this.Z) + var7_4;
                                                var5_8 = var6_9 << var10_5 ^ var7_4;
                                                try {
                                                    try {
                                                        v3 = this;
                                                        if (var3_3 == null) break block24;
                                                        v1 = v3.d[var5_8];
                                                        if (var3_3 == null) break block25;
                                                    }
                                                    catch (IOException v4) {
                                                        throw p4_0.a(v4);
                                                    }
                                                    if (v1 != var4_6) break block26;
                                                }
                                                catch (IOException v5) {
                                                    throw p4_0.a(v5);
                                                }
                                                var7_4 = this.J[var5_8];
                                                if (var3_3 != null) ** GOTO lbl-1000
                                            }
                                            v1 = this.d[var5_8];
                                        }
                                        try {
                                            if (var3_3 == null) break block27;
                                            if (v1 < 0) break block28;
                                        }
                                        catch (IOException v6) {
                                            throw p4_0.a(v6);
                                        }
                                        var8_10 = var9_7 - var5_8;
                                        try {
                                            v7 = var5_8;
                                            if (var3_3 != null) {
                                                if (v7 != 0) break block29;
                                            }
                                            ** GOTO lbl69
                                        }
                                        catch (IOException v8) {
                                            throw p4_0.a(v8);
                                        }
                                        var8_10 = 1;
                                    }
                                    do {
                                        block30: {
                                            v7 = var5_8 - var8_10;
lbl69:
                                            // 2 sources

                                            if (v7 < 0) {
                                                var5_8 += var9_7;
                                            }
                                            try {
                                                v9 = this.d[var5_8];
                                                if (var3_3 == null) continue;
                                                if (v9 != var4_6) break block30;
                                            }
                                            catch (IOException v10) {
                                                throw p4_0.a(v10);
                                            }
                                            var7_4 = this.J[var5_8];
                                            if (var3_3 != null) ** GOTO lbl-1000
                                        }
                                        v9 = this.d[var5_8];
                                    } while (v9 >= 0);
                                }
                                this.x(var7_4, var2_2);
                                var7_4 = var6_9;
                                try {
                                    v11 = this;
                                    if (var3_3 == null) break block31;
                                    v1 = v11.L;
                                }
                                catch (IOException v12) {
                                    throw p4_0.a(v12);
                                }
                            }
                            v2 = this.X;
                            if (var3_3 == null) continue;
                            try {
                                if (v1 >= v2) break block32;
                                ++this.L;
                                this.d[var5_8] = var4_6;
                                if (var3_3 != null) ** GOTO lbl-1000
                            }
                            catch (IOException v13) {
                                throw p4_0.a(v13);
                            }
                        }
                        v11 = this;
                    }
                    v11.t(var2_2);
                    if (var3_3 != null) continue block17;
                }
                break;
            }
            this.x(var7_4, var2_2);
            v3 = this;
        }
        v3.x(this.m, var2_2);
    }

    void e(OutputStream outputStream) throws IOException {
        outputStream.write(this.a);
        this.z = this.g * this.x;
        this.D = 0;
        this.O(this.a + 1, outputStream);
        outputStream.write(0);
    }

    void H(OutputStream outputStream) throws IOException {
        block5: {
            block4: {
                ky_2[] ky_2Array = kj_2.d();
                try {
                    p4_0 p4_02;
                    try {
                        p4_02 = this;
                        if (ky_2Array == null) break block4;
                        if (p4_02.R <= 0) break block5;
                    }
                    catch (IOException iOException) {
                        throw p4_0.a(iOException);
                    }
                    outputStream.write(this.R);
                    outputStream.write(this.f, 0, this.R);
                    p4_02 = this;
                }
                catch (IOException iOException) {
                    throw p4_0.a(iOException);
                }
            }
            p4_02.R = 0;
        }
    }

    final int t(int n10) {
        return (1 << n10) - 1;
    }

    private int K() {
        ky_2[] ky_2Array = kj_2.d();
        int n10 = this.z--;
        if (ky_2Array != null) {
            if (n10 == 0) {
                return -1;
            }
            n10 = this.S[this.D++];
        }
        int n11 = n10;
        return n11 & p4_0.a(9476, 4430856160928123988L);
    }

    /*
     * Unable to fully structure code
     */
    void x(int var1_1, OutputStream var2_2) throws IOException {
        block49: {
            block50: {
                block48: {
                    block42: {
                        block43: {
                            block46: {
                                block44: {
                                    block41: {
                                        block40: {
                                            block39: {
                                                block37: {
                                                    this.I &= this.B[this.Q];
                                                    var3_3 = kj_2.d();
                                                    try {
                                                        block38: {
                                                            try {
                                                                try {
                                                                    v0 = this;
                                                                    if (var3_3 == null) break block37;
                                                                    if (v0.Q <= 0) break block38;
                                                                }
                                                                catch (IOException v1) {
                                                                    throw p4_0.a(v1);
                                                                }
                                                                this.I |= var1_1 << this.Q;
                                                                if (var3_3 != null) break block39;
                                                            }
                                                            catch (IOException v2) {
                                                                throw p4_0.a(v2);
                                                            }
                                                        }
                                                        v0 = this;
                                                    }
                                                    catch (IOException v3) {
                                                        throw p4_0.a(v3);
                                                    }
                                                }
                                                v0.I = var1_1;
                                            }
                                            this.Q += this.h;
                                            while (this.Q >= p4_0.a(14292, 713517377204412042L)) {
                                                try {
                                                    this.i((byte)(this.I & p4_0.a(9476, 4430856160928123988L)), var2_2);
                                                    this.I >>= p4_0.a(14292, 713517377204412042L);
                                                    this.Q -= p4_0.a(14292, 713517377204412042L);
                                                    if (var3_3 != null) {
                                                        if (var3_3 != null) continue;
                                                        break;
                                                    }
                                                    break block40;
                                                }
                                                catch (IOException v4) {
                                                    throw p4_0.a(v4);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v5 = this.L;
                                                        if (var3_3 == null) break block41;
                                                        if (v5 > this.V) break block40;
                                                    }
                                                    catch (IOException v6) {
                                                        throw p4_0.a(v6);
                                                    }
                                                    v7 = this.G;
                                                    if (var3_3 == null) break block42;
                                                }
                                                catch (IOException v8) {
                                                    throw p4_0.a(v8);
                                                }
                                                if (v7 == 0) break block43;
                                            }
                                            catch (IOException v9) {
                                                throw p4_0.a(v9);
                                            }
                                        }
                                        v5 = (int)this.G;
                                    }
                                    try {
                                        try {
                                            block45: {
                                                try {
                                                    try {
                                                        if (var3_3 == null) break block44;
                                                        if (v5 == 0) break block45;
                                                    }
                                                    catch (IOException v10) {
                                                        throw p4_0.a(v10);
                                                    }
                                                    this.h = this.U;
                                                    this.V = this.t(this.h);
                                                    this.G = false;
                                                    if (var3_3 != null) break block43;
                                                }
                                                catch (IOException v11) {
                                                    throw p4_0.a(v11);
                                                }
                                            }
                                            ++this.h;
                                            v12 = this;
                                            if (var3_3 == null) break block46;
                                        }
                                        catch (IOException v13) {
                                            throw p4_0.a(v13);
                                        }
                                        v5 = v12.h;
                                    }
                                    catch (IOException v14) {
                                        throw p4_0.a(v14);
                                    }
                                }
                                try {
                                    block47: {
                                        try {
                                            if (v5 != this.Z) break block47;
                                            this.V = this.X;
                                            if (var3_3 != null) break block43;
                                        }
                                        catch (IOException v15) {
                                            throw p4_0.a(v15);
                                        }
                                    }
                                    v12 = this;
                                }
                                catch (IOException v16) {
                                    throw p4_0.a(v16);
                                }
                            }
                            v12.V = this.t(this.h);
                        }
                        v7 = var1_1;
                    }
                    try {
                        try {
                            if (var3_3 == null) break block48;
                            if (v7 != this.m) break block49;
                        }
                        catch (IOException v17) {
                            throw p4_0.a(v17);
                        }
                        while (true) {
                            v7 = this.Q;
                            break;
                        }
                    }
                    catch (IOException v18) {
                        throw p4_0.a(v18);
                    }
                }
                try {
                    try {
                        if (v7 <= 0) break block50;
                        this.i((byte)(this.I & p4_0.a(9476, 4430856160928123988L)), var2_2);
                        this.I >>= p4_0.a(14292, 713517377204412042L);
                        this.Q -= p4_0.a(14292, 713517377204412042L);
                        if (var3_3 == null) break block49;
                    }
                    catch (IOException v19) {
                        throw p4_0.a(v19);
                    }
                    if (var3_3 != null) ** continue;
                }
                catch (IOException v20) {
                    throw p4_0.a(v20);
                }
            }
            this.H(var2_2);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5875077809874358961L;
                var6_1 = new long[35];
                var3_2 = 0;
                var4_3 = "Z\u007f?\u00e98\u00e8J\u00fb.~\u00adC\u009d\u001brS}P\u00bf\"(\u00ea\u0092>\u00f2\u00de\u008d\\\u00cc\u0001\f3\u00d0e\u00a9\u0010\u0095\u00cc\u00ae\u00b4\u0092,\b\u0089)\u00a3\u00b5\u0017\u00e0\u00b5\u00b7\u0015,\f\u00ec\u00e0\u009e\u00ad/B\u0011\u00fc\u00da\u00e3\u0007\u00c8\b\u00b2\u00f6$\u00148\u0088\u00ed\u0088:/\u00a9\fA!\u0093F\u009f\u0085t7/\u00ec~\u009c\u00a5\u0016`7\u00ac\u00ccz\u00c3\u008b\u00db\\ \u0080\u00c9\u000f\u00b2\u008b\u001f\u00af\u009e\u001a\t\n\u001443\u00ca4>7\u00dbS\u001b\u0080G\u0088kWdU\u00fd\u0092\u0082j\u008bD\u00cc\u00b2\u00cc&h\u00d7_\u00f5\u0007\u00c3g\u0014\u0005\u008fdr\u00bd\u00ce\u00d6Qb\u0095X\u00c9\u00c2\u00f2\u009b\u00ab\u00cd\u00fe\u008cY\u00e3d\u009c\r\u0002b]<\u0087\u009e|6\u00e8\u00ad[ \u00c4\u00bb\u00aaQ\u0093*K\u0082\u00ec\u00ae~B|x'\u00e6\u00a7\u0014\u00db^\u0091\u0090\u00bc\u00aa\u0006\u00ae\u009b\u000b\u00a3ani{KU\u00c5\u00d5\u00fc\u00ccG\u00c1\u00da\u00e1\u00d5i\u00f3Z\u000b\u00ed\u0017\u0089\u00b7QW{,\u009a\u00ado\u00c7!\u0095\u00d2O\u0097\u00e7l\u009c<\u00cc\u00bf:\u0085\u00a0T\u00d7CVK";
                var5_4 = "Z\u007f?\u00e98\u00e8J\u00fb.~\u00adC\u009d\u001brS}P\u00bf\"(\u00ea\u0092>\u00f2\u00de\u008d\\\u00cc\u0001\f3\u00d0e\u00a9\u0010\u0095\u00cc\u00ae\u00b4\u0092,\b\u0089)\u00a3\u00b5\u0017\u00e0\u00b5\u00b7\u0015,\f\u00ec\u00e0\u009e\u00ad/B\u0011\u00fc\u00da\u00e3\u0007\u00c8\b\u00b2\u00f6$\u00148\u0088\u00ed\u0088:/\u00a9\fA!\u0093F\u009f\u0085t7/\u00ec~\u009c\u00a5\u0016`7\u00ac\u00ccz\u00c3\u008b\u00db\\ \u0080\u00c9\u000f\u00b2\u008b\u001f\u00af\u009e\u001a\t\n\u001443\u00ca4>7\u00dbS\u001b\u0080G\u0088kWdU\u00fd\u0092\u0082j\u008bD\u00cc\u00b2\u00cc&h\u00d7_\u00f5\u0007\u00c3g\u0014\u0005\u008fdr\u00bd\u00ce\u00d6Qb\u0095X\u00c9\u00c2\u00f2\u009b\u00ab\u00cd\u00fe\u008cY\u00e3d\u009c\r\u0002b]<\u0087\u009e|6\u00e8\u00ad[ \u00c4\u00bb\u00aaQ\u0093*K\u0082\u00ec\u00ae~B|x'\u00e6\u00a7\u0014\u00db^\u0091\u0090\u00bc\u00aa\u0006\u00ae\u009b\u000b\u00a3ani{KU\u00c5\u00d5\u00fc\u00ccG\u00c1\u00da\u00e1\u00d5i\u00f3Z\u000b\u00ed\u0017\u0089\u00b7QW{,\u009a\u00ado\u00c7!\u0095\u00d2O\u0097\u00e7l\u009c<\u00cc\u00bf:\u0085\u00a0T\u00d7CVK".length();
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
                    var4_3 = "\"\u00d8\u00efp\u00eb\\v7\u00f8F\u00b0=\u0007@\t\u00c5";
                    var5_4 = "\"\u00d8\u00efp\u00eb\\v7\u00f8F\u00b0=\u0007@\t\u00c5".length();
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
        p4_0.b = var6_1;
        p4_0.c = new Integer[35];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x695D;
        if (c[n11] == null) {
            p4_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

