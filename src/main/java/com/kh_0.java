/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.E6;
import com.P7;
import com.X4;
import com.hi_0;
import com.ks_0;
import com.ky_2;
import com.yn_2;
import com.zS;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Renamed from com.Kh
 */
public class kh_0
implements X4 {
    protected final Class c;
    protected final Enum[] r;
    protected final Enum[] s;
    protected long[] L;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;
    private static final long[] f;
    private static final Long[] g;

    /*
     * Loose catch block
     */
    public kh_0(Class clazz) {
        Object object;
        int n10;
        HashMap<Long, Object> hashMap;
        ky_2[] ky_2Array;
        block64: {
            block49: {
                this.c = clazz;
                ky_2Array = zS.p();
                this.s = (Enum[])clazz.getEnumConstants();
                hashMap = new HashMap<Long, Object>();
                n10 = 0;
                block38: while (true) {
                    int n11 = n10;
                    block39: while (n11 < this.s.length) {
                        block60: {
                            Object object2;
                            int n12;
                            long l2;
                            long l3;
                            Enum enum_;
                            block59: {
                                block58: {
                                    Object object3;
                                    long l4;
                                    block54: {
                                        Object object4;
                                        block51: {
                                            enum_ = this.s[n10];
                                            object4 = enum_.name();
                                            object = null;
                                            try {
                                                String string;
                                                block53: {
                                                    String string2;
                                                    block52: {
                                                        E6 e6;
                                                        block50: {
                                                            Field field = clazz.getField((String)object4);
                                                            object = (E6)B8.f(field, E6.class);
                                                            if (ky_2Array != null) break block49;
                                                            try {
                                                                block65: {
                                                                    e6 = object;
                                                                    if (ky_2Array != null) break block50;
                                                                    break block65;
                                                                    catch (Exception exception) {
                                                                        throw kh_0.a(exception);
                                                                    }
                                                                }
                                                                if (e6 == null) break block51;
                                                            }
                                                            catch (Exception exception) {
                                                                throw kh_0.a(exception);
                                                            }
                                                            e6 = object;
                                                        }
                                                        string2 = e6.W();
                                                        try {
                                                            string = string2;
                                                            if (ky_2Array != null) break block52;
                                                            if (string == null) break block51;
                                                        }
                                                        catch (Exception exception) {
                                                            throw kh_0.a(exception);
                                                        }
                                                        string = string2;
                                                    }
                                                    if (ky_2Array != null) break block53;
                                                    try {
                                                        block66: {
                                                            if (string.length() <= 0) break block51;
                                                            break block66;
                                                            catch (Exception exception) {
                                                                throw kh_0.a(exception);
                                                            }
                                                        }
                                                        string = string2;
                                                    }
                                                    catch (Exception exception) {
                                                        throw kh_0.a(exception);
                                                    }
                                                }
                                                object4 = string;
                                            }
                                            catch (Exception exception) {
                                                // empty catch block
                                            }
                                        }
                                        l3 = kh_0.b(14973, 1051995453224831731L);
                                        l2 = kh_0.b(15275, 1346713791693474598L);
                                        for (int i2 = 0; i2 < ((String)object4).length(); ++i2) {
                                            int n13;
                                            block67: {
                                                block56: {
                                                    int n14;
                                                    int n15;
                                                    block57: {
                                                        block55: {
                                                            n12 = ((String)object4).charAt(i2);
                                                            l3 ^= (long)n12;
                                                            try {
                                                                try {
                                                                    try {
                                                                        l4 = l2;
                                                                        if (ky_2Array != null) break block54;
                                                                        n15 = n12;
                                                                        n14 = kh_0.a(32544, 6176439222498811142L);
                                                                        if (ky_2Array != null) break block55;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw kh_0.a(exception);
                                                                    }
                                                                    if (n15 < n14) break block56;
                                                                }
                                                                catch (Exception exception) {
                                                                    throw kh_0.a(exception);
                                                                }
                                                                n15 = n12;
                                                                n14 = kh_0.a(11905, 8892647733881048235L);
                                                            }
                                                            catch (Exception exception) {
                                                                throw kh_0.a(exception);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (ky_2Array != null) break block57;
                                                                if (n15 > n14) break block56;
                                                            }
                                                            catch (Exception exception) {
                                                                throw kh_0.a(exception);
                                                            }
                                                            n15 = n12;
                                                            n14 = kh_0.a(15661, 151073299620962054L);
                                                        }
                                                        catch (Exception exception) {
                                                            throw kh_0.a(exception);
                                                        }
                                                    }
                                                    n13 = n15 + n14;
                                                    break block67;
                                                }
                                                n13 = n12;
                                            }
                                            l2 = l4 ^ (long)n13;
                                            l3 *= kh_0.b(25575, 5260667354170921835L);
                                            l2 *= kh_0.b(21328, 8123969851176166367L);
                                            if (ky_2Array == null) continue;
                                        }
                                        try {
                                            object3 = hashMap.put(l3, enum_);
                                            if (ky_2Array != null) break block58;
                                            l4 = l3;
                                        }
                                        catch (Exception exception) {
                                            throw kh_0.a(exception);
                                        }
                                    }
                                    try {
                                        if (l4 != l2) {
                                            object3 = hashMap.put(l2, enum_);
                                        }
                                    }
                                    catch (Exception exception) {
                                        throw kh_0.a(exception);
                                    }
                                }
                                try {
                                    object2 = object;
                                    if (ky_2Array != null) break block59;
                                    if (object2 == null) break block60;
                                }
                                catch (Exception exception) {
                                    throw kh_0.a(exception);
                                }
                                object2 = object;
                            }
                            String[] stringArray = object2.X();
                            n12 = stringArray.length;
                            int n16 = 0;
                            while (n16 < n12) {
                                block61: {
                                    block63: {
                                        long l5;
                                        long l6;
                                        block62: {
                                            String string = stringArray[n16];
                                            l6 = kh_0.b(15275, 1346713791693474598L);
                                            n11 = 0;
                                            if (ky_2Array != null) continue block39;
                                            for (int i3 = v3988379; i3 < string.length(); ++i3) {
                                                char c2 = string.charAt(i3);
                                                l6 ^= (long)c2;
                                                l6 *= kh_0.b(21328, 8123969851176166367L);
                                                try {
                                                    if (ky_2Array == null) {
                                                        if (ky_2Array == null) continue;
                                                        break;
                                                    }
                                                    break block61;
                                                }
                                                catch (Exception exception) {
                                                    throw kh_0.a(exception);
                                                }
                                            }
                                            try {
                                                try {
                                                    l5 = l6 == l3 ? 0 : (l6 < l3 ? -1 : 1);
                                                    if (ky_2Array != null) break block62;
                                                    if (l5 == false) break block63;
                                                }
                                                catch (Exception exception) {
                                                    throw kh_0.a(exception);
                                                }
                                                l5 = l6 == l2 ? 0 : (l6 < l2 ? -1 : 1);
                                            }
                                            catch (Exception exception) {
                                                throw kh_0.a(exception);
                                            }
                                        }
                                        try {
                                            if (l5 != false) {
                                                hashMap.put(l6, enum_);
                                            }
                                        }
                                        catch (Exception exception) {
                                            throw kh_0.a(exception);
                                        }
                                    }
                                    ++n16;
                                }
                                if (ky_2Array == null) continue;
                            }
                        }
                        ++n10;
                        if (ky_2Array == null) continue block38;
                    }
                    break;
                }
                this.L = new long[hashMap.size()];
                n10 = 0;
            }
            for (Object object4 : hashMap.keySet()) {
                try {
                    this.L[n10++] = (Long)object4;
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block64;
                }
                catch (Exception exception) {
                    throw kh_0.a(exception);
                }
            }
            Arrays.sort(this.L);
            this.r = new Enum[this.L.length];
        }
        for (n10 = 0; n10 < this.L.length; ++n10) {
            long l7 = this.L[n10];
            this.r[n10] = object = (Enum)hashMap.get(l7);
            if (ky_2Array == null) continue;
        }
    }

    public Enum f(long l2) {
        kh_0 kh_02;
        block7: {
            block8: {
                ky_2[] ky_2Array = zS.p();
                try {
                    try {
                        kh_02 = this;
                        if (ky_2Array != null) break block7;
                        if (kh_02.r != null) break block8;
                    }
                    catch (hi_0 hi_02) {
                        throw kh_0.a(hi_02);
                    }
                    return null;
                }
                catch (hi_0 hi_03) {
                    throw kh_0.a(hi_03);
                }
            }
            kh_02 = this;
        }
        int n10 = Arrays.binarySearch(kh_02.L, l2);
        try {
            if (n10 < 0) {
                return null;
            }
        }
        catch (hi_0 hi_04) {
            throw kh_0.a(hi_04);
        }
        return this.r[n10];
    }

    public Enum Z(int n10) {
        return this.s[n10];
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        ky_2[] ky_2Array = zS.p();
        try {
            int n10;
            int n11;
            P7 p7;
            block35: {
                int n12;
                block36: {
                    Enum enum_;
                    Enum enum_2;
                    block42: {
                        String string;
                        block47: {
                            block40: {
                                block41: {
                                    block32: {
                                        block33: {
                                            int n13;
                                            int n14;
                                            block34: {
                                                p7 = yn_22.N;
                                                n12 = p7.P();
                                                try {
                                                    n11 = n12;
                                                    n10 = 2;
                                                    if (ky_2Array != null) break block32;
                                                    if (n11 != n10) break block33;
                                                }
                                                catch (hi_0 hi_02) {
                                                    throw kh_0.a(hi_02);
                                                }
                                                n14 = p7.G();
                                                try {
                                                    p7.S(kh_0.a(20914, 6352386745146536859L));
                                                    n13 = n14;
                                                    if (ky_2Array != null) break block34;
                                                    if (n13 < 0) throw new hi_0(kh_0.a(-27, -29256) + this.c.getName() + kh_0.a(-31, -12347) + n14);
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw kh_0.a(hi_03);
                                                }
                                                n13 = n14;
                                            }
                                            try {
                                                if (n13 < this.s.length) return this.s[n14];
                                                throw new hi_0(kh_0.a(-27, -29256) + this.c.getName() + kh_0.a(-31, -12347) + n14);
                                            }
                                            catch (hi_0 hi_04) {
                                                throw kh_0.a(hi_04);
                                            }
                                        }
                                        n11 = n12;
                                        n10 = 4;
                                    }
                                    try {
                                        if (ky_2Array != null) break block35;
                                        if (n11 != n10) break block36;
                                    }
                                    catch (hi_0 hi_05) {
                                        throw kh_0.a(hi_05);
                                    }
                                    string = p7.z();
                                    p7.S(kh_0.a(10808, 952191310857177104L));
                                    if (string.length() == 0) {
                                        return null;
                                    }
                                    long l2 = kh_0.b(15275, 1346713791693474598L);
                                    long l3 = kh_0.b(15275, 1346713791693474598L);
                                    for (int i2 = 0; i2 < string.length(); ++i2) {
                                        int n15;
                                        long l4;
                                        block45: {
                                            int n16;
                                            block38: {
                                                int n17;
                                                int n18;
                                                block39: {
                                                    block37: {
                                                        n16 = string.charAt(i2);
                                                        l2 ^= (long)n16;
                                                        l4 = l3;
                                                        n18 = n16;
                                                        n17 = kh_0.a(23692, 1100971277268319907L);
                                                        if (ky_2Array != null) break block37;
                                                        try {
                                                            block43: {
                                                                if (n18 < n17) break block38;
                                                                break block43;
                                                                catch (hi_0 hi_06) {
                                                                    throw kh_0.a(hi_06);
                                                                }
                                                            }
                                                            n18 = n16;
                                                            n17 = kh_0.a(12071, 2529419186983701770L);
                                                        }
                                                        catch (hi_0 hi_07) {
                                                            throw kh_0.a(hi_07);
                                                        }
                                                    }
                                                    if (ky_2Array != null) break block39;
                                                    try {
                                                        block44: {
                                                            if (n18 > n17) break block38;
                                                            break block44;
                                                            catch (hi_0 hi_08) {
                                                                throw kh_0.a(hi_08);
                                                            }
                                                        }
                                                        n18 = n16;
                                                        n17 = kh_0.a(9565, 1752709638861850481L);
                                                    }
                                                    catch (hi_0 hi_09) {
                                                        throw kh_0.a(hi_09);
                                                    }
                                                }
                                                n15 = n18 + n17;
                                                break block45;
                                            }
                                            n15 = n16;
                                        }
                                        l3 = l4 ^ (long)n15;
                                        l2 *= kh_0.b(21328, 8123969851176166367L);
                                        l3 *= kh_0.b(21328, 8123969851176166367L);
                                        if (ky_2Array == null) continue;
                                    }
                                    enum_2 = this.f(l2);
                                    enum_ = enum_2;
                                    if (ky_2Array != null) break block40;
                                    try {
                                        block46: {
                                            if (enum_ != null) break block41;
                                            break block46;
                                            catch (hi_0 hi_010) {
                                                throw kh_0.a(hi_010);
                                            }
                                        }
                                        if (l3 == l2) break block41;
                                    }
                                    catch (hi_0 hi_011) {
                                        throw kh_0.a(hi_011);
                                    }
                                    enum_2 = this.f(l3);
                                }
                                enum_ = enum_2;
                            }
                            if (ky_2Array != null) return enum_;
                            if (enum_ != null) break block42;
                            break block47;
                            catch (hi_0 hi_012) {
                                throw kh_0.a(hi_012);
                            }
                        }
                        try {
                            if (!p7.w(ks_0.ErrorOnEnumNotMatch)) break block42;
                            throw new hi_0(kh_0.a(-29, 12971) + this.c.getName() + kh_0.a(-32, 29138) + string);
                            catch (hi_0 hi_013) {
                                throw kh_0.a(hi_013);
                            }
                        }
                        catch (hi_0 hi_014) {
                            throw kh_0.a(hi_014);
                        }
                    }
                    enum_ = enum_2;
                    return enum_;
                }
                n11 = n12;
                n10 = kh_0.a(8403, 8354539897635504893L);
            }
            if (n11 == n10) {
                Object var5_14 = null;
                p7.S(kh_0.a(10808, 952191310857177104L));
                return null;
            }
            Object object2 = yn_22.M();
            throw new hi_0(kh_0.a(-28, 19170) + this.c.getName() + kh_0.a(-30, 26328) + object2);
        }
        catch (hi_0 hi_015) {
            throw hi_015;
        }
        catch (Exception exception) {
            throw new hi_0(exception.getMessage(), exception);
        }
    }

    @Override
    public int j() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
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
                                var21 = new String[6];
                                var19_1 = 0;
                                var18_2 = "aa\u00f7>i\u00e95G\u000b \u001c\u00f8gRy<\u0003)\u00c1\u00ac\u0016\u00c1\nbJ\u001fl\u00e1\u00c5\u00dc\u001a2\u00cd\u009a\u00c1\u00ce\u00fc\u0011\u00e2\u00de\u00b8\u009a\u0098\u0010l\u00e8V\u000f]\u00cf\u00b3\u0083\u00db\u00b8\u0006\u00eb$0\u0011p";
                                var20_3 = "aa\u00f7>i\u00e95G\u000b \u001c\u00f8gRy<\u0003)\u00c1\u00ac\u0016\u00c1\nbJ\u001fl\u00e1\u00c5\u00dc\u001a2\u00cd\u009a\u00c1\u00ce\u00fc\u0011\u00e2\u00de\u00b8\u009a\u0098\u0010l\u00e8V\u000f]\u00cf\u00b3\u0083\u00db\u00b8\u0006\u00eb$0\u0011p".length();
                                var17_4 = 16;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 99;
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
                                    var18_2 = "\u00f3\u00de\u00e4W\u001a\u00acB\u00a2\u009d\f\u00fa\u000b\u00a0\u009a\u008e\u00dfW\u00bd\u00eb\u0080\u00a8H\\";
                                    var20_3 = "\u00f3\u00de\u00e4W\u001a\u00acB\u00a2\u009d\f\u00fa\u000b\u00a0\u009a\u008e\u00dfW\u00bd\u00eb\u0080\u00a8H\\".length();
                                    var17_4 = 11;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 123;
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
                                            v15 = 37;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 118;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 38;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 104;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 15;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 98;
                                            break;
                                        }
                                        default: {
                                            v15 = 88;
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
                        kh_0.a = var21;
                        kh_0.b = new String[6];
                        var8_7 = 5833292136850142918L;
                        var14_8 = new long[9];
                        var11_9 = 0;
                        var12_10 = "\u00ed\u00b3s\u0080\u0014l\u00b4397l?\u00f9tH$\u0015\u00a1r\u00ad\u0082\u00cb\u00b1\u00972\u00c9\u00d1o\u00b80\u00bb\u0096\u00ba\u0016\u00d7\u00c9r\u00a1\u00ba7\u009a\u008a\u0093\u00ddN\u00fc)\u00e0k\u0004OW\u0011\u00d3>\u00c6";
                        var13_11 = "\u00ed\u00b3s\u0080\u0014l\u00b4397l?\u00f9tH$\u0015\u00a1r\u00ad\u0082\u00cb\u00b1\u00972\u00c9\u00d1o\u00b80\u00bb\u0096\u00ba\u0016\u00d7\u00c9r\u00a1\u00ba7\u009a\u008a\u0093\u00ddN\u00fc)\u00e0k\u0004OW\u0011\u00d3>\u00c6".length();
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
                            var12_10 = "`\u00c3@\u00f8DS\u00c5M\f\u0083\u00ed\u0082q\u00dc\u00eb\u0081";
                            var13_11 = "`\u00c3@\u00f8DS\u00c5M\f\u0083\u00ed\u0082q\u00dc\u00eb\u0081".length();
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
                kh_0.d = var14_8;
                kh_0.e = new Integer[9];
                var0_14 = 912951862825067383L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "|\u0015Vh\u00a1\u00ee\u0081\u001b\u00c9\u00c0\u0098O\"P\u00ca\u00a1";
                var5_18 = "|\u0015Vh\u00a1\u00ee\u0081\u001b\u00c9\u00c0\u0098O\"P\u00ca\u00a1".length();
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
                    var4_17 = "\u00d5\u00e9\u0095\u000b\u00ac\u0098KtE\u00aa\u00d0\u00f7\u00c6b1\u00af";
                    var5_18 = "\u00d5\u00e9\u0095\u000b\u00ac\u0098KtE\u00aa\u00d0\u00f7\u00c6b1\u00af".length();
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
        kh_0.f = var6_15;
        kh_0.g = new Long[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFFFE1) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 103;
                    break;
                }
                case 1: {
                    n14 = 80;
                    break;
                }
                case 2: {
                    n14 = 67;
                    break;
                }
                case 3: {
                    n14 = 61;
                    break;
                }
                case 4: {
                    n14 = 247;
                    break;
                }
                case 5: {
                    n14 = 149;
                    break;
                }
                case 6: {
                    n14 = 140;
                    break;
                }
                case 7: {
                    n14 = 198;
                    break;
                }
                case 8: {
                    n14 = 166;
                    break;
                }
                case 9: {
                    n14 = 147;
                    break;
                }
                case 10: {
                    n14 = 83;
                    break;
                }
                case 11: {
                    n14 = 132;
                    break;
                }
                case 12: {
                    n14 = 104;
                    break;
                }
                case 13: {
                    n14 = 31;
                    break;
                }
                case 14: {
                    n14 = 10;
                    break;
                }
                case 15: {
                    n14 = 55;
                    break;
                }
                case 16: {
                    n14 = 39;
                    break;
                }
                case 17: {
                    n14 = 218;
                    break;
                }
                case 18: {
                    n14 = 7;
                    break;
                }
                case 19: {
                    n14 = 65;
                    break;
                }
                case 20: {
                    n14 = 114;
                    break;
                }
                case 21: {
                    n14 = 54;
                    break;
                }
                case 22: {
                    n14 = 204;
                    break;
                }
                case 23: {
                    n14 = 245;
                    break;
                }
                case 24: {
                    n14 = 228;
                    break;
                }
                case 25: {
                    n14 = 199;
                    break;
                }
                case 26: {
                    n14 = 229;
                    break;
                }
                case 27: {
                    n14 = 85;
                    break;
                }
                case 28: {
                    n14 = 187;
                    break;
                }
                case 29: {
                    n14 = 152;
                    break;
                }
                case 30: {
                    n14 = 239;
                    break;
                }
                case 31: {
                    n14 = 34;
                    break;
                }
                case 32: {
                    n14 = 121;
                    break;
                }
                case 33: {
                    n14 = 88;
                    break;
                }
                case 34: {
                    n14 = 99;
                    break;
                }
                case 35: {
                    n14 = 181;
                    break;
                }
                case 36: {
                    n14 = 211;
                    break;
                }
                case 37: {
                    n14 = 73;
                    break;
                }
                case 38: {
                    n14 = 6;
                    break;
                }
                case 39: {
                    n14 = 190;
                    break;
                }
                case 40: {
                    n14 = 148;
                    break;
                }
                case 41: {
                    n14 = 53;
                    break;
                }
                case 42: {
                    n14 = 206;
                    break;
                }
                case 43: {
                    n14 = 129;
                    break;
                }
                case 44: {
                    n14 = 18;
                    break;
                }
                case 45: {
                    n14 = 29;
                    break;
                }
                case 46: {
                    n14 = 122;
                    break;
                }
                case 47: {
                    n14 = 64;
                    break;
                }
                case 48: {
                    n14 = 23;
                    break;
                }
                case 49: {
                    n14 = 221;
                    break;
                }
                case 50: {
                    n14 = 196;
                    break;
                }
                case 51: {
                    n14 = 58;
                    break;
                }
                case 52: {
                    n14 = 156;
                    break;
                }
                case 53: {
                    n14 = 37;
                    break;
                }
                case 54: {
                    n14 = 234;
                    break;
                }
                case 55: {
                    n14 = 79;
                    break;
                }
                case 56: {
                    n14 = 226;
                    break;
                }
                case 57: {
                    n14 = 5;
                    break;
                }
                case 58: {
                    n14 = 102;
                    break;
                }
                case 59: {
                    n14 = 138;
                    break;
                }
                case 60: {
                    n14 = 185;
                    break;
                }
                case 61: {
                    n14 = 217;
                    break;
                }
                case 62: {
                    n14 = 233;
                    break;
                }
                case 63: {
                    n14 = 146;
                    break;
                }
                case 64: {
                    n14 = 101;
                    break;
                }
                case 65: {
                    n14 = 118;
                    break;
                }
                case 66: {
                    n14 = 110;
                    break;
                }
                case 67: {
                    n14 = 174;
                    break;
                }
                case 68: {
                    n14 = 232;
                    break;
                }
                case 69: {
                    n14 = 197;
                    break;
                }
                case 70: {
                    n14 = 145;
                    break;
                }
                case 71: {
                    n14 = 52;
                    break;
                }
                case 72: {
                    n14 = 76;
                    break;
                }
                case 73: {
                    n14 = 130;
                    break;
                }
                case 74: {
                    n14 = 22;
                    break;
                }
                case 75: {
                    n14 = 135;
                    break;
                }
                case 76: {
                    n14 = 41;
                    break;
                }
                case 77: {
                    n14 = 220;
                    break;
                }
                case 78: {
                    n14 = 68;
                    break;
                }
                case 79: {
                    n14 = 143;
                    break;
                }
                case 80: {
                    n14 = 96;
                    break;
                }
                case 81: {
                    n14 = 20;
                    break;
                }
                case 82: {
                    n14 = 97;
                    break;
                }
                case 83: {
                    n14 = 163;
                    break;
                }
                case 84: {
                    n14 = 167;
                    break;
                }
                case 85: {
                    n14 = 231;
                    break;
                }
                case 86: {
                    n14 = 124;
                    break;
                }
                case 87: {
                    n14 = 155;
                    break;
                }
                case 88: {
                    n14 = 227;
                    break;
                }
                case 89: {
                    n14 = 105;
                    break;
                }
                case 90: {
                    n14 = 120;
                    break;
                }
                case 91: {
                    n14 = 248;
                    break;
                }
                case 92: {
                    n14 = 193;
                    break;
                }
                case 93: {
                    n14 = 240;
                    break;
                }
                case 94: {
                    n14 = 238;
                    break;
                }
                case 95: {
                    n14 = 209;
                    break;
                }
                case 96: {
                    n14 = 87;
                    break;
                }
                case 97: {
                    n14 = 161;
                    break;
                }
                case 98: {
                    n14 = 183;
                    break;
                }
                case 99: {
                    n14 = 77;
                    break;
                }
                case 100: {
                    n14 = 111;
                    break;
                }
                case 101: {
                    n14 = 205;
                    break;
                }
                case 102: {
                    n14 = 202;
                    break;
                }
                case 103: {
                    n14 = 50;
                    break;
                }
                case 104: {
                    n14 = 134;
                    break;
                }
                case 105: {
                    n14 = 127;
                    break;
                }
                case 106: {
                    n14 = 188;
                    break;
                }
                case 107: {
                    n14 = 62;
                    break;
                }
                case 108: {
                    n14 = 222;
                    break;
                }
                case 109: {
                    n14 = 56;
                    break;
                }
                case 110: {
                    n14 = 108;
                    break;
                }
                case 111: {
                    n14 = 131;
                    break;
                }
                case 112: {
                    n14 = 42;
                    break;
                }
                case 113: {
                    n14 = 106;
                    break;
                }
                case 114: {
                    n14 = 216;
                    break;
                }
                case 115: {
                    n14 = 212;
                    break;
                }
                case 116: {
                    n14 = 159;
                    break;
                }
                case 117: {
                    n14 = 165;
                    break;
                }
                case 118: {
                    n14 = 244;
                    break;
                }
                case 119: {
                    n14 = 40;
                    break;
                }
                case 120: {
                    n14 = 249;
                    break;
                }
                case 121: {
                    n14 = 4;
                    break;
                }
                case 122: {
                    n14 = 38;
                    break;
                }
                case 123: {
                    n14 = 95;
                    break;
                }
                case 124: {
                    n14 = 98;
                    break;
                }
                case 125: {
                    n14 = 141;
                    break;
                }
                case 126: {
                    n14 = 154;
                    break;
                }
                case 127: {
                    n14 = 13;
                    break;
                }
                case 128: {
                    n14 = 139;
                    break;
                }
                case 129: {
                    n14 = 15;
                    break;
                }
                case 130: {
                    n14 = 89;
                    break;
                }
                case 131: {
                    n14 = 207;
                    break;
                }
                case 132: {
                    n14 = 2;
                    break;
                }
                case 133: {
                    n14 = 164;
                    break;
                }
                case 134: {
                    n14 = 9;
                    break;
                }
                case 135: {
                    n14 = 194;
                    break;
                }
                case 136: {
                    n14 = 237;
                    break;
                }
                case 137: {
                    n14 = 113;
                    break;
                }
                case 138: {
                    n14 = 169;
                    break;
                }
                case 139: {
                    n14 = 250;
                    break;
                }
                case 140: {
                    n14 = 158;
                    break;
                }
                case 141: {
                    n14 = 191;
                    break;
                }
                case 142: {
                    n14 = 123;
                    break;
                }
                case 143: {
                    n14 = 175;
                    break;
                }
                case 144: {
                    n14 = 176;
                    break;
                }
                case 145: {
                    n14 = 255;
                    break;
                }
                case 146: {
                    n14 = 57;
                    break;
                }
                case 147: {
                    n14 = 1;
                    break;
                }
                case 148: {
                    n14 = 203;
                    break;
                }
                case 149: {
                    n14 = 150;
                    break;
                }
                case 150: {
                    n14 = 24;
                    break;
                }
                case 151: {
                    n14 = 195;
                    break;
                }
                case 152: {
                    n14 = 28;
                    break;
                }
                case 153: {
                    n14 = 35;
                    break;
                }
                case 154: {
                    n14 = 11;
                    break;
                }
                case 155: {
                    n14 = 179;
                    break;
                }
                case 156: {
                    n14 = 214;
                    break;
                }
                case 157: {
                    n14 = 115;
                    break;
                }
                case 158: {
                    n14 = 78;
                    break;
                }
                case 159: {
                    n14 = 91;
                    break;
                }
                case 160: {
                    n14 = 223;
                    break;
                }
                case 161: {
                    n14 = 93;
                    break;
                }
                case 162: {
                    n14 = 215;
                    break;
                }
                case 163: {
                    n14 = 60;
                    break;
                }
                case 164: {
                    n14 = 235;
                    break;
                }
                case 165: {
                    n14 = 142;
                    break;
                }
                case 166: {
                    n14 = 16;
                    break;
                }
                case 167: {
                    n14 = 153;
                    break;
                }
                case 168: {
                    n14 = 186;
                    break;
                }
                case 169: {
                    n14 = 246;
                    break;
                }
                case 170: {
                    n14 = 242;
                    break;
                }
                case 171: {
                    n14 = 45;
                    break;
                }
                case 172: {
                    n14 = 252;
                    break;
                }
                case 173: {
                    n14 = 219;
                    break;
                }
                case 174: {
                    n14 = 157;
                    break;
                }
                case 175: {
                    n14 = 125;
                    break;
                }
                case 176: {
                    n14 = 225;
                    break;
                }
                case 177: {
                    n14 = 100;
                    break;
                }
                case 178: {
                    n14 = 0;
                    break;
                }
                case 179: {
                    n14 = 119;
                    break;
                }
                case 180: {
                    n14 = 151;
                    break;
                }
                case 181: {
                    n14 = 112;
                    break;
                }
                case 182: {
                    n14 = 44;
                    break;
                }
                case 183: {
                    n14 = 253;
                    break;
                }
                case 184: {
                    n14 = 47;
                    break;
                }
                case 185: {
                    n14 = 21;
                    break;
                }
                case 186: {
                    n14 = 70;
                    break;
                }
                case 187: {
                    n14 = 90;
                    break;
                }
                case 188: {
                    n14 = 168;
                    break;
                }
                case 189: {
                    n14 = 173;
                    break;
                }
                case 190: {
                    n14 = 171;
                    break;
                }
                case 191: {
                    n14 = 184;
                    break;
                }
                case 192: {
                    n14 = 210;
                    break;
                }
                case 193: {
                    n14 = 126;
                    break;
                }
                case 194: {
                    n14 = 107;
                    break;
                }
                case 195: {
                    n14 = 117;
                    break;
                }
                case 196: {
                    n14 = 30;
                    break;
                }
                case 197: {
                    n14 = 251;
                    break;
                }
                case 198: {
                    n14 = 71;
                    break;
                }
                case 199: {
                    n14 = 201;
                    break;
                }
                case 200: {
                    n14 = 36;
                    break;
                }
                case 201: {
                    n14 = 19;
                    break;
                }
                case 202: {
                    n14 = 189;
                    break;
                }
                case 203: {
                    n14 = 254;
                    break;
                }
                case 204: {
                    n14 = 208;
                    break;
                }
                case 205: {
                    n14 = 213;
                    break;
                }
                case 206: {
                    n14 = 26;
                    break;
                }
                case 207: {
                    n14 = 236;
                    break;
                }
                case 208: {
                    n14 = 94;
                    break;
                }
                case 209: {
                    n14 = 74;
                    break;
                }
                case 210: {
                    n14 = 172;
                    break;
                }
                case 211: {
                    n14 = 182;
                    break;
                }
                case 212: {
                    n14 = 92;
                    break;
                }
                case 213: {
                    n14 = 109;
                    break;
                }
                case 214: {
                    n14 = 14;
                    break;
                }
                case 215: {
                    n14 = 48;
                    break;
                }
                case 216: {
                    n14 = 86;
                    break;
                }
                case 217: {
                    n14 = 81;
                    break;
                }
                case 218: {
                    n14 = 33;
                    break;
                }
                case 219: {
                    n14 = 230;
                    break;
                }
                case 220: {
                    n14 = 32;
                    break;
                }
                case 221: {
                    n14 = 49;
                    break;
                }
                case 222: {
                    n14 = 133;
                    break;
                }
                case 223: {
                    n14 = 8;
                    break;
                }
                case 224: {
                    n14 = 243;
                    break;
                }
                case 225: {
                    n14 = 162;
                    break;
                }
                case 226: {
                    n14 = 160;
                    break;
                }
                case 227: {
                    n14 = 137;
                    break;
                }
                case 228: {
                    n14 = 116;
                    break;
                }
                case 229: {
                    n14 = 241;
                    break;
                }
                case 230: {
                    n14 = 27;
                    break;
                }
                case 231: {
                    n14 = 177;
                    break;
                }
                case 232: {
                    n14 = 51;
                    break;
                }
                case 233: {
                    n14 = 200;
                    break;
                }
                case 234: {
                    n14 = 66;
                    break;
                }
                case 235: {
                    n14 = 75;
                    break;
                }
                case 236: {
                    n14 = 144;
                    break;
                }
                case 237: {
                    n14 = 170;
                    break;
                }
                case 238: {
                    n14 = 12;
                    break;
                }
                case 239: {
                    n14 = 17;
                    break;
                }
                case 240: {
                    n14 = 224;
                    break;
                }
                case 241: {
                    n14 = 25;
                    break;
                }
                case 242: {
                    n14 = 178;
                    break;
                }
                case 243: {
                    n14 = 136;
                    break;
                }
                case 244: {
                    n14 = 43;
                    break;
                }
                case 245: {
                    n14 = 72;
                    break;
                }
                case 246: {
                    n14 = 128;
                    break;
                }
                case 247: {
                    n14 = 192;
                    break;
                }
                case 248: {
                    n14 = 69;
                    break;
                }
                case 249: {
                    n14 = 63;
                    break;
                }
                case 250: {
                    n14 = 180;
                    break;
                }
                case 251: {
                    n14 = 3;
                    break;
                }
                case 252: {
                    n14 = 82;
                    break;
                }
                case 253: {
                    n14 = 46;
                    break;
                }
                case 254: {
                    n14 = 84;
                    break;
                }
                default: {
                    n14 = 59;
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
            kh_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x222E;
        if (e[n11] == null) {
            kh_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x708F) & Short.MAX_VALUE;
        if (g[n11] == null) {
            kh_0.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

