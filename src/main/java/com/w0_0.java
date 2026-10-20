/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F;
import com.XB;
import com.XO;
import com.ky_2;
import com.nl_2;
import com.re_1;

/*
 * Renamed from com.w0
 */
public class w0_0 {
    int Y;
    int C = 1;
    final re_1 Q = new re_1();
    nl_2[] T = new nl_2[w0_0.a(15299, 3931763262190136338L)];
    int N = (int)(0.75 * (double)this.T.length);
    final nl_2 g = new nl_2();
    final nl_2 D = new nl_2();
    final nl_2 r = new nl_2();
    private int X;
    private int n;
    String d;
    private int G;
    private int J;
    private int[] w;
    XO s;
    XO k;
    F R;
    F U;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public w0_0() {
        this(0);
    }

    private w0_0(int n10) {
    }

    public void x(int n10, int n11, String string, String string2, String[] stringArray) {
        block15: {
            int[] nArray;
            block16: {
                String[] stringArray2;
                block14: {
                    int n12;
                    block13: {
                        nl_2 nl_22;
                        block11: {
                            block12: {
                                this.Y = n10;
                                nArray = XB.X();
                                try {
                                    try {
                                        this.X = n11;
                                        w0_0 w0_02 = this;
                                        nl_22 = this.H(string);
                                        if (nArray != null) break block11;
                                        w0_02.n = nl_22.J;
                                        this.d = string;
                                        w0_02 = this;
                                        if (string2 != null) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw w0_0.a(illegalArgumentException);
                                    }
                                    n12 = 0;
                                    break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw w0_0.a(illegalArgumentException);
                                }
                            }
                            nl_22 = this.H(string2);
                        }
                        n12 = nl_22.J;
                    }
                    try {
                        w0_02.G = n12;
                        stringArray2 = stringArray;
                        if (nArray != null) break block14;
                        if (stringArray2 == null) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw w0_0.a(illegalArgumentException);
                    }
                    stringArray2 = stringArray;
                }
                try {
                    int n13;
                    try {
                        n13 = stringArray2.length;
                        if (nArray != null) break block16;
                        if (n13 <= 0) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw w0_0.a(illegalArgumentException);
                    }
                    this.J = stringArray.length;
                    this.w = new int[this.J];
                    n13 = 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
            }
            for (int i2 = v9733545; i2 < this.J; ++i2) {
                this.w[i2] = this.H((String)stringArray[i2]).J;
                if (nArray == null) continue;
            }
        }
    }

    public byte[] B() {
        re_1 re_12;
        block20: {
            int n10;
            F f10;
            int[] nArray;
            block19: {
                int n11;
                XO xO2;
                block18: {
                    int n12;
                    int n13;
                    block17: {
                        int n14;
                        int n15;
                        block16: {
                            n15 = w0_0.a(28346, 4599225218052421985L) + 2 * this.J;
                            nArray = XB.X();
                            n13 = 0;
                            xO2 = this.s;
                            while (xO2 != null) {
                                ++n13;
                                n14 = n15 + xO2.h();
                                if (nArray == null) {
                                    n15 = n14;
                                    xO2 = xO2.L;
                                    if (nArray == null) continue;
                                    ky_2.K(new String[3]);
                                    break;
                                }
                                break block16;
                            }
                            n14 = 0;
                        }
                        n11 = n14;
                        f10 = this.R;
                        while (f10 != null) {
                            ++n11;
                            n12 = n15 + f10.A();
                            if (nArray == null) {
                                n15 = n12;
                                f10 = f10.X;
                                if (nArray == null) continue;
                            }
                            break block17;
                        }
                        n12 = 0;
                    }
                    n10 = n12;
                    re_12 = new re_1(n15 += this.Q.V);
                    re_12.z(w0_0.a(6428, 7690145124333948608L)).z(this.Y);
                    re_12.G(this.C).t(this.Q.Q, 0, this.Q.V);
                    int n16 = w0_0.a(22426, 8613186029799686218L);
                    re_12.G(this.X & ~n16).G(this.n).G(this.G);
                    re_12.G(this.J);
                    for (int i2 = 0; i2 < this.J; ++i2) {
                        try {
                            re_12.G(this.w[i2]);
                            if (nArray == null) {
                                if (nArray == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw w0_0.a(illegalArgumentException);
                        }
                    }
                    re_12.G(n13);
                }
                xO2 = this.s;
                while (xO2 != null) {
                    xO2.S(re_12);
                    xO2 = xO2.L;
                    try {
                        if (nArray == null) {
                            if (nArray == null) continue;
                            break;
                        }
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw w0_0.a(illegalArgumentException);
                    }
                }
                re_12.G(n11);
            }
            f10 = this.R;
            while (f10 != null) {
                f10.S(re_12);
                f10 = f10.X;
                try {
                    if (nArray == null) {
                        if (nArray == null) continue;
                        break;
                    }
                    break block20;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
            }
            re_12.G(n10);
        }
        return re_12.Q;
    }

    nl_2 N(Object object) {
        block25: {
            String string;
            w0_0 w0_02;
            block24: {
                XB xB2;
                block22: {
                    XB xB3;
                    block23: {
                        Object object2;
                        int[] nArray;
                        block21: {
                            boolean bl;
                            block19: {
                                block20: {
                                    block15: {
                                        block16: {
                                            nl_2 nl_22;
                                            block17: {
                                                nl_2 nl_23;
                                                block18: {
                                                    nArray = XB.X();
                                                    try {
                                                        bl = object instanceof Integer;
                                                        if (nArray != null) break block15;
                                                        if (!bl) break block16;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw w0_0.a(illegalArgumentException);
                                                    }
                                                    int n10 = (Integer)object;
                                                    this.g.r(n10);
                                                    nl_23 = this.D(this.g);
                                                    try {
                                                        nl_22 = nl_23;
                                                        if (nArray != null) break block17;
                                                        if (nl_22 != null) break block18;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw w0_0.a(illegalArgumentException);
                                                    }
                                                    this.Q.c(3).z(n10);
                                                    nl_23 = new nl_2(this.C++, this.g);
                                                    this.X(nl_23);
                                                }
                                                nl_22 = nl_23;
                                            }
                                            return nl_22;
                                        }
                                        bl = object instanceof String;
                                    }
                                    try {
                                        try {
                                            if (nArray != null) break block19;
                                            if (!bl) break block20;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw w0_0.a(illegalArgumentException);
                                        }
                                        return this.X((String)object);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw w0_0.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    object2 = object;
                                    if (nArray != null) break block21;
                                    bl = object2 instanceof XB;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw w0_0.a(illegalArgumentException);
                                }
                            }
                            if (!bl) break block25;
                            object2 = object;
                        }
                        xB3 = (XB)object2;
                        try {
                            try {
                                w0_02 = this;
                                xB2 = xB3;
                                if (nArray != null) break block22;
                                if (xB2.q != w0_0.a(11943, 181678923643140467L)) break block23;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw w0_0.a(illegalArgumentException);
                            }
                            string = xB3.o();
                            break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw w0_0.a(illegalArgumentException);
                        }
                    }
                    xB2 = xB3;
                }
                string = xB2.i();
            }
            return w0_02.H(string);
        }
        throw new IllegalArgumentException(a + object);
    }

    public int O(String string) {
        nl_2 nl_22;
        block2: {
            nl_2 nl_23;
            block3: {
                int[] nArray = XB.X();
                this.g.y(1, string, null, null);
                nl_23 = this.D(this.g);
                int[] nArray2 = nArray;
                try {
                    nl_22 = nl_23;
                    if (nArray2 != null) break block2;
                    if (nl_22 != null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                this.Q.c(1).n(string);
                nl_23 = new nl_2(this.C++, this.g);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22.J;
    }

    public nl_2 H(String string) {
        nl_2 nl_22;
        block2: {
            nl_2 nl_23;
            block3: {
                this.D.y(w0_0.a(30099, 5219950882138939981L), string, null, null);
                nl_23 = this.D(this.D);
                int[] nArray = XB.X();
                try {
                    nl_22 = nl_23;
                    if (nArray != null) break block2;
                    if (nl_22 != null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                this.Q.d(w0_0.a(31034, 9015446933555867372L), this.O(string));
                nl_23 = new nl_2(this.C++, this.D);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22;
    }

    nl_2 h(String string, String string2, String string3) {
        nl_2 nl_22;
        block2: {
            nl_2 nl_23;
            block3: {
                int[] nArray = XB.X();
                this.r.y(w0_0.a(11772, 5883405572420221487L), string, string2, string3);
                int[] nArray2 = nArray;
                nl_23 = this.D(this.r);
                try {
                    nl_22 = nl_23;
                    if (nArray2 != null) break block2;
                    if (nl_22 != null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                int n10 = this.H((String)string).J;
                int n11 = this.Q((String)string2, (String)string3).J;
                this.Q.d(w0_0.a(29880, 8521257355325039463L), n10).G(n11);
                nl_23 = new nl_2(this.C++, this.r);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22;
    }

    nl_2 d(String string, String string2, String string3, boolean n10) {
        nl_2 nl_22;
        block6: {
            nl_2 nl_23;
            block7: {
                int n11;
                int[] nArray;
                block4: {
                    block5: {
                        nArray = XB.X();
                        try {
                            n11 = n10;
                            if (nArray != null) break block4;
                            if (n11 == 0) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw w0_0.a(illegalArgumentException);
                        }
                        n11 = w0_0.a(21166, 4268729713179411828L);
                        break block4;
                    }
                    n11 = w0_0.a(12206, 1796646782810470519L);
                }
                int n12 = n11;
                this.r.y(n12, string, string2, string3);
                nl_23 = this.D(this.r);
                try {
                    nl_22 = nl_23;
                    if (nArray != null) break block6;
                    if (nl_22 != null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                int n13 = this.H((String)string).J;
                int n14 = this.Q((String)string2, (String)string3).J;
                this.Q.d(n12, n13).G(n14);
                nl_23 = new nl_2(this.C++, this.r);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22;
    }

    private nl_2 X(String string) {
        nl_2 nl_22;
        block2: {
            nl_2 nl_23;
            block3: {
                int[] nArray = XB.X();
                this.D.y(w0_0.a(7104, 5962825564416216085L), string, null, null);
                int[] nArray2 = nArray;
                nl_23 = this.D(this.D);
                try {
                    nl_22 = nl_23;
                    if (nArray2 != null) break block2;
                    if (nl_22 != null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                this.Q.d(w0_0.a(17417, 9123640859271746523L), this.O(string));
                nl_23 = new nl_2(this.C++, this.D);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22;
    }

    public nl_2 Q(String string, String string2) {
        nl_2 nl_22;
        block2: {
            nl_2 nl_23;
            block3: {
                int[] nArray = XB.X();
                this.D.y(w0_0.a(17861, 4962858029073060381L), string, string2, null);
                nl_23 = this.D(this.D);
                int[] nArray2 = nArray;
                try {
                    nl_22 = nl_23;
                    if (nArray2 != null) break block2;
                    if (nl_22 != null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw w0_0.a(illegalArgumentException);
                }
                int n10 = this.O(string);
                int n11 = this.O(string2);
                this.Q.d(w0_0.a(17981, 1066883893597917674L), n10).G(n11);
                nl_23 = new nl_2(this.C++, this.D);
                this.X(nl_23);
            }
            nl_22 = nl_23;
        }
        return nl_22;
    }

    private nl_2 D(nl_2 nl_22) {
        nl_2 nl_23;
        block11: {
            nl_2 nl_24 = this.T[nl_22.r % this.T.length];
            int[] nArray = XB.X();
            while (nl_24 != null) {
                nl_2 nl_25;
                block12: {
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            nl_23 = nl_24;
                                            if (nArray != null) break block11;
                                            if (nArray != null) break block12;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw w0_0.a(illegalArgumentException);
                                        }
                                        if (nl_23.p != nl_22.p) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw w0_0.a(illegalArgumentException);
                                    }
                                    nl_23 = nl_22;
                                    if (nArray != null) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw w0_0.a(illegalArgumentException);
                                }
                                if (nl_23.F(nl_24)) break;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw w0_0.a(illegalArgumentException);
                            }
                        }
                        nl_25 = nl_24.B;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw w0_0.a(illegalArgumentException);
                    }
                }
                nl_24 = nl_25;
                if (nArray == null) continue;
            }
            nl_23 = nl_24;
        }
        return nl_23;
    }

    private void X(nl_2 nl_22) {
        int n10;
        block9: {
            nl_2 nl_23;
            int n11;
            int n12;
            block7: {
                block8: {
                    int[] nArray = XB.X();
                    try {
                        n12 = this.C;
                        n11 = this.N;
                        if (nArray != null) break block7;
                        if (n12 <= n11) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw w0_0.a(illegalArgumentException);
                    }
                    n10 = this.T.length;
                    int n13 = n10 * 2 + 1;
                    nl_2[] nl_2Array = new nl_2[n13];
                    int n14 = n10 - 1;
                    while (n14 >= 0) {
                        block10: {
                            nl_23 = this.T[n14];
                            if (nArray != null) break block9;
                            nl_2 nl_24 = nl_23;
                            while (nl_24 != null) {
                                int n15 = nl_24.r % nl_2Array.length;
                                nl_2 nl_25 = nl_24.B;
                                nl_24.B = nl_2Array[n15];
                                nl_2Array[n15] = nl_24;
                                nl_24 = nl_25;
                                try {
                                    if (nArray == null) {
                                        if (nArray == null) continue;
                                        break;
                                    }
                                    break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw w0_0.a(illegalArgumentException);
                                }
                            }
                            --n14;
                        }
                        if (nArray == null) continue;
                    }
                    this.T = nl_2Array;
                    this.N = (int)((double)n13 * 0.75);
                }
                n12 = nl_22.r;
                n11 = this.T.length;
            }
            n10 = n12 % n11;
            nl_23 = nl_22;
        }
        nl_23.B = this.T[n10];
        this.T[n10] = nl_22;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "i|C]#8".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 62;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 33;
                                break;
                            }
                            case 1: {
                                v9 = 35;
                                break;
                            }
                            case 2: {
                                v9 = 17;
                                break;
                            }
                            case 3: {
                                v9 = 22;
                                break;
                            }
                            case 4: {
                                v9 = 120;
                                break;
                            }
                            case 5: {
                                v9 = 38;
                                break;
                            }
                            default: {
                                v9 = 7;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                w0_0.a = new String(v10).intern();
                var0_1 = 342399132631733222L;
                var6_2 = new long[15];
                var3_3 = 0;
                var4_4 = "\u000fR:\u0089\u00d4\u00cb@5\u0096W&L\"C\u00a9\u00c0\t\u00f3\u00fd\u0012U}\u00d3\u00ac?6\u000eMh,\u00be\u00f4l'\u00b2\u00a52\u0011\u00fd\r\u00ad\b\u00c0e\u00c9\u0097\u00c2\u0000\u00f8\u00da\u00e6\u0000\u00d5\u0006*\u009f\u00e0\u00ec\u00c9\u00d8GO\u001f\u00fbW\u00fb\u008a\u0087\u00db\u00dcV\u0099\u00f6B\u00c0\u00f3\u00bb\u00e2\u00ea\u009f4\u00ab\u0094N*r\u00c1\u00f7\u00c8\u00c4\u00e9\u00a7\u00b3\u00ae\u00ab\u009b\u0003\u0001\u00e3\u00f4\u00d5\nq\u00ac";
                var5_5 = "\u000fR:\u0089\u00d4\u00cb@5\u0096W&L\"C\u00a9\u00c0\t\u00f3\u00fd\u0012U}\u00d3\u00ac?6\u000eMh,\u00be\u00f4l'\u00b2\u00a52\u0011\u00fd\r\u00ad\b\u00c0e\u00c9\u0097\u00c2\u0000\u00f8\u00da\u00e6\u0000\u00d5\u0006*\u009f\u00e0\u00ec\u00c9\u00d8GO\u001f\u00fbW\u00fb\u008a\u0087\u00db\u00dcV\u0099\u00f6B\u00c0\u00f3\u00bb\u00e2\u00ea\u009f4\u00ab\u0094N*r\u00c1\u00f7\u00c8\u00c4\u00e9\u00a7\u00b3\u00ae\u00ab\u009b\u0003\u0001\u00e3\u00f4\u00d5\nq\u00ac".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "%e\u009b\u00c0\u00a8?\u00f0\u0088#\u0082\u0098\u0094\u00b24\u00a7\u0098";
                    var5_5 = "%e\u009b\u00c0\u00a8?\u00f0\u0088#\u0082\u0098\u0094\u00b24\u00a7\u0098".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        w0_0.b = var6_2;
        w0_0.c = new Integer[15];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x17D2;
        if (c[n11] == null) {
            w0_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

