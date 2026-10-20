/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KB;
import com.sd_0;
import com.ww_2;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.j
 */
public class j_0
implements Iterable,
CharSequence {
    public static final j_0 a;
    private final char[] i;
    private final int J;
    private final int o;
    static final boolean T;
    private static boolean E;
    private static final String[] b;
    private static final String[] c;
    private static final long d;

    public j_0(@NotNull char[] cArray, int n10, int n11) {
        if (n10 + n11 > cArray.length) {
            throw new IllegalArgumentException(String.format(j_0.a(-28406, 22015), n10, n11, cArray.length));
        }
        try {
            this.i = cArray;
            this.J = n10;
            this.o = n11;
            if (this.o < 0) {
                throw new IllegalStateException(j_0.a(-28407, 28565) + this.o);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw j_0.a(illegalArgumentException);
        }
        try {
            if (this.J < 0) {
                throw new IllegalStateException(j_0.a(-28405, 17404) + this.J);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw j_0.a(illegalArgumentException);
        }
        try {
            if (this.J + this.o > this.i.length) {
                throw new IllegalStateException(String.format(j_0.a(-28408, -8636), this.J, this.o, this.i.length));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw j_0.a(illegalArgumentException);
        }
    }

    public j_0(char c2, int n10) {
        block6: {
            block7: {
                this(new char[n10], 0, n10);
                boolean bl = j_0.g();
                try {
                    try {
                        try {
                            if (!bl) break block6;
                            if (T) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw j_0.a(illegalArgumentException);
                        }
                        if (!sd_0.U(c2, false)) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw j_0.a(illegalArgumentException);
                    }
                    throw new AssertionError();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw j_0.a(illegalArgumentException);
                }
            }
            Arrays.fill(this.i, c2);
        }
    }

    public j_0(@NotNull String string) {
        this(string.toCharArray(), 0, string.length());
    }

    public Iterator iterator() {
        return new ww_2(this);
    }

    public char[] r() {
        return this.i;
    }

    public int o() {
        return this.J;
    }

    public j_0 Y(int n10, int n11) {
        return new j_0(this.i, this.o() + n10, n11);
    }

    public j_0 D(KB kB) {
        return new j_0(this.i, this.o() + (Integer)kB.X, (Integer)kB.S - (Integer)kB.X);
    }

    public boolean Y() {
        char c2;
        block8: {
            block7: {
                boolean bl;
                block6: {
                    bl = j_0.g();
                    try {
                        try {
                            c2 = this.o;
                            if (!bl) break block6;
                            if (c2 <= '\u0000') break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw j_0.a(illegalArgumentException);
                        }
                        c2 = this.i[0];
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw j_0.a(illegalArgumentException);
                    }
                }
                try {
                    if (!bl) break block8;
                    if (c2 != '\u0000') break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw j_0.a(illegalArgumentException);
                }
                c2 = '\u0001';
                break block8;
            }
            c2 = '\u0000';
        }
        return c2 != '\u0000';
    }

    public void D() {
        Arrays.fill(this.i, (char)d);
    }

    @Override
    public int length() {
        return this.o;
    }

    @Override
    public char charAt(int n10) {
        return this.i[this.J + n10];
    }

    @Override
    public CharSequence subSequence(int n10, int n11) {
        return new j_0(this.i, this.J + n10, n11 - n10);
    }

    @Override
    public String toString() {
        return new String(this.i, this.J, this.o);
    }

    public j_0 q() {
        char[] cArray = Arrays.copyOfRange(this.i, this.J, this.J + this.o);
        return new j_0(cArray, 0, this.o);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.q();
    }

    static int C(j_0 j_02) {
        return j_02.J;
    }

    static char[] j(j_0 j_02) {
        return j_02.i;
    }

    static int a(j_0 j_02) {
        return j_02.o;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    var7 = new String[4];
                    var5_1 = 0;
                    var4_2 = "z\u0007\u00f8\u008a\u00ae\u00ac6\u00d2\u00c2q\u00a3sD\u0081\u00ed\u00a2\u008b\u00ba\u00ea\u00de\u00b5w\u0082\b\u0091\f;d\u0018Zp5\n\u00bc\u00bf\u00aeS\\y\u007f\u00f0\u001a\u008e}\u00d9\u00ad\u00d5\u0014\u00de\u0017\u00f7 8\u00ea\u00a6{\u0006\b\u00c4\u00ecew\u00edYX\u00a9%\u00e5";
                    var6_3 = "z\u0007\u00f8\u008a\u00ae\u00ac6\u00d2\u00c2q\u00a3sD\u0081\u00ed\u00a2\u008b\u00ba\u00ea\u00de\u00b5w\u0082\b\u0091\f;d\u0018Zp5\n\u00bc\u00bf\u00aeS\\y\u007f\u00f0\u001a\u008e}\u00d9\u00ad\u00d5\u0014\u00de\u0017\u00f7 8\u00ea\u00a6{\u0006\b\u00c4\u00ecew\u00edYX\u00a9%\u00e5".length();
                    var3_4 = 41;
                    var2_5 = -1;
                    j_0.q(true);
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 89;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block22;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u00af[\u0082:\u00faR\u0003$\u00c7j\t\u009e\u00da\u00bb\u0006 %\u0004V\u00ee\u00cd\u0085K\"\u008c@l*\u008b\u001dC}\n\u00e1\u0082.\u0081W\u0007E\u0000cU\u00ff\u00f1\u00f2\u0010\u00f5\u000f\u00c0a\bFJ\u00e1\u00c2\u0081\u00f5";
                        var6_3 = "\u00af[\u0082:\u00faR\u0003$\u00c7j\t\u009e\u00da\u00bb\u0006 %\u0004V\u00ee\u00cd\u0085K\"\u008c@l*\u008b\u001dC}\n\u00e1\u0082.\u0081W\u0007E\u0000cU\u00ff\u00f1\u00f2\u0010\u00f5\u000f\u00c0a\bFJ\u00e1\u00c2\u0081\u00f5".length();
                        var3_4 = 23;
                        var2_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 50;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block23;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 7;
                                break;
                            }
                            case 1: {
                                v15 = 55;
                                break;
                            }
                            case 2: {
                                v15 = 49;
                                break;
                            }
                            case 3: {
                                v15 = 56;
                                break;
                            }
                            case 4: {
                                v15 = 109;
                                break;
                            }
                            case 5: {
                                v15 = 55;
                                break;
                            }
                            default: {
                                v15 = 97;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            j_0.b = var7;
            j_0.c = new String[4];
            break block24;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4027509595015547950L;
        ** while (true)
        j_0.d = -3335017300492219378L ^ var0_7;
        try {
            v17 = j_0.class.desiredAssertionStatus() == false;
        }
        catch (IllegalArgumentException v18) {
            throw j_0.a(v18);
        }
        j_0.T = v17;
        j_0.a = new j_0(new char[0], 0, 0);
    }

    public static void q(boolean bl) {
        E = bl;
    }

    public static boolean g() {
        return E;
    }

    public static boolean P() {
        boolean bl = j_0.g();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw j_0.a(illegalArgumentException);
        }
        return false;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9108) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 97;
                    break;
                }
                case 1: {
                    n14 = 0;
                    break;
                }
                case 2: {
                    n14 = 52;
                    break;
                }
                case 3: {
                    n14 = 80;
                    break;
                }
                case 4: {
                    n14 = 68;
                    break;
                }
                case 5: {
                    n14 = 234;
                    break;
                }
                case 6: {
                    n14 = 186;
                    break;
                }
                case 7: {
                    n14 = 214;
                    break;
                }
                case 8: {
                    n14 = 71;
                    break;
                }
                case 9: {
                    n14 = 118;
                    break;
                }
                case 10: {
                    n14 = 137;
                    break;
                }
                case 11: {
                    n14 = 103;
                    break;
                }
                case 12: {
                    n14 = 133;
                    break;
                }
                case 13: {
                    n14 = 27;
                    break;
                }
                case 14: {
                    n14 = 93;
                    break;
                }
                case 15: {
                    n14 = 152;
                    break;
                }
                case 16: {
                    n14 = 227;
                    break;
                }
                case 17: {
                    n14 = 160;
                    break;
                }
                case 18: {
                    n14 = 199;
                    break;
                }
                case 19: {
                    n14 = 159;
                    break;
                }
                case 20: {
                    n14 = 70;
                    break;
                }
                case 21: {
                    n14 = 46;
                    break;
                }
                case 22: {
                    n14 = 170;
                    break;
                }
                case 23: {
                    n14 = 77;
                    break;
                }
                case 24: {
                    n14 = 254;
                    break;
                }
                case 25: {
                    n14 = 87;
                    break;
                }
                case 26: {
                    n14 = 149;
                    break;
                }
                case 27: {
                    n14 = 128;
                    break;
                }
                case 28: {
                    n14 = 114;
                    break;
                }
                case 29: {
                    n14 = 188;
                    break;
                }
                case 30: {
                    n14 = 166;
                    break;
                }
                case 31: {
                    n14 = 217;
                    break;
                }
                case 32: {
                    n14 = 146;
                    break;
                }
                case 33: {
                    n14 = 81;
                    break;
                }
                case 34: {
                    n14 = 242;
                    break;
                }
                case 35: {
                    n14 = 201;
                    break;
                }
                case 36: {
                    n14 = 215;
                    break;
                }
                case 37: {
                    n14 = 58;
                    break;
                }
                case 38: {
                    n14 = 220;
                    break;
                }
                case 39: {
                    n14 = 89;
                    break;
                }
                case 40: {
                    n14 = 74;
                    break;
                }
                case 41: {
                    n14 = 142;
                    break;
                }
                case 42: {
                    n14 = 43;
                    break;
                }
                case 43: {
                    n14 = 157;
                    break;
                }
                case 44: {
                    n14 = 84;
                    break;
                }
                case 45: {
                    n14 = 198;
                    break;
                }
                case 46: {
                    n14 = 189;
                    break;
                }
                case 47: {
                    n14 = 79;
                    break;
                }
                case 48: {
                    n14 = 123;
                    break;
                }
                case 49: {
                    n14 = 99;
                    break;
                }
                case 50: {
                    n14 = 208;
                    break;
                }
                case 51: {
                    n14 = 126;
                    break;
                }
                case 52: {
                    n14 = 235;
                    break;
                }
                case 53: {
                    n14 = 197;
                    break;
                }
                case 54: {
                    n14 = 147;
                    break;
                }
                case 55: {
                    n14 = 141;
                    break;
                }
                case 56: {
                    n14 = 165;
                    break;
                }
                case 57: {
                    n14 = 162;
                    break;
                }
                case 58: {
                    n14 = 161;
                    break;
                }
                case 59: {
                    n14 = 202;
                    break;
                }
                case 60: {
                    n14 = 236;
                    break;
                }
                case 61: {
                    n14 = 119;
                    break;
                }
                case 62: {
                    n14 = 50;
                    break;
                }
                case 63: {
                    n14 = 153;
                    break;
                }
                case 64: {
                    n14 = 255;
                    break;
                }
                case 65: {
                    n14 = 238;
                    break;
                }
                case 66: {
                    n14 = 135;
                    break;
                }
                case 67: {
                    n14 = 252;
                    break;
                }
                case 68: {
                    n14 = 108;
                    break;
                }
                case 69: {
                    n14 = 127;
                    break;
                }
                case 70: {
                    n14 = 222;
                    break;
                }
                case 71: {
                    n14 = 179;
                    break;
                }
                case 72: {
                    n14 = 253;
                    break;
                }
                case 73: {
                    n14 = 240;
                    break;
                }
                case 74: {
                    n14 = 62;
                    break;
                }
                case 75: {
                    n14 = 145;
                    break;
                }
                case 76: {
                    n14 = 134;
                    break;
                }
                case 77: {
                    n14 = 117;
                    break;
                }
                case 78: {
                    n14 = 192;
                    break;
                }
                case 79: {
                    n14 = 116;
                    break;
                }
                case 80: {
                    n14 = 122;
                    break;
                }
                case 81: {
                    n14 = 190;
                    break;
                }
                case 82: {
                    n14 = 100;
                    break;
                }
                case 83: {
                    n14 = 150;
                    break;
                }
                case 84: {
                    n14 = 57;
                    break;
                }
                case 85: {
                    n14 = 35;
                    break;
                }
                case 86: {
                    n14 = 196;
                    break;
                }
                case 87: {
                    n14 = 88;
                    break;
                }
                case 88: {
                    n14 = 173;
                    break;
                }
                case 89: {
                    n14 = 174;
                    break;
                }
                case 90: {
                    n14 = 20;
                    break;
                }
                case 91: {
                    n14 = 245;
                    break;
                }
                case 92: {
                    n14 = 176;
                    break;
                }
                case 93: {
                    n14 = 102;
                    break;
                }
                case 94: {
                    n14 = 113;
                    break;
                }
                case 95: {
                    n14 = 200;
                    break;
                }
                case 96: {
                    n14 = 195;
                    break;
                }
                case 97: {
                    n14 = 72;
                    break;
                }
                case 98: {
                    n14 = 83;
                    break;
                }
                case 99: {
                    n14 = 65;
                    break;
                }
                case 100: {
                    n14 = 23;
                    break;
                }
                case 101: {
                    n14 = 7;
                    break;
                }
                case 102: {
                    n14 = 109;
                    break;
                }
                case 103: {
                    n14 = 193;
                    break;
                }
                case 104: {
                    n14 = 144;
                    break;
                }
                case 105: {
                    n14 = 205;
                    break;
                }
                case 106: {
                    n14 = 9;
                    break;
                }
                case 107: {
                    n14 = 56;
                    break;
                }
                case 108: {
                    n14 = 187;
                    break;
                }
                case 109: {
                    n14 = 211;
                    break;
                }
                case 110: {
                    n14 = 180;
                    break;
                }
                case 111: {
                    n14 = 241;
                    break;
                }
                case 112: {
                    n14 = 168;
                    break;
                }
                case 113: {
                    n14 = 218;
                    break;
                }
                case 114: {
                    n14 = 17;
                    break;
                }
                case 115: {
                    n14 = 37;
                    break;
                }
                case 116: {
                    n14 = 244;
                    break;
                }
                case 117: {
                    n14 = 101;
                    break;
                }
                case 118: {
                    n14 = 169;
                    break;
                }
                case 119: {
                    n14 = 33;
                    break;
                }
                case 120: {
                    n14 = 172;
                    break;
                }
                case 121: {
                    n14 = 28;
                    break;
                }
                case 122: {
                    n14 = 29;
                    break;
                }
                case 123: {
                    n14 = 24;
                    break;
                }
                case 124: {
                    n14 = 246;
                    break;
                }
                case 125: {
                    n14 = 151;
                    break;
                }
                case 126: {
                    n14 = 41;
                    break;
                }
                case 127: {
                    n14 = 105;
                    break;
                }
                case 128: {
                    n14 = 158;
                    break;
                }
                case 129: {
                    n14 = 125;
                    break;
                }
                case 130: {
                    n14 = 124;
                    break;
                }
                case 131: {
                    n14 = 155;
                    break;
                }
                case 132: {
                    n14 = 143;
                    break;
                }
                case 133: {
                    n14 = 32;
                    break;
                }
                case 134: {
                    n14 = 38;
                    break;
                }
                case 135: {
                    n14 = 2;
                    break;
                }
                case 136: {
                    n14 = 207;
                    break;
                }
                case 137: {
                    n14 = 248;
                    break;
                }
                case 138: {
                    n14 = 21;
                    break;
                }
                case 139: {
                    n14 = 49;
                    break;
                }
                case 140: {
                    n14 = 121;
                    break;
                }
                case 141: {
                    n14 = 204;
                    break;
                }
                case 142: {
                    n14 = 250;
                    break;
                }
                case 143: {
                    n14 = 40;
                    break;
                }
                case 144: {
                    n14 = 6;
                    break;
                }
                case 145: {
                    n14 = 104;
                    break;
                }
                case 146: {
                    n14 = 111;
                    break;
                }
                case 147: {
                    n14 = 47;
                    break;
                }
                case 148: {
                    n14 = 228;
                    break;
                }
                case 149: {
                    n14 = 64;
                    break;
                }
                case 150: {
                    n14 = 110;
                    break;
                }
                case 151: {
                    n14 = 209;
                    break;
                }
                case 152: {
                    n14 = 22;
                    break;
                }
                case 153: {
                    n14 = 185;
                    break;
                }
                case 154: {
                    n14 = 42;
                    break;
                }
                case 155: {
                    n14 = 221;
                    break;
                }
                case 156: {
                    n14 = 53;
                    break;
                }
                case 157: {
                    n14 = 95;
                    break;
                }
                case 158: {
                    n14 = 63;
                    break;
                }
                case 159: {
                    n14 = 183;
                    break;
                }
                case 160: {
                    n14 = 15;
                    break;
                }
                case 161: {
                    n14 = 237;
                    break;
                }
                case 162: {
                    n14 = 213;
                    break;
                }
                case 163: {
                    n14 = 66;
                    break;
                }
                case 164: {
                    n14 = 181;
                    break;
                }
                case 165: {
                    n14 = 10;
                    break;
                }
                case 166: {
                    n14 = 59;
                    break;
                }
                case 167: {
                    n14 = 60;
                    break;
                }
                case 168: {
                    n14 = 85;
                    break;
                }
                case 169: {
                    n14 = 130;
                    break;
                }
                case 170: {
                    n14 = 3;
                    break;
                }
                case 171: {
                    n14 = 115;
                    break;
                }
                case 172: {
                    n14 = 106;
                    break;
                }
                case 173: {
                    n14 = 184;
                    break;
                }
                case 174: {
                    n14 = 164;
                    break;
                }
                case 175: {
                    n14 = 229;
                    break;
                }
                case 176: {
                    n14 = 171;
                    break;
                }
                case 177: {
                    n14 = 55;
                    break;
                }
                case 178: {
                    n14 = 16;
                    break;
                }
                case 179: {
                    n14 = 30;
                    break;
                }
                case 180: {
                    n14 = 96;
                    break;
                }
                case 181: {
                    n14 = 230;
                    break;
                }
                case 182: {
                    n14 = 8;
                    break;
                }
                case 183: {
                    n14 = 34;
                    break;
                }
                case 184: {
                    n14 = 4;
                    break;
                }
                case 185: {
                    n14 = 18;
                    break;
                }
                case 186: {
                    n14 = 140;
                    break;
                }
                case 187: {
                    n14 = 92;
                    break;
                }
                case 188: {
                    n14 = 13;
                    break;
                }
                case 189: {
                    n14 = 247;
                    break;
                }
                case 190: {
                    n14 = 69;
                    break;
                }
                case 191: {
                    n14 = 48;
                    break;
                }
                case 192: {
                    n14 = 177;
                    break;
                }
                case 193: {
                    n14 = 78;
                    break;
                }
                case 194: {
                    n14 = 156;
                    break;
                }
                case 195: {
                    n14 = 82;
                    break;
                }
                case 196: {
                    n14 = 91;
                    break;
                }
                case 197: {
                    n14 = 210;
                    break;
                }
                case 198: {
                    n14 = 1;
                    break;
                }
                case 199: {
                    n14 = 31;
                    break;
                }
                case 200: {
                    n14 = 167;
                    break;
                }
                case 201: {
                    n14 = 206;
                    break;
                }
                case 202: {
                    n14 = 94;
                    break;
                }
                case 203: {
                    n14 = 219;
                    break;
                }
                case 204: {
                    n14 = 129;
                    break;
                }
                case 205: {
                    n14 = 39;
                    break;
                }
                case 206: {
                    n14 = 67;
                    break;
                }
                case 207: {
                    n14 = 90;
                    break;
                }
                case 208: {
                    n14 = 249;
                    break;
                }
                case 209: {
                    n14 = 61;
                    break;
                }
                case 210: {
                    n14 = 203;
                    break;
                }
                case 211: {
                    n14 = 148;
                    break;
                }
                case 212: {
                    n14 = 98;
                    break;
                }
                case 213: {
                    n14 = 76;
                    break;
                }
                case 214: {
                    n14 = 232;
                    break;
                }
                case 215: {
                    n14 = 216;
                    break;
                }
                case 216: {
                    n14 = 212;
                    break;
                }
                case 217: {
                    n14 = 163;
                    break;
                }
                case 218: {
                    n14 = 112;
                    break;
                }
                case 219: {
                    n14 = 131;
                    break;
                }
                case 220: {
                    n14 = 5;
                    break;
                }
                case 221: {
                    n14 = 138;
                    break;
                }
                case 222: {
                    n14 = 120;
                    break;
                }
                case 223: {
                    n14 = 223;
                    break;
                }
                case 224: {
                    n14 = 182;
                    break;
                }
                case 225: {
                    n14 = 132;
                    break;
                }
                case 226: {
                    n14 = 26;
                    break;
                }
                case 227: {
                    n14 = 51;
                    break;
                }
                case 228: {
                    n14 = 225;
                    break;
                }
                case 229: {
                    n14 = 243;
                    break;
                }
                case 230: {
                    n14 = 36;
                    break;
                }
                case 231: {
                    n14 = 54;
                    break;
                }
                case 232: {
                    n14 = 226;
                    break;
                }
                case 233: {
                    n14 = 75;
                    break;
                }
                case 234: {
                    n14 = 14;
                    break;
                }
                case 235: {
                    n14 = 19;
                    break;
                }
                case 236: {
                    n14 = 86;
                    break;
                }
                case 237: {
                    n14 = 224;
                    break;
                }
                case 238: {
                    n14 = 12;
                    break;
                }
                case 239: {
                    n14 = 107;
                    break;
                }
                case 240: {
                    n14 = 73;
                    break;
                }
                case 241: {
                    n14 = 11;
                    break;
                }
                case 242: {
                    n14 = 239;
                    break;
                }
                case 243: {
                    n14 = 175;
                    break;
                }
                case 244: {
                    n14 = 194;
                    break;
                }
                case 245: {
                    n14 = 251;
                    break;
                }
                case 246: {
                    n14 = 231;
                    break;
                }
                case 247: {
                    n14 = 178;
                    break;
                }
                case 248: {
                    n14 = 139;
                    break;
                }
                case 249: {
                    n14 = 25;
                    break;
                }
                case 250: {
                    n14 = 45;
                    break;
                }
                case 251: {
                    n14 = 136;
                    break;
                }
                case 252: {
                    n14 = 44;
                    break;
                }
                case 253: {
                    n14 = 191;
                    break;
                }
                case 254: {
                    n14 = 233;
                    break;
                }
                default: {
                    n14 = 154;
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
            j_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

