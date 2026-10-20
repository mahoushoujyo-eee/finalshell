/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com._Y;
import com.db_0;
import com.dm_2;
import com.nf_1;
import com.oz_1;
import com.rc_0;
import com.uJ;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q
implements db_0 {
    private rc_0 P;
    private Path m;
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    public Q() throws _Y {
        this(Q.q(), Q.t());
    }

    public Q(Path path) throws _Y {
        this(Q.q(), path);
    }

    public Q(rc_0 rc_02) throws _Y {
        this(rc_02, Q.t());
    }

    public Q(rc_0 rc_02, Path path) {
        this.P = rc_02;
        this.m = path;
    }

    @Override
    public String B() {
        return "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53712 out of bounds for length 7";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean x() {
        block13: {
            block12: {
                var1_1 = dm_2.J();
                var2_2 = this.Z();
                try {
                    var3_4 = true;
                }
                catch (Throwable var3_5) {
                    try {
                        block14: {
                            try {
                                v0 = var2_2;
                                if (!var1_1) {
                                    if (v0 == null) break block14;
                                }
                                ** GOTO lbl18
                            }
                            catch (Throwable v1) {
                                throw Q.a(v1);
                            }
                            try {
                                v0 = var2_2;
lbl18:
                                // 2 sources

                                v0.close();
                            }
                            catch (Throwable var4_6) {
                                var3_5.addSuppressed(var4_6);
                            }
                        }
                        throw var3_5;
                    }
                    catch (IOException var2_3) {
                        return false;
                    }
                }
                try {
                    v2 = var2_2;
                    if (var1_1) break block12;
                    if (v2 == null) break block13;
                }
                catch (Throwable v3) {
                    throw Q.a(v3);
                }
                v2 = var2_2;
            }
            v2.close();
        }
        return var3_4;
    }

    private SocketChannel Z() throws IOException {
        return this.P.o(this.m);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Z(uJ var1_1) throws _Y {
        block22: {
            var2_2 = dm_2.F();
            try {
                block21: {
                    var3_3 = this.Z();
                    try {
                        block19: {
                            block20: {
                                block18: {
                                    Q.y(var3_3, var1_1, 0, var1_1.P());
                                    var1_1.a();
                                    var4_5 = Q.S(var3_3, var1_1, 0, 4);
                                    var4_5 = var1_1.d();
                                    try {
                                        v0 = var4_5;
                                        if (!var2_2) break block18;
                                        if (v0 > 0) {
                                        }
                                        ** GOTO lbl27
                                    }
                                    catch (Throwable v1) {
                                        throw Q.a(v1);
                                    }
                                    v0 = var4_5;
                                }
                                if (!var2_2) break block19;
                                try {
                                    block24: {
                                        if (v0 <= (int)Q.c) break block20;
                                        break block24;
                                        catch (Throwable v2) {
                                            throw Q.a(v2);
                                        }
                                    }
                                    throw new _Y("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53718 out of bounds for length 7" + var4_5);
                                }
                                catch (Throwable v3) {
                                    throw Q.a(v3);
                                }
                            }
                            var1_1.a();
                            var1_1.X(var4_5);
                            v0 = Q.S(var3_3, var1_1, 0, var4_5);
                        }
                        var4_5 = v0;
                    }
                    catch (Throwable var4_6) {
                        block23: {
                            try {
                                v4 = var3_3;
                                if (var2_2) {
                                    if (v4 == null) break block23;
                                }
                                ** GOTO lbl48
                            }
                            catch (Throwable v5) {
                                throw Q.a(v5);
                            }
                            try {
                                v4 = var3_3;
lbl48:
                                // 2 sources

                                v4.close();
                            }
                            catch (Throwable var5_7) {
                                var4_6.addSuppressed(var5_7);
                            }
                        }
                        throw var4_6;
                    }
                    try {
                        v6 = var3_3;
                        if (!var2_2) break block21;
                        if (v6 == null) break block22;
                    }
                    catch (Throwable v7) {
                        throw Q.a(v7);
                    }
                    v6 = var3_3;
                }
                v6.close();
            }
            catch (IOException var3_4) {
                throw new _Y(var3_4.toString(), var3_4);
            }
        }
    }

    private static rc_0 q() throws _Y {
        try {
            return new oz_1();
        }
        catch (_Y _Y2) {
            try {
                return new nf_1();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                _Y _Y3 = new _Y("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53717 out of bounds for length 7");
                _Y3.addSuppressed(_Y2);
                _Y3.addSuppressed(noClassDefFoundError);
                throw _Y3;
            }
            catch (_Y _Y4) {
                _Y4.addSuppressed(_Y2);
                throw _Y2;
            }
        }
    }

    private static Path t() throws _Y {
        String string;
        block4: {
            String string2;
            block5: {
                string2 = E8.F("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53719 out of bounds for length 7");
                boolean bl = dm_2.J();
                try {
                    try {
                        string = string2;
                        if (bl) break block4;
                        if (string != null) break block5;
                    }
                    catch (_Y _Y2) {
                        throw Q.a(_Y2);
                    }
                    throw new _Y("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53716 out of bounds for length 7");
                }
                catch (_Y _Y3) {
                    throw Q.a(_Y3);
                }
            }
            string = string2;
        }
        return Paths.get(string, new String[0]);
    }

    private static int S(SocketChannel socketChannel, uJ uJ2, int n10, int n11) throws IOException {
        int n12;
        block11: {
            ByteBuffer byteBuffer = ByteBuffer.wrap(uJ2.g, n10, n11);
            int n13 = n11;
            boolean bl = dm_2.J();
            while (n11 > 0) {
                block15: {
                    int n14;
                    block14: {
                        int n15;
                        block12: {
                            block13: {
                                n15 = socketChannel.read(byteBuffer);
                                try {
                                    try {
                                        try {
                                            n12 = n15;
                                            if (bl) break block11;
                                            if (bl) break block12;
                                        }
                                        catch (IOException iOException) {
                                            throw Q.a(iOException);
                                        }
                                        if (n12 >= 0) break block13;
                                    }
                                    catch (IOException iOException) {
                                        throw Q.a(iOException);
                                    }
                                    return -1;
                                }
                                catch (IOException iOException) {
                                    throw Q.a(iOException);
                                }
                            }
                            n14 = n15;
                        }
                        try {
                            try {
                                if (bl) break block14;
                                if (n14 <= 0) break block15;
                            }
                            catch (IOException iOException) {
                                throw Q.a(iOException);
                            }
                            n14 = n11 - n15;
                        }
                        catch (IOException iOException) {
                            throw Q.a(iOException);
                        }
                    }
                    n11 = n14;
                }
                if (!bl) continue;
            }
            n12 = n13;
        }
        return n12;
    }

    private static int y(SocketChannel socketChannel, uJ uJ2, int n10, int n11) throws IOException {
        int n12;
        block11: {
            ByteBuffer byteBuffer = ByteBuffer.wrap(uJ2.g, n10, n11);
            int n13 = n11;
            boolean bl = dm_2.J();
            while (n11 > 0) {
                block15: {
                    int n14;
                    block14: {
                        int n15;
                        block12: {
                            block13: {
                                n15 = socketChannel.write(byteBuffer);
                                try {
                                    try {
                                        try {
                                            n12 = n15;
                                            if (bl) break block11;
                                            if (bl) break block12;
                                        }
                                        catch (IOException iOException) {
                                            throw Q.a(iOException);
                                        }
                                        if (n12 >= 0) break block13;
                                    }
                                    catch (IOException iOException) {
                                        throw Q.a(iOException);
                                    }
                                    return -1;
                                }
                                catch (IOException iOException) {
                                    throw Q.a(iOException);
                                }
                            }
                            n14 = n15;
                        }
                        try {
                            try {
                                if (bl) break block14;
                                if (n14 <= 0) break block15;
                            }
                            catch (IOException iOException) {
                                throw Q.a(iOException);
                            }
                            n14 = n11 - n15;
                        }
                        catch (IOException iOException) {
                            throw Q.a(iOException);
                        }
                    }
                    n11 = n14;
                }
                if (!bl) continue;
            }
            n12 = n13;
        }
        return n12;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[5];
                    var5_1 = 0;
                    var4_2 = "\u0014\u0006\u009b\u00e6\u00a92_K\u00ba\u0013\u00ec\u00c2\u007f\u0004\u001e\u0007\u00cf\u00d3h\u00a2\u00f8p\u008e\u00e81\u0003\b\u00f0\\\u001f\u00b1\u00a6\u0017&\u00e3\u00fc3[_i\u00d9\u001e\u00a2\u00d9m\u00dd\u008a\u00b5\u00bf\u00a5\u0083D\u001a5/\u00ad\u00cb\u00c7@\t+\u0010\u0086\u008c\u00b4U\u00ca\r\u00e9v`\u00e7\u00c3\u0088\u00a0\u00a5n!";
                    var6_3 = "\u0014\u0006\u009b\u00e6\u00a92_K\u00ba\u0013\u00ec\u00c2\u007f\u0004\u001e\u0007\u00cf\u00d3h\u00a2\u00f8p\u008e\u00e81\u0003\b\u00f0\\\u001f\u00b1\u00a6\u0017&\u00e3\u00fc3[_i\u00d9\u001e\u00a2\u00d9m\u00dd\u008a\u00b5\u00bf\u00a5\u0083D\u001a5/\u00ad\u00cb\u00c7@\t+\u0010\u0086\u008c\u00b4U\u00ca\r\u00e9v`\u00e7\u00c3\u0088\u00a0\u00a5n!".length();
                    var3_4 = 29;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 111;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "X\u0097\u001b\u00dd\u00b0\\u\u008f\u00f6\u0082l\u00f9f\t\u0001\u00a94LQ`\\Z\u00ef";
                        var6_3 = "X\u0097\u001b\u00dd\u00b0\\u\u008f\u00f6\u0082l\u00f9f\t\u0001\u00a94LQ`\\Z\u00ef".length();
                        var3_4 = 13;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 103;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 28;
                                break;
                            }
                            case 1: {
                                v15 = 61;
                                break;
                            }
                            case 2: {
                                v15 = 105;
                                break;
                            }
                            case 3: {
                                v15 = 101;
                                break;
                            }
                            case 4: {
                                v15 = 117;
                                break;
                            }
                            case 5: {
                                v15 = 33;
                                break;
                            }
                            default: {
                                v15 = 123;
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
lbl85:
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
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            Q.a = var7;
            Q.b = new String[5];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5902802498515832957L;
        ** while (true)
        Q.c = -8264031133158141827L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC934) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 197;
                    break;
                }
                case 1: {
                    n14 = 0;
                    break;
                }
                case 2: {
                    n14 = 77;
                    break;
                }
                case 3: {
                    n14 = 190;
                    break;
                }
                case 4: {
                    n14 = 161;
                    break;
                }
                case 5: {
                    n14 = 187;
                    break;
                }
                case 6: {
                    n14 = 96;
                    break;
                }
                case 7: {
                    n14 = 231;
                    break;
                }
                case 8: {
                    n14 = 41;
                    break;
                }
                case 9: {
                    n14 = 155;
                    break;
                }
                case 10: {
                    n14 = 130;
                    break;
                }
                case 11: {
                    n14 = 65;
                    break;
                }
                case 12: {
                    n14 = 255;
                    break;
                }
                case 13: {
                    n14 = 185;
                    break;
                }
                case 14: {
                    n14 = 248;
                    break;
                }
                case 15: {
                    n14 = 73;
                    break;
                }
                case 16: {
                    n14 = 61;
                    break;
                }
                case 17: {
                    n14 = 128;
                    break;
                }
                case 18: {
                    n14 = 169;
                    break;
                }
                case 19: {
                    n14 = 45;
                    break;
                }
                case 20: {
                    n14 = 58;
                    break;
                }
                case 21: {
                    n14 = 238;
                    break;
                }
                case 22: {
                    n14 = 7;
                    break;
                }
                case 23: {
                    n14 = 136;
                    break;
                }
                case 24: {
                    n14 = 208;
                    break;
                }
                case 25: {
                    n14 = 180;
                    break;
                }
                case 26: {
                    n14 = 216;
                    break;
                }
                case 27: {
                    n14 = 117;
                    break;
                }
                case 28: {
                    n14 = 177;
                    break;
                }
                case 29: {
                    n14 = 111;
                    break;
                }
                case 30: {
                    n14 = 109;
                    break;
                }
                case 31: {
                    n14 = 42;
                    break;
                }
                case 32: {
                    n14 = 30;
                    break;
                }
                case 33: {
                    n14 = 211;
                    break;
                }
                case 34: {
                    n14 = 218;
                    break;
                }
                case 35: {
                    n14 = 39;
                    break;
                }
                case 36: {
                    n14 = 137;
                    break;
                }
                case 37: {
                    n14 = 234;
                    break;
                }
                case 38: {
                    n14 = 224;
                    break;
                }
                case 39: {
                    n14 = 220;
                    break;
                }
                case 40: {
                    n14 = 222;
                    break;
                }
                case 41: {
                    n14 = 131;
                    break;
                }
                case 42: {
                    n14 = 104;
                    break;
                }
                case 43: {
                    n14 = 64;
                    break;
                }
                case 44: {
                    n14 = 228;
                    break;
                }
                case 45: {
                    n14 = 126;
                    break;
                }
                case 46: {
                    n14 = 116;
                    break;
                }
                case 47: {
                    n14 = 232;
                    break;
                }
                case 48: {
                    n14 = 153;
                    break;
                }
                case 49: {
                    n14 = 110;
                    break;
                }
                case 50: {
                    n14 = 81;
                    break;
                }
                case 51: {
                    n14 = 204;
                    break;
                }
                case 52: {
                    n14 = 119;
                    break;
                }
                case 53: {
                    n14 = 101;
                    break;
                }
                case 54: {
                    n14 = 120;
                    break;
                }
                case 55: {
                    n14 = 43;
                    break;
                }
                case 56: {
                    n14 = 107;
                    break;
                }
                case 57: {
                    n14 = 198;
                    break;
                }
                case 58: {
                    n14 = 97;
                    break;
                }
                case 59: {
                    n14 = 230;
                    break;
                }
                case 60: {
                    n14 = 76;
                    break;
                }
                case 61: {
                    n14 = 121;
                    break;
                }
                case 62: {
                    n14 = 34;
                    break;
                }
                case 63: {
                    n14 = 86;
                    break;
                }
                case 64: {
                    n14 = 102;
                    break;
                }
                case 65: {
                    n14 = 112;
                    break;
                }
                case 66: {
                    n14 = 167;
                    break;
                }
                case 67: {
                    n14 = 113;
                    break;
                }
                case 68: {
                    n14 = 71;
                    break;
                }
                case 69: {
                    n14 = 51;
                    break;
                }
                case 70: {
                    n14 = 221;
                    break;
                }
                case 71: {
                    n14 = 2;
                    break;
                }
                case 72: {
                    n14 = 8;
                    break;
                }
                case 73: {
                    n14 = 69;
                    break;
                }
                case 74: {
                    n14 = 90;
                    break;
                }
                case 75: {
                    n14 = 170;
                    break;
                }
                case 76: {
                    n14 = 6;
                    break;
                }
                case 77: {
                    n14 = 241;
                    break;
                }
                case 78: {
                    n14 = 98;
                    break;
                }
                case 79: {
                    n14 = 79;
                    break;
                }
                case 80: {
                    n14 = 226;
                    break;
                }
                case 81: {
                    n14 = 4;
                    break;
                }
                case 82: {
                    n14 = 129;
                    break;
                }
                case 83: {
                    n14 = 105;
                    break;
                }
                case 84: {
                    n14 = 52;
                    break;
                }
                case 85: {
                    n14 = 138;
                    break;
                }
                case 86: {
                    n14 = 27;
                    break;
                }
                case 87: {
                    n14 = 239;
                    break;
                }
                case 88: {
                    n14 = 14;
                    break;
                }
                case 89: {
                    n14 = 1;
                    break;
                }
                case 90: {
                    n14 = 57;
                    break;
                }
                case 91: {
                    n14 = 63;
                    break;
                }
                case 92: {
                    n14 = 54;
                    break;
                }
                case 93: {
                    n14 = 151;
                    break;
                }
                case 94: {
                    n14 = 84;
                    break;
                }
                case 95: {
                    n14 = 9;
                    break;
                }
                case 96: {
                    n14 = 16;
                    break;
                }
                case 97: {
                    n14 = 127;
                    break;
                }
                case 98: {
                    n14 = 87;
                    break;
                }
                case 99: {
                    n14 = 233;
                    break;
                }
                case 100: {
                    n14 = 85;
                    break;
                }
                case 101: {
                    n14 = 217;
                    break;
                }
                case 102: {
                    n14 = 223;
                    break;
                }
                case 103: {
                    n14 = 83;
                    break;
                }
                case 104: {
                    n14 = 243;
                    break;
                }
                case 105: {
                    n14 = 78;
                    break;
                }
                case 106: {
                    n14 = 22;
                    break;
                }
                case 107: {
                    n14 = 29;
                    break;
                }
                case 108: {
                    n14 = 183;
                    break;
                }
                case 109: {
                    n14 = 25;
                    break;
                }
                case 110: {
                    n14 = 12;
                    break;
                }
                case 111: {
                    n14 = 184;
                    break;
                }
                case 112: {
                    n14 = 173;
                    break;
                }
                case 113: {
                    n14 = 225;
                    break;
                }
                case 114: {
                    n14 = 10;
                    break;
                }
                case 115: {
                    n14 = 191;
                    break;
                }
                case 116: {
                    n14 = 201;
                    break;
                }
                case 117: {
                    n14 = 236;
                    break;
                }
                case 118: {
                    n14 = 215;
                    break;
                }
                case 119: {
                    n14 = 144;
                    break;
                }
                case 120: {
                    n14 = 251;
                    break;
                }
                case 121: {
                    n14 = 62;
                    break;
                }
                case 122: {
                    n14 = 94;
                    break;
                }
                case 123: {
                    n14 = 26;
                    break;
                }
                case 124: {
                    n14 = 205;
                    break;
                }
                case 125: {
                    n14 = 166;
                    break;
                }
                case 126: {
                    n14 = 253;
                    break;
                }
                case 127: {
                    n14 = 108;
                    break;
                }
                case 128: {
                    n14 = 145;
                    break;
                }
                case 129: {
                    n14 = 66;
                    break;
                }
                case 130: {
                    n14 = 193;
                    break;
                }
                case 131: {
                    n14 = 174;
                    break;
                }
                case 132: {
                    n14 = 213;
                    break;
                }
                case 133: {
                    n14 = 219;
                    break;
                }
                case 134: {
                    n14 = 18;
                    break;
                }
                case 135: {
                    n14 = 33;
                    break;
                }
                case 136: {
                    n14 = 59;
                    break;
                }
                case 137: {
                    n14 = 80;
                    break;
                }
                case 138: {
                    n14 = 172;
                    break;
                }
                case 139: {
                    n14 = 19;
                    break;
                }
                case 140: {
                    n14 = 92;
                    break;
                }
                case 141: {
                    n14 = 160;
                    break;
                }
                case 142: {
                    n14 = 182;
                    break;
                }
                case 143: {
                    n14 = 181;
                    break;
                }
                case 144: {
                    n14 = 227;
                    break;
                }
                case 145: {
                    n14 = 74;
                    break;
                }
                case 146: {
                    n14 = 206;
                    break;
                }
                case 147: {
                    n14 = 165;
                    break;
                }
                case 148: {
                    n14 = 199;
                    break;
                }
                case 149: {
                    n14 = 100;
                    break;
                }
                case 150: {
                    n14 = 176;
                    break;
                }
                case 151: {
                    n14 = 37;
                    break;
                }
                case 152: {
                    n14 = 47;
                    break;
                }
                case 153: {
                    n14 = 254;
                    break;
                }
                case 154: {
                    n14 = 140;
                    break;
                }
                case 155: {
                    n14 = 5;
                    break;
                }
                case 156: {
                    n14 = 35;
                    break;
                }
                case 157: {
                    n14 = 75;
                    break;
                }
                case 158: {
                    n14 = 194;
                    break;
                }
                case 159: {
                    n14 = 147;
                    break;
                }
                case 160: {
                    n14 = 148;
                    break;
                }
                case 161: {
                    n14 = 237;
                    break;
                }
                case 162: {
                    n14 = 188;
                    break;
                }
                case 163: {
                    n14 = 210;
                    break;
                }
                case 164: {
                    n14 = 142;
                    break;
                }
                case 165: {
                    n14 = 67;
                    break;
                }
                case 166: {
                    n14 = 246;
                    break;
                }
                case 167: {
                    n14 = 134;
                    break;
                }
                case 168: {
                    n14 = 49;
                    break;
                }
                case 169: {
                    n14 = 250;
                    break;
                }
                case 170: {
                    n14 = 38;
                    break;
                }
                case 171: {
                    n14 = 189;
                    break;
                }
                case 172: {
                    n14 = 163;
                    break;
                }
                case 173: {
                    n14 = 122;
                    break;
                }
                case 174: {
                    n14 = 202;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 139;
                    break;
                }
                case 177: {
                    n14 = 164;
                    break;
                }
                case 178: {
                    n14 = 56;
                    break;
                }
                case 179: {
                    n14 = 24;
                    break;
                }
                case 180: {
                    n14 = 186;
                    break;
                }
                case 181: {
                    n14 = 13;
                    break;
                }
                case 182: {
                    n14 = 158;
                    break;
                }
                case 183: {
                    n14 = 70;
                    break;
                }
                case 184: {
                    n14 = 11;
                    break;
                }
                case 185: {
                    n14 = 123;
                    break;
                }
                case 186: {
                    n14 = 209;
                    break;
                }
                case 187: {
                    n14 = 141;
                    break;
                }
                case 188: {
                    n14 = 72;
                    break;
                }
                case 189: {
                    n14 = 175;
                    break;
                }
                case 190: {
                    n14 = 156;
                    break;
                }
                case 191: {
                    n14 = 159;
                    break;
                }
                case 192: {
                    n14 = 31;
                    break;
                }
                case 193: {
                    n14 = 154;
                    break;
                }
                case 194: {
                    n14 = 21;
                    break;
                }
                case 195: {
                    n14 = 135;
                    break;
                }
                case 196: {
                    n14 = 168;
                    break;
                }
                case 197: {
                    n14 = 212;
                    break;
                }
                case 198: {
                    n14 = 40;
                    break;
                }
                case 199: {
                    n14 = 133;
                    break;
                }
                case 200: {
                    n14 = 124;
                    break;
                }
                case 201: {
                    n14 = 3;
                    break;
                }
                case 202: {
                    n14 = 15;
                    break;
                }
                case 203: {
                    n14 = 106;
                    break;
                }
                case 204: {
                    n14 = 195;
                    break;
                }
                case 205: {
                    n14 = 55;
                    break;
                }
                case 206: {
                    n14 = 28;
                    break;
                }
                case 207: {
                    n14 = 196;
                    break;
                }
                case 208: {
                    n14 = 91;
                    break;
                }
                case 209: {
                    n14 = 68;
                    break;
                }
                case 210: {
                    n14 = 93;
                    break;
                }
                case 211: {
                    n14 = 44;
                    break;
                }
                case 212: {
                    n14 = 162;
                    break;
                }
                case 213: {
                    n14 = 247;
                    break;
                }
                case 214: {
                    n14 = 36;
                    break;
                }
                case 215: {
                    n14 = 48;
                    break;
                }
                case 216: {
                    n14 = 200;
                    break;
                }
                case 217: {
                    n14 = 53;
                    break;
                }
                case 218: {
                    n14 = 179;
                    break;
                }
                case 219: {
                    n14 = 95;
                    break;
                }
                case 220: {
                    n14 = 150;
                    break;
                }
                case 221: {
                    n14 = 60;
                    break;
                }
                case 222: {
                    n14 = 171;
                    break;
                }
                case 223: {
                    n14 = 88;
                    break;
                }
                case 224: {
                    n14 = 118;
                    break;
                }
                case 225: {
                    n14 = 146;
                    break;
                }
                case 226: {
                    n14 = 50;
                    break;
                }
                case 227: {
                    n14 = 46;
                    break;
                }
                case 228: {
                    n14 = 143;
                    break;
                }
                case 229: {
                    n14 = 82;
                    break;
                }
                case 230: {
                    n14 = 32;
                    break;
                }
                case 231: {
                    n14 = 89;
                    break;
                }
                case 232: {
                    n14 = 240;
                    break;
                }
                case 233: {
                    n14 = 17;
                    break;
                }
                case 234: {
                    n14 = 245;
                    break;
                }
                case 235: {
                    n14 = 103;
                    break;
                }
                case 236: {
                    n14 = 125;
                    break;
                }
                case 237: {
                    n14 = 214;
                    break;
                }
                case 238: {
                    n14 = 152;
                    break;
                }
                case 239: {
                    n14 = 157;
                    break;
                }
                case 240: {
                    n14 = 242;
                    break;
                }
                case 241: {
                    n14 = 192;
                    break;
                }
                case 242: {
                    n14 = 249;
                    break;
                }
                case 243: {
                    n14 = 207;
                    break;
                }
                case 244: {
                    n14 = 252;
                    break;
                }
                case 245: {
                    n14 = 244;
                    break;
                }
                case 246: {
                    n14 = 114;
                    break;
                }
                case 247: {
                    n14 = 203;
                    break;
                }
                case 248: {
                    n14 = 149;
                    break;
                }
                case 249: {
                    n14 = 229;
                    break;
                }
                case 250: {
                    n14 = 115;
                    break;
                }
                case 251: {
                    n14 = 99;
                    break;
                }
                case 252: {
                    n14 = 20;
                    break;
                }
                case 253: {
                    n14 = 23;
                    break;
                }
                case 254: {
                    n14 = 178;
                    break;
                }
                default: {
                    n14 = 132;
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
            Q.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

