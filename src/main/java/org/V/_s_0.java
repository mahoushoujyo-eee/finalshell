/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import org.F.c;
import org.K;
import org.V.J;
import org.V.N;
import org.b_0;
import org.h.cr_0;
import org.v.RB;
import org.v.RG;
import org.v._L;
import org.v.d_0;
import org.v.f0;
import org.v.h_1;
import org.v.hd_0;
import org.v.ht_0;
import org.v.w_1;

/*
 * Renamed from org.v._s
 */
class _s_0
extends _L {
    private final J OU;
    @c
    private final J OQ;
    static final boolean OT;
    final w_1 O6;
    private static final String[] cb;
    private static final String[] db;
    private static final long[] eb;
    private static final Integer[] fb;

    _s_0(w_1 w_12, @c J j2, J j3, _L _L2) {
        this.O6 = w_12;
        super(_L2);
        this.OU = j2;
        this.OQ = j3;
        super.L();
    }

    @Override
    @c
    protected hd_0 x(String string) throws ClassNotFoundException {
        N n10;
        String string2;
        block58: {
            N n11;
            N n12;
            block57: {
                String[] stringArray;
                block59: {
                    d_0 d_02;
                    Object object;
                    block54: {
                        Object object2;
                        block56: {
                            Object object3;
                            block55: {
                                int n13;
                                block46: {
                                    int n14;
                                    block47: {
                                        String[] stringArray2 = RG.C();
                                        w_1.t().entering(null, _s_0.b(17261, -12326), string);
                                        stringArray = stringArray2;
                                        string2 = f0.F(string);
                                        try {
                                            try {
                                                w_1.t().log(Level.FINE, _s_0.b(17256, -25217), string2);
                                                n14 = string2.startsWith(_s_0.b(17258, -21170));
                                                if (stringArray == null) break block46;
                                                if (n14 == 0) break block47;
                                            }
                                            catch (ClassNotFoundException classNotFoundException) {
                                                throw _s_0.b(classNotFoundException);
                                            }
                                            return null;
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            throw _s_0.b(classNotFoundException);
                                        }
                                    }
                                    n14 = n13 = string2.indexOf(_s_0.a(25668, 8308444574867474831L), string2.lastIndexOf(_s_0.a(12016, 597401944659886905L)) + 2);
                                }
                                block38: do {
                                    int n15;
                                    String string3;
                                    block48: {
                                        if (n13 == -1) {
                                            try {
                                                string3 = string2;
                                                if (stringArray != null) {
                                                }
                                                break block48;
                                            }
                                            catch (ClassNotFoundException classNotFoundException) {
                                                throw _s_0.b(classNotFoundException);
                                            }
                                        }
                                        string3 = string2;
                                    }
                                    string3 = string3.substring(0, n13);
                                    object3 = string3;
                                    int n16 = 0;
                                    while (n16 < w_1.o(this.O6).size()) {
                                        block49: {
                                            block50: {
                                                hd_0 hd_02;
                                                block52: {
                                                    hd_0 hd_03;
                                                    block51: {
                                                        object = (h_1)w_1.o(this.O6).get(n16);
                                                        hd_03 = ((h_1)object).u((String)object3);
                                                        try {
                                                            try {
                                                                try {
                                                                    if (stringArray == null) continue block38;
                                                                    if (stringArray == null) break block49;
                                                                }
                                                                catch (ClassNotFoundException classNotFoundException) {
                                                                    throw _s_0.b(classNotFoundException);
                                                                }
                                                                if (hd_03 == null) break block50;
                                                            }
                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                throw _s_0.b(classNotFoundException);
                                                            }
                                                            if (string2.equals(object3)) break block51;
                                                        }
                                                        catch (ClassNotFoundException classNotFoundException) {
                                                            throw _s_0.b(classNotFoundException);
                                                        }
                                                        hd_03 = ((h_1)object).u(string2);
                                                        try {
                                                            try {
                                                                hd_02 = hd_03;
                                                                if (stringArray == null) break block52;
                                                                if (hd_02 != null) break block51;
                                                            }
                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                throw _s_0.b(classNotFoundException);
                                                            }
                                                            return null;
                                                        }
                                                        catch (ClassNotFoundException classNotFoundException) {
                                                            throw _s_0.b(classNotFoundException);
                                                        }
                                                    }
                                                    this.l(hd_03);
                                                    hd_02 = hd_03;
                                                }
                                                return hd_02;
                                            }
                                            ++n16;
                                        }
                                        if (stringArray != null) continue;
                                    }
                                    try {
                                        try {
                                            n15 = n13;
                                            if (stringArray == null) continue;
                                            if (n15 == -1) {
                                                break;
                                            }
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            throw _s_0.b(classNotFoundException);
                                        }
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        throw _s_0.b(classNotFoundException);
                                    }
                                    n15 = n13 = string2.indexOf(_s_0.a(8125, 798571123217478263L), n13 + 2);
                                } while (stringArray != null);
                                n10 = this.OU.J(cr_0.R(string2));
                                try {
                                    if (n10 == null) {
                                        return null;
                                    }
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw _s_0.b(classNotFoundException);
                                }
                                object3 = this.OQ;
                                try {
                                    try {
                                        try {
                                            try {
                                                if (object3 == org.K.L) break block54;
                                                if (OT) break block55;
                                            }
                                            catch (ClassNotFoundException classNotFoundException) {
                                                throw _s_0.b(classNotFoundException);
                                            }
                                            object2 = object3;
                                            if (stringArray == null) break block56;
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            throw _s_0.b(classNotFoundException);
                                        }
                                        if (object2 != null) break block55;
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        throw _s_0.b(classNotFoundException);
                                    }
                                    throw new AssertionError();
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw _s_0.b(classNotFoundException);
                                }
                            }
                            object2 = object3;
                        }
                        n12 = ((J)object2).J(cr_0.A(string2));
                        break block59;
                    }
                    try {
                        if (!(n10 instanceof d_0)) {
                            return null;
                        }
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw _s_0.b(classNotFoundException);
                    }
                    object = new File(((d_0)n10).U().getParentFile(), cr_0.A(string2.substring(string2.lastIndexOf(_s_0.a(27667, 5076450027857560027L)) + 1)));
                    try {
                        d_02 = ((File)object).exists() ? new d_0((File)object) : null;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw _s_0.b(classNotFoundException);
                    }
                    n12 = d_02;
                }
                try {
                    n11 = n12;
                    if (stringArray == null) break block57;
                    if (n11 == null) break block58;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw _s_0.b(classNotFoundException);
                }
                n11 = n10;
            }
            try {
                if (n11.z() <= n12.z()) {
                    return this.a(n12);
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw _s_0.b(classNotFoundException);
            }
        }
        return this.s(n10, string2);
    }

    private hd_0 s(N n10, String string) throws ClassNotFoundException {
        Object object;
        block7: {
            Object object2;
            block8: {
                h_1 h_12;
                String[] stringArray = RG.C();
                try {
                    object2 = w_1.Y(this.O6, n10.o(), new BufferedInputStream(n10.o()), this.O6.m);
                    h_12 = new h_1((RB)object2, this).F(w_1.N(this.O6));
                }
                catch (IOException iOException) {
                    throw new ClassNotFoundException(_s_0.b(17263, -30529) + n10 + "\"", iOException);
                }
                catch (b_0 b_02) {
                    throw new ClassNotFoundException(_s_0.b(17259, -23184) + n10 + "\"", b_02);
                }
                w_1.o(this.O6).add(h_12);
                object2 = h_12.u(string);
                try {
                    try {
                        object = object2;
                        if (stringArray == null) break block7;
                        if (object != null) break block8;
                    }
                    catch (IOException iOException) {
                        throw _s_0.b(iOException);
                    }
                    throw new ClassNotFoundException("\"" + n10 + _s_0.b(17260, -15490) + string + "\"");
                }
                catch (IOException iOException) {
                    throw _s_0.b(iOException);
                }
            }
            this.l((hd_0)object2);
            object = object2;
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private hd_0 a(N var1_1) throws ClassNotFoundException {
        v0 = RG.C();
        w_1.w(this.O6).u(_s_0.b(17257, -2156) + var1_1.o() + "\"");
        var2_2 = v0;
        try {
            block17: {
                var3_3 = null;
                var3_3 = var1_1.o();
                var4_4 = new cr_0(new BufferedInputStream(var3_3));
                try {
                    v1 = var3_3;
                    if (var2_2 != null) {
                        if (v1 == null) break block17;
                    }
                    ** GOTO lbl19
                }
                catch (IOException v2) {
                    throw _s_0.b(v2);
                }
                try {
                    v1 = var3_3;
lbl19:
                    // 2 sources

                    v1.close();
                }
                catch (IOException var5_5) {}
                break block17;
                catch (IOException var5_6) {
                    try {
                        throw new ClassNotFoundException(_s_0.b(17262, -18436) + var1_1 + "\"", var5_6);
                    }
                    catch (Throwable var6_8) {
                        block18: {
                            try {
                                v3 = var3_3;
                                if (var2_2 != null) {
                                    if (v3 == null) break block18;
                                }
                                ** GOTO lbl37
                            }
                            catch (IOException v4) {
                                throw _s_0.b(v4);
                            }
                            try {
                                v3 = var3_3;
lbl37:
                                // 2 sources

                                v3.close();
                            }
                            catch (IOException var7_10) {
                                // empty catch block
                            }
                        }
                        throw var6_8;
                    }
                }
            }
            var5_7 = new ht_0(var4_4, this);
            this.l(var5_7);
            var5_7.S();
            var6_9 = var5_7;
            return var6_9;
        }
        finally {
            w_1.w(this.O6).r();
        }
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
                        var10_2 = "\u00c1\u0096\u008aaj\u0019\u00d1sG\t\u00b2\t\u00d3\u00df\u00fc\u00a3\u00bc\u00a4=\u00bb\n\u00c8\u00a8m\u00cd\u00f1\u00d6G\u00b3L\u00f8\u001d\u00b0Xe\u00e3\u00bau\u0001\u000e\u00fe9I\u0003\u00d3(\"~2\u00161\u00bd\u0012\u00db\u00d2\u00a3Rz\u00d7\u00152\u001a\u00ca\u00d8\u00c1\u00dd\u00db\f-!{\u00df\u00f5\u00bf\u00d3\u0090|\u00b1\u001b[\u00ff\r\\\u00c8\u000f~}\u00a1\r\u00be\u00c9\tS\u00a9\u00fd<v\u0099\u0083yl\u0082\u0014\u0083\u001fd\u00fd\u001e\u00fd\u0095\u001fl\u001b\u001bG\u0099\u00a0ko\u001b4\u0014\u00a9";
                        var12_3 = "\u00c1\u0096\u008aaj\u0019\u00d1sG\t\u00b2\t\u00d3\u00df\u00fc\u00a3\u00bc\u00a4=\u00bb\n\u00c8\u00a8m\u00cd\u00f1\u00d6G\u00b3L\u00f8\u001d\u00b0Xe\u00e3\u00bau\u0001\u000e\u00fe9I\u0003\u00d3(\"~2\u00161\u00bd\u0012\u00db\u00d2\u00a3Rz\u00d7\u00152\u001a\u00ca\u00d8\u00c1\u00dd\u00db\f-!{\u00df\u00f5\u00bf\u00d3\u0090|\u00b1\u001b[\u00ff\r\\\u00c8\u000f~}\u00a1\r\u00be\u00c9\tS\u00a9\u00fd<v\u0099\u0083yl\u0082\u0014\u0083\u001fd\u00fd\u001e\u00fd\u0095\u001fl\u001b\u001bG\u0099\u00a0ko\u001b4\u0014\u00a9".length();
                        var9_4 = 20;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 100;
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
                            var10_2 = "z\n\u00b3\u0088K\u001aGYm\u00f0S\u00b4!+\u00e7\u0083{)\u001f_\u00f8U\u0096\u00daS \u00d4p\u0003t\u00e1\u00fd";
                            var12_3 = "z\n\u00b3\u0088K\u001aGYm\u00f0S\u00b4!+\u00e7\u0083{)\u001f_\u00f8U\u0096\u00daS \u00d4p\u0003t\u00e1\u00fd".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 23;
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
                                    v15 = 2;
                                    break;
                                }
                                case 1: {
                                    v15 = 24;
                                    break;
                                }
                                case 2: {
                                    v15 = 24;
                                    break;
                                }
                                case 3: {
                                    v15 = 19;
                                    break;
                                }
                                case 4: {
                                    v15 = 93;
                                    break;
                                }
                                case 5: {
                                    v15 = 78;
                                    break;
                                }
                                default: {
                                    v15 = 54;
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
                _s_0.cb = var13;
                _s_0.db = new String[8];
                var0_7 = 8137114292494791415L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u0010\u00f0f\u00b6\u0014\u0018\u00bb\\\u0080|0@\u00ab\u00a4\u00c0\u00a4";
                var5_11 = "\u0010\u00f0f\u00b6\u0014\u0018\u00bb\\\u0080|0@\u00ab\u00a4\u00c0\u00a4".length();
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
                    var4_10 = "\u001e\u00dbq\u009c\u007fsq\u00e0k\u001d7\u0091B\u009f3\u0002";
                    var5_11 = "\u001e\u00dbq\u009c\u007fsq\u00e0k\u001d7\u0091B\u009f3\u0002".length();
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
        _s_0.eb = var6_8;
        _s_0.fb = new Integer[4];
        _s_0.OT = w_1.class.desiredAssertionStatus() == false;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x436C) & 0xFFFF;
        if (db[n12] == null) {
            int n13;
            int n14;
            char[] cArray = cb[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 25;
                    break;
                }
                case 1: {
                    n14 = 46;
                    break;
                }
                case 2: {
                    n14 = 50;
                    break;
                }
                case 3: {
                    n14 = 124;
                    break;
                }
                case 4: {
                    n14 = 113;
                    break;
                }
                case 5: {
                    n14 = 216;
                    break;
                }
                case 6: {
                    n14 = 7;
                    break;
                }
                case 7: {
                    n14 = 76;
                    break;
                }
                case 8: {
                    n14 = 128;
                    break;
                }
                case 9: {
                    n14 = 103;
                    break;
                }
                case 10: {
                    n14 = 169;
                    break;
                }
                case 11: {
                    n14 = 96;
                    break;
                }
                case 12: {
                    n14 = 72;
                    break;
                }
                case 13: {
                    n14 = 60;
                    break;
                }
                case 14: {
                    n14 = 132;
                    break;
                }
                case 15: {
                    n14 = 26;
                    break;
                }
                case 16: {
                    n14 = 230;
                    break;
                }
                case 17: {
                    n14 = 225;
                    break;
                }
                case 18: {
                    n14 = 9;
                    break;
                }
                case 19: {
                    n14 = 3;
                    break;
                }
                case 20: {
                    n14 = 145;
                    break;
                }
                case 21: {
                    n14 = 35;
                    break;
                }
                case 22: {
                    n14 = 105;
                    break;
                }
                case 23: {
                    n14 = 45;
                    break;
                }
                case 24: {
                    n14 = 144;
                    break;
                }
                case 25: {
                    n14 = 32;
                    break;
                }
                case 26: {
                    n14 = 171;
                    break;
                }
                case 27: {
                    n14 = 117;
                    break;
                }
                case 28: {
                    n14 = 236;
                    break;
                }
                case 29: {
                    n14 = 251;
                    break;
                }
                case 30: {
                    n14 = 63;
                    break;
                }
                case 31: {
                    n14 = 58;
                    break;
                }
                case 32: {
                    n14 = 222;
                    break;
                }
                case 33: {
                    n14 = 167;
                    break;
                }
                case 34: {
                    n14 = 118;
                    break;
                }
                case 35: {
                    n14 = 201;
                    break;
                }
                case 36: {
                    n14 = 178;
                    break;
                }
                case 37: {
                    n14 = 214;
                    break;
                }
                case 38: {
                    n14 = 98;
                    break;
                }
                case 39: {
                    n14 = 6;
                    break;
                }
                case 40: {
                    n14 = 163;
                    break;
                }
                case 41: {
                    n14 = 130;
                    break;
                }
                case 42: {
                    n14 = 78;
                    break;
                }
                case 43: {
                    n14 = 226;
                    break;
                }
                case 44: {
                    n14 = 54;
                    break;
                }
                case 45: {
                    n14 = 82;
                    break;
                }
                case 46: {
                    n14 = 116;
                    break;
                }
                case 47: {
                    n14 = 115;
                    break;
                }
                case 48: {
                    n14 = 237;
                    break;
                }
                case 49: {
                    n14 = 111;
                    break;
                }
                case 50: {
                    n14 = 31;
                    break;
                }
                case 51: {
                    n14 = 100;
                    break;
                }
                case 52: {
                    n14 = 131;
                    break;
                }
                case 53: {
                    n14 = 137;
                    break;
                }
                case 54: {
                    n14 = 211;
                    break;
                }
                case 55: {
                    n14 = 138;
                    break;
                }
                case 56: {
                    n14 = 79;
                    break;
                }
                case 57: {
                    n14 = 88;
                    break;
                }
                case 58: {
                    n14 = 143;
                    break;
                }
                case 59: {
                    n14 = 246;
                    break;
                }
                case 60: {
                    n14 = 155;
                    break;
                }
                case 61: {
                    n14 = 107;
                    break;
                }
                case 62: {
                    n14 = 157;
                    break;
                }
                case 63: {
                    n14 = 36;
                    break;
                }
                case 64: {
                    n14 = 158;
                    break;
                }
                case 65: {
                    n14 = 67;
                    break;
                }
                case 66: {
                    n14 = 241;
                    break;
                }
                case 67: {
                    n14 = 231;
                    break;
                }
                case 68: {
                    n14 = 161;
                    break;
                }
                case 69: {
                    n14 = 61;
                    break;
                }
                case 70: {
                    n14 = 127;
                    break;
                }
                case 71: {
                    n14 = 244;
                    break;
                }
                case 72: {
                    n14 = 0;
                    break;
                }
                case 73: {
                    n14 = 224;
                    break;
                }
                case 74: {
                    n14 = 1;
                    break;
                }
                case 75: {
                    n14 = 28;
                    break;
                }
                case 76: {
                    n14 = 168;
                    break;
                }
                case 77: {
                    n14 = 164;
                    break;
                }
                case 78: {
                    n14 = 49;
                    break;
                }
                case 79: {
                    n14 = 11;
                    break;
                }
                case 80: {
                    n14 = 75;
                    break;
                }
                case 81: {
                    n14 = 81;
                    break;
                }
                case 82: {
                    n14 = 110;
                    break;
                }
                case 83: {
                    n14 = 37;
                    break;
                }
                case 84: {
                    n14 = 24;
                    break;
                }
                case 85: {
                    n14 = 219;
                    break;
                }
                case 86: {
                    n14 = 233;
                    break;
                }
                case 87: {
                    n14 = 176;
                    break;
                }
                case 88: {
                    n14 = 174;
                    break;
                }
                case 89: {
                    n14 = 22;
                    break;
                }
                case 90: {
                    n14 = 14;
                    break;
                }
                case 91: {
                    n14 = 87;
                    break;
                }
                case 92: {
                    n14 = 188;
                    break;
                }
                case 93: {
                    n14 = 17;
                    break;
                }
                case 94: {
                    n14 = 165;
                    break;
                }
                case 95: {
                    n14 = 175;
                    break;
                }
                case 96: {
                    n14 = 129;
                    break;
                }
                case 97: {
                    n14 = 51;
                    break;
                }
                case 98: {
                    n14 = 189;
                    break;
                }
                case 99: {
                    n14 = 159;
                    break;
                }
                case 100: {
                    n14 = 108;
                    break;
                }
                case 101: {
                    n14 = 44;
                    break;
                }
                case 102: {
                    n14 = 48;
                    break;
                }
                case 103: {
                    n14 = 254;
                    break;
                }
                case 104: {
                    n14 = 64;
                    break;
                }
                case 105: {
                    n14 = 85;
                    break;
                }
                case 106: {
                    n14 = 243;
                    break;
                }
                case 107: {
                    n14 = 102;
                    break;
                }
                case 108: {
                    n14 = 221;
                    break;
                }
                case 109: {
                    n14 = 185;
                    break;
                }
                case 110: {
                    n14 = 179;
                    break;
                }
                case 111: {
                    n14 = 73;
                    break;
                }
                case 112: {
                    n14 = 217;
                    break;
                }
                case 113: {
                    n14 = 197;
                    break;
                }
                case 114: {
                    n14 = 205;
                    break;
                }
                case 115: {
                    n14 = 38;
                    break;
                }
                case 116: {
                    n14 = 83;
                    break;
                }
                case 117: {
                    n14 = 125;
                    break;
                }
                case 118: {
                    n14 = 140;
                    break;
                }
                case 119: {
                    n14 = 210;
                    break;
                }
                case 120: {
                    n14 = 136;
                    break;
                }
                case 121: {
                    n14 = 74;
                    break;
                }
                case 122: {
                    n14 = 252;
                    break;
                }
                case 123: {
                    n14 = 65;
                    break;
                }
                case 124: {
                    n14 = 245;
                    break;
                }
                case 125: {
                    n14 = 183;
                    break;
                }
                case 126: {
                    n14 = 55;
                    break;
                }
                case 127: {
                    n14 = 191;
                    break;
                }
                case 128: {
                    n14 = 193;
                    break;
                }
                case 129: {
                    n14 = 248;
                    break;
                }
                case 130: {
                    n14 = 104;
                    break;
                }
                case 131: {
                    n14 = 228;
                    break;
                }
                case 132: {
                    n14 = 239;
                    break;
                }
                case 133: {
                    n14 = 187;
                    break;
                }
                case 134: {
                    n14 = 8;
                    break;
                }
                case 135: {
                    n14 = 12;
                    break;
                }
                case 136: {
                    n14 = 27;
                    break;
                }
                case 137: {
                    n14 = 232;
                    break;
                }
                case 138: {
                    n14 = 29;
                    break;
                }
                case 139: {
                    n14 = 68;
                    break;
                }
                case 140: {
                    n14 = 71;
                    break;
                }
                case 141: {
                    n14 = 112;
                    break;
                }
                case 142: {
                    n14 = 162;
                    break;
                }
                case 143: {
                    n14 = 126;
                    break;
                }
                case 144: {
                    n14 = 202;
                    break;
                }
                case 145: {
                    n14 = 34;
                    break;
                }
                case 146: {
                    n14 = 86;
                    break;
                }
                case 147: {
                    n14 = 242;
                    break;
                }
                case 148: {
                    n14 = 156;
                    break;
                }
                case 149: {
                    n14 = 192;
                    break;
                }
                case 150: {
                    n14 = 2;
                    break;
                }
                case 151: {
                    n14 = 207;
                    break;
                }
                case 152: {
                    n14 = 106;
                    break;
                }
                case 153: {
                    n14 = 184;
                    break;
                }
                case 154: {
                    n14 = 170;
                    break;
                }
                case 155: {
                    n14 = 41;
                    break;
                }
                case 156: {
                    n14 = 59;
                    break;
                }
                case 157: {
                    n14 = 186;
                    break;
                }
                case 158: {
                    n14 = 247;
                    break;
                }
                case 159: {
                    n14 = 13;
                    break;
                }
                case 160: {
                    n14 = 142;
                    break;
                }
                case 161: {
                    n14 = 166;
                    break;
                }
                case 162: {
                    n14 = 198;
                    break;
                }
                case 163: {
                    n14 = 114;
                    break;
                }
                case 164: {
                    n14 = 47;
                    break;
                }
                case 165: {
                    n14 = 135;
                    break;
                }
                case 166: {
                    n14 = 109;
                    break;
                }
                case 167: {
                    n14 = 249;
                    break;
                }
                case 168: {
                    n14 = 23;
                    break;
                }
                case 169: {
                    n14 = 19;
                    break;
                }
                case 170: {
                    n14 = 149;
                    break;
                }
                case 171: {
                    n14 = 209;
                    break;
                }
                case 172: {
                    n14 = 195;
                    break;
                }
                case 173: {
                    n14 = 69;
                    break;
                }
                case 174: {
                    n14 = 18;
                    break;
                }
                case 175: {
                    n14 = 212;
                    break;
                }
                case 176: {
                    n14 = 62;
                    break;
                }
                case 177: {
                    n14 = 213;
                    break;
                }
                case 178: {
                    n14 = 93;
                    break;
                }
                case 179: {
                    n14 = 172;
                    break;
                }
                case 180: {
                    n14 = 80;
                    break;
                }
                case 181: {
                    n14 = 250;
                    break;
                }
                case 182: {
                    n14 = 122;
                    break;
                }
                case 183: {
                    n14 = 121;
                    break;
                }
                case 184: {
                    n14 = 181;
                    break;
                }
                case 185: {
                    n14 = 92;
                    break;
                }
                case 186: {
                    n14 = 57;
                    break;
                }
                case 187: {
                    n14 = 97;
                    break;
                }
                case 188: {
                    n14 = 204;
                    break;
                }
                case 189: {
                    n14 = 223;
                    break;
                }
                case 190: {
                    n14 = 141;
                    break;
                }
                case 191: {
                    n14 = 53;
                    break;
                }
                case 192: {
                    n14 = 134;
                    break;
                }
                case 193: {
                    n14 = 218;
                    break;
                }
                case 194: {
                    n14 = 220;
                    break;
                }
                case 195: {
                    n14 = 215;
                    break;
                }
                case 196: {
                    n14 = 190;
                    break;
                }
                case 197: {
                    n14 = 194;
                    break;
                }
                case 198: {
                    n14 = 90;
                    break;
                }
                case 199: {
                    n14 = 234;
                    break;
                }
                case 200: {
                    n14 = 206;
                    break;
                }
                case 201: {
                    n14 = 147;
                    break;
                }
                case 202: {
                    n14 = 227;
                    break;
                }
                case 203: {
                    n14 = 253;
                    break;
                }
                case 204: {
                    n14 = 153;
                    break;
                }
                case 205: {
                    n14 = 52;
                    break;
                }
                case 206: {
                    n14 = 255;
                    break;
                }
                case 207: {
                    n14 = 238;
                    break;
                }
                case 208: {
                    n14 = 160;
                    break;
                }
                case 209: {
                    n14 = 10;
                    break;
                }
                case 210: {
                    n14 = 94;
                    break;
                }
                case 211: {
                    n14 = 146;
                    break;
                }
                case 212: {
                    n14 = 56;
                    break;
                }
                case 213: {
                    n14 = 150;
                    break;
                }
                case 214: {
                    n14 = 99;
                    break;
                }
                case 215: {
                    n14 = 40;
                    break;
                }
                case 216: {
                    n14 = 196;
                    break;
                }
                case 217: {
                    n14 = 182;
                    break;
                }
                case 218: {
                    n14 = 203;
                    break;
                }
                case 219: {
                    n14 = 21;
                    break;
                }
                case 220: {
                    n14 = 39;
                    break;
                }
                case 221: {
                    n14 = 148;
                    break;
                }
                case 222: {
                    n14 = 42;
                    break;
                }
                case 223: {
                    n14 = 229;
                    break;
                }
                case 224: {
                    n14 = 139;
                    break;
                }
                case 225: {
                    n14 = 20;
                    break;
                }
                case 226: {
                    n14 = 84;
                    break;
                }
                case 227: {
                    n14 = 5;
                    break;
                }
                case 228: {
                    n14 = 133;
                    break;
                }
                case 229: {
                    n14 = 235;
                    break;
                }
                case 230: {
                    n14 = 33;
                    break;
                }
                case 231: {
                    n14 = 91;
                    break;
                }
                case 232: {
                    n14 = 123;
                    break;
                }
                case 233: {
                    n14 = 199;
                    break;
                }
                case 234: {
                    n14 = 15;
                    break;
                }
                case 235: {
                    n14 = 77;
                    break;
                }
                case 236: {
                    n14 = 240;
                    break;
                }
                case 237: {
                    n14 = 180;
                    break;
                }
                case 238: {
                    n14 = 16;
                    break;
                }
                case 239: {
                    n14 = 152;
                    break;
                }
                case 240: {
                    n14 = 119;
                    break;
                }
                case 241: {
                    n14 = 30;
                    break;
                }
                case 242: {
                    n14 = 43;
                    break;
                }
                case 243: {
                    n14 = 70;
                    break;
                }
                case 244: {
                    n14 = 200;
                    break;
                }
                case 245: {
                    n14 = 66;
                    break;
                }
                case 246: {
                    n14 = 208;
                    break;
                }
                case 247: {
                    n14 = 173;
                    break;
                }
                case 248: {
                    n14 = 101;
                    break;
                }
                case 249: {
                    n14 = 4;
                    break;
                }
                case 250: {
                    n14 = 154;
                    break;
                }
                case 251: {
                    n14 = 177;
                    break;
                }
                case 252: {
                    n14 = 151;
                    break;
                }
                case 253: {
                    n14 = 95;
                    break;
                }
                case 254: {
                    n14 = 120;
                    break;
                }
                default: {
                    n14 = 89;
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
            _s_0.db[n12] = new String(cArray).intern();
        }
        return db[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2DCB;
        if (fb[n11] == null) {
            _s_0.fb[n11] = (int)(eb[n11] ^ l2);
        }
        return fb[n11];
    }
}

